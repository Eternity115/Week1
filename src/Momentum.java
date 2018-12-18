import hsa.*;
public class Momentum {
    
    public static void main(String[] args) {
        Console c = new Console();
        double mass, vel, mome;
        c.print("What is the mass of the object (kg)? ");
        mass = c.readDouble();
        c.print("What is the velocity of the object (m/s)? ");
        vel = c.readDouble();
        mome = mass*vel;
        c.print ("The momentum of the object is " + mome + "kg*m/s");
    }
    
}
