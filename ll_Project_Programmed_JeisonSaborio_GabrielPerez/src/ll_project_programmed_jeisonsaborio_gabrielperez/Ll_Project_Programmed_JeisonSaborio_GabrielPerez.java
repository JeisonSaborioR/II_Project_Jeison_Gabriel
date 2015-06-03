/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;

/**
 *
 * @author Jeison
 */
public class Ll_Project_Programmed_JeisonSaborio_GabrielPerez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> listaTriangulos = new ArrayList<>();
        PersonFactory tf = new PersonFactory();
        tf.personCreator("ghfg","hfg", 756, "gsdfg","bdg",'F', "sdfg", "dfg", "gfhd",6345);
        tf.personCreator("asd","asd","Carlos",'M',"asldfj","als","als",3242);
        tf.personCreator("lasd", "asd", "sadf", 'F', "ahgf", "asd", "asdf", 4353);
        for(int i = 0; i < GlobalVariables.getInstance().peopleList.size(); i++){
            System.out.println(GlobalVariables.getInstance().peopleList.get(i).getType());
        }
    }
    
}
