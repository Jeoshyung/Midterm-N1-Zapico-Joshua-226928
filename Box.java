/**
This class is a box that makes use of 2 polygon classes in order to make 3d looking objects. 
The constructor has parameters that determine the placement of the box and its colors.
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

public class Box implements DrawingObject {

    private int x;
    private int y;
    private int r1;
    private int g1;
    private int b1;
    private int r2;
    private int g2;
    private int b2;

    public Box(int x, int y, int r1, int g1, int b1, int r2, int g2, int b2) {
        this.x = x;
        this.y = y;
        this.r1 = r1;
        this.g1 = g1;
        this.b1 = b1;
        this.r2 = r2;
        this.g2 = g2;
        this.b2 = b2;
    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        Poly box1 = new Poly(30+x,60+y,10+x,60+y,10+x,10+y,30+x,0+y,r1,g1,b1);
        Poly box2 = new Poly(30+x,60+y,30+x,0+y,60+x,10+y,60+x,60+y,r2,g2,b2);
        box1.draw(g2d, reset);
        box2.draw(g2d, reset);
    }
    
    public void move(int n) {
        x += n;
    }

}
