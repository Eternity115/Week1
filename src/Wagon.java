import hsa.*;
import java.awt.Color;
public class Wagon {
    
    public static void main(String[] args) {
        Console c = new Console();
        //sky
        int r=0;
        int g=50;
        int b=75;
        int x=0;
        int y=100;
        int w= 640;
        int h= 600;
        c.setColor(new Color(r,g,b));
        c.fillRect(0, 0, 640, 500);
        while (true){
            if (r==180) break;
            c.setColor(new Color(r,g,b));
            c.fillOval(x, y, w, h);
            r+=1;
            g+=1;
            b+=1;
            y+=4;
            x+=4;
            w-=8;
            h-=8;
        }
        //grass
        c.setColor(new Color(10,120,0));
        c.fillRect(0, 400, 640, 100);
        //handle
        c.setColor(new Color(0, 0, 0));
        int x1=90;
        int y1=190;
        int x2=190;
        int y2=270;
        while (true){
            if (x1==110) break;
            c.drawLine(x1, y1, x2, y2);
            x1+=1;
            y1+=1;
            x2+=1;
            y2+=1;
        }
        //wagon
        c.setColor(new Color(255, 123, 0));
        c.fillRect(200, 280, 240, 100);
        //tires
        c.setColor(new Color(0, 0, 0));
        c.fillOval(220, 360, 50, 50);
        c.fillOval(370, 360, 50, 50);
        
        //moon
        c.setColor(new Color(255, 255, 200));
        c.fillOval(500, 50, 80, 80);
        c.setColor(new Color(250, 250, 230));
        c.fillOval(540, 80, 22, 22);
        c.fillOval(510, 70, 16, 16);
        c.fillOval(520, 116, 8, 8);
        c.setColor(new Color(239, 231, 198));
        c.fillOval(515, 55, 20, 20);
        c.fillOval(540, 60, 35, 35);
        c.fillOval(515, 90, 28, 28);
        c.fillOval(555, 110, 12, 12);
        
        //grass pieces
        int xg=0;
        int yg = 410;
        int count = 0;
        while (true){
            if (yg>510 && xg>640) break;
            while (true){
                if (xg>640) break;
                c.setColor(new Color(10,120,0));
                c.drawLine(xg, yg, xg, yg-10);
                xg+=2;
                c.setColor(new Color(70,180,5));
                c.drawLine(xg, yg, xg, yg-10);
                xg+=2;
                c.setColor(new Color(30,140,0));
                c.drawLine(xg, yg, xg, yg-10);
                xg+=2;
                c.setColor(new Color(60,155,5));
                c.drawLine(xg, yg, xg, yg-10);
                xg+=2;
                
            }
            count+=1;
            if (count % 2==1) xg=1;
            else xg=0;
            yg+=8;
        }        
    }
}
