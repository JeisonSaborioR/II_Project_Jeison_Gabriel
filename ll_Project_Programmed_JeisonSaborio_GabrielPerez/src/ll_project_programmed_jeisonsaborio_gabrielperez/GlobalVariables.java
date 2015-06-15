
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;
//Class that contains all the global variables of the system
//In this class we use the Singleton design pattern to create a single instance
public class GlobalVariables {
    public static GlobalVariables instance;
    public ArrayList<Person> peopleList;
    public ArrayList<Hotel> hotelList;
    public Hotel hotel;
    public String typeRoom;
    public String entryDate;
    public String departureDate;
    public int nightsDuration;
    public int amountChildren;
    public int amountAdults;
    public int numberRooms;
    public Person person;
    
    public GlobalVariables() {
        peopleList = new ArrayList();
        hotelList = new ArrayList();
    }
    
    //Valid existence of the single instance
    public static GlobalVariables getInstance(){
        
        if(instance == null){
            instance = new GlobalVariables();
        }
        return instance;
    }

    public ArrayList<Person> getAl() {
        return instance.peopleList;
    }

    public void setPeopleList(Person p) {
        
        this.peopleList.add(p);
    }
    
    public ArrayList<Hotel> getAll(){
        return instance.hotelList;
    }
    
    public void setHotelList(Hotel h){
        this.hotelList.add(h);
    }

   
    
//Method that allows the system to erase hotels
//Receives a string parameter
    public void deleteHotel(String name){
        for (int i = 0; i < hotelList.size(); i++) {
            if(hotelList.get(i).getName().equals(name)){
                hotelList.remove(i);
            }
        }
    }
 //Method to add rooms to the hotel system   
 //Receives a string and room parameter
    public void addRoomToHotel(int hotel, Room room ){
        this.hotelList.get(hotel).getRoomsList().add(room);
    }
 //Method to add attractions Hotels  
 //Receive an int and attraction as parameters
    public void addAttractionToHotel(int hotel, Attraction attraction ){
        this.hotelList.get(hotel).getAttractionList().add(attraction);
    }
 //Method to add services to hotels  
    public void addServicesToHotel(int hotel, Service service ){
        this.hotelList.get(hotel).getServiceList().add(service);
    }
 //Receive an int and a service as a parameter
    public void addSeasonsToHotel(int hotel, Season season ){
        this.hotelList.get(hotel).getSeasonList().add(season);
    }
 //Method to add images to the system
 //Receive a string as a parameter and int
    public void addImagesToHotel(int hotel, String image ){
        this.hotelList.get(hotel).getPhotos().add(image);
    }
}
