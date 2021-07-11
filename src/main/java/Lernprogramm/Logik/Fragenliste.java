/**
 *
 * @author Meike
 */

package Lernprogramm.Logik;

import java.util.ArrayList;

public class Fragenliste {
    
    private ArrayList<FrageAntworten> Liste = new ArrayList<FrageAntworten>();
    
    public int size(){
        return Liste.size();
    }
    
    public FrageAntworten get(int nummer) {
        return Liste.get(nummer);
    }
    
    public void add(FrageAntworten frage) {
        add(frage, Liste.size());
    }
    
    public void add(FrageAntworten frage, int nummer) {
        if(frage == null) {
            throw new NullPointerException("Frage darf nicht 'null' sein.");
        }
        Liste.add(nummer, frage);
    }
}