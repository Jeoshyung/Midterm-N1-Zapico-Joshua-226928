/**
This is a template for a Java file.
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

public class Poly implements DrawingObject {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;
    private int r;
    private int g;
    private int b;

    public Poly(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int r, int g, int b) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        Path2D.Double line = new Path2D.Double();
        line.moveTo(x1,y1);
        line.lineTo(x2,y2);
        line.lineTo(x3,y3);
        line.lineTo(x4,y4);
        line.closePath();
        g2d.setColor(new Color(r,g,b));
        g2d.fill(line);
    }

}
