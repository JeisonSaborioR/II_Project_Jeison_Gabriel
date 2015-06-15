
package ll_project_programmed_jeisonsaborio_gabrielperez;

//Classes allows object creation system type season
public class Season {
    private String name;
    private String code;
    private String startDate;
    private String finalDate;
    

    public Season(String name, String code, String startDate, String finalDate ) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.finalDate = finalDate;
      
    }

    public Season() {
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


    
    
}
