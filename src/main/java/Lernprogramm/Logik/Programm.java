
package Lernprogramm.Logik;

import Lernprogramm.GUI.ProgrammGUI;
import Startbild.StartbildGUI;
/**
 *
 * @author Meike
 */

public class Programm { //Äquivalent zu class Addressbook
    
    private StartbildGUI start;
    private Fragenliste Liste = new Fragenliste();
    private ProgrammGUI pprogrammGUI;
    
    public Programm(){
//        Liste.add(new FrageAntworten());
        //hier wird eine Frage aus der Tabelle importiert
        //das soll immer wieder passieren
        
        pprogrammGUI = new ProgrammGUI(this, Liste);
    }
    
    public void schließen() {
        pprogrammGUI.dispose();
    }
    
}
