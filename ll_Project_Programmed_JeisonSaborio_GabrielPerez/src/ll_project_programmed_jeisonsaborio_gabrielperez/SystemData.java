/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_project_programmed_jeisonsaborio_gabrielperez;

import GUI.StartMenu;
import java.util.ArrayList;
import org.apache.commons.codec.digest.DigestUtils;

//Class that contains the default system
public class SystemData {
                                                                                           
    public void defaultData(){
        PersonFactory tf = new PersonFactory();
        //String currency, String country, int numberPartner, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber
        String password = "123";
        password = DigestUtils.md5Hex(password);
        String password2 = "als";
        password2 = DigestUtils.md5Hex(password2);
        tf.personCreator("Colon","Costa Rica", 756, "Jeison","Saborio",'F', "j", password, password,6345);
        tf.personCreator("23/06/2014","Carlos","Valverde",'M',"c",password2,password2,3242);
        tf.personCreator("Fabi", "asd", "sadf", 'F', "ahgf", "asd", "asdf", 4353);
        Room room = new Room(15,new TypeRoom("Suit", 2, 4 ,  "",  true,  false,  false,  true),2500);      
        
        
        
        GlobalVariables.getInstance().hotelList.add(new Hotel("Budapest", "Quesada", "Costa Rica", 24608127, 3,"Hotel", "7 am", "7 pm", "nothing", 5, 1996));
        GlobalVariables.getInstance().hotelList.add(new Hotel("Budapest2", "Quesada", "Costa Rica", 24608128, 5,"All-in", "7 am", "7 pm", "nothing", 1, 1995));     
        GlobalVariables.getInstance().hotelList.add(new Hotel("San Juan", "Puerto Viejo", "Costa Rica", 24708129, 2,"Hostel", "7 am", "7 pm", "nothing", 2, 1980));
        GlobalVariables.getInstance().hotelList.add(new Hotel("El Puerto", "Puntarenas", "Costa Rica", 24508148, 4,"Cabin", "7 am", "7 pm", "nothing", 5, 2000));     
        
        GlobalVariables.getInstance().addImagesToHotel(0, "/Image/sendero.jpg");
        GlobalVariables.getInstance().addImagesToHotel(0, "/Image/lago.jpg");
        GlobalVariables.getInstance().addImagesToHotel(1, "/Image/animal.jpg");
        GlobalVariables.getInstance().addImagesToHotel(1, "/Image/lago2.jpg");
        GlobalVariables.getInstance().addImagesToHotel(1, "/Image/flor.jpg");
        GlobalVariables.getInstance().addImagesToHotel(2, "/Image/animal2.jpg");
        GlobalVariables.getInstance().addImagesToHotel(2, "/Image/rio.jpg");
        GlobalVariables.getInstance().addImagesToHotel(0, "/Image/mar.jpg");
        GlobalVariables.getInstance().addImagesToHotel(0, "/Image/lsgo3.jpg");
        
        
        GlobalVariables.getInstance().hotelList.get(0).getAttractionList().add(new Attraction("g11","Golf"));
        GlobalVariables.getInstance().hotelList.get(0).getAttractionList().add(new Attraction("g12","Soccer"));
        GlobalVariables.getInstance().hotelList.get(1).getAttractionList().add(new Attraction("b51","Mountain"));
        GlobalVariables.getInstance().hotelList.get(1).getAttractionList().add(new Attraction("b36","Soccer"));
        GlobalVariables.getInstance().hotelList.get(2).getAttractionList().add(new Attraction("d17","Basketball"));
        GlobalVariables.getInstance().hotelList.get(2).getAttractionList().add(new Attraction("d11","River"));
        GlobalVariables.getInstance().hotelList.get(3).getAttractionList().add(new Attraction("L81","Tennis"));
        GlobalVariables.getInstance().hotelList.get(3).getAttractionList().add(new Attraction("L33","Beach"));
        
        GlobalVariables.getInstance().hotelList.get(0).getServiceList().add(new Service("s1","WiFi"));
        GlobalVariables.getInstance().hotelList.get(0).getServiceList().add(new Service("s2","SPA"));
        GlobalVariables.getInstance().hotelList.get(1).getServiceList().add(new Service("s1","WiFi"));
        GlobalVariables.getInstance().hotelList.get(1).getServiceList().add(new Service("s2","Breakfast"));
        GlobalVariables.getInstance().hotelList.get(2).getServiceList().add(new Service("s1","WiFi"));
        GlobalVariables.getInstance().hotelList.get(2).getServiceList().add(new Service("s2","Free kids club"));
        GlobalVariables.getInstance().hotelList.get(3).getServiceList().add(new Service("s1","WiFi"));
        GlobalVariables.getInstance().hotelList.get(3).getServiceList().add(new Service("s2","Center conference"));
        
        GlobalVariables.getInstance().hotelList.get(2).getRoomsList().add(new Room (1,new TypeRoom("Individual",2,12,"asd",true,false,true,true),6000));
        GlobalVariables.getInstance().hotelList.get(2).getRoomsList().add(new Room (2,new TypeRoom("Double",2,12,"asd",true,false,true,false),7000));
        GlobalVariables.getInstance().hotelList.get(3).getRoomsList().add(new Room (3,new TypeRoom("Individual",2,12,"asd",true,false,true,false),3348));
        GlobalVariables.getInstance().hotelList.get(3).getRoomsList().add(new Room (4,new TypeRoom("Double",2,12,"asd",true,true,true,false),2500));
        GlobalVariables.getInstance().hotelList.get(3).getRoomsList().add(new Room (5,new TypeRoom("Suite",2,12,"lol",true,true,true,false),3500));
        

        GlobalVariables.getInstance().hotelList.get(0).getRoomsList().add(new Room (1,new TypeRoom("Suite",2,12,"asd",true,false,true,false),1233));
        GlobalVariables.getInstance().hotelList.get(1).getRoomsList().add(new Room (2,new TypeRoom("Suite",2,12,"asd",true,false,true,false),5500));
        GlobalVariables.getInstance().hotelList.get(1).getRoomsList().add(new Room (3,new TypeRoom("Individual",2,12,"asd",true,false,true,false),3348));
        GlobalVariables.getInstance().hotelList.get(1).getRoomsList().add(new Room (4,new TypeRoom("Double",2,12,"asd",true,false,true,false),2500));
        GlobalVariables.getInstance().hotelList.get(0).getRoomsList().add(new Room (5,new TypeRoom("Double",2,12,"lol",true,false,true,false),3500));
        

        
        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);
    }
   
}
