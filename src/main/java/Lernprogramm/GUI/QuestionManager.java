package Lernprogramm.GUI;

import Lernprogramm.GUI.Frage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arjun Büsing
 */
public class QuestionManager {

    private static String _csvpath;
    private List<Frage> _fragenliste;
    private final Iterator<Frage> _fragenIt;
    private Frage _currentQuestion;

    //Konstruktor
    public QuestionManager(String csvpath) { 
        _csvpath = csvpath;
        List<String[]> zeilenliste = readCSVDatei();
        _fragenliste = createfragenliste(zeilenliste);
        Collections.shuffle(_fragenliste); // Fragen in zufälliger reihenfolge
        _fragenliste = _fragenliste.subList(0, 10);
        _fragenIt = _fragenliste.iterator();

    }
    //Methode
    public Frage getAndLoadNextQuestion() {
        // TODO do something when there are no more questions.
        if (_fragenIt.hasNext()) {
            _currentQuestion = _fragenIt.next();
        } else {
            _currentQuestion = null;

        }
        return _currentQuestion;
    }
    //Methode
    public Frage getCurrentQuestion(int questionUmber) {
        return _fragenliste.get(questionUmber);
    }
    //Methode   
    public Frage getCurrentQuestion() {
        if (_currentQuestion == null && _fragenIt.hasNext()) {
            _currentQuestion = getAndLoadNextQuestion();
        }

        return _currentQuestion;
    }
    //Methode
    public void printAllQuestions() {
        for (Frage frage : _fragenliste) {
            frage.PrintoutQuestion();
            //Extended for Loop geht die Liste durch und packt Inhalt in das Variable frage.
        }
    }
    //Methode
    private static List<Frage> createfragenliste(List<String[]> zeilenliste) {

        List<Frage> outlist = new ArrayList<Frage>();
        Iterator<String[]> it = zeilenliste.iterator();
        while (it.hasNext()) {
            // Eine Zeile zu einer Frage
            Frage fragestellung = new Frage(it.next());
            outlist.add(fragestellung);
        }

        return outlist;
    }
    //Methode
    private static List<String[]> readCSVDatei() {

        List<String[]> outList = new ArrayList<String[]>();

        try {
            BufferedReader stringreader = new BufferedReader(new FileReader(_csvpath));

            String currentline = stringreader.readLine();
            while (currentline != null) {
                String[] array = currentline.split(";");
                outList.add(array);
                currentline = stringreader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(QuestionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outList;
    }

}
