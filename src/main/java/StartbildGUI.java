/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//irgendwelche hilfreichen Packages von Java
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JFrame; //Top-Level-Container = unser Fenster
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
public class StartbildGUI extends JFrame {       //JFrame ist die Oberklasse bei super()
    private Image img;
    
    public StartbildGUI(){      //Unterklasse
        super("Startbild");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JLabel label = new JLabel("Wer wird Bionik-Bachelor? :-)");
//        add(label);
        setSize(800,500);
        setLocationRelativeTo(null);
        
//        setLayout(new BorderLayout()); 
//        add(new JLabel("leer"), BorderLayout.NORTH);
//        add(new JLabel ("Osten"), BorderLayout.EAST);
//        add(new JLabel("Grofa ist nur einmal im Jahr!! B)"), BorderLayout.WEST);
            
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        add(backgroundPanel);
	setSize(backgroundPanel.getBackgroundImage().getWidth(backgroundPanel),	backgroundPanel.getBackgroundImage().getHeight(backgroundPanel));
        
        setVisible(true);
    }
	

        
//        menütitel = "Botanik oder Chemie?";
//        JPanel südpanel = new JPanel();
//        PopupMenu fächer = new PopupMenu(menütitel);
//        südpanel.add(fächer);
//        
       
        
    public static void main(String[] args) {        //MainKlasse
        new StartbildGUI();
    }
}


