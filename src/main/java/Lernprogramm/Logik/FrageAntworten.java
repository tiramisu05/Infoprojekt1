
package Lernprogramm.Logik;

/**
 *
 * @author Meike
 */
public class FrageAntworten {
    
    private String frage;
    private String antwort1;
    private String antwort2;
    private String antwort3;
    private String antwort4;

    public FrageAntworten(String ffrage, String a1, String a2, String a3, String a4) {
        if(ffrage == null) {
            throw new NullPointerException("Frage muss vorhanden sein");
        }
        if(a1 == null){
            throw new NullPointerException("Erste Antwort muss vorhanden sein");
        }
        if(a2 == null){
            throw new NullPointerException("Zweite Antwort muss vorhanden sein");
        }
        if(a3 == null){
            throw new NullPointerException("Dritte Antwort muss vorhanden sein");
        }
        if(a4 == null){
            throw new NullPointerException("Vierte Antwort muss vorhanden sein");
        }
        frage = ffrage;
        antwort1 = a1;
        antwort2 = a2;
        antwort3 = a3;
        antwort4 = a4;
    }
    
    public String getFrage(){
        return frage;
    }
    
    public String getA1(){
        return antwort1;
    }
    
    public String getA2(){
        return antwort2;
    }
    
    public String getA3(){
        return antwort4;
    }
    
    public String getA4(){
        return antwort4;
    }
    
    public boolean equals(Object obj){
        return obj instanceof FrageAntworten
                && frage.equals(((FrageAntworten) obj).getFrage())
                && antwort1.equals(((FrageAntworten) obj).getA1())
                && antwort2.equals(((FrageAntworten) obj).getA2())
                && antwort3.equals(((FrageAntworten) obj).getA3())
                && antwort4.equals(((FrageAntworten) obj).getA4());
    }
}
