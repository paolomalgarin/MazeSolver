package mazesolver;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author paolo
 */
public class Impostazioni extends javax.swing.JFrame {

    Gui gui;
    
    public Impostazioni(Gui gui) {
        initComponents();
        this.gui = gui;
        
        setLocationRelativeTo(null);
        gui.setEnabled(false);
        
        //aggiunta radio buttons
        ThreadSpeedRBGR.add(ThreadSpeedVeryFastRB);
        ThreadSpeedRBGR.add(ThreadSpeedFastRB);
        ThreadSpeedRBGR.add(ThreadSpeedMediumRB);
        ThreadSpeedRBGR.add(ThreadSpeedSlowRB);
        ThreadSpeedRBGR.add(ThreadSpeedVerySlowRB);
        
        MazeSizeRBGR.add(ThreadSpeedVeryFastRB1);
        MazeSizeRBGR.add(ThreadSpeedFastRB1);
        MazeSizeRBGR.add(ThreadSpeedMediumRB1);
        MazeSizeRBGR.add(ThreadSpeedSlowRB1);
        MazeSizeRBGR.add(ThreadSpeedVerySlowRB1);
        
        MazeCellSizeRBGR.add(ThreadSpeedVeryFastRB23);
        MazeCellSizeRBGR.add(ThreadSpeedFastRB23);
        MazeCellSizeRBGR.add(ThreadSpeedMediumRB23);
        MazeCellSizeRBGR.add(ThreadSpeedSlowRB23);
        MazeCellSizeRBGR.add(ThreadSpeedVerySlowRB23);
        
        //illuminazione radio button
        switch (gui.getThreadSpeed()) {
            case 10:
                ThreadSpeedVeryFastRB.setSelected(true);
                break;
            case 25:
                ThreadSpeedFastRB.setSelected(true);
                break;
            case 50:
                ThreadSpeedMediumRB.setSelected(true);
                break;
            case 300:
                ThreadSpeedSlowRB.setSelected(true);
                break;
            case 1000:
                ThreadSpeedVerySlowRB.setSelected(true);
                break;
            default:
                throw new AssertionError();
        }
        switch (gui.getLabirintoSize()) {
            case 10:
                ThreadSpeedVeryFastRB1.setSelected(true);
                break;
            case 20:
                ThreadSpeedFastRB1.setSelected(true);
                break;
            case 45:
                ThreadSpeedMediumRB1.setSelected(true);
                break;
            case 80:
                ThreadSpeedSlowRB1.setSelected(true);
                break;
            case 100:
                ThreadSpeedVerySlowRB1.setSelected(true);
                break;
            default:
                throw new AssertionError();
        }
        switch (gui.getLabirinto().getCasellaSize()) {
            case 7:
                ThreadSpeedVeryFastRB23.setSelected(true);
                break;
            case 10:
                ThreadSpeedFastRB23.setSelected(true);
                break;
            case 15:
                ThreadSpeedMediumRB23.setSelected(true);
                break;
            case 20:
                ThreadSpeedSlowRB23.setSelected(true);
                break;
            case 30:
                ThreadSpeedVerySlowRB23.setSelected(true);
                break;
            default:
                throw new AssertionError();
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThreadSpeedRBGR = new javax.swing.ButtonGroup();
        MazeSizeRBGR = new javax.swing.ButtonGroup();
        MazeCellSizeRBGR = new javax.swing.ButtonGroup();
        jPanel24 = new javax.swing.JPanel();
        ThreadSpeedVeryFastRB23 = new javax.swing.JRadioButton();
        ThreadSpeedFastRB23 = new javax.swing.JRadioButton();
        ThreadSpeedMediumRB23 = new javax.swing.JRadioButton();
        ThreadSpeedSlowRB23 = new javax.swing.JRadioButton();
        ThreadSpeedVerySlowRB23 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        ThreadSpeedVeryFastRB = new javax.swing.JRadioButton();
        ThreadSpeedFastRB = new javax.swing.JRadioButton();
        ThreadSpeedMediumRB = new javax.swing.JRadioButton();
        ThreadSpeedSlowRB = new javax.swing.JRadioButton();
        ThreadSpeedVerySlowRB = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        ThreadSpeedVeryFastRB1 = new javax.swing.JRadioButton();
        ThreadSpeedFastRB1 = new javax.swing.JRadioButton();
        ThreadSpeedMediumRB1 = new javax.swing.JRadioButton();
        ThreadSpeedSlowRB1 = new javax.swing.JRadioButton();
        ThreadSpeedVerySlowRB1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("⚙ ️Impostazioni");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Maze Cells Dimensions"));

        ThreadSpeedVeryFastRB23.setText("Extra Small");
        ThreadSpeedVeryFastRB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreadSpeedVeryFastRB23ActionPerformed(evt);
            }
        });

        ThreadSpeedFastRB23.setText("Small");
        ThreadSpeedFastRB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreadSpeedFastRB23ActionPerformed(evt);
            }
        });

        ThreadSpeedMediumRB23.setText("Medium");

        ThreadSpeedSlowRB23.setText("Large");

        ThreadSpeedVerySlowRB23.setText("Extra Large");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThreadSpeedVeryFastRB23, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ThreadSpeedVerySlowRB23)
                            .addComponent(ThreadSpeedSlowRB23)
                            .addComponent(ThreadSpeedMediumRB23)
                            .addComponent(ThreadSpeedFastRB23))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThreadSpeedVeryFastRB23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedFastRB23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedMediumRB23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedSlowRB23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedVerySlowRB23)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thread Speed"));

        ThreadSpeedVeryFastRB.setText("Very Fast");
        ThreadSpeedVeryFastRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreadSpeedVeryFastRBActionPerformed(evt);
            }
        });

        ThreadSpeedFastRB.setText("Fast");

        ThreadSpeedMediumRB.setText("Medium");

        ThreadSpeedSlowRB.setText("Slow");

        ThreadSpeedVerySlowRB.setText("Very Slow");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThreadSpeedVeryFastRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ThreadSpeedVerySlowRB)
                            .addComponent(ThreadSpeedSlowRB)
                            .addComponent(ThreadSpeedMediumRB)
                            .addComponent(ThreadSpeedFastRB))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThreadSpeedVeryFastRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedFastRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedMediumRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedSlowRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedVerySlowRB)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Maze Dimensions"));

        ThreadSpeedVeryFastRB1.setText("Extra Small");
        ThreadSpeedVeryFastRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreadSpeedVeryFastRB1ActionPerformed(evt);
            }
        });

        ThreadSpeedFastRB1.setText("Small");
        ThreadSpeedFastRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreadSpeedFastRB1ActionPerformed(evt);
            }
        });

        ThreadSpeedMediumRB1.setText("Medium");

        ThreadSpeedSlowRB1.setText("Large");

        ThreadSpeedVerySlowRB1.setText("Extra Large");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThreadSpeedVeryFastRB1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ThreadSpeedVerySlowRB1)
                            .addComponent(ThreadSpeedSlowRB1)
                            .addComponent(ThreadSpeedMediumRB1)
                            .addComponent(ThreadSpeedFastRB1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThreadSpeedVeryFastRB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedFastRB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedMediumRB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedSlowRB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadSpeedVerySlowRB1)
                .addContainerGap())
        );

        jButton1.setBackground(ThemeDetector.isDarkModeEnabled() ? new java.awt.Color(117, 43, 43) : new java.awt.Color(255, 51, 51));
        jButton1.setText("ANNULLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(ThemeDetector.isDarkModeEnabled() ? new java.awt.Color(55,150,55) : new java.awt.Color(102,255,102));
        jButton2.setText("SALVA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThreadSpeedVeryFastRB23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreadSpeedVeryFastRB23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreadSpeedVeryFastRB23ActionPerformed

    private void ThreadSpeedFastRB23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreadSpeedFastRB23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreadSpeedFastRB23ActionPerformed

    private void ThreadSpeedVeryFastRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreadSpeedVeryFastRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreadSpeedVeryFastRBActionPerformed

    private void ThreadSpeedVeryFastRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreadSpeedVeryFastRB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreadSpeedVeryFastRB1ActionPerformed

    private void ThreadSpeedFastRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreadSpeedFastRB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreadSpeedFastRB1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gui.setEnabled(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch (getSelectedButtonText(ThreadSpeedRBGR)) {
            case "Very Fast":
            gui.setThreadSpeed(RisolviLabirintoThr.Speed.VERY_FAST);
            break;
            case "Fast":
            gui.setThreadSpeed(RisolviLabirintoThr.Speed.FAST);
            break;
            case "Medium":
            gui.setThreadSpeed(RisolviLabirintoThr.Speed.MEDIUM);
            break;
            case "Slow":
            gui.setThreadSpeed(RisolviLabirintoThr.Speed.SLOW);
            break;
            case "Very Slow":
            gui.setThreadSpeed(RisolviLabirintoThr.Speed.VERY_SLOW);
            break;
            default:
                break;
        }
        if(RisolviLabirintoThr.isWorking())
            JOptionPane.showMessageDialog(null, "Non puoi modificare le dimensioni mentre sta venendo mostrata la soluzione", "Warning", JOptionPane.QUESTION_MESSAGE);
        else {
            switch (getSelectedButtonText(MazeSizeRBGR)) {
                case "Extra Small":
                gui.setLabSize(Labirinto.Size.EXTRA_SMALL);
                break;
                case "Small":
                gui.setLabSize(Labirinto.Size.SMALL);
                break;
                case "Medium":
                gui.setLabSize(Labirinto.Size.MEDIUM);
                break;
                case "Large":
                gui.setLabSize(Labirinto.Size.LARGE);
                break;
                case "Extra Large":
                gui.setLabSize(Labirinto.Size.EXTRA_LARGE);
                break;
                default:
                    break;
            }
            switch (getSelectedButtonText(MazeCellSizeRBGR)) {
                case "Extra Small":
                gui.setLabCellsSize(Labirinto.Size.EXTRA_SMALL);
                break;
                case "Small":
                gui.setLabCellsSize(Labirinto.Size.SMALL);
                break;
                case "Medium":
                gui.setLabCellsSize(Labirinto.Size.MEDIUM);
                break;
                case "Large":
                gui.setLabCellsSize(Labirinto.Size.LARGE);
                break;
                case "Extra Large":
                gui.setLabCellsSize(Labirinto.Size.EXTRA_LARGE);
                break;
                default:
                    break;
            }
        }

        gui.setEnabled(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        gui.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        try {
            for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = buttons.nextElement();

                if (button.isSelected()) {
                    return button.getText();
                }
            }
        } catch (Exception e) {}

        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MazeCellSizeRBGR;
    private javax.swing.ButtonGroup MazeSizeRBGR;
    private javax.swing.JRadioButton ThreadSpeedFastRB;
    private javax.swing.JRadioButton ThreadSpeedFastRB1;
    private javax.swing.JRadioButton ThreadSpeedFastRB23;
    private javax.swing.JRadioButton ThreadSpeedMediumRB;
    private javax.swing.JRadioButton ThreadSpeedMediumRB1;
    private javax.swing.JRadioButton ThreadSpeedMediumRB23;
    private javax.swing.ButtonGroup ThreadSpeedRBGR;
    private javax.swing.JRadioButton ThreadSpeedSlowRB;
    private javax.swing.JRadioButton ThreadSpeedSlowRB1;
    private javax.swing.JRadioButton ThreadSpeedSlowRB23;
    private javax.swing.JRadioButton ThreadSpeedVeryFastRB;
    private javax.swing.JRadioButton ThreadSpeedVeryFastRB1;
    private javax.swing.JRadioButton ThreadSpeedVeryFastRB23;
    private javax.swing.JRadioButton ThreadSpeedVerySlowRB;
    private javax.swing.JRadioButton ThreadSpeedVerySlowRB1;
    private javax.swing.JRadioButton ThreadSpeedVerySlowRB23;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    // End of variables declaration//GEN-END:variables
}
