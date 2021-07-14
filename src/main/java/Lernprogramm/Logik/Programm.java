package Lernprogramm.Logik;

import Lernprogramm.GUI.ProgrammGUI;
import Lernprogramm.GUI.QuestionManager;

/**
 *
 * @author Meike
 */

public class Programm { //Äquivalent zu class Addressbook

    private ProgrammGUI pprogrammGUI;

    public Programm() {
//
//        liste.add(new FrageAntworten(//hier müssen vier Stings abgerufen werden
//        ));
//        //hier wird eine Frage aus der Tabelle importiert
//        //das soll immer wieder passieren
//        //
//        //bei Knorr wurden hier immer einzeln Addresskarten angelegt
//        //mit je zwei Strings

        
        QuestionManager qManager = new QuestionManager();
        pprogrammGUI = new ProgrammGUI(this, qManager);
    }

    public void schließen() {
        pprogrammGUI.dispose();
    }

}
