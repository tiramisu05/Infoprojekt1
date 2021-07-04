/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//irgendwelche hilfreichen Packages von Java
//import javax.swing.JPanel;
import javax.swing.JFrame; //Top-Level-Container = unser Fenster
import javax.swing.JLabel;
//import java.awt.Graphics;
//import java.awt.Color;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
//import java.util.ArrayList;

//Basisklasse für alle Container:
//import java.awt.Container;

/**
 *
 * @author Meike
 */
public class erstesFensterGUI extends JFrame {
    
    public erstesFensterGUI(){
        super("wir wollen keinen Fenstertitel, shit");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Wer wird Bionik-Bachelor? :-)");
        add(label);
        setSize(1200, 500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new erstesFensterGUI();
    }
   
}
