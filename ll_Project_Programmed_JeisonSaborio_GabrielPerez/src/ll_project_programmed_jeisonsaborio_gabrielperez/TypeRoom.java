
package ll_project_programmed_jeisonsaborio_gabrielperez;

public class TypeRoom {
    private String name;
    private int maximumPeople;
    private String size;
    private String description;
    private boolean terrace;
    private boolean view;
    private boolean everythingIncluded;
    private boolean smoke;

    public TypeRoom(String name, int maximumPeople, String size, String description, boolean terrace, boolean view, boolean everythingIncluded, boolean smoke) {
        this.name = name;
        this.maximumPeople = maximumPeople;
        this.size = size;
        this.description = description;
        this.terrace = terrace;
        this.view = view;
        this.everythingIncluded = everythingIncluded;
        this.smoke = smoke;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTerrace() {
        return terrace;
    }

    public void setTerrace(boolean terrace) {
        this.terrace = terrace;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public boolean isEverythingIncluded() {
        return everythingIncluded;
    }

    public void setEverythingIncluded(boolean everythingIncluded) {
        this.everythingIncluded = everythingIncluded;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }
    
    
    
    
    
}
