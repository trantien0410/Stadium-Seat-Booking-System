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

/**
 *
 * @author Admin
 */
public class Booking extends javax.swing.JFrame {
   String user,pass;
   String ticket_id;
    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
        addID();
        loadID();
//        addTeamOne();
//        addTeamTwo();
//        addTime();
//        addPrice();
//        addType();
    }
    public void loadID(){
    this.ticket_id =  txtID.getSelectedItem().toString();
}
//
    public Booking(String user, String pass) {
        initComponents();
        addID();
        loadID();
        this.user = user;
        this.pass = pass;
        
    }
    public void addID(){
        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
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
//    public void addTeamTwo(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select team2 from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtTeam2.addItem(rs.getString("team2"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addTime(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select time_match from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtTime.addItem(rs.getString("time_match"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addPrice(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select price from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtPrice.addItem(rs.getString("price"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addType(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select distinct ticket_type from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtType.addItem(rs.getString("ticket_type"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBooking = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        txtValue = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        txtID = new javax.swing.JComboBox<>();
        txtChecking = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 128));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Booking Details");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 128));
        jLabel2.setText(" Booking Seat System");

        btnBooking.setText("Booking");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnShow.setText("Show All Ticket");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        txtChecking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Team", "Price", "Time", "Type" }));

        jLabel3.setText("Choose ID ticket to book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtChecking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnBooking)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnShow)
                    .addComponent(txtChecking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBooking)
                    .addComponent(jButton2))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Confirm(ticket_id).setVisible(true);
    }//GEN-LAST:event_btnBookingActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new index(user,pass).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValueActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        txtResult.selectAll();
        txtResult.replaceSelection("");
        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";


 
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            String SQL = "select * from ticket";
            ResultSet rs = stmt.executeQuery(SQL);
 
            // Iterate through the data in the result set and display it.
            // process query results
            StringBuilder results = new StringBuilder();
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                results.append(metaData.getColumnName(i)).append("\t");
            }
            results.append("\n");
            //  Metadata
            while (rs.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    results.append(rs.getObject(i)).append("\t");
                }
                results.append("\n");
            }
            txtResult.setText(results.toString());
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            txtResult.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String checking =  txtChecking.getSelectedItem().toString();
        String value = txtValue.getText();
        txtResult.selectAll();
        txtResult.replaceSelection("");
        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            if("Price".equals(checking)){
                try{
                    String SQL = "select * from ticket where price='"+value+"'";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if("Time".equals(checking)){
                try{
                    String SQL = "select * from ticket where time_match='"+value+"'";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if("Type".equals(checking)){
                try{
                    String SQL = "select * from ticket where ticket_type='"+value+"'";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if("Team".equals(checking)){
                try{
                    String SQL = "(Select * from ticket where team1 = '"+value+"') union (Select * from ticket where team2 = '"+value+"')";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtChecking;
    private javax.swing.JComboBox<String> txtID;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
