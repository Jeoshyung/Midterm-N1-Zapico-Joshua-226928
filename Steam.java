import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/**
This steam class uses bezier curves in order to display steam.
There is a method responsible for switching the boolean values of the direction of the steam
in order to create an animation. The draw method draws the shape and the move method
allows the object to move.
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

public class Steam implements DrawingObject {

    private int x;
    private int y;
    private boolean dir = true;

    public Steam(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g2d, AffineTransform reset) {
         // Steam
         if (dir == true) {
            Path2D.Double steam1 = new Path2D.Double();
            steam1.moveTo(40+x,10+y);
            steam1.curveTo(20+x,40+y,70+x,40+y,40+x,70+y);
            g2d.setStroke(new BasicStroke((float) 5));
            g2d.setColor(new Color(240,240,240,100));
            g2d.draw(steam1);
            Path2D.Double steam2 = new Path2D.Double();
            steam2.moveTo(90+x,10+y);
            steam2.curveTo(70+x,40+y,120+x,40+y,90+x,70+y);
            g2d.setStroke(new BasicStroke((float) 5));
            g2d.setColor(new Color(240,240,240,100));
            g2d.draw(steam2);
            Path2D.Double steam3 = new Path2D.Double();
            steam3.moveTo(140+x,10+y);
            steam3.curveTo(120+x,40+y,170+x,40+y,140+x,70+y);
            g2d.setStroke(new BasicStroke((float) 5));
            g2d.setColor(new Color(240,240,240,100));
            g2d.draw(steam3);
        } else {
            Path2D.Double steam4 = new Path2D.Double();
            steam4.moveTo(40+x,10+y);
            steam4.curveTo(70+x,40+y,20+x,40+y,40+x,70+y);
            g2d.setStroke(new BasicStroke((float) 5));
            g2d.setColor(new Color(240,240,240,100));
            g2d.draw(steam4);
            Path2D.Double steam5 = new Path2D.Double();
            steam5.moveTo(90+x,10+y);
            steam5.curveTo(120+x,40+y,70+x,40+y,90+x,70+y);
            g2d.setStroke(new BasicStroke((float) 5));
            g2d.setColor(new Color(240,240,240,100));
            g2d.draw(steam5);
            Path2D.Double steam6 = new Path2D.Double();
            steam6.moveTo(140+x,10+y);
            steam6.curveTo(170+x,40+y,120+x,40+y,140+x,70+y);
            g2d.setStroke(new BasicStroke((float) 5));
            g2d.setColor(new Color(240,240,240,100));
            g2d.draw(steam6);
        }
    }

    public void anim() {
        if(dir == true) {
            dir = false;
        } else {
            dir = true;
        }
    }

    @Override
    public void move(int x) {

    }


}
