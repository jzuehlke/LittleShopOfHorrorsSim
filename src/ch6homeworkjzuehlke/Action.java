package ch6homeworkjzuehlke;

//@author Jake Zuehlke

public enum Action 
{
    //static fields with values
    WATER(-5), AXE(-10), GUN(-5), FLEE(-10), ELECTROCUTE(-50), NEUTRAL(0);
    
    //value variable
    private int val;
    
    //set the value of val to the corresponding nourishment
    private Action(int val)
    {
        this.val = val;
    }
    
    //accessor to get val
    public int val()
    {
        return val;
    }
}
