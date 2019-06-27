//  Concentric.java
// This program draws concentric circles using Graphics2D
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Concentric extends JFrame 
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
      frame.setSize(250,250);
  
   } 
} // end class Concentric

