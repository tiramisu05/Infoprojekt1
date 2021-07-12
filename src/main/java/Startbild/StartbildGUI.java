package Startbild;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//irgendwelche hilfreichen Packages von Java

import Lernprogramm.GUI.ProgrammGUI;
import Lernprogramm.Logik.Fragenliste;
import Lernprogramm.Logik.Logik;
import Lernprogramm.Logik.Programm;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    private StartbildGUI start = new StartbildGUI();
    private JPanel control = new JPanel(new BorderLayout());
    private JLabel titel = new JLabel("Wer wird Bionik-Bachelor?", SwingConstants.CENTER);
    private JButton startbut = new JButton("Start");
    private BackgroundPanel backgroundPanel = new BackgroundPanel();
    
    private Programm programm;
//    private Logik logik;
    private Fragenliste liste;
    
public StartbildGUI(){      //Unterklasse
        super("Startbild");
        setLayout(new BorderLayout());
        
        
        getContentPane().add(backgroundPanel);
        pack();
        setSize(backgroundPanel.getBackgroundImage().getWidth(backgroundPanel), backgroundPanel.getBackgroundImage().getWidth(backgroundPanel));
        
        titel.setFont(new Font( "Castellar", Font.PLAIN, 26));
        add(titel, BorderLayout.NORTH);
        titel.setBackground(Color.WHITE);
        
        add(startbut, BorderLayout.SOUTH);
        startbut.setFont(new Font( "Arial", Font.PLAIN, 20));
        startbut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                starte();
            }
            });     

       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

public void starte(){
        new Logik();
      //  ProgrammGUI programmGUI = new ProgrammGUI(programm, liste);
        
        //vom Startbutton aus die Logik und GUI starten plus die Liste erstellen
        //krieg ich noch nicht

        start.dispose();
}
}