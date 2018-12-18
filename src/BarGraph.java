import hsa.*;
import java.awt.Color;
public class BarGraph {
    
    public static void main(String[] args) {
        Console c = new Console();
        int h1, h2, h3, h4;
        //Bar 1
            c.print("Enter the height of the 1st bar: ");
            h1 = c.readInt();
            c.setColor(new Color (240,150,190));
            // Draw Bar 1
            c.fillRect(100, 500-h1, 50, h1);
            c.drawString ("Value: " + h1, 100,500-h1-20);
        //Bar 2
            c.print("Enter the height of the 2nd bar: ");
            h2 = c.readInt();
            c.setColor(new Color (255,180,140));
            // Draw Bar 2
            c.fillRect(200, 500-h2, 50, h2);
            c.drawString ("Value: " + h2, 200,500-h2-20);
        //Bar 3
            c.print("Enter the height of the 3rd bar: ");
            h3 = c.readInt();
            c.setColor(new Color (255,255,140));
            // Draw Bar 3
            c.fillRect(300, 500-h3, 50, h3);
            c.setColor(new Color (200,200,70));
            c.drawString ("Value: " + h3, 300,500-h3-20);
        //Bar 4
            c.print("Enter the height of the 4th bar: ");
            h4 = c.readInt();
            c.setColor(new Color (200,255,200));
            // Draw Bar 4
            c.fillRect(400, 500-h4, 50, h4);
            c.drawString ("Value: " + h4, 400,500-h4-20);
        
    }
    
}
