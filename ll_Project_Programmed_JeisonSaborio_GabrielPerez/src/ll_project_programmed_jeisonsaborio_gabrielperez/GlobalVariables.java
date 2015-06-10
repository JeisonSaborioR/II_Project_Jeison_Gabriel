
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;

public class GlobalVariables {
    public static GlobalVariables instance;
    public ArrayList<Person> peopleList;
    public ArrayList<Hotel> hotelList;
    
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
    
    
}
