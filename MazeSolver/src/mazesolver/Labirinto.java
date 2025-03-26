package mazesolver;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Labirinto {
    // ------------------------------------------------------ ATTRIBUTI ------------------------------------------------------
    private JLabel[][] caselle;
    private int height;
    private int width;
    private int casellaSize = 15; //10 small, 15 medium, 20 big, 30 enormus
    private MazeGenerator labirinto;
    private boolean isCompleted;
    private int colorHue;
    private JFrame parent;
    public enum Size {
        EXTRA_SMALL,
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE,
    }

    // ------------------------------------------------------ METODI ------------------------------------------------------ 
    //costruttori
    public Labirinto() {
        super();
        isCompleted = false;
        colorHue = new Random().nextInt(0, 6);
    }
    //custom
    public void generaLabirinto(int height, int width, JFrame parent) {
        this.parent = parent;
        this.height = height;
        this.width = width;
        labirinto = new MazeGenerator(width, height);
        caselle = new JLabel[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                caselle[i][j] = new JLabel();
                caselle[i][j].setBounds(casellaSize * j, casellaSize * i, casellaSize, casellaSize);
                caselle[i][j].setOpaque(true);
                
                caselle[i][j].setBackground( (i==0 && j==0) ? new Color(102, 0, 0) : (i == height - 1 && j == width - 1) ? new Color(0, 51, 0) : ThemeDetector.isDarkModeEnabled() ? new Color(102, 102, 102) : new Color(148, 148, 148));
                
                int n = (labirinto.getMaze()[j][i] & 1) != 0 ? 0 : 1;
                int s = (labirinto.getMaze()[j][i] & 2) != 0 ? 0 : 1;
                int e = (labirinto.getMaze()[j][i] & 4) != 0 ? 0 : 1;
                int w = (labirinto.getMaze()[j][i] & 8) != 0 ? 0 : 1;
                caselle[i][j].setBorder(BorderFactory.createMatteBorder(n, w, s, e, new Color(51, 51, 51)));
                
                parent.getContentPane().add(caselle[i][j]);
            }
        }
    }
    public void renew() {
        isCompleted = false;
        int newColorHue;
        while((newColorHue = new Random().nextInt(0, 6)) == colorHue);
        colorHue = newColorHue;
        resetColor();
        //rigenero il labirinto
        labirinto = new MazeGenerator(width, height);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                caselle[i][j].setBounds(casellaSize * j, casellaSize * i, casellaSize, casellaSize);
                caselle[i][j].setOpaque(true);
                
                caselle[i][j].setBackground( (i==0 && j==0) ? new Color(102, 0, 0) : (i == height - 1 && j == width - 1) ? new Color(0, 51, 0) : ThemeDetector.isDarkModeEnabled() ? new Color(102, 102, 102) : new Color(148, 148, 148));
                
                int n = (labirinto.getMaze()[j][i] & 1) != 0 ? 0 : 1;
                int s = (labirinto.getMaze()[j][i] & 2) != 0 ? 0 : 1;
                int e = (labirinto.getMaze()[j][i] & 4) != 0 ? 0 : 1;
                int w = (labirinto.getMaze()[j][i] & 8) != 0 ? 0 : 1;
                caselle[i][j].setBorder(BorderFactory.createMatteBorder(n, w, s, e, new Color(51, 51, 51)));
            }
        }
    }
    //set
    public void setLabirintoHeight(int height) {
        this.height = height;
    }
    public void setLabirintoWidth(int width) {
        this.width = width;
    }
    public boolean setCasellaSize(Size size) {
        boolean isNew = false;
        switch (size) {
            case EXTRA_SMALL:
                isNew = this.casellaSize != 7;
                this.casellaSize = isNew ? 7 : this.casellaSize;
                break;
            case SMALL:
                isNew = this.casellaSize != 10;
                this.casellaSize = isNew ? 10 : this.casellaSize;
                break;
            case MEDIUM:
                isNew = this.casellaSize != 15;
                this.casellaSize = isNew ? 15 : this.casellaSize;
                break;
            case LARGE:
                isNew = this.casellaSize != 20;
                this.casellaSize = isNew ? 20 : this.casellaSize;
                break;
            case EXTRA_LARGE:
                isNew = this.casellaSize != 30;
                this.casellaSize = isNew ? 30 : this.casellaSize;
                break;
            default:
                throw new AssertionError();
        }
        return isNew;
    }
    //get
    public int getCasellaSize() {
        return this.casellaSize;
    }
    public int getLabirintoHeight() {
        return this.height;
    }
    public int getLabirintoWidth() {
        return this.width;
    }
    public MazeGenerator getLabirinto() {
        return labirinto;
    }
    public boolean isCompleted() {
        return this.isCompleted;
    }
    //custom
    public void setCasellaColor(Color color, int i, int j) {
        caselle[i][j].setBackground(color);
    }
    public synchronized void passa(int i, int j, int color) {
        if(i == 0 && j == 0)
            caselle[i][j].setBackground(new Color(255, 0, 0));
        else if (i == height - 1 && j == width - 1)
            caselle[i][j].setBackground(new Color(51, 204, 0));
        else {
            switch (colorHue) {
                case 0:
                    //caso verde
                    switch (color) {
                        case 0:
                            caselle[i][j].setBackground(new Color(136, 212, 171));
                            break;
                        case 1:
                            caselle[i][j].setBackground(new Color(120, 198, 163));
                            break;
                        case 2:
                            caselle[i][j].setBackground(new Color(103, 185, 154));
                            break;
                        case 3:
                            caselle[i][j].setBackground(new Color(86, 171, 145));
                            break;
                        case 4:
                            caselle[i][j].setBackground(new Color(70, 157, 137));
                            break;
                        case 5:
                            caselle[i][j].setBackground(new Color(53, 143, 128));
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 1:
                    //caso blu
                    switch (color) {
                        case 0:
                            caselle[i][j].setBackground(new Color(56, 86, 168));
                            break;
                        case 1:
                            caselle[i][j].setBackground(new Color(61, 94, 184));
                            break;
                        case 2:
                            caselle[i][j].setBackground(new Color(71, 104, 194));
                            break;
                        case 3:
                            caselle[i][j].setBackground(new Color(87, 117, 199));
                            break;
                        case 4:
                            caselle[i][j].setBackground(new Color(95, 123, 202));
                            break;
                        case 5:
                            caselle[i][j].setBackground(new Color(102, 129, 204));
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    //caso viola
                    switch (color) {
                        case 0:
                            caselle[i][j].setBackground(new Color(129, 135, 220));
                            break;
                        case 1:
                            caselle[i][j].setBackground(new Color(142, 148, 242));
                            break;
                        case 2:
                            caselle[i][j].setBackground(new Color(159, 160, 255));
                            break;
                        case 3:
                            caselle[i][j].setBackground(new Color(173, 167, 255));
                            break;
                        case 4:
                            caselle[i][j].setBackground(new Color(187, 173, 255));
                            break;
                        case 5:
                            caselle[i][j].setBackground(new Color(117, 123, 200));
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 3:
                    //caso arancione
                    switch (color) {
                        case 0:
                            caselle[i][j].setBackground(new Color(255, 123, 0));
                            break;
                        case 1:
                            caselle[i][j].setBackground(new Color(255, 136, 0));
                            break;
                        case 2:
                            caselle[i][j].setBackground(new Color(255, 149, 0));
                            break;
                        case 3:
                            caselle[i][j].setBackground(new Color(255, 162, 0));
                            break;
                        case 4:
                            caselle[i][j].setBackground(new Color(255, 170, 0));
                            break;
                        case 5:
                            caselle[i][j].setBackground(new Color(255, 183, 0));
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 4:
                    //caso rainbow
                    switch (color) {
                        case 0:
                            caselle[i][j].setBackground(new Color(255, 173, 173));
                            break;
                        case 1:
                            caselle[i][j].setBackground(new Color(255, 214, 165));
                            break;
                        case 2:
                            caselle[i][j].setBackground(new Color(253, 255, 182));
                            break;
                        case 3:
                            caselle[i][j].setBackground(new Color(202, 255, 191));
                            break;
                        case 4:
                            caselle[i][j].setBackground(new Color(160, 196, 255));
                            break;
                        case 5:
                            caselle[i][j].setBackground(new Color(189, 178, 255));
                            break;
                    }
                    break;
                case 5:
                    //caso marrone
                    switch (color) {
                        case 0:
                            caselle[i][j].setBackground(new Color(212, 162, 118));
                            break;
                        case 1:
                            caselle[i][j].setBackground(new Color(188, 138, 95));
                            break;
                        case 2:
                            caselle[i][j].setBackground(new Color(164, 113, 72));
                            break;
                        case 3:
                            caselle[i][j].setBackground(new Color(139, 94, 52));
                            break;
                        case 4:
                            caselle[i][j].setBackground(new Color(111, 69, 24));
                            break;
                        case 5:
                            caselle[i][j].setBackground(new Color(96, 56, 8));
                            break;
                    }
                    break;
            }
        }
        
        caselle[i][j].repaint();
    }
    public synchronized void completed() {
        this.isCompleted = true;
        System.out.println("FINE!");
    }
    public void resetColor() {
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                if(i == 0 && j == 0)
                    caselle[i][j].setBackground(new Color(255, 0, 0));
                else if (i == height - 1 && j == width - 1)
                    caselle[i][j].setBackground(new Color(51, 204, 0));
                else
                    caselle[i][j].setBackground(ThemeDetector.isDarkModeEnabled() ? new Color(102, 102, 102) : new Color(148, 148, 148));
    }
    void removeAllLabel() {
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                parent.getContentPane().remove(caselle[i][j]);
    }
}
