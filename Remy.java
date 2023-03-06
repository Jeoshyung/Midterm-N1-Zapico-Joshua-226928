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

public class Remy implements DrawingObject {

    private int x;
    private Triangle ear1;
    private Triangle ear2;
    private Circle head;
    private Circle body;
    private Triangle tail;
    private Circle eye1;
    private Circle eye2;
    private Rectangle leg1;
    private Rectangle leg2;
    private Triangle nose;
    
    public Remy() {

    }

    public void draw(Graphics2D g2d, AffineTransform reset) {
        ear1 = new Triangle(605+x,520,620+x,500,610+x,490,215,163,139);
        ear2 = new Triangle(645+x,520,630+x,500,640+x,490,215,163,139);
        tail = new Triangle(480+x,550,540+x,555,540+x,540,215,163,139);
        head = new Circle(600+x,500,50,50,52,64,92);
        body = new Circle(525+x,520,100,50,52,64,92);
        eye1 = new Circle(615+x,520,5,5,0,0,0);
        eye2 = new Circle(635+x,520,5,5,0,0,0);
        leg1 = new Rectangle(600+x,550,5,30,215,163,139);
        leg2 = new Rectangle(545+x,550,5,30,215,163,139);
        nose = new Triangle(623+x,528,632+x,545,633+x,528,33,43,66);
        ear1.draw(g2d, reset);
        ear2.draw(g2d, reset);
        tail.draw(g2d, reset);
        head.draw(g2d, reset);
        leg1.draw(g2d, reset);
        leg2.draw(g2d, reset);
        body.draw(g2d, reset);
        eye1.draw(g2d, reset);
        eye2.draw(g2d, reset);
        nose.draw(g2d, reset);   
    }

    public void move(int n) {
        this.x += n;
    };

}
