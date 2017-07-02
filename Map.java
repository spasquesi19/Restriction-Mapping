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
    ArrayList<Enzyme> eArr = new ArrayList<Enzyme>();
    ArrayList<EnzymeGroup> gArr = new ArrayList<EnzymeGroup>();
    /**
     * Constructor for objects of class Map
     */
    public Map(Enzyme[] es, EnzymeGroup[] gs)
    {
        for(Enzyme e : es){
            eArr.add(e);
        }
        
        for(EnzymeGroup g : gs){
            gArr.add(g);
        }
        
    }
    
    public boolean check(){
        if((eArr.size())*(eArr.size()-1)==gArr.size())
            return true;
        return false;
    }
}
