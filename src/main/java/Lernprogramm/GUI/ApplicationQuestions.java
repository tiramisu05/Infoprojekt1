package Lernprogramm.GUI;


import Lernprogramm.GUI.Frage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class ApplicationQuestions {

    private static final String _csvpath = "C:\\Users\\Arjun Büsing\\Documents\\NetBeansProjects\\Sample Questions.csv";

    public static void main(String[] args) {
        List<String[]> zeilenliste = readCSVDatei();
        List<Frage> fragenliste = createfragenliste(zeilenliste);
        for (Frage frage : fragenliste) {
            frage.PrintoutQuestion();
        }
    }

    private static List<Frage> createfragenliste(List<String[]> zeilenliste) {

        List<Frage> outlist = new ArrayList<Frage>();
        Iterator<String[]> it = zeilenliste.iterator();
        while (it.hasNext()) {
            //Eine Zeile zu einer Frage
            Frage fragestellung = new Frage(it.next());
            outlist.add(fragestellung);
        }

        return outlist;
    }

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
            Logger.getLogger(ApplicationQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outList;
    }

}
