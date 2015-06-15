package GUI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ll_project_programmed_jeisonsaborio_gabrielperez.Card;
import ll_project_programmed_jeisonsaborio_gabrielperez.Reservation;
import ll_project_programmed_jeisonsaborio_gabrielperez.Room;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeison
 */
public final class ReservationMenu extends javax.swing.JFrame {
    public  ArrayList<String> nameList;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String cardType;
    /**
     * Creates new form ReservationMenu
     */
    public ReservationMenu() {
        initComponents();
        customerDataLoad();
        loadSaveCards();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BtoName = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LabCustomerName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        CobSavedCards = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtNameCustomer = new javax.swing.JTextField();
        TxtLastNameCustomer = new javax.swing.JTextField();
        TxtCardType = new javax.swing.JTextField();
        CobCardType = new javax.swing.JComboBox();
        TxtCardNumber = new javax.swing.JTextField();
        TxtPSecurityCode = new javax.swing.JPasswordField();
        TxtFExpirationDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        BtoBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        RadioButtonPaid = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Person to stay in room:");

        jLabel2.setText("Name:");

        BtoName.setText("Add");
        BtoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer:");

        LabCustomerName.setText(" ");

        jButton1.setText("Reservation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CobSavedCards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CobSavedCardsMouseClicked(evt);
            }
        });
        CobSavedCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobSavedCardsActionPerformed(evt);
            }
        });

        jLabel4.setText("Saved cards");

        jLabel7.setText("Name:");

        jLabel8.setText("Last name:");

        jLabel9.setText("Card type:");

        jLabel10.setText("Card number:");

        jLabel11.setText("Security code");

        jLabel12.setText("Expiration Date:");

        CobCardType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "Visa Electron", "Master Card", "Discover", "American Express", "Maestro", " " }));
        CobCardType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CobCardTypeMouseClicked(evt);
            }
        });

        try {
            TxtFExpirationDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Selection card type");

        BtoBack.setText("Cancel");
        BtoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoBackActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pay already?"));

        buttonGroup1.add(RadioButtonPaid);
        RadioButtonPaid.setText("Yes");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(RadioButtonPaid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonPaid)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(BtoName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(BtoBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtLastNameCustomer))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtCardType))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtCardNumber))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtFExpirationDate))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtPSecurityCode)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(79, 79, 79))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(CobSavedCards, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CobCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtoName))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabCustomerName))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CobSavedCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TxtNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtLastNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtCardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CobCardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TxtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TxtPSecurityCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtFExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(BtoBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadSaveCards(){
        for(int i = 0; i < GlobalVariables.getInstance().person.getListCards().size();i++){
            CobSavedCards.addItem(GlobalVariables.getInstance().person.getListCards().get(i).getCardNumber());
        }
    }

 
    private void BtoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoNameActionPerformed

       
        String name = TxtName.getText();
        nameList.add(name);
        TxtName.setText("");
    }//GEN-LAST:event_BtoNameActionPerformed
    public static String ReturnDate(){
        Date currentDate = new Date();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd/MM/YYYY");
        return formatoF.format(currentDate); 
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int contRooms = 0;
    
        ArrayList<Room> roomList;
        roomList = new ArrayList();
        String name = TxtNameCustomer.getText();
        String lastName = TxtLastNameCustomer.getText();
        
        cardType = TxtCardType.getText();
        int cardNumber = Integer.parseInt(TxtCardNumber.getText());
        String securityCode = new String (TxtPSecurityCode.getPassword());
        String date = TxtFExpirationDate.getText();
        boolean response = validateCard(cardNumber);
        if(response == false){
            Card card = new Card(name,lastName,cardType,cardNumber,Integer.parseInt(securityCode),date);
            GlobalVariables.getInstance().person.getListCards().add(card);
        }
        boolean paid = false;
        if(RadioButtonPaid.isSelected()){
            paid = true;
        }
        for(int i = 0; i < GlobalVariables.getInstance().hotel.getRoomsList().size();i++){
            boolean busy = false;
         
            if(contRooms == GlobalVariables.getInstance().numberRooms){
                Reservation reservation = new Reservation(GlobalVariables.getInstance().entryDate,
                        GlobalVariables.getInstance().departureDate,
                        GlobalVariables.getInstance().nightsDuration,
                        roomList,nameList,GlobalVariables.getInstance().amountChildren,
                        GlobalVariables.getInstance().amountAdults,
                        GlobalVariables.getInstance().person,paid );
                reservation.reservationHotel(reservation);
                CustomerMain customerMain = new CustomerMain();
                customerMain.setVisible(true);
                this.dispose();
                return;
            }
            if(GlobalVariables.getInstance().hotel.getRoomsList().get(i).getTypeRoom().getName().equals(GlobalVariables.getInstance().typeRoom)){       
                JOptionPane.showMessageDialog(this, "Hola");
                for(int j = 0;j<GlobalVariables.getInstance().hotel.getReservationList().size();j++){    
                    for(int h=0;h<GlobalVariables.getInstance().hotel.getReservationList().get(j).getRoomsList().size();h++){
                        if(GlobalVariables.getInstance().hotel.getReservationList().get(j).getRoomsList().get(h).getRoomNumber() == GlobalVariables.getInstance().hotel.getRoomsList().get(i).getRoomNumber()){
                            JOptionPane.showMessageDialog(this, "wtf");
                            try {
                                Date fechaDate1 = formato.parse(GlobalVariables.getInstance().hotel.getReservationList().get(j).getEntryDate());
                                Date fechaDate2 = formato.parse(GlobalVariables.getInstance().hotel.getReservationList().get(j).getDepartureDate());
                                Date fechaDate3 = formato.parse(ReturnDate());
                                if ((fechaDate1.after(fechaDate3)) &&(fechaDate2.after(fechaDate3))){
                                    JOptionPane.showMessageDialog(this, "wtf");
                                    boolean response1 = validateRoom(j);
                                    if(response1 == true){
                                        JOptionPane.showMessageDialog(this, "No mames");
                                        busy = true;
                                      
                                 
                                    }
                                }
                            } catch (ParseException ex) {
                                Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                          
                           
                         
                        }      
                    }

                }
                if(busy == false){
                    roomList.add(GlobalVariables.getInstance().hotel.getRoomsList().get(i));
                    contRooms++;
                }


            }        
        } 
        JOptionPane.showMessageDialog(this, "Hotel without rooms");
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean validateRoom(int j){
        Calendar c = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance();
        int startday = Integer.parseInt(GlobalVariables.getInstance().hotel.getReservationList().get(j).getEntryDate().split("/")[0]);
        int startmonth = Integer.parseInt(GlobalVariables.getInstance().hotel.getReservationList().get(j).getEntryDate().split("/")[1]);
        int startyear = Integer.parseInt(GlobalVariables.getInstance().hotel.getReservationList().get(j).getEntryDate().split("/")[2]);
        int departureday = Integer.parseInt(GlobalVariables.getInstance().hotel.getReservationList().get(j).getDepartureDate().split("/")[0]);
        int departuremonth = Integer.parseInt(GlobalVariables.getInstance().hotel.getReservationList().get(j).getDepartureDate().split("/")[1]);
        int departureyear = Integer.parseInt(GlobalVariables.getInstance().hotel.getReservationList().get(j).getDepartureDate().split("/")[2]);
        Calendar startDate = new GregorianCalendar();
        startDate.set(startyear, startmonth, startday);
        Calendar departureDate = new GregorianCalendar();
        departureDate.set(departureyear, departuremonth, departureday);  
        
        
        int newStartday = Integer.parseInt(GlobalVariables.getInstance().entryDate.split("/")[0]);
        int newStartmonth = Integer.parseInt(GlobalVariables.getInstance().entryDate.split("/")[1]);
        int newStartyear = Integer.parseInt(GlobalVariables.getInstance().entryDate.split("/")[2]);
        int newDepartureday = Integer.parseInt(GlobalVariables.getInstance().departureDate.split("/")[0]);
        int newDeparturemonth = Integer.parseInt(GlobalVariables.getInstance().departureDate.split("/")[1]);
        int newDepartureyear = Integer.parseInt(GlobalVariables.getInstance().departureDate.split("/")[2]);
        Calendar newstartDate = new GregorianCalendar();
        newstartDate.set(newStartyear, newStartmonth, newStartday);
        Calendar newdepartureDate = new GregorianCalendar();
        newdepartureDate.set(newDepartureyear, newStartmonth, newStartday);
          
        if((startyear == newStartyear) || (startyear == newDepartureyear) || (departureyear == newStartyear)||(departureyear==newDepartureyear)){
            if(((startmonth == newStartmonth) && (departuremonth == newDeparturemonth))){
                for(int x = startday;x <= departureday ;x++){
                    for(int m = newStartday;m <=newDepartureday;m++ ){
                        if(m==x){
                            JOptionPane.showMessageDialog(this, "dota");
                            return true;
                        }
                    }
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Correcto");
                int daysStart = startDate.getActualMaximum(Calendar.DAY_OF_MONTH);
                int daysDeparture = departureDate.getActualMaximum(Calendar.DAY_OF_MONTH);
                for(int i = startday; i <=daysStart;i++){
                    
                    daysStart = startDate.getActualMaximum(Calendar.DAY_OF_MONTH);
                    int newdaysStart = newstartDate.getActualMaximum(Calendar.DAY_OF_MONTH);
                    int newdaysDeparture = newstartDate.getActualMaximum(Calendar.DAY_OF_MONTH);
                    for(int y = newStartday;y <= newdaysStart;y++){
                 
                        if((i==y)&&(newStartmonth==startmonth)){
                            return true;
                        } 
                        
                        if((i==newDepartureday)&&(newStartmonth==newDeparturemonth)){
                            JOptionPane.showMessageDialog(this, "1");
                            return false;
                        }
                        if((i==daysStart)&&(newStartmonth!=newDeparturemonth)){
                            JOptionPane.showMessageDialog(this, "3");
                            i=1;
                            startmonth++;
                        }
                        if((y==newdaysStart)&&(newStartmonth!=newDeparturemonth)){
                            JOptionPane.showMessageDialog(this, "4");
                            y=1;
                            newStartmonth++;
                        }
                    }
                }
                JOptionPane.showMessageDialog(this, "puto metodo");
                return false;
            }
        }
        JOptionPane.showMessageDialog(this, "Desgraciado");
        return false;
        
    }
 
    private void BtoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoBackActionPerformed
        // TODO add your handling code here:
        CustomerMain customerMain = new CustomerMain();
        customerMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtoBackActionPerformed

    private void CobSavedCardsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CobSavedCardsMouseClicked
        // TODO add your handling code here:
        int numberCard = Integer.parseInt(CobCardType.getSelectedItem().toString());
        for(int i = 0; i < GlobalVariables.getInstance().person.getListCards().size();i++){
            if(GlobalVariables.getInstance().person.getListCards().get(i).getSecurityCode() ==numberCard ){
                TxtNameCustomer.setText(GlobalVariables.getInstance().person.getListCards().get(i).getName());
                TxtLastNameCustomer.setText(GlobalVariables.getInstance().person.getListCards().get(i).getLastName());
                TxtLastNameCustomer.setText(GlobalVariables.getInstance().person.getListCards().get(i).getLastName());
                TxtCardType.setText(GlobalVariables.getInstance().person.getListCards().get(i).getCardType());
                TxtCardNumber.setText(Integer.toString(GlobalVariables.getInstance().person.getListCards().get(i).getCardNumber()));
                TxtPSecurityCode.setText(Integer.toString(GlobalVariables.getInstance().person.getListCards().get(i).getSecurityCode()));
                TxtPSecurityCode.setText(GlobalVariables.getInstance().person.getListCards().get(i).getExpirationDate());
            }
        }
    }//GEN-LAST:event_CobSavedCardsMouseClicked

    private void CobCardTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CobCardTypeMouseClicked
        // TODO add your handling code here:
        cardType = CobCardType.getSelectedItem().toString();
        TxtCardType.setText(cardType);
        
    }//GEN-LAST:event_CobCardTypeMouseClicked

    private void CobSavedCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobSavedCardsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobSavedCardsActionPerformed

    public boolean validateCard(int cardNumber){
        for(int j = 0; j < GlobalVariables.getInstance().person.getListCards().size();j++){
            if(GlobalVariables.getInstance().person.getListCards().get(j).getCardNumber() == cardNumber){
                return true;
            }
        }
        return false;
    }
             
   
    public void customerDataLoad(){
       LabCustomerName.setText(GlobalVariables.getInstance().person.getName());
        
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
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoBack;
    private javax.swing.JButton BtoName;
    private javax.swing.JComboBox CobCardType;
    private javax.swing.JComboBox CobSavedCards;
    private javax.swing.JLabel LabCustomerName;
    private javax.swing.JRadioButton RadioButtonPaid;
    private javax.swing.JTextField TxtCardNumber;
    private javax.swing.JTextField TxtCardType;
    private javax.swing.JFormattedTextField TxtFExpirationDate;
    private javax.swing.JTextField TxtLastNameCustomer;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtNameCustomer;
    private javax.swing.JPasswordField TxtPSecurityCode;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
