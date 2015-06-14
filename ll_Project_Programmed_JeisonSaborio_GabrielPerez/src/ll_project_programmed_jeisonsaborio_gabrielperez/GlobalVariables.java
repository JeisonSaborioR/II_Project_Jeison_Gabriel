
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;

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

   
    
    
    public void deleteHotel(String name){
        for (int i = 0; i < hotelList.size(); i++) {
            if(hotelList.get(i).getName().equals(name)){
                hotelList.remove(i);
            }
        }
    }
    
    public void addRoomToHotel(int hotel, Room room ){
        this.hotelList.get(hotel).getRoomsList().add(room);
    }
    
    public void addAttractionToHotel(int hotel, Attraction attraction ){
        this.hotelList.get(hotel).getAttractionList().add(attraction);
    }
    
    public void addServicesToHotel(int hotel, Service service ){
        this.hotelList.get(hotel).getServiceList().add(service);
    }
    public void addSeasonsToHotel(int hotel, Season season ){
        this.hotelList.get(hotel).getSeasonList().add(season);
    }
    public void addImagesToHotel(int hotel, String image ){
        this.hotelList.get(hotel).getPhotos().add(image);
    }
}
