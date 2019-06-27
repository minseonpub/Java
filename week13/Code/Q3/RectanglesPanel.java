
// Draw nested rectangles
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class RectanglesPanel extends JPanel
{
	
	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);
		 Graphics2D g2d=(Graphics2D)g;
		 
		 int x=150, y=150; // coordinates of upper-left vertex of central rectangle
		 int length=50; int width=30;// width and height of central rectangle
		 int adjacent = 10;
		 
		 for(int i=1;i<=10;i++)
		 {
				
			// write the missing code here.
		   int a = x-(i-1)*adjacent; 
		   int b = y-(i-1)*adjacent; 
		   
		   int w= width+2*i*adjacent;
		   int h= length+2*i*adjacent;       
		
		   // write your code to draw Ellipse objects from Ellipse2D.Double class.
		   Rectangle2D.Double rect = new Rectangle2D.Double(a,b,h,w);
				  
		   g2d.draw(rect);

		  }
	
	}
}
