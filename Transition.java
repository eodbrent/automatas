
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Brent
 */
public class Transition {
    String fromState;
    Character label;
    String toState;
    ArrayList<String> transitions = new ArrayList<>();
    
    public String getfromstate(){
        return fromState;
    }
            
    public void setFromState(String fromState){
        this.fromState = fromState;
    }
    
    public Character getlabel(){
        return label;
    }
    
    public void setlabel(Character label){
        this.label = label;
    }
    
    public String gettostate(){
        return toState;
    }
    
    public void setToState(String toState){
        this.toState = toState;
    }
    
    public ArrayList<String> getTransitions(){
        return transitions;
    }
    
    public void setTransitions(ArrayList<String> transitions){
        this.transitions = transitions;
    }
}
