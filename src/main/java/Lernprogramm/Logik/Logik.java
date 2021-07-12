package Lernprogramm.Logik;

import Lernprogramm.GUI.ProgrammGUI;
import Startbild.StartbildGUI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Meike
 */

public class Logik { //Äquivalent zu class Addressbook

    private Fragenliste liste;
    private ProgrammGUI gui;

    public Logik() {

//        Liste.add(new FrageAntworten());
        //hier wird eine Frage aus der Tabelle importiert
        //das soll immer wieder passieren
    }

    public void schließen() {
        gui.dispose();
    }

}
