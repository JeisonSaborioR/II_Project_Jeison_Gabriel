
package GUI;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar; 
import com.mxrck.autocompleter.TextAutoCompleter;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;
import java.util.ArrayList;


public final class StartMenu extends javax.swing.JFrame {
    TextAutoCompleter textAutoAcompleter;
    DateFormat dateFormat = DateFormat.getDateInstance();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<String> listDescription = new ArrayList<>();
    
    public StartMenu() {
        initComponents();      	
        textAutoAcompleter = new TextAutoCompleter( TxtSearchHotel );
        loadNameHotel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtSearchHotel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PanelHabitacion1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CobAdults = new javax.swing.JComboBox();
        CobChildren = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CobRooms = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        DateCheckIn = new com.toedter.calendar.JDateChooser();
        DateCheckOut = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        BtoLoginandaccount = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Search for hotel:");

        jLabel4.setText("Check-In");

        jLabel5.setText("Check-Out");

        PanelHabitacion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Adults");

        jLabel11.setText("Children");

        CobAdults.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));

        CobChildren.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabel8.setText(" Over eighteen");

        jLabel12.setText("0-17 years");

        CobRooms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));
        CobRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CobRoomsMouseClicked(evt);
            }
        });
        CobRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobRoomsActionPerformed(evt);
            }
        });

        jLabel6.setText("Rooms");

        javax.swing.GroupLayout PanelHabitacion1Layout = new javax.swing.GroupLayout(PanelHabitacion1);
        PanelHabitacion1.setLayout(PanelHabitacion1Layout);
        PanelHabitacion1Layout.setHorizontalGroup(
            PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHabitacion1Layout.createSequentialGroup()
                .addGroup(PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHabitacion1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18))
                    .addGroup(PanelHabitacion1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelHabitacion1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(42, 42, 42))
                            .addGroup(PanelHabitacion1Layout.createSequentialGroup()
                                .addComponent(CobRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CobAdults, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))))
                .addGroup(PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CobChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHabitacion1Layout.setVerticalGroup(
            PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHabitacion1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CobAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CobChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CobRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHabitacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        DateCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DateCheckInMouseClicked(evt);
            }
        });
        DateCheckIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateCheckInPropertyChange(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtoLoginandaccount.setText("Login and Account");
        BtoLoginandaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoLoginandaccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(DateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(DateCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(TxtSearchHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelHabitacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BtoLoginandaccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtSearchHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(PanelHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(BtoLoginandaccount))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void loadNameHotel(){
       
        for(int i = 0; i < GlobalVariables.getInstance().hotelList.size();i++){
            boolean response1 = validarList(GlobalVariables.getInstance().hotelList.get(i).getName());
            if(response1 == false){
                listDescription.add(GlobalVariables.getInstance().hotelList.get(i).getName());
               
            }
            boolean response2 = validarList(GlobalVariables.getInstance().hotelList.get(i).getAddress());
            if(response2 == false){
                listDescription.add(GlobalVariables.getInstance().hotelList.get(i).getAddress());
            }     
        }
        for(int j = 0; j < listDescription.size();j++){
            textAutoAcompleter.addItem(listDescription.get(j));
        }
    }

    public boolean validarList(String description){
        if(listDescription.isEmpty()){
            return false;
        }
        for(int j = 0; j < listDescription.size();j++){
            if(listDescription.get(j).equals(description)){
                return true;
            }
        }
        return false;
    }
    private void CobRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CobRoomsMouseClicked
        // TODO add your handling code here:
        int pos = CobRooms.getSelectedIndex();
        if(pos ==0){
            PanelHabitacion1.setVisible(true);
            jLabel10.setVisible(true);
            
        }
        if(pos !=0){
            PanelHabitacion1.setVisible(false);
            jLabel10.setVisible(false);
        }
    }//GEN-LAST:event_CobRoomsMouseClicked

    private void CobRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobRoomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobRoomsActionPerformed

    private void DateCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateCheckInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DateCheckInMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GlobalVariables.getInstance().entryDate =  dateFormat.format(DateCheckIn.getDate());
        GlobalVariables.getInstance().departureDate = dateFormat.format(DateCheckOut.getDate()); 
        GlobalVariables.getInstance().numberRooms = Integer.parseInt(CobRooms.getSelectedItem().toString());
        GlobalVariables.getInstance().amountAdults = Integer.parseInt(CobAdults.getSelectedItem().toString());
        GlobalVariables.getInstance().amountChildren = Integer.parseInt(CobChildren.getSelectedItem().toString());
        int startday = Integer.parseInt(GlobalVariables.getInstance().entryDate.split("/")[0]);
        int startmonth = Integer.parseInt(GlobalVariables.getInstance().entryDate.split("/")[1]);
        int startyear = Integer.parseInt(GlobalVariables.getInstance().entryDate.split("/")[2]);
        int departureday = Integer.parseInt(GlobalVariables.getInstance().departureDate.split("/")[0]);
        int departuremonth = Integer.parseInt(GlobalVariables.getInstance().departureDate.split("/")[1]);
        int departureyear = Integer.parseInt(GlobalVariables.getInstance().departureDate.split("/")[2]);
        Calendar c = Calendar.getInstance();
        Calendar startDate = new GregorianCalendar();
        startDate.set(startyear, startmonth, startday);
        Calendar departureDate = new GregorianCalendar();
        departureDate.set(departureyear, departuremonth, departureday);
        c.setTimeInMillis(departureDate.getTime().getTime() - startDate.getTime().getTime());
        GlobalVariables.getInstance().nightsDuration = c.get(Calendar.DAY_OF_YEAR);
        SearchResultsMenu searchResultsMenu = new SearchResultsMenu();
        searchResultsMenu.loardHotel(textAutoAcompleter.getItemSelected().toString());
        searchResultsMenu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateCheckInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateCheckInPropertyChange
        // TODO add your handling code here:
     
   
    }//GEN-LAST:event_DateCheckInPropertyChange

    private void BtoLoginandaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoLoginandaccountActionPerformed
        // TODO add your handling code here:
        LogInmMenu logInmMenu = new LogInmMenu();
        logInmMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtoLoginandaccountActionPerformed

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
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoLoginandaccount;
    private javax.swing.JComboBox CobAdults;
    private javax.swing.JComboBox CobChildren;
    private javax.swing.JComboBox CobRooms;
    private com.toedter.calendar.JDateChooser DateCheckIn;
    private com.toedter.calendar.JDateChooser DateCheckOut;
    private javax.swing.JPanel PanelHabitacion1;
    private javax.swing.JTextField TxtSearchHotel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
