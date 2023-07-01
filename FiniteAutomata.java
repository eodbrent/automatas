
import java.util.ArrayList;

public class FiniteAutomata extends Transition{
    
    String startState;
    private ArrayList<String> transitions = new ArrayList<>();
    private ArrayList<String> acceptStates = new ArrayList<>();
    private ArrayList<String> states = new ArrayList<>();
    
    public FiniteAutomata(){}
    
    public FiniteAutomata(String startState, ArrayList<String> acceptStates, ArrayList<String> states){
        this.startState = startState;
        this.acceptStates = acceptStates;
        this.states = states;
    }
    
    public ArrayList<Character> setAlphabet(){
        ArrayList<Character> alphabet = new ArrayList<>();
        
        return alphabet;
    }
    
    public boolean run(String input){
        Transition tr = new Transition();
        tr.setTransitions(this.transitions);
        String pos = startState;
        for (int i = 0; i < input.length(); i++){
            String test = pos + " " + input.charAt(i);
            boolean transitionFound = false;
            for(String tester : tr.transitions){
                if (tester.contains(test)){
                    tr.setFromState(tester.split(" ")[0]);
                    tr.setToState(tester.split(" ")[2]);
                    pos = tester.split(" ")[2];
                    transitionFound = true;
                    break;
                }
            }
            if(!transitionFound){
               pos = startState; //not necessary, but place holder
               return false;
            }
            if (i == input.length()-1){
                for(String p : acceptStates){
                    if(p.contains(pos)){
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }
    public String getStartState(){
        return startState;
    }
            
    public void setStartState(String state){
        this.startState = state;
    }
    
    public ArrayList<String> getTransitionList(){
        return transitions;
    }
    
    public void setTransitionList(String line){
        if (!this.transitions.contains(line)) {
            this.transitions.add(line);
        }
    }
    public ArrayList<String> getAcceptStates(){
        return acceptStates;
    }
            
    public void setAcceptStates(String acceptState){
        this.acceptStates.add(acceptState);
    }
    
    public ArrayList<String> getStates(){
        return states;
    }
    public void setStates(){

    }
    
                    

}
