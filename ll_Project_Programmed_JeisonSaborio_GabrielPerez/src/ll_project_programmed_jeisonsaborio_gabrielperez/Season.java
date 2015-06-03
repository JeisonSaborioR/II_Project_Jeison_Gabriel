
package ll_project_programmed_jeisonsaborio_gabrielperez;


public class Season {
    private String name;
    private String code;
    private String startDate;
    private String finalDate;
    private int amount;
    private String typeRoom;

    public Season(String name, String code, String startDate, String finalDate, int amount, String typeRoom) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.amount = amount;
        this.typeRoom = typeRoom;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }
    
    
}
