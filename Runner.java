
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args)
    {
        Car c = new Car();
        Car c1 = new Car();
        System.out.println(c.compareTo(c1));
        
        Vehicle v = new Car();
        System.out.println(c instanceof Car);
        System.out.println(c instanceof Vehicle);
        System.out.println(v instanceof Truck);
    }
}
