

package ll_project_programmed_jeisonsaborio_gabrielperez;

//Class that allows the application of factory design pattern within the system
public class PersonFactory {
    public void personCreator(String currency, String country, int numberPartner, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber){
        GlobalVariables.getInstance().peopleList.add(new Customer(currency,country,numberPartner,name,lastName,genre,emailAdress,passWord,passwordConfirmation,phoneNumber));
    }
    public void personCreator(String startDate, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber){
        GlobalVariables.getInstance().peopleList.add(new Staff(startDate,name,lastName,genre,emailAdress,passWord,passwordConfirmation,phoneNumber));
    }
}
