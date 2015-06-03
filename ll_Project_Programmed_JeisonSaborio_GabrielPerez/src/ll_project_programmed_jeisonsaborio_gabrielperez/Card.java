
package ll_project_programmed_jeisonsaborio_gabrielperez;


public class Card {
    private String name;
    private String lastName;
    private String cardType;
    private int cardNumber;
    private int securityCode;
    private String expirationDate;

    public Card(String name, String lastName, String cardType, int cardNumber, int securityCode, String expirationDate) {
        this.name = name;
        this.lastName = lastName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
    
    
    
}
