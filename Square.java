/**
The square class takes a set of coordinates for its position, and a size value that makes it have equal sides.
The draw method is responsible for drawing the square and the move method allows it to move.
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

public class Square implements DrawingObject {

    private int x;
    private int y;
    private int size;
    private int r;
    private int g;
    private int b;

    public Square(int x, int y, int size, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        Rectangle2D.Double square = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(new Color(r,g,b));
        g2d.fill(square);
    }

    public void move(int x) {
        
    };
    
}
