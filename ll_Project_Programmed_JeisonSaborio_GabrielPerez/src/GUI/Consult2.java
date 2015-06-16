/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;
import ll_project_programmed_jeisonsaborio_gabrielperez.Hotel;
import ll_project_programmed_jeisonsaborio_gabrielperez.Reservation;

/**
 *
 * @author Gabriel
 */
public class Consult2 extends javax.swing.JFrame {

    /**
     * Creates new form Consult2
     */
    public Consult2() {
        initComponents();
        setHotels();
    }

    public void setHotels(){
        
        ComboBoxListHotels.removeAllItems();
        
        ArrayList<Hotel> hotels = GlobalVariables.getInstance().getAll();  
        for (int i = 0; i < hotels.size(); i++) {
            ComboBoxListHotels.addItem(hotels.get(i).getName());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxReservations = new javax.swing.JComboBox();
        ButtonList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableReservations = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        ComboBoxListHotels = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxMonth = new javax.swing.JComboBox();

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

        jLabel1.setText("Month");

        ComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(0, 419, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxListHotels, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonList)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonList))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxListHotels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(ComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String hotel;
     
    ArrayList<Reservation> reservations = new ArrayList<>();
    
    
    //Here reserves are extracted hotels
    private void ButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListActionPerformed

        hotel = ComboBoxListHotels.getSelectedItem().toString();
        int month = Integer.parseInt(ComboBoxMonth.getSelectedItem().toString());
        for (int i = 0; i < GlobalVariables.getInstance().getAll().size(); i++) {
            if (GlobalVariables.getInstance().getAll().get(i).getName().equals(hotel)) {
                ArrayList<Reservation> resevationsTemp= GlobalVariables.getInstance().getAll().get(i).getReservationList();
                for (int j = 0; j < resevationsTemp.size(); j++) {
                    if(getMontMonth(resevationsTemp.get(j).getEntryDate(),resevationsTemp.get(j).getDepartureDate(),month)){
                        reservations.add(resevationsTemp.get(j));
                    }
                }
                break;
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
    
    //This method calculates if the reservation is in the month consultation
    public static boolean getMontMonth(String entryDate, String DepartureDate, int month){
        
        String[] parts = entryDate.split("/");
        int foundMonth = Integer.parseInt(parts[1]); 
        
        String[] parts2 = DepartureDate.split("/");
        int foundMonth2 = Integer.parseInt(parts2[1]); 
        
        if ((month>foundMonth)||(month==foundMonth) && (month<foundMonth2)||(month==foundMonth2)){
            return true;
        }
        return false;
    }
    
    //here they are seeking outstanding reservations
    public void reservationsPending( ){
        String []fila= new String[3];
        String[]titulos = {"Hotel","Entry Date","Departure Date"};
        TableReservations.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TableReservations.setModel(model);

           
            
        for(int i = 0; i < reservations.size(); i++) {                
            if(compare(reservations.get(i).getDepartureDate())==false){
                fila[0]=hotel;
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
        String[]titulos = {"Hotel","Entry Date","Departure Date"};
        TableReservations.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TableReservations.setModel(model);

             
            
        for(int i = 0; i < reservations.size(); i++) {                
            if(reservations.get(i).isPaid()== true){
                fila[0]=hotel;
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
        String[]titulos = {"Hotel","Entry Date","Departure Date"};
        TableReservations.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TableReservations.setModel(model);

           
            
        for(int i = 0; i < reservations.size(); i++) {                
            if(compare(reservations.get(i).getDepartureDate())==true){
                fila[0]=hotel;
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
    
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Consult2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consult2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonList;
    private javax.swing.JComboBox ComboBoxListHotels;
    private javax.swing.JComboBox ComboBoxMonth;
    private javax.swing.JComboBox ComboBoxReservations;
    private javax.swing.JTable TableReservations;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
