/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package booking_stadium_prj_pdm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author Admin
 */
public class EditTicket extends javax.swing.JFrame {
   
    /**
     * Creates new form EditTicket
     */
    public EditTicket() {
        initComponents();
        AddID();
    }
    public void AddID(){
        String connectionUrl = new ConnectionProvider().getConnection();
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            String SQL = "select ticket_id from ticket";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                txtID.addItem(rs.getString("ticket_id"));
            }
    
           
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
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
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtID = new javax.swing.JComboBox<>();
        txtTeam1 = new javax.swing.JTextField();
        txtTeam2 = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtActive = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 229, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(167, 105, 42));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edit Ticket Page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 25, 270, 51));

        btnSearch.setBackground(new java.awt.Color(134, 89, 45));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 80, -1, -1));

        btnCancel.setBackground(new java.awt.Color(134, 89, 45));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 96, -1));

        txtID.setBackground(new java.awt.Color(255, 247, 230));
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(153, 77, 0));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 94, 325, -1));

        txtTeam1.setBackground(new java.awt.Color(255, 247, 230));
        txtTeam1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTeam1.setForeground(new java.awt.Color(153, 77, 0));
        txtTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeam1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 141, 325, -1));

        txtTeam2.setBackground(new java.awt.Color(255, 247, 230));
        txtTeam2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTeam2.setForeground(new java.awt.Color(153, 77, 0));
        jPanel1.add(txtTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 184, 325, -1));

        txtTime.setBackground(new java.awt.Color(255, 247, 230));
        txtTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime.setForeground(new java.awt.Color(153, 77, 0));
        jPanel1.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 227, 325, -1));

        txtQuantity.setBackground(new java.awt.Color(255, 247, 230));
        txtQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(153, 77, 0));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 270, 325, -1));

        txtPrice.setBackground(new java.awt.Color(255, 247, 230));
        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(153, 77, 0));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 313, 325, -1));

        txtType.setBackground(new java.awt.Color(255, 247, 230));
        txtType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtType.setForeground(new java.awt.Color(153, 77, 0));
        jPanel1.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 362, 325, -1));

        txtDate.setBackground(new java.awt.Color(255, 247, 230));
        txtDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDate.setForeground(new java.awt.Color(153, 77, 0));
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 406, 325, -1));

        txtActive.setBackground(new java.awt.Color(255, 247, 230));
        txtActive.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtActive.setForeground(new java.awt.Color(153, 77, 0));
        txtActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));
        jPanel1.add(txtActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 452, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(134, 89, 45));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Ticket");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        btnDelete.setBackground(new java.awt.Color(134, 89, 45));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 98, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 136, 0));
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 316, 84, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 136, 0));
        jLabel5.setText("Time");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 230, 98, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 136, 0));
        jLabel6.setText("Quantity Of Seats");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 273, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 136, 0));
        jLabel4.setText("Team Two ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 187, 98, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 136, 0));
        jLabel9.setText("Team One");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 145, 98, 22));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 136, 0));
        jLabel10.setText("Choose ID Ticket");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 97, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 136, 0));
        jLabel3.setText("Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 365, 84, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 136, 0));
        jLabel8.setText("Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 409, 84, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 136, 0));
        jLabel11.setText("Active");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 455, 84, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        new adminHomePage().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String connectionUrl = new ConnectionProvider().getConnection();
        String ID = (String) txtID.getSelectedItem();
        String team1     = txtTeam1.getText();
        String team2     = txtTeam2.getText();
        String time      = txtTime.getText();
        String quantity  = txtQuantity.getText();
        String price     = txtPrice.getText();
        String type      = txtType.getText();
        String date      = txtDate.getText();
        String active       = (String) txtActive.getSelectedItem();
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            String SQL = "update ticket set team1='"+team1+"', team2='"+team2+"' , time_match='"+time+"' , seat_number='"+quantity+"', price='"+price+"' , ticket_type='"+type+"', date_ticket='"+date+"', isActive='"+active+"' where ticket_id='"+ID+"'";
            stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null, "Successfully Update Ticket !", "Message", JOptionPane.WARNING_MESSAGE);
    
           
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String ID =  txtID.getSelectedItem().toString();
        String connectionUrl = new ConnectionProvider().getConnection();
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            String SQL = "select * from ticket where ticket_id='"+ID+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                txtTeam1.setText(rs.getString("team1"));
                txtTeam2.setText(rs.getString("team2"));
                txtTime.setText(rs.getString("time_match"));
                txtQuantity.setText(rs.getString("seat_number"));
                txtPrice.setText(rs.getString("price"));
                txtType.setText(rs.getString("ticket_type"));
                txtDate.setText(rs.getString("date_ticket"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeam1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String connectionUrl = new ConnectionProvider().getConnection();
        String ID = (String) txtID.getSelectedItem();
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            String SQL = "delete from ticket where  ticket_id='"+ID+"'";
            stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null, "Successfully Delete Ticket !", "Message", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            new EditTicket().setVisible(true);
           
        } // Handle any errors that may have occurred. // Handle any errors that may have occurred. // Handle any errors that may have occurred. // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
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
            java.util.logging.Logger.getLogger(EditTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txtActive;
    private javax.swing.JTextField txtDate;
    private javax.swing.JComboBox<String> txtID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTeam1;
    private javax.swing.JTextField txtTeam2;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
