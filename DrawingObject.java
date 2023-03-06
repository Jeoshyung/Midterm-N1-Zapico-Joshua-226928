/**
The drawing object class is the interface used in all of the shape classes.
The draw method uses Graphics2D and AffineTransform to generate shapes and
the move method is responsible for moving objects along the x axis.
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

public interface DrawingObject {
    public void draw(Graphics2D g2d, AffineTransform reset);
    public void move(int x);
}
