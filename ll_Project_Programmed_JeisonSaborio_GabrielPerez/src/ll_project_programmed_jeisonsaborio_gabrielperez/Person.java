
package ll_project_programmed_jeisonsaborio_gabrielperez;

public abstract class Person {
    private String name;
    private String lastName;
    private char genre;
    private String emailAdress;
    private String passWord;
    private String passwordConfirmation;
    private int phoneNumber;

    public Person(String name, String lastName, char genre, String emailAdress, String passWord, String passwordConfirmation, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.genre = genre;
        this.emailAdress = emailAdress;
        this.passWord = passWord;
        this.passwordConfirmation = passwordConfirmation;
        this.phoneNumber = phoneNumber;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public abstract String getType();
    
    
}
