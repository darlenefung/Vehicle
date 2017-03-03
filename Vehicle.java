
/**
 * Abstract class Vehicle - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Vehicle implements Comparable<Vehicle>
{
    private int numWheels;
    private int maxSpeed;
    private int mpg;
    
    public Vehicle()
    {
        this(4, 60, 35);
    }
    public Vehicle(int w, int s, int m)
    {
        numWheels = w;
        maxSpeed = s;
        mpg = m;
    }
    public int getNumWheels()
    {
        return numWheels;
    }
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public int getMPG()
    {
        return mpg;
    }
}
