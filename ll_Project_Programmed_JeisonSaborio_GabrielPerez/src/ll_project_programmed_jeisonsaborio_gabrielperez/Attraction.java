
package ll_project_programmed_jeisonsaborio_gabrielperez;
//Class system allows you to insert attractions
//Attributes: code,name
public class Attraction {
    private String code;
    private String name;

    public Attraction(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
