/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lernprogramm.GUI;

import Lernprogramm.Logik.Fragenliste;
import Lernprogramm.Logik.Programm;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Meike
 */


public class ProgrammGUI extends JFrame{
    
    private Programm pprogramm;
    private Fragenliste Liste;
    //private //ein Äquivalent zu AddressForm??? Wat soll dat?
    private int aktuelleNummer = -1; //Herr Knorr hatte hier für jede Adresskarte einen Index der durchgeklickt wurde,
    //wie funktioniert das wenn die Fragen randomisiert durchgegangen werden
    private JLabel punkte;
    
    public ProgrammGUI(Programm programm, Fragenliste liste){
        super("Wer wird Bionik-Bachelor?");
        setSize(800, 400);
        setLayout(new BorderLayout());
        
        if(programm == null) {
            throw new NullPointerException("Programm darf nicht 'null' sein");
        }
        if(liste == null) {
            throw new NullPointerException("Liste darf nicht 'null' sein");
        }
        
        pprogramm = programm;
        Liste = liste;
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                pprogramm.schließen();
            }
        });
        
        JPanel overcontent = new JPanel();
        overcontent.setLayout(new BorderLayout());
        add(overcontent);
        
        JPanel content = new JPanel();
        overcontent.add(content, BorderLayout.CENTER);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        
        JPanel fächerPanel = new JPanel();
        content.add(fächerPanel);
        JButton chemie = new JButton("Chemie");
        fächerPanel.add(chemie);
        JButton botanik = new JButton("Botanik");
        fächerPanel.add(botanik);
        
        JLabel frage = new JLabel();
        content.add(frage);
        
        JPanel antworten = new JPanel();
        antworten.setLayout(new GridLayout(2, 2));
        content.add(antworten);
        
        JButton a1 = new JButton();
        
        JButton a2 = new JButton();
        
        JButton a3 = new JButton();
        
        JButton a4 = new JButton();
        
        antworten.add(a1);
        antworten.add(a2);
        antworten.add(a3);
        antworten.add(a4);
        
        int richtig = 0;
        int fragenanzahl = 10;
        
        punkte = new JLabel(richtig + " / " + fragenanzahl + " P.");
        overcontent.add(punkte, BorderLayout.EAST);
        
        
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void showNextQuestion() {
        //hat man eine Antwort ausgewählt soll die nächste Frage angezeigt werden
        //ein Punktestad an der Seite soll zB 3/10 ((richtig/fragenanzahl)) Punkte anzeigen
        //if("Frage ist richtig){richtig++;  nächste Frage;  updateView()}
        //else if("Frage ist falsch"){nächste Frage;  updateView()}
        
    }
}