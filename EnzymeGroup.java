
/**
 * Write a description of class EnzymeGroup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnzymeGroup
{
    Enzyme e1;
    Enzyme e2;
    int[] fragLenArr;
    /**
     * Constructor for objects of class EnzymeGroup
     */
    public EnzymeGroup(Enzyme e1, Enzyme e2, int[] fragLenArr)
    {
        this.e1=e1;
        this.e2=e2;
        this.fragLenArr=fragLenArr;
    }
    
    public int[] getFragLenArr() {
        return fragLenArr;
    }
    
    public Enzyme getEnzyme(int num) {
        if(num==1)
            return e1;
        else
            return e2;
    }
    
    public String[] getEnzymeNames() {
        return new String[] {e1.name, e2.name};
    }
}
