/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lernprogramm.GUI;

import Lernprogramm.Logik.Fragenliste;
import Lernprogramm.Logik.Programm;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Meike
 */


public class ProgrammGUI extends JFrame{
    
    private Programm pprogramm;
    private Fragenliste Liste;
    //private //ein Äquivalent zu AddressForm??? Wat soll dat?
    private int aktuelleNummer = -1;
    
    public ProgrammGUI(Programm programm, Fragenliste liste){
        super("Wer wird Bionik-Bachelor");
        
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
        
        
        
        
        
        
    }
    
}
