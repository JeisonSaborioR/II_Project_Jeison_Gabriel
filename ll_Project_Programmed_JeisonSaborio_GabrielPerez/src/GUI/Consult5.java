/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import ll_project_programmed_jeisonsaborio_gabrielperez.Consultation;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;
import ll_project_programmed_jeisonsaborio_gabrielperez.Hotel;

/**
 *
 * @author Gabriel
 */

//class used for handling the inquiries
//We initialize models tables
public final class Consult5 extends javax.swing.JFrame {
    String[] month = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nombiembre","Diciembre"};
    DefaultTableModel tableSearchHotels;
    String data1[][] = {};
    String cabeza1[] = {"Month","Amount reservation"};
    public Consult5() {
        initComponents();
        tableSearchHotels = new DefaultTableModel(data1,cabeza1);
        TabTopOcupation.setModel(tableSearchHotels);
        loadHotel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void loadHotel(){
        CobHotelSystem.removeAllItems(); 
        for (int i = 0; i < GlobalVariables.getInstance().hotelList.size(); i++) {
            CobHotelSystem.addItem(GlobalVariables.getInstance().hotelList.get(i).getName());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabTopOcupation = new javax.swing.JTable();
        BtoBack = new javax.swing.JButton();
        CobHotelSystem = new javax.swing.JComboBox();
        BtoSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Top occupation:");

        TabTopOcupation.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabTopOcupation);

        BtoBack.setText("Back");
        BtoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoBackActionPerformed(evt);
            }
        });

        BtoSearch.setText("Search");
        BtoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CobHotelSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtoBack))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CobHotelSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtoSearch))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(BtoBack)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoBackActionPerformed
        // TODO add your handling code here:
        StaffMain staffMain = new StaffMain();
        staffMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtoBackActionPerformed
//allows the path of the lists and validate dates to display the month
    private void BtoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<Consultation> MonthList= new ArrayList();
        int cont = 0;
        for(int x = 0; x < TabTopOcupation.getRowCount(); x++){
            tableSearchHotels.removeRow(x);
            x -= 1;
        }
        String hotel = CobHotelSystem.getSelectedItem().toString();
        for(int j = 0; j < GlobalVariables.getInstance().hotelList.size();j++){
            if(GlobalVariables.getInstance().hotelList.get(j).getName().equals(hotel)){
                for(int Contmonth = 1; Contmonth <=12;Contmonth++){
                    for(int i = 0; i< GlobalVariables.getInstance().hotelList.get(j).getReservationList().size();i++ ){
                        int startmonth = Integer.parseInt(GlobalVariables.getInstance().hotelList.get(j).getReservationList().get(i).getEntryDate().split("/")[1]);
                        int departuremonth = Integer.parseInt(GlobalVariables.getInstance().hotelList.get(j).getReservationList().get(i).getDepartureDate().split("/")[1]);
                       
                        if(startmonth == Contmonth){
                            cont++;      
                        }
                        if((startmonth != Contmonth) && (departuremonth == Contmonth)){
                            cont++;
                        }
                    
                             
                    }
                    Consultation consultation = new Consultation(cont,Contmonth-1);
                    MonthList.add(consultation);
                    cont=0;
                }
                  
                  
              
                    
            }
            
        }
        
        Collections.sort(MonthList, new Comparator<Consultation>() {

            @Override  //sorts the list
            public int compare(Consultation t, Consultation t1) {
                 return new Integer (t1.getCant()).compareTo((t.getCant()));
            }

        });
        int top3=0;
        for(int y =0;y < MonthList.size();y++){
            if(top3==3){
                return;
            }
            if(MonthList.get(y).getCant() != 0){
                for(int m=0;m<month.length-1;m++){
                    if(MonthList.get(y).getMonth()==m){
                        Object datos[] = {month[m],MonthList.get(y).getCant()};
                        tableSearchHotels.addRow(datos);
                        top3++;
                    }
                }
            }
       
        }
                              
    }//GEN-LAST:event_BtoSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Consult5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consult5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoBack;
    private javax.swing.JButton BtoSearch;
    private javax.swing.JComboBox CobHotelSystem;
    private javax.swing.JTable TabTopOcupation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
