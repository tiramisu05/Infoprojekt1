package Startbild;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//irgendwelche hilfreichen Packages von Java

import Lernprogramm.Logik.Programm;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame; //Top-Level-Container = unser Fenster
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



/**
 *
 * @author Meike
 */
public class StartbildGUI extends JFrame {
    
    private BackgroundPanel backgroundPanel = new BackgroundPanel();
//    private JPanel control = new JPanel();
    private JLabel titel = new JLabel("Wer wird Bionik-Bachelor?", SwingConstants.CENTER);
    private JButton startbut = new JButton("Start");
        
    
public StartbildGUI(){      //Unterklasse
        super("Startbild");
        setSize(500, 300);
        setLayout(new BorderLayout());
        
        titel.setFont(new Font( "Castellar", Font.PLAIN, 26));
        add(titel, BorderLayout.NORTH);
        titel.setBackground(Color.BLUE);
        
        add(backgroundPanel);
        backgroundPanel.setAlignmentX(CENTER_ALIGNMENT);
        setSize(backgroundPanel.getBackgroundImage().getWidth(backgroundPanel), backgroundPanel.getBackgroundImage().getWidth(backgroundPanel));
        
        
        
        
        add(startbut, BorderLayout.SOUTH);
        startbut.setAlignmentX(CENTER_ALIGNMENT);
        startbut.setFont(new Font( "Dubai", Font.PLAIN, 20));
        startbut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                new Programm();
                dispose();
            }
            });     

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

//public void starte(){
//        new Programm();
//        
//        //vom Startbutton aus die Logik und GUI starten plus die Liste erstellen
//        //krieg ich noch nicht
//        dispose();
//}
        
        
    public static void main(String[] args) {
        new StartbildGUI();
    }
}
