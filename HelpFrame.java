/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppPackages;

/**
 *
 * @author user
 */
public class HelpFrame extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public HelpFrame() {
        initComponents();
        
        this.setLocation(this.getX()+420,this.getY());
        jLabel1.setText(String.format("<html>MAIN MENU <br><br>"
                + "\"\u2191 and \u2193\" - to change between clock, alarm, and stopwatch <br><br>"
                + "\"\u2190 and \u2192\" - to change between clock and MP3 player<br><br><br>"
                + "ALARM MENU<br><br>"
                + "\"space\" - to change between hour and minute setting<br><br>"
                + "\"+\" - to add the hour or minute<br><br>"
                + "\"-\" - to subtract the hour or minute<br><br>"
                + "\"enter\" - to set the alarm<br><br>"
                + "\"d\" - to dismiss the alarm<br><br><br>"
                + "STOPWATCH MENU<br><br>"
                + "\"s\" - to stop or start the stopwatch<br><br>"
                + "\"l\" - to record the lap times<br><br>"
                + "\"r\" - to reset the stopwatch<br><br><br>"
                + "MP3 MENU<br><br>"
                + "\"\u2191 and \u2193\" - to choose between available tracks <br><br>"
                + "\"enter\" - to play the selected track<br><br>"
                + "\"s\" - to stop the track<br><br>"
                + "\"n\" - to play the next track<br><br>"
                + "\"p\" - to play the previous track<br><br>"
                + "\"b\" - to browse your own tracks"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close_button = new javax.swing.JLabel();
        helpTitle = new javax.swing.JLabel();
        custom_frame = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backgroundHelpFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 645));
        setMinimumSize(new java.awt.Dimension(420, 645));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(420, 645));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/close.png"))); // NOI18N
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.setMaximumSize(new java.awt.Dimension(20, 20));
        close_button.setMinimumSize(new java.awt.Dimension(20, 20));
        close_button.setPreferredSize(new java.awt.Dimension(20, 20));
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 2, -1, -1));

        helpTitle.setForeground(new java.awt.Color(255, 255, 255));
        helpTitle.setText("Help - Command List");
        getContentPane().add(helpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 5, -1, -1));

        custom_frame.setBackground(new java.awt.Color(184, 191, 191));
        custom_frame.setForeground(new java.awt.Color(184, 191, 191));
        custom_frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackages/frame_abu.png"))); // NOI18N
        custom_frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                custom_frameMousePressed(evt);
            }
        });
        custom_frame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                custom_frameMouseDragged(evt);
            }
        });
        getContentPane().add(custom_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, -1, 30));

        jLabel1.setMaximumSize(new java.awt.Dimension(400, 365));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 365));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 365));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 400, 600));

        backgroundHelpFrame.setMaximumSize(new java.awt.Dimension(420, 210));
        backgroundHelpFrame.setMinimumSize(new java.awt.Dimension(420, 210));
        backgroundHelpFrame.setPreferredSize(new java.awt.Dimension(420, 210));
        getContentPane().add(backgroundHelpFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(420, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void custom_frameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custom_frameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_custom_frameMousePressed

    private void custom_frameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custom_frameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_custom_frameMouseDragged

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_close_buttonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundHelpFrame;
    private javax.swing.JLabel close_button;
    private javax.swing.JLabel custom_frame;
    private javax.swing.JLabel helpTitle;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
