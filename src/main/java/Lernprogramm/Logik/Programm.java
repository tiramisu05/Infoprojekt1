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

        QuestionManager qManager = new QuestionManager();
        pprogrammGUI = new ProgrammGUI(this, qManager);
    }

    public void schließen() {
        pprogrammGUI.dispose();
    }

}
