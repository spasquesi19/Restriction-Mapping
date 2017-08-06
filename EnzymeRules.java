
/**
 * Write a description of class Enzyme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnzymeRules
{
    String name;
    int[] fragLenArr;
    /**
     * Constructor for objects of class EnzymeRules
     */
    public EnzymeRules(String name, int[] fragLenArr)
    {
        this.name = name;
        this.fragLenArr = fragLenArr;
    }
    
    public int[] getFragLenArr() {
        return fragLenArr;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTotalLength() {
        int len = 0;
        for(int i=0; i<fragLenArr.length; i++) {
            len+=fragLenArr[i];
        }
        return len;
    }
}
