/**
The line class takes in 2 sets of coordinates and a thickness to generate lines.
The draw method generates the line while the move method allows the line to move.
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

public class Line implements DrawingObject {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int r;
    private int g;
    private int b;
    private int thickness;

    public Line(int x1, int y1, int x2, int y2, int thickness, int r, int g, int b) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.r = r;
        this.g = g;
        this.b = b;
        this.thickness = thickness;
    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
        g2d.setStroke(new BasicStroke((float) thickness));
        g2d.setColor(new Color(r,g,b));
        g2d.draw(line);
    }

    public void move(int x) {

    };
    
}
