/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import ll_project_programmed_jeisonsaborio_gabrielperez.PassWordException;
import org.apache.commons.codec.digest.DigestUtils;
import javax.swing.JOptionPane; 
import ll_project_programmed_jeisonsaborio_gabrielperez.Customer;
import ll_project_programmed_jeisonsaborio_gabrielperez.GlobalVariables;
import ll_project_programmed_jeisonsaborio_gabrielperez.PersonFactory;
/**
 *
 * @author Jeison
 */
public class RegisterMenu extends javax.swing.JFrame {
    PersonFactory personFactory = new PersonFactory();
    /**
     * Creates new form RegisterMenu
     */
    public RegisterMenu() {
        
        initComponents();
        TxtFStartDate.setText(ReturnDate());
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtLastName = new javax.swing.JTextField();
        TxtEmailAddress = new javax.swing.JTextField();
        TxtPhoneNumber = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        RadCustomer = new javax.swing.JRadioButton();
        RadStaff = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtCurrency = new javax.swing.JTextField();
        TxtCountry = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TxtFStartDate = new javax.swing.JTextField();
        BtoAddPerson = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RadMasculino = new javax.swing.JRadioButton();
        RadFemenino = new javax.swing.JRadioButton();
        TxtPPassWord = new javax.swing.JPasswordField();
        TxtPPasswordConfirmation = new javax.swing.JPasswordField();
        ButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Last Name:");

        jLabel4.setText("Email Address:");

        jLabel5.setText("PassWord:");

        jLabel6.setText("Password Confirmation:");

        jLabel7.setText("Phone Number:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setText("Type person");

        buttonGroup1.add(RadCustomer);
        RadCustomer.setText("Customer");
        RadCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadCustomerActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadStaff);
        RadStaff.setText("Staff");
        RadStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadStaffActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Currency:");

        jLabel11.setText("Country:");

        TxtCurrency.setEnabled(false);
        TxtCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCurrencyActionPerformed(evt);
            }
        });

        TxtCountry.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtCurrency)
                    .addComponent(TxtCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Start Date:");

        TxtFStartDate.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtFStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtFStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        BtoAddPerson.setText("Sign Up");
        BtoAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoAddPersonActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Sex:");

        buttonGroup2.add(RadMasculino);
        RadMasculino.setText("Masculino");

        buttonGroup2.add(RadFemenino);
        RadFemenino.setText("Femenino");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadFemenino)
                    .addComponent(RadMasculino))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RadMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadFemenino)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtPPassWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TxtName, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                .addComponent(TxtLastName))
                                            .addComponent(TxtPPasswordConfirmation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadCustomer)
                                    .addComponent(RadStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(ButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(BtoAddPerson)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TxtPPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtPPasswordConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadStaff)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtoAddPerson)
                    .addComponent(ButtonCancel))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static void PassWord(String passWord,String passWordConfirmation) throws PassWordException{
        if((!passWord.equals(passWordConfirmation))){
           throw new PassWordException("Different passwords");
        }
    }
    static void chekPassword(String password) throws PassWordException{
          char[] charPassword = password.toCharArray();
          
          if((password.length()>20) || (password.length()<6)){
              throw new PassWordException();
          }
          
          int count = 0;
          for (int i = 0; i < charPassword.length; i++) {
             
                int temp = (int) charPassword[i];
                if((temp>47) &&(temp<58) ){
                    count ++;
                }

          }
          if(count == 0){
              throw new PassWordException();
          }
 
      }
 
    private void BtoAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoAddPersonActionPerformed
  
        
        try {
            
            String passWord = new String (TxtPPassWord.getPassword());
            chekPassword(passWord);
            Add();
        } catch (PassWordException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
      
        
        
        
      
       
        
    }//GEN-LAST:event_BtoAddPersonActionPerformed

    public void Add() throws PassWordException{
        
        String name = TxtName.getText();
        String lastName = TxtLastName.getText();
        String email = TxtEmailAddress.getText();
        String passWord = new String (TxtPPassWord.getPassword());
        String passWordConfirmation = new String (TxtPPasswordConfirmation.getPassword());
        System.out.println(passWordConfirmation);
        try{
           System.out.println("Hola");
           PassWord(passWord,passWordConfirmation); 
        }catch(PassWordException e){
            JOptionPane.showMessageDialog(this, e.toString());
            return;
            
        }
        int phoneNumber;
        String passWordEncrypted=DigestUtils.md5Hex(passWord); 
        String passWordConfirmationEncrypted = DigestUtils.md5Hex(passWordConfirmation);
        char sex = 'a';
        if(RadMasculino.isSelected()){
            sex = 'M';
        }else if(RadFemenino.isSelected()){
            sex = 'F';
        }
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"Empty name");
            return;
        }
        
        if(lastName.equals(" ")){
            JOptionPane.showMessageDialog(this,"Insert last name");
            return;
        }
        if(passWord.equals(" ")){
             JOptionPane.showMessageDialog(this,"Insert passWord");
             return;
        }
        if(passWordConfirmation.equals(" ")){
             JOptionPane.showMessageDialog(this,"Insert passWord confirmation");
             return;
        }
        if(sex == 'a'){
            JOptionPane.showMessageDialog(this,"Select sex");
            return;
        }
        
        try{
            phoneNumber = Integer.parseInt(TxtPhoneNumber.getText());  
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Numbers only");
            TxtPhoneNumber.setText("");
            return;
        }
        if(RadCustomer.isSelected()){
   
            String currency = TxtCurrency.getText();
            String country = TxtCountry.getText();
            if(currency.equals(" ")){
                JOptionPane.showMessageDialog(this,"Insert currency");
                return;
            }
            if(country.equals(" ")){
                JOptionPane.showMessageDialog(this,"Insert country");
                return;
            }
            personFactory.personCreator(currency, country, phoneNumber, name, lastName, sex, email, passWordEncrypted, passWordConfirmationEncrypted, phoneNumber);
        }else if( RadStaff.isSelected()){ 
            String startDate = TxtFStartDate.getText();
            personFactory.personCreator(startDate, name, lastName, sex, email, passWordEncrypted, passWordConfirmationEncrypted, phoneNumber);
            
        }
        for(int i =0; i < GlobalVariables.getInstance().peopleList.size();i++){
            System.out.println(GlobalVariables.getInstance().peopleList.get(i));
        }
        this.dispose();
        LogInmMenu logInmMenu = new LogInmMenu();
        logInmMenu.setVisible(true);
        this.setVisible(false);

    }
    private void RadCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadCustomerActionPerformed
        // TODO add your handling code here:
        TxtFStartDate.disable();
        TxtCurrency.enable();
        TxtCurrency.setBackground(Color.white);
        TxtCountry.enable();        
        TxtCountry.setBackground(Color.white);
        
    }//GEN-LAST:event_RadCustomerActionPerformed

    private void RadStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadStaffActionPerformed
        // TODO add your handling code here:
        TxtCurrency.disable();
        TxtCurrency.setBackground(Color.gray);
        TxtCountry.disable();
        TxtCountry.setBackground(Color.gray);
        TxtFStartDate.enable();
        
    }//GEN-LAST:event_RadStaffActionPerformed

    private void TxtCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCurrencyActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        LogInmMenu logInmMenu = new LogInmMenu();
        logInmMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelActionPerformed

 
    public static String ReturnDate(){
        Date currentDate = new Date();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd/MM/YYYY");
        return formatoF.format(currentDate); 
        
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
            java.util.logging.Logger.getLogger(RegisterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoAddPerson;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JRadioButton RadCustomer;
    private javax.swing.JRadioButton RadFemenino;
    private javax.swing.JRadioButton RadMasculino;
    private javax.swing.JRadioButton RadStaff;
    private javax.swing.JTextField TxtCountry;
    private javax.swing.JTextField TxtCurrency;
    private javax.swing.JTextField TxtEmailAddress;
    private javax.swing.JTextField TxtFStartDate;
    private javax.swing.JTextField TxtLastName;
    private javax.swing.JTextField TxtName;
    private javax.swing.JPasswordField TxtPPassWord;
    private javax.swing.JPasswordField TxtPPasswordConfirmation;
    private javax.swing.JTextField TxtPhoneNumber;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
