
/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{   
    private int engineWeight;
    
    public Truck()
    {
        this(200);
    }
    public Truck(int w)
    {
        engineWeight = w;
    }
    public int getEngineWeight()
    {
        return engineWeight;
    }
    public int compareTo(Vehicle v)
    {
        if (v instanceof Truck)
        {
            Truck t = (Truck) v;
            int compareNumWheels = t.getNumWheels() - this.getNumWheels();
            int compareMaxSpeed = t.getMaxSpeed() - this.getMaxSpeed();
            int compareMPG = t.getMPG() - this.getMPG();
            int compareNumPass = t.getEngineWeight() - this.engineWeight;
            return compareNumWheels + compareMaxSpeed + compareMPG + compareNumPass;
        }
        else
        {
            return 1;
        }        
    }
    
}
