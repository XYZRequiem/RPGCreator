
/**
 * Write a description of class DnDMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DnDMain
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        DnDFunction create = new DnDFunction();
        
        DnDFunction.Character Etwahl =  create.getCharacter();
        
        Etwahl.Character(0,12,0,9,1,5);
        Etwahl.PrintToString();
    }
}
