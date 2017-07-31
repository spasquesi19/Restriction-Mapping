
/**
 * Write a description of class Enzyme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enzyme
{
    String name;
    int[] fragLenArr;
    /**
     * Constructor for objects of class Enzyme
     */
    public Enzyme(String name, int[] fragLenArr)
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
}
