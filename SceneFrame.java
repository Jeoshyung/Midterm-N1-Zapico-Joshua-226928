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

import javax.swing.*;
import java.awt.*;

public class SceneFrame {

  private JFrame f;
  private int width;
  private int height;
  private SceneCanvas sceneCanvas;

  public SceneFrame(int w, int h) {
    f = new JFrame();
    width = w;
    height = h;
    sceneCanvas = new SceneCanvas(width, height);
  }

  public void setUpGUI() {
    // Instantiating CP
    Container cp = f.getContentPane();
    cp.add(sceneCanvas, BorderLayout.CENTER);

    // Frame Settings 
    f.setTitle("Midterm Project - Zapico, Joshua - 226928");
    f.getContentPane().setPreferredSize(new Dimension(width, height));
    f.pack();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}