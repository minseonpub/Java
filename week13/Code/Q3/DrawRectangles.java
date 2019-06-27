import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class DrawRectangles 
{
	public static void main(String arg[])
	{
	      JFrame frame = new JFrame();
	      Container c = frame.getContentPane();

	      RectanglesPanel panel = new RectanglesPanel();
	      c.add(panel, BorderLayout.CENTER);

	      
	      frame.setTitle("Nested Rectangles");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.add(panel);
	      frame.setVisible(true);
	      frame.setSize(400,400);
	}

}
