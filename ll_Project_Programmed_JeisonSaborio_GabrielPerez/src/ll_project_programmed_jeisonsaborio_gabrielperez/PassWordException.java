
package ll_project_programmed_jeisonsaborio_gabrielperez;

public class PassWordException extends Exception {

    public PassWordException(String message) {
        super(message);
    }
    
    public  PassWordException(){
        super("Characters out of range (min 6 letters and a number, max 20 characters)");
    }
}
