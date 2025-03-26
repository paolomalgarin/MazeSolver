package mazesolver;

import java.awt.Point;
import com.formdev.flatlaf.*;
import javax.swing.*;
import java.awt.Toolkit;

public class Gui extends javax.swing.JFrame {
    
    private int labSize;
    RisolviLabirintoThr r;
    
    public Gui() {
        initComponents();
        labSize = 45;
        
        Point caselle = new Point(labSize, labSize);  //20 small, 45 medium, 100 big
        labirinto1.generaLabirinto(caselle.y, caselle.x, this);
        this.setSize(15 + caselle.x * labirinto1.getCasellaSize(), 38 + caselle.y * labirinto1.getCasellaSize());
        
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/labyrinth.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labirinto1 = new mazesolver.Labirinto();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MazeSolver");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JOptionPane.showMessageDialog(this, "Premere il tasto destro per aprire le impostazioni.", "Info", JOptionPane.QUESTION_MESSAGE);
        r = new RisolviLabirintoThr(labirinto1);
        r.start();
    }//GEN-LAST:event_formWindowOpened

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if(evt.getButton() == 3)
            new Impostazioni(this).setVisible(true);
    }//GEN-LAST:event_formMousePressed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    if(ThemeDetector.isDarkModeEnabled())
                        UIManager.setLookAndFeel(new FlatDarculaLaf());
                    else
                        UIManager.setLookAndFeel(new FlatLightLaf());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new Gui().setVisible(true);
            }
        });
    }
    
    public Labirinto getLabirinto() {
        return this.labirinto1;
    }
    public int getLabirintoSize() {
        return this.labSize;
    }
    public int getThreadSpeed() {
        return RisolviLabirintoThr.getSpeed();
    }
    public void setThreadSpeed(RisolviLabirintoThr.Speed speed) {
        RisolviLabirintoThr.setSpeed(speed);
    }
    public void setLabSize(Labirinto.Size size) {
        boolean isNew = false;
        switch (size) {
            case EXTRA_SMALL:
                isNew = this.labSize != 10;
                this.labSize = 10;
                break;
            case SMALL:
                isNew = this.labSize != 20;
                this.labSize = 20;
                break;
            case MEDIUM:
                isNew = this.labSize != 45;
                this.labSize = 45;
                break;
            case LARGE:
                isNew = this.labSize != 80;
                this.labSize = 80;
                break;
            case EXTRA_LARGE:
                isNew = this.labSize != 100;
                this.labSize = 100;
                break;
            default:
                throw new AssertionError();
        }
        
        if(isNew) {
            RisolviLabirintoThr.interruptAll();
            try {
                Thread.sleep(RisolviLabirintoThr.getSpeed() + 10);

                labirinto1.removeAllLabel();
                Point caselle = new Point(labSize, labSize);  //20 small, 45 medium, 100 big
                labirinto1.generaLabirinto(caselle.y, caselle.x, this);
                this.setSize(15 + caselle.x * labirinto1.getCasellaSize(), 38 + caselle.y * labirinto1.getCasellaSize());

                r = new RisolviLabirintoThr(labirinto1);
                r.start();
            } catch (InterruptedException ex) {
            }
        }
    }
    public void setLabCellsSize(Labirinto.Size size) {
        if(this.labirinto1.setCasellaSize(size)) {
            RisolviLabirintoThr.interruptAll();
            try {
                Thread.sleep(RisolviLabirintoThr.getSpeed() + 10);

                labirinto1.removeAllLabel();
                Point caselle = new Point(labSize, labSize);  //20 small, 45 medium, 100 big
                labirinto1.generaLabirinto(caselle.y, caselle.x, this);
                this.setSize(15 + caselle.x * labirinto1.getCasellaSize(), 38 + caselle.y * labirinto1.getCasellaSize());

                r = new RisolviLabirintoThr(labirinto1);
                r.start();
            } catch (InterruptedException ex) {
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mazesolver.Labirinto labirinto1;
    // End of variables declaration//GEN-END:variables
}
