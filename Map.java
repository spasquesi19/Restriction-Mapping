import java.util.ArrayList;
/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map
{
    int length;
    Enzyme[] eArr;
    EnzymeGroup[] gArr;
    /**
     * Constructor for objects of class Map
     */
    public Map(Enzyme[] es, EnzymeGroup[] gs)
    {
        eArr = new Enzyme[es.length];
        gArr = new EnzymeGroup[gs.length];
        for(int i=0; i<es.length; i++){
            eArr[i] = es[i];
        }
        
        for(int i=0; i<gs.length; i++){
            gArr[i] = gs[i];
        }
        
        int length = 0;
        for(int i =0; i<eArr[0].getFragLenArr().length; i++){
            length+=eArr[0].getFragLenArr()[i];
        }
        this.length = length;
    }
    
    public boolean check(){
        return checkNumEnzymes() && checkNumFrags();
    }
    
    private boolean checkNumEnzymes() {
        if(((eArr.length)*(eArr.length-1))/2==gArr.length)
            return true;
        return false;
    }
    
    private boolean checkNumFrags(){
        int eFragNum = 0;
        int gFragNum = 0;
        for(Enzyme e: eArr){
            eFragNum+= e.getFragLenArr().length;
        }
        for(EnzymeGroup g: gArr){
            gFragNum+= g.getFragLenArr().length;
        }
        return eFragNum == gFragNum;
    }
    
    public void circularMap() {
        Object[][] circle = new Object[][];
        int totalLen = eArr[0].getTotalLength();
        
        
    }
}
