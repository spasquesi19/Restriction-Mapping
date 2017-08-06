
/**
 * Write a description of class EnzymeGroupRules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnzymeGroupRules extends EnzymeRules
{
    EnzymeRules e1;
    EnzymeRules e2;
    /**
     * Constructor for objects of class EnzymeGroupRules
     */
    public EnzymeGroupRules(EnzymeRules e1, EnzymeRules e2, int[] fragLenArr)
    {
        super(e1.name + " " + e2.name, fragLenArr);
        this.e1=e1;
        this.e2=e2;
    }
    
    public EnzymeRules getEnzyme(int num) {
        if(num==1)
            return e1;
        else
            return e2;
    }
    
    public String[] getEnzymeNames() {
        return new String[] {e1.name, e2.name};
    }
}
