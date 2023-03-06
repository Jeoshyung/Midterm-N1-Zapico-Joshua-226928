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

public class Circle implements DrawingObject {
    
    private int x;
    private int y;
    private int w;
    private int h;
    private int r;
    private int g;
    private int b;

    public Circle(int x, int y, int w, int h, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, w, h);
        g2d.setColor(new Color(r,g,b));
        g2d.fill(ellipse);
    }
    
    public void move(int n) {
        x += n;
    };

}
