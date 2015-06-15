
package ll_project_programmed_jeisonsaborio_gabrielperez;

//Type interface classes with two constructors which allows implementation in other classes
public interface PersonFactoryCreator {
    public void personCreator(String currency, String country, int numberPartner, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber);
    public void personCreator(String startDate, String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber);
}
