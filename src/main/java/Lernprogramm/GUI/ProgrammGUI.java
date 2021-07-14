/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lernprogramm.GUI;

import Lernprogramm.Logik.Programm;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Meike
 */

public class ProgrammGUI extends JFrame {

    private Programm pprogramm;
    private QuestionManager _qManager;
    // Addressform? Wat soll dat?
    private int _questionIndex = 0;
    // Herr Knorr hatte hier für jede Adresskarte einen Index
    // der durchgeklickt wurde, wie funktioniert
    // das wenn die Fragen randomisiert durchgegangen werden??
    private JButton a1;
    private JButton a2;
    private JButton a3;
    private JButton a4;

    private JLabel _frageLabel;

    private JLabel punkte;
    private int richtig = 0;
    final int fragenanzahl = 10;
    
    private JButton weiter;

    public ProgrammGUI(Programm programm, QuestionManager qManager) {
        super("Wer wird Bionik-Bachelor?");
        setSize(800, 600);
        setLayout(new BorderLayout());

        if (programm == null) {
            throw new NullPointerException("Programm darf nicht 'null' sein");
        }
        if (qManager == null) {
            throw new NullPointerException("Liste darf nicht 'null' sein");
        }

        pprogramm = programm;
        _qManager = qManager;

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
        chemie.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                ;//hier soll in die chemie Liste "geschaltet" werden
            }
    });
        
        JButton botanik = new JButton("Botanik");
        fächerPanel.add(botanik);
        botanik.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ;//hier soll in die botanik Liste "geschaltet" werden
            }
    });


        _frageLabel = new JLabel("Hier steht die Frage", SwingConstants.CENTER);
        content.add(_frageLabel);

        JPanel antworten = new JPanel();
        antworten.setLayout(new GridLayout(2, 2));
        content.add(antworten);

        a1 = new JButton("Antwort 1");
        a1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonHandler(a1.getText());
            }
        });

        a2 = new JButton("Antwort 2");
        a2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonHandler(a2.getText());
            }
        });

        a3 = new JButton("Antwort 3");
        a3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonHandler(a3.getText());
            }
        });

        a4 = new JButton("Antwort 4");
        a4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonHandler(a4.getText());
            }
        });

        antworten.add(a1);
        antworten.add(a2);
        antworten.add(a3);
        antworten.add(a4);

        punkte = new JLabel(richtig + " / " + fragenanzahl + " P.");
        punkte.setFont(new Font("Castellar", Font.BOLD, 20));
        content.add(punkte);
        
        weiter = new JButton("nächste Frage");
        weiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateView();
            }
        });
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buttonHandler(String buttonText) {

        if (_qManager.getCurrentQuestion(_questionIndex).isCorrectAnswer(buttonText)) {
            System.out.println("CorrectAnswer!!");
            richtig++;
            // TODO Counter counting usw...
            //hier muss dem Button mit der richigen ANtwort die Farbe grün zugewiesen werden
        } else {
            System.out.println("Wrong Answer!!");
            //hier wird falsche Antwort Button rot und richtige grün

        }

        _qManager.getAndLoadNextQuestion();

        updateView();

    }

    private void showNextQuestion() {
        // hat man eine Antwort ausgewählt soll die nächste Frage angezeigt werden
        if (true) {
            a2.setBackground(Color.GREEN);
            // hier fehlt ein Timer für wenige Sekunden bis Button wieder GRAY
            // nächste Frage;
            // updateView();
        }

        // else if("Frage ist falsch"){
        // falseAnswer();
        // nächste Frage;
        // updateView()
        // }

    }

    private void falseAnswer() {
        // hier muss jeweils der Button mit der richtigen Antwort grün
        // der mit der falschen Rot werden
        // danach könnte wieder ein Timer kommen bis beide wieder
        // GRAY gesetzt werden
        a2.setBackground(Color.RED);
        a3.setBackground(Color.GREEN);

    }

    private void updateView() {
        // hier wird einprogrammiert was updateView machen soll
        // bei Knorr: fForm.set(fList.get(fCurrentIndex))
        // bedeutet: fForm ist das Schreib und Anzeigefeld der Namen
        // fList ist die Liste mit Namen
        // fCurrentIndex ist der Index der aktuellen Addresskarte

        Frage currFrage = _qManager.getCurrentQuestion();

        if (currFrage == null) {
            System.out.println("Keine weiteren Fragen");
            _frageLabel.setText("DONE.. No more Questions");
        } else {

            List<String> answ = currFrage.getAnswers();

            if (answ.size() != 4) {
                throw new IllegalArgumentException("Size diff");
            }

            a1.setText(answ.get(0));
            a2.setText(answ.get(1));
            a3.setText(answ.get(2));
            a4.setText(answ.get(3));

            _frageLabel.setText(currFrage.getQuestion());
            
            
        }
        
            a1.setBackground(null);
            a2.setBackground(null);
            a3.setBackground(null);
            a4.setBackground(null);
    }

}