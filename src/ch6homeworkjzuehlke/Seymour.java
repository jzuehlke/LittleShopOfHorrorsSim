package ch6homeworkjzuehlke;

//@author Jake Zuehlke

public class Seymour 
{
    //fields
    private int hitPoints;
    
    //constructor
    public Seymour() 
    {
        this.hitPoints = 10;
    }
    
    //mutator
    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    public void alterHitPoints(Action a)
    {
        this.hitPoints += a.val();
    }
    
    //accessor
    public int getHitPoints() 
    {
        return hitPoints;
    }
}
