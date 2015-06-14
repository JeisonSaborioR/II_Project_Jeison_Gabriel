
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;


public class Staff extends Person {
    private String startDate;

    public Staff(String startDate, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber) {
        super(name, lastName, genre, emailAdress, passWord, passwordConfirmation, phoneNumber);
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String getType() {
        
        return "Staff";
    
    }

    @Override
    public ArrayList<Card> getListCards() {
        return null;
    }

    @Override
    public ArrayList<Reservation> getListReservation() {
        return null;
    }
    
    
    
    
}
