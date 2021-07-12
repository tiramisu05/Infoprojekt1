package Lernprogramm.Logik;

import Lernprogramm.GUI.ProgrammGUI;

/**
 *
 * @author Meike
 */

public class Programm { //Äquivalent zu class Addressbook

    private Fragenliste liste = new Fragenliste();
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

        pprogrammGUI = new ProgrammGUI(this, liste);
    }

    public void schließen() {
        pprogrammGUI.dispose();
    }

}
