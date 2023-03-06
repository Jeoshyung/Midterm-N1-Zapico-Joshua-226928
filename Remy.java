/**
The Remy class is responsible for displaying Remy and his movements. 
The draw method uses g2d to draw Remy's body and the void method 
creates a boundary in which remy can move in before he is brought 
back to the other side.
@author Joshua Paolo S. Zapico (226928)
@version March 3, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/

import java.awt.*;
import java.awt.geom.*;

public class Remy implements DrawingObject {

    private int pos;
    private Circle eyes;
    private Circle nose;
    
    public Remy() {

    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        Path2D.Double path = new Path2D.Double();
        double x = 300, y = 550, scale = 0.25;
        g2d.setColor(new Color(85,99,116));
        path.moveTo(x + pos  + scale * -219.56, y + scale * -63.94);
        path.lineTo(x + pos  + scale * -212, y + scale * -74.61);
        path.lineTo(x + pos  + scale * -198.67, y + scale * -88.39);
        path.lineTo(x + pos  + scale * -186.67, y + scale * -97.72);
        path.lineTo(x + pos  + scale * -165.78, y + scale * -109.28);
        path.lineTo(x + pos  + scale * -141.33, y + scale * -115.5);
        path.lineTo(x + pos  + scale * -116.44, y + scale * -117.72);
        path.lineTo(x + pos  + scale * -105.78, y + scale * -117.72);
        path.lineTo(x + pos  + scale * -86, y + scale * -116.61);
        path.lineTo(x + pos  + scale * -72.67, y + scale * -115.72);
        path.lineTo(x + pos  + scale * -74.44, y + scale * -108.61);
        path.lineTo(x + pos  + scale * -74.22, y + scale * -97.06);
        path.lineTo(x + pos  + scale * -72.67, y + scale * -85.06);
        path.lineTo(x + pos  + scale * -68, y + scale * -73.72);
        path.lineTo(x + pos  + scale * -62, y + scale * -66.83);
        path.lineTo(x + pos  + scale * -50.67, y + scale * -56.83);
        path.lineTo(x + pos  + scale * -38, y + scale * -48.61);
        path.lineTo(x + pos  + scale * -28.22, y + scale * -43.28);
        path.lineTo(x + pos  + scale * -22, y + scale * -41.28);
        path.lineTo(x + pos  + scale * -8.22, y + scale * -41.28);
        path.lineTo(x + pos  + scale * 28.67, y + scale * -49.72);
        path.lineTo(x + pos  + scale * 40.89, y + scale * -56.17);
        path.lineTo(x + pos  + scale * 47.11, y + scale * -61.5);
        path.lineTo(x + pos  + scale * 52, y + scale * -69.06);
        path.lineTo(x + pos  + scale * 54.22, y + scale * -78.39);
        path.lineTo(x + pos  + scale * 52, y + scale * -86.61);
        path.lineTo(x + pos  + scale * 48, y + scale * -91.94);
        path.lineTo(x + pos  + scale * 40, y + scale * -95.28);
        path.lineTo(x + pos  + scale * 36.22, y + scale * -97.28);
        path.lineTo(x + pos  + scale * 29.78, y + scale * -101.06);
        path.lineTo(x + pos  + scale * 28.89, y + scale * -102.39);
        path.lineTo(x + pos  + scale * 38.22, y + scale * -101.94);
        path.lineTo(x + pos  + scale * 46.22, y + scale * -104.39);
        path.lineTo(x + pos  + scale * 51.11, y + scale * -107.28);
        path.lineTo(x + pos  + scale * 57.33, y + scale * -115.5);
        path.lineTo(x + pos  + scale * 63.11, y + scale * -121.5);
        path.lineTo(x + pos  + scale * 70.44, y + scale * -127.06);
        path.lineTo(x + pos  + scale * 77.78, y + scale * -130.17);
        path.lineTo(x + pos  + scale * 85.56, y + scale * -131.5);
        path.lineTo(x + pos  + scale * 94, y + scale * -130.61);
        path.lineTo(x + pos  + scale * 99.33, y + scale * -127.72);
        path.lineTo(x + pos  + scale * 104, y + scale * -121.28);
        path.lineTo(x + pos  + scale * 108.22, y + scale * -114.83);
        path.lineTo(x + pos  + scale * 112.67, y + scale * -104.39);
        path.lineTo(x + pos  + scale * 116.67, y + scale * -96.39);
        path.lineTo(x + pos  + scale * 122.44, y + scale * -86.39);
        path.lineTo(x + pos  + scale * 131.11, y + scale * -76.21);
        path.lineTo(x + pos  + scale * 143.56, y + scale * -68.87);
        path.lineTo(x + pos  + scale * 159.11, y + scale * -62.65);
        path.lineTo(x + pos  + scale * 181.56, y + scale * -57.32);
        path.lineTo(x + pos  + scale * 197.78, y + scale * -52.43);
        path.lineTo(x + pos  + scale * 210.44, y + scale * -47.98);
        path.lineTo(x + pos  + scale * 224.44, y + scale * -43.54);
        path.lineTo(x + pos  + scale * 234.44, y + scale * -38.43);
        path.lineTo(x + pos  + scale * 238, y + scale * -33.72);
        path.lineTo(x + pos  + scale * 238, y + scale * -29.5);
        path.lineTo(x + pos  + scale * 235.78, y + scale * -25.06);
        path.lineTo(x + pos  + scale * 230.22, y + scale * -17.28);
        path.lineTo(x + pos  + scale * 227.78, y + scale * -10.17);
        path.lineTo(x + pos  + scale * 225.11, y + scale * -1.72);
        path.lineTo(x + pos  + scale * 222, y + scale * 7.39);
        path.lineTo(x + pos  + scale * 208.44, y + scale * 20.94);
        path.lineTo(x + pos  + scale * 194.67, y + scale * 28.06);
        path.lineTo(x + pos  + scale * 180.22, y + scale * 34.94);
        path.lineTo(x + pos  + scale * 170, y + scale * 37.83);
        path.lineTo(x + pos  + scale * 153.33, y + scale * 39.61);
        path.lineTo(x + pos  + scale * 141.78, y + scale * 39.61);
        path.lineTo(x + pos  + scale * 137.33, y + scale * 45.83);
        path.lineTo(x + pos  + scale * 131.56, y + scale * 50.72);
        path.lineTo(x + pos  + scale * 123.56, y + scale * 50.72);
        path.lineTo(x + pos  + scale * 125.33, y + scale * 54.72);
        path.lineTo(x + pos  + scale * 125.56, y + scale * 59.61);
        path.lineTo(x + pos  + scale * 123.11, y + scale * 61.83);
        path.lineTo(x + pos  + scale * 111.33, y + scale * 68.06);
        path.lineTo(x + pos  + scale * 104.22, y + scale * 74.94);
        path.lineTo(x + pos  + scale * 88.33, y + scale * 95.5);
        path.lineTo(x + pos  + scale * 88, y + scale * 100.83);
        path.lineTo(x + pos  + scale * 85.33, y + scale * 105.83);
        path.lineTo(x + pos  + scale * 59.67, y + scale * 117.83);
        path.lineTo(x + pos  + scale * 44.33, y + scale * 121.5);
        path.lineTo(x + pos  + scale * 28.33, y + scale * 125.17);
        path.lineTo(x + pos  + scale * 9.22, y + scale * 127.83);
        path.lineTo(x + pos  + scale * -42.67, y + scale * 131.5);
        path.lineTo(x + pos  + scale * -198.67, y + scale * 131.5);
        path.lineTo(x + pos  + scale * -209.67, y + scale * 127.17);
        path.lineTo(x + pos  + scale * -217.67, y + scale * 120.83);
        path.lineTo(x + pos  + scale * -219.56, y + scale * 92.06);
        path.lineTo(x + pos  + scale * -226.89, y + scale * 66.5);
        path.lineTo(x + pos  + scale * -234.89, y + scale * 40.28);
        path.lineTo(x + pos  + scale * -238, y + scale * -8.5);
        path.lineTo(x + pos  + scale * -232.67, y + scale * -39.83);
        g2d.fill(path);

        Path2D.Double path1 = new Path2D.Double();
        double x1 = 300, y1 = 525, scale1 = 0.30;
        g2d.setColor(new Color(180,155,140));
        path1.moveTo(x1 + pos + scale1 * -45.22, y1 + scale1 * -43.17);
        path1.lineTo(x1 + pos + scale1 * -50.56, y1 + scale1 * -38.28);
        path1.lineTo(x1 + pos  + scale1 * -55.89, y1 + scale1 * -32.84);
        path1.lineTo(x1 + pos  + scale1 * -60.78, y1 + scale1 * -26.39);
        path1.lineTo(x1 + pos  + scale1 * -63.78, y1 + scale1 * -17.17);
        path1.lineTo(x1 + pos  + scale1 * -63.78, y1 + scale1 * -7.95);
        path1.lineTo(x1 + pos  + scale1 * -63.22, y1 + scale1 * 4.61);
        path1.lineTo(x1 + pos  + scale1 * -59.67, y1 + scale1 * 14.05);
        path1.lineTo(x1 + pos  + scale1 * -55, y1 + scale1 * 20.94);
        path1.lineTo(x1 + pos  + scale1 * -45.22, y1 + scale1 * 30.72);
        path1.lineTo(x1 + pos  + scale1 * -37.34, y1 + scale1 * 37.72);
        path1.lineTo(x1 + pos  + scale1 * -26.45, y1 + scale1 * 44.39);
        path1.lineTo(x1 + pos  + scale1 * -16.34, y1 + scale1 * 49.28);
        path1.lineTo(x1 + pos  + scale1 * -6.22, y1 + scale1 * 51.28);
        path1.lineTo(x1 + pos  + scale1 * 5.78, y1 + scale1 * 52.28);
        path1.lineTo(x1 + pos  + scale1 * 20.44, y1 + scale1 * 49.83);
        path1.lineTo(x1 + pos  + scale1 * 32.44, y1 + scale1 * 46.39);
        path1.lineTo(x1 + pos  + scale1 * 43.33, y1 + scale1 * 41.16);
        path1.lineTo(x1 + pos  + scale1 * 53.89, y1 + scale1 * 33.5);
        path1.lineTo(x1 + pos  + scale1 * 62.89, y1 + scale1 * 22.94);
        path1.lineTo(x1 + pos  + scale1 * 63.78, y1 + scale1 * 14.94);
        path1.lineTo(x1 + pos  + scale1 * 62.44, y1 + scale1 * 6.05);
        path1.lineTo(x1 + pos  + scale1 * 58.11, y1 + scale1 * 0.94);
        path1.lineTo(x1 + pos  + scale1 * 44.89, y1 + scale1 * -5.5);
        path1.lineTo(x1 + pos  + scale1 * 38.89, y1 + scale1 * -9.28);
        path1.lineTo(x1 + pos  + scale1 * 49.55, y1 + scale1 * -9.84);
        path1.lineTo(x1 + pos  + scale1 * 48, y1 + scale1 * -11.95);
        path1.lineTo(x1 + pos  + scale1 * 36.44, y1 + scale1 * -21.06);
        path1.lineTo(x1 + pos  + scale1 * 5, y1 + scale1 * -48.61);
        path1.lineTo(x1 + pos  + scale1 * -6.34, y1 + scale1 * -52.28);
        path1.lineTo(x1 + pos  + scale1 * -10.67, y1 + scale1 * -52.28);
        path1.lineTo(x1 + pos  + scale1 * -19.56, y1 + scale1 * -51.5);
        path1.lineTo(x1 + pos  + scale1 * -28.11, y1 + scale1 * -48.72);
        g2d.fill(path1);

        eyes = new Circle(325+pos,520,5,10,0,0,0);
        nose = new Circle(350+pos,540,15,12,180,155,140);
        eyes.draw(g2d, reset);
        nose.draw(g2d, reset);

    }

    public void move(int n) {
        pos += n;
        if(pos > 800) {
            pos = -365;
        } else if (pos < -365) {
            pos = 800;
        }
    };

}
