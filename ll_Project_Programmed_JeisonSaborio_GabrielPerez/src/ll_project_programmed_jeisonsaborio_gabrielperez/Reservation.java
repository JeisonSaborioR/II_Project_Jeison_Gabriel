
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;


public class Reservation {
 
    private String entryDate;
    private String departureDate;
    private int nightsDuration;
    private ArrayList roomsList;
    private ArrayList<String> hostedList;
    private int amountChildren;
    private int amountAdults;
    private Customer customer;

    public Reservation(String entryDate, String departureDate, int nightsDuration, ArrayList roomsList, ArrayList<String> hostedList, int amountChildren, int amountAdults, Customer customer) {
        this.entryDate = entryDate;
        this.departureDate = departureDate;
        this.nightsDuration = nightsDuration;
        this.roomsList = roomsList;
        this.hostedList = hostedList;
        this.amountChildren = amountChildren;
        this.amountAdults = amountAdults;
        this.customer = customer;
    }

  

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public int getNightsDuration() {
        return nightsDuration;
    }

    public void setNightsDuration(int nightsDuration) {
        this.nightsDuration = nightsDuration;
    }

    public ArrayList getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(ArrayList roomsList) {
        this.roomsList = roomsList;
    }

    public ArrayList<String> getHostedList() {
        return hostedList;
    }

    public void setHostedList(ArrayList<String> hostedList) {
        this.hostedList = hostedList;
    }

    public int getAmountChildren() {
        return amountChildren;
    }

    public void setAmountChildren(int amountChildren) {
        this.amountChildren = amountChildren;
    }

    public int getAmountAdults() {
        return amountAdults;
    }

    public void setAmountAdults(int amountAdults) {
        this.amountAdults = amountAdults;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
