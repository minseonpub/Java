//  Events.java
// Program displays events that occur during execution.
import javax.swing.JFrame;

public class Events
{
   public static void main(String[] args)
   {
	   EventsFrame eventsFrame = new EventsFrame();
	   
	   
	   eventsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	   
	   eventsFrame.setSize(375,325);
	   eventsFrame.setVisible(true);

	   eventsFrame.setTitle("Events");
   } // end class Events
}
