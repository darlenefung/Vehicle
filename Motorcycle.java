
/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motorcycle extends Vehicle
{
    private int cost;
    
    public Motorcycle()
    {
        this(5000);
    }
    public Motorcycle(int c)
    {
        cost = c;
    }
    public int getCost()
    {
        return cost;
    }
    public int compareTo(Vehicle v)
    {
        if (v instanceof Motorcycle)
        {
            Motorcycle m = (Motorcycle) v;
            int compareNumWheels = m.getNumWheels() - this.getNumWheels();
            int compareMaxSpeed = m.getMaxSpeed() - this.getMaxSpeed();
            int compareMPG = m.getMPG() - this.getMPG();
            int compareNumPass = m.getCost() - this.cost;
            return compareNumWheels + compareMaxSpeed + compareMPG + compareNumPass;
        }
        else
        {
            return 1;
        }
    }
}
