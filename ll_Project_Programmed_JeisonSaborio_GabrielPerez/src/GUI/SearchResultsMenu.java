/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;
import ll_project_programmed_jeisonsaborio_gabrielperez.Hotel;
import ll_project_programmed_jeisonsaborio_gabrielperez.Room;


/**
 *
 * @author Jeison
 */
public class SearchResultsMenu extends javax.swing.JFrame {
    DefaultTableModel tableSearchHotels;
    String data1[][] = {};
    String cabeza1[] = {"Name","Address","Country","PhoneNumber","Accommodation type","Hour Check-In","Hour Check-Out"};
   
    public SearchResultsMenu() {
        initComponents();
        tableSearchHotels = new DefaultTableModel(data1,cabeza1);
        TabSearchHotels.setModel(tableSearchHotels);

    }
    
    public void loardHotel(String description){
        for(int i =0; i < GlobalVariables.getInstance().hotelList.size();i++){
            if((GlobalVariables.getInstance().hotelList.get(i).getAddress().equals(description))||(GlobalVariables.getInstance().hotelList.get(i).getName().equals(description))){
                Object datos[] = {GlobalVariables.getInstance().hotelList.get(i).getName(),
                    GlobalVariables.getInstance().hotelList.get(i).getAddress(),
                    GlobalVariables.getInstance().hotelList.get(i).getCountry(),
                    GlobalVariables.getInstance().hotelList.get(i).getPhoneNumber(),
                    GlobalVariables.getInstance().hotelList.get(i).getAccommodationType(),
                    GlobalVariables.getInstance().hotelList.get(i).getHourCheckIn(),
                    GlobalVariables.getInstance().hotelList.get(i).getHourCheckOut()};
                tableSearchHotels.addRow(datos);
            }
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabSearchHotels = new javax.swing.JTable();
        BtoBack = new javax.swing.JButton();
        BtoContinue = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BtoSortPrice = new javax.swing.JButton();
        ComboBoxRooms = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        ComboBoxLodging = new javax.swing.JComboBox();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search Results:");

        TabSearchHotels.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabSearchHotels);

        BtoBack.setText("Back");

        BtoContinue.setText("Continue");
        BtoContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoContinueActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sort by"));

        BtoSortPrice.setText("Sort price");
        BtoSortPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSortPriceActionPerformed(evt);
            }
        });

        ComboBoxRooms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suite", "Double", "Individual" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtoSortPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboBoxRooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(ComboBoxRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtoSortPrice))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sort by"));

        jButton2.setText("Start rating");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("     Stars low to high");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sort by"));

        jButton3.setText("Accommodation type");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ComboBoxLodging.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cabin", "Hotel", "Hostel", "All-in" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(ComboBoxLodging, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(ComboBoxLodging, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtoContinue)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtoBack)
                    .addComponent(BtoContinue))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtoContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoContinueActionPerformed
        // TODO add your handling code here:
        int row;
       
        row = TabSearchHotels.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(this,"Selections hotel");
        }else{
            String nameHotel = TabSearchHotels.getValueAt(row, 0).toString();
            for(int i = 0; i < GlobalVariables.getInstance().hotelList.size();i++){
                if(nameHotel.equals(GlobalVariables.getInstance().hotelList.get(i).getName())){
                    GlobalVariables.getInstance().hotel = GlobalVariables.getInstance().hotelList.get(i);
                    HotelMenu hotelMenu = new HotelMenu();
                    hotelMenu.setVisible(true);
                    this.dispose();
                    return;
                }
           
            }
        }
    }//GEN-LAST:event_BtoContinueActionPerformed
    
    
    private void BtoSortPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSortPriceActionPerformed

        String []fila= new String[3];
        String[]titulos = {"Name","Country", "Price"};
        TabSearchHotels.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TabSearchHotels.setModel(model);
            
            
        ArrayList<Hotel> hotels = GlobalVariables.getInstance().getAll();
        ArrayList<Hotel> hotelsTemp = new ArrayList<>();
        ArrayList <Integer> prices = new ArrayList<>();
        
                
        String typeRoom = ComboBoxRooms.getSelectedItem().toString();
        for (int i = 0; i < hotels.size(); i++) {
            ArrayList<Room> rooms = hotels.get(i).getRoomsList();
                for (int j = 0; j < rooms.size(); j++) {
                    if(rooms.get(j).getTypeRoom().getName().equals(typeRoom)){
                        hotelsTemp.add(hotels.get(i));
                        prices.add(rooms.get(j).getPrice());
                }
            }  
        }
       
        Collections.sort(prices);
        
        boolean state = false;
         
        for (int j = 0; j < prices.size(); j++) {            
            for (int i = 0; i < hotelsTemp.size(); i++) {                
               ArrayList<Room> roomsTemp = hotelsTemp.get(i).getRoomsList();
                for (int k = 0; k < roomsTemp.size(); k++) {
                    if (roomsTemp.get(k).getPrice() == prices.get(j)) {
               
                        fila[0]=hotelsTemp.get(i).getName();
                        fila[1]=hotelsTemp.get(i).getCountry();
                        fila[2]=String.valueOf(prices.get(j));
                        hotelsTemp.remove(i);
                        model.addRow(fila);
                        TabSearchHotels.setModel(model);
                        state = true;
                        break;
                    }
                }
                if(state){
                    state = false;
                    break;
                }
            }
        }
         
    }//GEN-LAST:event_BtoSortPriceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String []fila= new String[3];
        String[]titulos = {"Name","Country", "Stars"};
        TabSearchHotels.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TabSearchHotels.setModel(model);
            
            
        ArrayList<Hotel> hotels = GlobalVariables.getInstance().getAll();
        ArrayList<Hotel> hotelsTemp = new ArrayList<>();
        ArrayList <Integer> stars = new ArrayList<>();
        
                
       
        for (int i = 0; i < hotels.size(); i++) {
            hotelsTemp.add(hotels.get(i));
            stars.add(hotels.get(i).getNumberStars());
        }
        Collections.sort(stars);
        
     
         
        for (int j = 0; j < stars.size(); j++) {            
            for (int i = 0; i < hotelsTemp.size(); i++) {                
                if (hotelsTemp.get(i).getNumberStars() == stars.get(j)) {
               
                    fila[0]=hotelsTemp.get(i).getName();
                    fila[1]=hotelsTemp.get(i).getCountry();
                    fila[2]=String.valueOf(stars.get(j));
                    hotelsTemp.remove(i);
                    model.addRow(fila);
                    TabSearchHotels.setModel(model);
                    break;
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String []fila= new String[3];
        String[]titulos = {"Name","Country", "Accommodation type"};
        TabSearchHotels.repaint();
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        TabSearchHotels.setModel(model);
            
            
        ArrayList<Hotel> hotels = GlobalVariables.getInstance().getAll();
        
        String lodging = ComboBoxLodging.getSelectedItem().toString();
                
       
        for (int i = 0; i < hotels.size(); i++) {
            if(hotels.get(i).getAccommodationType().equals(lodging)){
                fila[0]=hotels.get(i).getName();
                    fila[1]=hotels.get(i).getCountry();
                    fila[2]=hotels.get(i).getAccommodationType();
                    model.addRow(fila);
                    TabSearchHotels.setModel(model);
            }
        }
    

        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResultsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoBack;
    private javax.swing.JButton BtoContinue;
    private javax.swing.JButton BtoSortPrice;
    private javax.swing.JComboBox ComboBoxLodging;
    private javax.swing.JComboBox ComboBoxRooms;
    private javax.swing.JTable TabSearchHotels;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
