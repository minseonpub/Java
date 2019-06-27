// CirclesJPanel.java
// This program draws concentric circles using Graphics2D
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class CirclesJPanel extends JPanel 
{
   // draw eight concentric circles separated by 10 pixels
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      // create Graphic 2D reference from g by filling the following Table
      Graphics2D g2 = (Graphics2D) g;

      for (int i = 0; i < 80; i += 10) 
      {
		 /*(30,30)is coordinate of upperleft corner of
		 * enclosing rectangle of the outer circle 
		 */
		   int x= i+30; 
		   int y= i+30;
		  /* find width and height upperleft corner of
		   * upperleft corner of enclosing rectangle of the outer circle 
		   */
		  int w= 160-(i*2);
		  int h= 160-(i*2);        
		 // write your code to draw Ellipse objects from Ellipse2D.Double class.
		  Ellipse2D.Double circle = new Ellipse2D.Double(x,y,w,h);
		  
		  //circle.setFrameFromCenter(centerX, centerY, centerX+i, centerY+i);
		  g2.draw(circle);
      } 
        
      
   }
} // end class CirclesJPanel
// Hint 1: Read draw() of Graphics2D class from java API
// Hint 2: Read  the constructor Ellipse2D.Double(x,y,w,h) from java API
