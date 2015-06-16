/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.ReservationMenu.ReturnDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;

/**
 *
 * @author Gabriel
 */
public final class Consult7 extends javax.swing.JFrame {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    DefaultTableModel tableReservationCanceled;
    String data1[][] = {};
    String cabeza1[] = {"Name","Email Address","EntryDate","DepartureDate","NightsDuration"};
    
    DefaultTableModel tableReservationComplete;
    String data2[][] = {};
    String cabeza2[] = {"Name","Email Address","EntryDate","DepartureDate","NightsDuration"};
    public Consult7() {
        initComponents();
        tableReservationCanceled = new DefaultTableModel(data1,cabeza1);
        TabReservationCanceled.setModel(tableReservationCanceled);
        
        tableReservationComplete = new DefaultTableModel(data2,cabeza2);
        TabReservationComplete.setModel(tableReservationComplete);
        loadReservationCancelated();
        loadReservationComplete();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabReservationCanceled = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabReservationComplete = new javax.swing.JTable();
        BtoBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reservations canceled:");

        TabReservationCanceled.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabReservationCanceled);

        jLabel2.setText("Reservations  complete:");

        TabReservationComplete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TabReservationComplete);

        BtoBack.setText("Back");
        BtoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(BtoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(BtoBack)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadReservationCancelated(){
        for(int i = 0; i < GlobalVariables.getInstance().canceleteReservation.size();i++){
            Object datos[] = {GlobalVariables.getInstance().canceleteReservation.get(i).getCustomer().getName(),
                GlobalVariables.getInstance().canceleteReservation.get(i).getCustomer().getEmailAddress(),
                GlobalVariables.getInstance().canceleteReservation.get(i).getEntryDate(),
                GlobalVariables.getInstance().canceleteReservation.get(i).getDepartureDate(),
                GlobalVariables.getInstance().canceleteReservation.get(i).getNightsDuration()};
                tableReservationCanceled.addRow(datos);
        }
    }
    public void loadReservationComplete(){
        for(int i =0;i< GlobalVariables.getInstance().hotelList.size();i++ ){
            for(int j =0; j<GlobalVariables.getInstance().hotelList.get(i).getReservationList().size();j++){
                try{
                    
                    Date fechaDate1 = formato.parse(GlobalVariables.getInstance().hotelList.get(i).getReservationList().get(j).getEntryDate());
                    Date fechaDate2 = formato.parse(GlobalVariables.getInstance().hotelList.get(i).getReservationList().get(j).getDepartureDate());
                    Date fechaDate3 = formato.parse(ReservationMenu.ReturnDate());
                    if ((fechaDate1.before(fechaDate3)) &&(fechaDate2.before(fechaDate3))){
                        Object datos[] = {GlobalVariables.getInstance().hotelList.get(i).getReservationList().get(j).getCustomer().getName(),
                        GlobalVariables.getInstance().hotelList.get(i).getReservationList().get(j).getCustomer().getEmailAddress(),
                        GlobalVariables.getInstance().hotelList.get(i).getReservationList().get(j).getEntryDate(),
                        GlobalVariables.getInstance().hotelList.get(i).getReservationList().get(j).getDepartureDate(),
                        GlobalVariables.getInstance().hotelList.get(i).getReservationList().get(j).getNightsDuration()};
                        tableReservationComplete.addRow(datos);
                    }
                }catch (ParseException ex) {
                        Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             
        }
    }
    private void BtoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoBackActionPerformed
        // TODO add your handling code here:
        StaffMain staffMain = new StaffMain();
        staffMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtoBackActionPerformed

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
            java.util.logging.Logger.getLogger(Consult7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consult7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoBack;
    private javax.swing.JTable TabReservationCanceled;
    private javax.swing.JTable TabReservationComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
