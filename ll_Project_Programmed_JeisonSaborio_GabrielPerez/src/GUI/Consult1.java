/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;
import ll_project_programmed_jeisonsaborio_gabrielperez.Hotel;
import ll_project_programmed_jeisonsaborio_gabrielperez.Reservation;

/**
 *
 * @author Gabriel
 */
public class Consult1 extends javax.swing.JFrame {

    /**
     * Creates new form Consult1
     */
    public Consult1() {
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

        ComboBoxReservations = new javax.swing.JComboBox();
        ButtonList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableReservations = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        TextFieldEmailOfCustomer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBoxReservations.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pending", "Completed", "Cancelled" }));

        ButtonList.setText("Search");
        ButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonListActionPerformed(evt);
            }
        });

        TableReservations.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableReservations);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Email of customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldEmailOfCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonList)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonList)
                    .addComponent(TextFieldEmailOfCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    
    ArrayList<Reservation> reservations = new ArrayList<>();
    String customer;
    
    //Here reserves are extracted customers
    private void ButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListActionPerformed
        
        String emailAddress = TextFieldEmailOfCustomer.getText().toString();
        
        for (int i = 0; i < GlobalVariables.getInstance().getAl().size(); i++) {
            if (GlobalVariables.getInstance().getAl().get(i).getEmailAddress().equals(emailAddress)) {
                customer = GlobalVariables.getInstance().getAl().get(i).getName();
                reservations = GlobalVariables.getInstance().getAl().get(i).getListReservation();
            }
        }
        

        if(ComboBoxReservations.getSelectedIndex() == 0){
            reservationsPending();
        }else if(ComboBoxReservations.getSelectedIndex() == 1){
            reservationsCompleted(); 
        }else{
            reservationsCancelled();
        }
    }//GEN-LAST:event_ButtonListActionPerformed
   
    
    
    //here they are seeking outstanding reservations
    public void reservationsPending( ){
        String []fila= new String[3];
        String[]titulos = {"Customer","Entry Date","Departure Date"};
        TableReservations.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TableReservations.setModel(model);

           
            
        for(int i = 0; i < reservations.size(); i++) {                
            if(compare(reservations.get(i).getDepartureDate())==false){
                fila[0]=customer;
                fila[1]=reservations.get(i).getEntryDate();
                fila[2]=reservations.get(i).getDepartureDate();
                        
                model.addRow(fila);
                TableReservations.setModel(model);
            }   
        }
    }
    
    
    //Reservations canceled (payments) here  are sought 
    public void reservationsCancelled( ){
        String []fila= new String[3];
        String[]titulos = {"Customer","Entry Date","Departure Date"};
        TableReservations.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TableReservations.setModel(model);

             
            
        for(int i = 0; i < reservations.size(); i++) {                
            if(reservations.get(i).isPaid()== true){
                fila[0]=customer;
                fila[1]=reservations.get(i).getEntryDate();
                fila[2]=reservations.get(i).getDepartureDate();
                        
                model.addRow(fila);
                TableReservations.setModel(model);
            }   
        }        
    }
    
    
    //here are searched reserves which their departure has expired
    public void reservationsCompleted( ){
        String []fila= new String[3];
        String[]titulos = {"Customer","Entry Date","Departure Date"};
        TableReservations.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TableReservations.setModel(model);

           
            
        for(int i = 0; i < reservations.size(); i++) {                
            if(compare(reservations.get(i).getDepartureDate())==true){
                fila[0]=customer;
                fila[1]=reservations.get(i).getEntryDate();
                fila[2]=reservations.get(i).getDepartureDate();
                        
                model.addRow(fila);
                TableReservations.setModel(model);
            }   
        }
    }
    
    
    //This method is used to compare dates
    public static boolean compare(String date){
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSistema=formateador.format(fechaActual); 

        try {

            SimpleDateFormat formateador2 = new SimpleDateFormat("dd/MM/yyyy"); 
            Date date1 = formateador2.parse(date);
            Date systemDate = formateador2.parse(fechaSistema);

            
            if ( date1.before(systemDate) ){
                return true;
            }else if(systemDate.before(date1)){
                return false;
            }else{
                return false;
            }
        } catch (ParseException e) {
            System.out.println("Se Produjo un Error!!!  "+e.getMessage());
        }  
  
        return true;
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Consult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consult1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonList;
    private javax.swing.JComboBox ComboBoxReservations;
    private javax.swing.JTable TableReservations;
    private javax.swing.JTextField TextFieldEmailOfCustomer;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
