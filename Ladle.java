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

public class Ladle implements DrawingObject {
    private Rectangle handle;
    private Circle circle1;
    private Circle circle2;

    public Ladle(int x) {
        handle = new Rectangle(200 + x,140,20,120,120,105,96);
        circle1 = new Circle(180 + x,250,60,40,120,105,96);
        circle2 = new Circle(185 + x,258,50,15,70,60,60);
    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        handle.draw(g2d, reset);
        circle1.draw(g2d, reset);
        circle2.draw(g2d, reset);
    }

}