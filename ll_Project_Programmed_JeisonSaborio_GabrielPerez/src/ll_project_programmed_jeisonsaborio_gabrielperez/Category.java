
package ll_project_programmed_jeisonsaborio_gabrielperez;


public class Category {
    private int taxation;
    private String description;

    public Category(int taxation, String description) {
        this.taxation = taxation;
        this.description = description;
    }

    public int getTaxation() {
        return taxation;
    }

    public void setTaxation(int taxation) {
        this.taxation = taxation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
