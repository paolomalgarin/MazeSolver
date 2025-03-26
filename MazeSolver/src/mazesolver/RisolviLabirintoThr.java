package mazesolver;

import java.util.ArrayList;
import java.util.Random;
import java.awt.*;

public class RisolviLabirintoThr extends Thread {

    private int i, j;
    private Labirinto l;
    private static int[][] risolvimento;
    private int color;
    private String path;
    private static int speed = 50;
    private static boolean isWorking = false;
    public static enum Speed {
        VERY_FAST,
        FAST,
        MEDIUM,
        SLOW,
        VERY_SLOW,
    }
    private static boolean isStopped = false;
    

    public RisolviLabirintoThr(Labirinto l) {
        isStopped = false;
        this.i = 0;
        this.j = 0;
        this.l = l;
        risolvimento = new int[l.getLabirinto().getMaze().length][l.getLabirinto().getMaze()[0].length];
        for (int k = 0; k < risolvimento.length; k++) {
            for (int m = 0; m < risolvimento[0].length; m++) {
                risolvimento[k][m] = 0;
            }
        }
        color = new Random().nextInt(4);
        path = "";
    }
    private RisolviLabirintoThr(Labirinto l, String path, int i, int j, int color) {
        this.i = i;
        this.j = j;
        this.l = l;
        this.color = color;
        this.path = path;
    }
    public void mostraRisposta() {
        i = 0;
        j = 0;
        for (int k = 0; k < path.length(); k++) {
            try {
                Thread.sleep(6);
            } catch (InterruptedException ex) {}
            switch (path.charAt(k)) {
                case 'n':
                    i--;
                    break;
                case 's':
                    i++;
                    break;
                case 'e':
                    j++;
                    break;
                case 'w':
                    j--;
                    break;
            }
            l.passa(i, j, color);
        }
    }
    public void nascondiRisposta() {
        i = risolvimento.length - 1;
        j = risolvimento[0].length - 1;
        for (int k = path.length() - 1; k > 0; k--) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {}
            switch (path.charAt(k)) {
                case 'n':
                    i++;
                    break;
                case 's':
                    i--;
                    break;
                case 'e':
                    j--;
                    break;
                case 'w':
                    j++;
                    break;
            }
            l.setCasellaColor((i==0 && j==0) ? new Color(102, 0, 0) : (i == risolvimento.length - 1 && j == risolvimento[0].length - 1) ? new Color(0, 51, 0) : new Color(102, 102, 102), i, j);
        }
    }
    public static int getSpeed() {
        return speed;
    }
    public static void setSpeed(Speed speed) {
        switch (speed) {
            case VERY_FAST:
                RisolviLabirintoThr.speed = 10;
                break;
            case FAST:
                RisolviLabirintoThr.speed = 25;
                break;
            case MEDIUM:
                RisolviLabirintoThr.speed = 50;
                break;
            case SLOW:
                RisolviLabirintoThr.speed = 300;
                break;
            case VERY_SLOW:
                RisolviLabirintoThr.speed = 1000;
                break;
            default:
                throw new AssertionError();
        }
    }
    @Override
    public void run() {
        ArrayList<RisolviLabirintoThr> figli = new ArrayList<>();
        l.passa(i, j, color);
        while (!isStopped && !(i == risolvimento.length - 1 && j == risolvimento[0].length - 1) && risolvimento[i][j] == 0 && !l.isCompleted()) {
            try {
                Thread.sleep(speed);  // 10 flash, 30 fast, 50 normal, 80 slow
            } catch (InterruptedException ex) {}

            risolvimento[i][j] = 1;

            String directions = "";
            int direzDisponibili = 0;
            directions += (l.getLabirinto().getMaze()[j][i] & 1) != 0 && i > 0 && risolvimento[i - 1][j] == 0 ? direzDisponibili++ * 0 : 1;
            directions += (l.getLabirinto().getMaze()[j][i] & 2) != 0 && i < risolvimento.length - 1 && risolvimento[i + 1][j] == 0 ? direzDisponibili++ * 0 : 1;
            directions += (l.getLabirinto().getMaze()[j][i] & 4) != 0 && j < risolvimento[0].length - 1 && risolvimento[i][j + 1] == 0 ? direzDisponibili++ * 0 : 1;
            directions += (l.getLabirinto().getMaze()[j][i] & 8) != 0 && j > 0 && risolvimento[i][j - 1] == 0 ? direzDisponibili++ * 0 : 1;

            for (int k = 0; k < 4; k++) {
                if (directions.charAt(k) == '0') {
                    if (direzDisponibili > 1) {
                        String pathChild = path;
                        pathChild += k == 0 ? "n" : k == 1 ? "s" : "";
                        pathChild += k == 2 ? "e" : k == 3 ? "w" : "";
                        figli.add(new RisolviLabirintoThr(l, pathChild, k == 0 ? i - 1 : k == 1 ? i + 1 : i, k == 2 ? j + 1 : k == 3 ? j - 1 : j, new Random().nextInt(6)));
                        figli.get(figli.size() - 1).start();
                    } else {
                        i = k == 0 ? i - 1 : k == 1 ? i + 1 : i;
                        j = k == 2 ? j + 1 : k == 3 ? j - 1 : j;
                        path += k == 0 ? "n" : k == 1 ? "s" : "";
                        path += k == 2 ? "e" : k == 3 ? "w" : "";
                    }
                    direzDisponibili--;
                }
            }
            l.passa(i, j, color);
        }

        if (i == risolvimento.length - 1 && j == risolvimento[0].length - 1) {
            l.completed();
            
            for (RisolviLabirintoThr risolviLabirintoThr : figli) {
                try {
                    risolviLabirintoThr.join();
                } catch (Exception e) {}
            }

            try {
                this.isWorking = true;
                Thread.sleep(800);
                l.resetColor();
                
                Thread.sleep(800);
                mostraRisposta();
                Thread.sleep(3500);
                nascondiRisposta();
                
                l.renew();
                Thread.sleep(500);
                this.isWorking = false;
                new RisolviLabirintoThr(l).start();
            } catch (InterruptedException ex) {
            }
            
        }
    }
    public static void interruptAll() {
        isStopped = true;
    }
    public static boolean isWorking() {
        return isWorking;
    }
}