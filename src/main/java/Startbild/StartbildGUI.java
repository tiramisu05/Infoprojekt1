package Startbild;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//irgendwelche hilfreichen Packages von Java

import Lernprogramm.Logik.Programm;
import java.awt.BorderLayout;
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
    
    JPanel control = new JPanel(new BorderLayout());
    JLabel titel = new JLabel("Wer wird Bionik-Bachelor?", SwingConstants.CENTER);
    JButton startbut = new JButton("Start");
    BackgroundPanel backgroundPanel = new BackgroundPanel();
    
public StartbildGUI(){      //Unterklasse
        super("Startbild");
        setLayout(new BorderLayout());
        
        
        getContentPane().add(backgroundPanel);
        pack();
        setSize(backgroundPanel.getBackgroundImage().getWidth(backgroundPanel), backgroundPanel.getBackgroundImage().getWidth(backgroundPanel));
        titel.setFont(new Font( "Times New Roman", Font.BOLD, 26));
        add(titel, BorderLayout.NORTH);
        add(startbut, BorderLayout.SOUTH);
        
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

    public static void main(String[] args) {
        new StartbildGUI();
    }

}