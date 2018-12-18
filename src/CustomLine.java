import hsa.*;
public class CustomLine {
    
    public static void main(String[] args) {
        Console c = new Console();
        int x1,x2,y1,y2;
        c.print("x1> ");
        x1 = c.readInt();
        c.print("y1> ");
        y1 = c.readInt();
        c.print("x2> ");
        x2 = c.readInt();
        c.print("y2> ");
        y2 = c.readInt();
        c.drawString (String.format("(%d, %d)", x1, y1),x1,y1-10);
        c.drawString (String.format("(%d, %d)", x2, y2),x2+5,y2-10);
        c.drawLine(x1, y1, x2, y2);
    }
    
}

