/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_project_programmed_jeisonsaborio_gabrielperez;

import GUI.StartMenu;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Jeison
 */
public class SystemData {
    
    public void defaultData(){
        GlobalVariables.getInstance().hotelList.add(new Hotel("Budapest", "Quesada", "Costa Rica", 24608127, 3,"Hostel", "7 am", "7 pm", "nothing", 5, 1996));
        GlobalVariables.getInstance().hotelList.add(new Hotel("Budapest2", "Quesada", "Costa Rica", 24608128, 5,"Cabin", "7 am", "7 pm", "nothing", 5, 1995));     
        GlobalVariables.getInstance().hotelList.get(0).getRoomsList().add(new Room (1,new TypeRoom("Suite",2,12,"asd",true,false,true,false),1233));
        GlobalVariables.getInstance().hotelList.get(1).getRoomsList().add(new Room (2,new TypeRoom("Suite",2,12,"asd",true,false,true,false),5500));
        GlobalVariables.getInstance().hotelList.get(1).getRoomsList().add(new Room (3,new TypeRoom("Individual",2,12,"asd",true,false,true,false),3348));
        GlobalVariables.getInstance().hotelList.get(1).getRoomsList().add(new Room (4,new TypeRoom("Double",2,12,"asd",true,false,true,false),2500));
        GlobalVariables.getInstance().hotelList.get(0).getRoomsList().add(new Room (5,new TypeRoom("Double",2,12,"lol",true,false,true,false),3500));
        PersonFactory tf = new PersonFactory();
        //String currency, String country, int numberPartner, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber
        String password = "123";
        password = DigestUtils.md5Hex(password);
        tf.personCreator("Colon","Costa Rica", 756, "Jeison","Saborio",'F', "j", password, password,6345);
        tf.personCreator("Gabriel","asd","Carlos",'M',"asldfj","als","als",3242);
        tf.personCreator("Fabi", "asd", "sadf", 'F', "ahgf", "asd", "asdf", 4353);
        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);
    }
   
}
