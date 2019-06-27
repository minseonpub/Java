//  Circles.java
// This program draws concentric circles
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Circles extends JFrame 
{
   public static void main(String args[])
   {
      JFrame frame = new JFrame();
      Container c = frame.getContentPane();

      CirclesJPanel panel = new CirclesJPanel();
      c.add(panel, BorderLayout.CENTER);

      
      frame.setTitle("concentric Circles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setVisible(true);
      frame.setSize(200,250);
   } // end main
   
   
} // end class Circles
// Requirement 1:  the title for the frame is concentric Circles.  
// Requirement 2:  the size for the frame is 200 x 250.