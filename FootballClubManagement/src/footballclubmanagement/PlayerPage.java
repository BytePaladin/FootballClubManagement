/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package footballclubmanagement;

/**
 *
 * @author USER
 */
public class PlayerPage extends javax.swing.JFrame {

    /**
     * Creates new form PlayerPage
     */
    public PlayerPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Backdrop = new javax.swing.JPanel();
        ViewAnnouncements = new javax.swing.JButton();
        ViewOwnInformation = new javax.swing.JButton();
        ViewOtherPlayers = new javax.swing.JButton();
        MakeRequests = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(255, 255, 0));
        setName(""); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        Backdrop.setBackground(new java.awt.Color(204, 204, 255));

        ViewAnnouncements.setBackground(new java.awt.Color(0, 0, 102));
        ViewAnnouncements.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ViewAnnouncements.setForeground(new java.awt.Color(255, 255, 255));
        ViewAnnouncements.setText("View  Player Announcements");
        ViewAnnouncements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAnnouncementsActionPerformed(evt);
            }
        });

        ViewOwnInformation.setBackground(new java.awt.Color(0, 0, 102));
        ViewOwnInformation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ViewOwnInformation.setForeground(new java.awt.Color(255, 255, 255));
        ViewOwnInformation.setText("View Own Information");

        ViewOtherPlayers.setBackground(new java.awt.Color(0, 0, 102));
        ViewOtherPlayers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ViewOtherPlayers.setForeground(new java.awt.Color(255, 255, 255));
        ViewOtherPlayers.setText("View Other Players' Information");

        MakeRequests.setBackground(new java.awt.Color(0, 0, 102));
        MakeRequests.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MakeRequests.setForeground(new java.awt.Color(255, 255, 255));
        MakeRequests.setText("Make requests");

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        Title.setBackground(new java.awt.Color(0, 51, 51));
        Title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("PLAYER PAGE");

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footballclubmanagement/football-player (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout BackdropLayout = new javax.swing.GroupLayout(Backdrop);
        Backdrop.setLayout(BackdropLayout);
        BackdropLayout.setHorizontalGroup(
            BackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackdropLayout.createSequentialGroup()
                .addGroup(BackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackdropLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(BackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MakeRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewOtherPlayers)
                            .addComponent(ViewOwnInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewAnnouncements, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackdropLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        BackdropLayout.setVerticalGroup(
            BackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackdropLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ViewAnnouncements)
                .addGap(41, 41, 41)
                .addComponent(ViewOwnInformation)
                .addGap(38, 38, 38)
                .addComponent(ViewOtherPlayers)
                .addGap(39, 39, 39)
                .addComponent(MakeRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Backdrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Backdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewAnnouncementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAnnouncementsActionPerformed
        // TODO add your handling code here:
                
    }//GEN-LAST:event_ViewAnnouncementsActionPerformed

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
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backdrop;
    private javax.swing.JButton MakeRequests;
    private javax.swing.JLabel Title;
    private javax.swing.JButton ViewAnnouncements;
    private javax.swing.JButton ViewOtherPlayers;
    private javax.swing.JButton ViewOwnInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
