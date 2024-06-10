/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package footballclubmanagement;

import java.util.*;

/**
 *
 * @author Sabit
 */
public class ViewAll extends javax.swing.JFrame {

    /**
     * Creates new form ViewAll
     */
    public ViewAll() {
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
        ViewLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewArea = new javax.swing.JTextArea();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setPreferredSize(new java.awt.Dimension(1080, 680));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        ViewLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        ViewLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewLabel.setText("View All P/C/F");

        ViewArea.setEditable(false);
        ViewArea.setBackground(new java.awt.Color(0, 0, 0));
        ViewArea.setColumns(20);
        ViewArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ViewArea.setForeground(new java.awt.Color(255, 255, 255));
        ViewArea.setRows(5);
        jScrollPane1.setViewportView(ViewArea);

        close.setBackground(new java.awt.Color(0, 51, 51));
        close.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(ViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(ViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(close)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setAnnouncements(List<Announcement> announcements) {
        List<String> announcementStrings = new ArrayList<>();
        ViewLabel.setText("Announcements");
        for (Announcement ann : announcements) {
            announcementStrings.add(ann.toString());
        }
        String dividers = String.join("\n--------------------------\n", announcementStrings);
        ViewArea.setText(dividers);
    }

    public void setPlayerInfo(List<Player> players) {
        List<String> playerStrings = new ArrayList<>();
        ViewLabel.setText("All Player Info");
        for (Player player : players) {
            playerStrings.add(player.toString());
        }
        String dividers = String.join("\n------------------------------\n", playerStrings);
        ViewArea.setText(dividers);
    }

    public void setCoachInfo(List<Coach> coaches) {
        List<String> coachStrings = new ArrayList<>();
        ViewLabel.setText("All Coach Info");
        for (Coach coach : coaches) {
            coachStrings.add(coach.toString());  // Assuming Coach class has a meaningful toString() method
        }
        String dividers = String.join("\n------------------------------\n", coachStrings);
        ViewArea.setText(dividers);
    }

    public void setPlayerRequestInfo(List<Request> requests) {
        List<String> requestStrings = new ArrayList<>();
        ViewLabel.setText("Player Requests");
        for (Request request : requests) {
            requestStrings.add(request.toString());
        }
        String dividers = String.join("\n------------------------------\n", requestStrings);
        ViewArea.setText(dividers);
    }

    public void setCoachRequestInfo(List<Request> requests) {
        String[] requestStrings = new String[requests.size()];
        ViewLabel.setText("Coach Requests");
        for (int i = 0; i < requests.size(); i++) {
            requestStrings[i] = requests.get(i).toString();
        }
        String dividers = String.join("\n------------------------------\n", requestStrings);
        ViewArea.setText(dividers);
    }

     public void setFinancesInfo(String[] playerStrings, double totalContractMoney) {
        String players = String.join("\n------------------------------\n", playerStrings);
        String financesInfo = players + "\n---------------------------\nTotal Contract Money: $" + totalContractMoney;
        
        ViewLabel.setText("Finances Information");
        ViewArea.setText(financesInfo);
    }

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
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ViewArea;
    private javax.swing.JLabel ViewLabel;
    private javax.swing.JButton close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}