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
    
    public void linearMap() {
        
    }
    
    public int mapLength() {
        int mapLen = 0;
        for(int i =0; i<eArr[0].getFragLenArr().length; i++){
            mapLen+=eArr[0].getFragLenArr()[i];
        }
        return mapLen;
    }
    
    public void setUp() {
        length = mapLength();
    }
}
