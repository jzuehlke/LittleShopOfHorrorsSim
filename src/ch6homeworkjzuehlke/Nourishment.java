package ch6homeworkjzuehlke;

//@author Jake Zuehlke

public enum Nourishment 
{
    //static fields with values
    SUNLIGHT(-1), SHADE(0), SAND(-1), DIRT(0), WATER(-1), BLOOD(1), 
    MEAT(0), LIMBS(5), NEGLECT(-1);
    
    //value variable
    private int val;
    
    //set the value of val to the corresponding nourishment
    private Nourishment(int val)
    {
        this.val = val;
    }
    
    //accessor to get val
    public int val()
    {
        return val;
    }
}
