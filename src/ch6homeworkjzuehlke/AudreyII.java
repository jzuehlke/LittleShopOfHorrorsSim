package ch6homeworkjzuehlke;

//@author Jake Zuehlke

public class AudreyII 
{
    //fields
    private int podHealth;
    private int hitPoints;

    //constructor
    public AudreyII() 
    {
        this.podHealth = 3;
        this.hitPoints = 10;
    }
    
    //mutators
    public void setPodHealth(Nourishment n) 
    {
        this.podHealth += n.val();
    }
    public void setInitialHitPoints() 
    {
        this.hitPoints *= podHealth;
    }
    public void alterHitPoints(Action a)
    {
        this.hitPoints += a.val();
    }
    
    //accessors
    public int getPodHealth() 
    {
        return podHealth;
    }
    public int getHitPoints() 
    {
        return hitPoints;
    }
}
