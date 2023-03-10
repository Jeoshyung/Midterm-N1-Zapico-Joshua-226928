/**
This pot class generates the pot with the rectangle being the pot and the triangle being the soup.
The draw method generates the pot and the move method allows it to move.
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

public class Pot implements DrawingObject {

    public Pot() {

    }

    public void draw(Graphics2D g2d, AffineTransform reset) {

        Rectangle pot = new Rectangle(450,380,185,200,188,113,73);
        Triangle soup = new Triangle(460,390,620,390,540,400,200,130,90); 
        pot.draw(g2d, reset);
        soup.draw(g2d, reset);

    }

    public void move(int n) {
        
    }

}
