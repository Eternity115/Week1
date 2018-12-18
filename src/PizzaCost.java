import hsa.*;
public class PizzaCost {
    
    public static void main(String[] args) {
        Console c = new Console();
        double cost, size, top;
        c.println("Find out the cost of your pizza!");
        c.print("What size pizza do you want (inches)? ");
        size = c.readDouble();
        c.print("How many toppings do you want? ");
        top = c.readDouble();
        cost = (top*0.75) + 1.5 + 0.75 + (size * 0.5);
        c.print("Your pizza will cost $" + cost);
        
    }
    
}
