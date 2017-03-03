
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int numPassengers;
    
    public Car()
    {
        this(5);
    }
    public Car(int p)
    {
        numPassengers = p;
    }
    public int getNumPassengers()
    {
        return numPassengers;
    }
    public int compareTo(Vehicle v)
    {
        if (v instanceof Car)
        {
            Car c = (Car) v;
            int compareNumWheels = c.getNumWheels() - this.getNumWheels();
            int compareMaxSpeed = c.getMaxSpeed() - this.getMaxSpeed();
            int compareMPG = c.getMPG() - this.getMPG();
            int compareNumPass = c.getNumPassengers() - this.numPassengers;
            return compareNumWheels + compareMaxSpeed + compareMPG + compareNumPass;
        }
        else
        {
            return 1;
        }
    }
}
