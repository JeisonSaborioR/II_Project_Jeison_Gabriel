
package ll_project_programmed_jeisonsaborio_gabrielperez;
import java.util.ArrayList;

public class Customer extends Person {
    private String currency;
    private String country;
    private int numberPartner;
    protected ArrayList<Card> listCards;
    protected ArrayList<Reservation> listReservation;

    public Customer(String currency, String country, int numberPartner, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber) {
        super(name, lastName, genre, emailAdress, passWord, passwordConfirmation, phoneNumber);
        this.currency = currency;
        this.country = country;
        this.numberPartner = numberPartner;
        this.listCards = new ArrayList<>();
        this.listReservation = new ArrayList<>();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberPartner() {
        return numberPartner;
    }

    public void setNumberPartner(int numberPartner) {
        this.numberPartner = numberPartner;
    }
    @Override
    public ArrayList<Card> getListCards() {
        return listCards;
    }

    public void setListCards(ArrayList<Card> listCards) {
        this.listCards = listCards;
    }
    @Override
    public ArrayList<Reservation> getListReservation() {
        return listReservation;
    }

    public void setListReservation(ArrayList<Reservation> listReservation) {
        this.listReservation = listReservation;
    }


    
    

    @Override
    public String getType() {
        return "Customer";
    }
    
    
    
}
