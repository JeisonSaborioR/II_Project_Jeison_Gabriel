
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;

public class GlobalVariables {
    public static GlobalVariables instance;
    public ArrayList<Person> peopleList;
    
    public GlobalVariables() {
        peopleList = new ArrayList();
    }
    
    public static GlobalVariables getInstance(){
        
        if(instance == null){
            instance = new GlobalVariables();
        }
        return instance;
    }

    public ArrayList<Person> getAl() {
        return instance.peopleList;
    }

    public void setPeopleList(Person p) {
        
        this.peopleList.add(p);
    }
}
