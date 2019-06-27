//  Circle.java
// Program calculates the area, circumference
// and diameter for a circle and draws the circle
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;

public class Circle
{
   public static void main(String args[])
   {
      
      /* write your code using methods of JOptionPane class 
        do not use System.out.Println() to display on the screen
        do not use methods of Scanner class and Sytem.in to accept input from user      
       */
	   JFrame frame = new JFrame();
	   Container c = frame.getContentPane();
	   
	   String radius = JOptionPane.showInputDialog("Enter radius:");
	   String xCoor = JOptionPane.showInputDialog("Enter x-coordinate:");
	   String yCoor = JOptionPane.showInputDialog("Enter y-coordinate:");
	   
	   double r_radiu = Double.parseDouble(radius);
	   int r_xCoor = Integer.parseInt(xCoor);
	   int r_yCoor = Integer.parseInt(yCoor);

	   CirclesJPanel circle = new CirclesJPanel(r_radiu, r_xCoor, r_yCoor);
	   c.add(circle);
    
	   frame.setTitle("Circle");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	   frame.setVisible(true);
	   frame.setSize(300,400);

   }
      
} // end class Circle

