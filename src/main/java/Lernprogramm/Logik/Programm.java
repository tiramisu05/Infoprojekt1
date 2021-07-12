/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lernprogramm.Logik;

import Lernprogramm.GUI.ProgrammGUI;
import Startbild.StartbildGUI;

/**
 *
 * @author Meike
 */
public class Programm {
       private StartbildGUI start;
            
    public Programm(){
        start = new StartbildGUI();

    }
    
    public static void main(String[] args) {
        new Programm();
    }
}