/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_project_programmed_jeisonsaborio_gabrielperez;

import GUI.StartMenu;

/**
 *
 * @author Jeison
 */
public class SystemData {
    
    public void defaultData(){
        GlobalVariables.getInstance().hotelList.add(new Hotel("Budapest", "Quesada", "Costa Rica", 24608127, 5,"Mountain", "7 am", "7 pm", "nothing", 5, 1996));
        GlobalVariables.getInstance().hotelList.add(new Hotel("Budapest2", "Quesada", "Costa Rica", 24608128, 5,"City", "7 am", "7 pm", "nothing", 5, 1995));
        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);
    }
   
}
