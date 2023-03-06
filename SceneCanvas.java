/**
The SceneCanvas file is responsible for drawing out all of the shapes stored in the ArrayList shapes which contain different basic and composite shapes.
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

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.geom.*;

public class SceneCanvas extends JComponent {
    ArrayList<DrawingObject> shapes;
    private int width;
    private int height;
    private Remy remy = new Remy();

    public SceneCanvas(int w, int h) {
        width = w;
        height = h;
        // Init ArrayList
        shapes = new ArrayList<DrawingObject>();
        // Background Color
        shapes.add(new Rectangle(0,0,1026,768,156,128,107));
        // Pot
        shapes.add(new Pot());
        // Salt n' Pepper
        shapes.add(new Box(30,515,15,15,15,50,50,50));
        shapes.add(new Box(90,515,255,255,255,200,200,200));
        // Remy
        shapes.add(remy);
        // Cabinets
        shapes.add(new Rectangle(0,600,1026,200, 136,99,54));
        shapes.add(new Rectangle(0,575,1026,30,43,30,23));
        shapes.add(new Rectangle(25,625,400,200,44,41,26));
        shapes.add(new Rectangle(450,625,600,200,44,41,26));
        // Towel Backside
        shapes.add(new Rectangle(660,660,200,150,200,200,200));
        // Cabinet Handles
        shapes.add(new Circle(75,650,50,50,144,107,65));
        shapes.add(new Circle(325,650,50,50,144,107,65));
        shapes.add(new Circle(500,650,50,50,144,107,65));
        shapes.add(new Circle(960,650,50,50,144,107,65));
        shapes.add(new Rectangle(510,665,460,20,144,107,65));
        // Cabinet Handle Details
        shapes.add(new Line(78,660,95,700,44,41,26));
        shapes.add(new Line(120,660,102,700,44,41,26));
        shapes.add(new Line(328,660,345,700,44,41,26));
        shapes.add(new Line(370,660,352,700,44,41,26));
        // Towel Frontside
        shapes.add(new Rectangle(655,660,200,150,245,245,245));
        // Shelves
        shapes.add(new Rectangle(0,150,600,75,80,72,59));
        shapes.add(new Rectangle(0,145,610,40,127,80,36));
        shapes.add(new Poly(0,120,0,150,150,150,100,120,127,80,36));
        // Orders
        shapes.add(new Square(15,185,30,255,255,255));
        shapes.add(new Square(55,185,30,255,255,255));
        shapes.add(new Square(95,185,30,255,255,255));
        shapes.add(new Square(135,185,30,255,255,255));
        shapes.add(new Square(175,185,30,255,255,255));
        shapes.add(new Square(215,185,30,255,255,255));
        shapes.add(new Square(255,185,30,255,255,255));
        shapes.add(new Square(295,185,30,255,255,255));
        shapes.add(new Square(335,185,30,255,255,255));
        shapes.add(new Square(375,185,30,255,255,255));
        shapes.add(new Square(415,185,30,255,255,255));
        shapes.add(new Square(455,185,30,255,255,255));
        shapes.add(new Square(495,185,30,255,255,255));
        shapes.add(new Square(535,185,30,255,255,255));
        // Ladle
        shapes.add(new Ladle(0));
        shapes.add(new Ladle(75));

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        // Generate all objects
        for(DrawingObject element : shapes) {
            element.draw(g2d, new AffineTransform());
        }
    }

    public Remy getRat() {
        return remy;
    }

}