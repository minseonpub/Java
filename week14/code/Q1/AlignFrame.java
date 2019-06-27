//  AlignFrame.java
// Program creates a simple GUI.
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlignFrame extends JFrame 
{      
   //Step 0: Declare  all the necessary GUI components here.
	private JCheckBox CshowGrid;
	private JCheckBox CsnaptoGrid;
	private JLabel labelX;
	private JLabel labelY;
	private JTextField tlabelX;
	private JTextField tlabelY;
	private JButton ok;
	private JButton cancel;
	private JButton help;
	

    // constructor sets up GUI
   public AlignFrame()
   {
      super("Align");
      // Step 1.create two check boxes and store them in a panel_1 
      setLayout(new FlowLayout());
      
      JPanel panel_1 = new JPanel();
      CsnaptoGrid = new JCheckBox("Snap to Grid");
      CshowGrid = new JCheckBox("Show Grid");
      panel_1.setLayout(new GridLayout(2,1));
      panel_1.add(CsnaptoGrid);
      panel_1.add(CshowGrid);
      add(panel_1);
      
      // Step 2.1 Create text field and its label and store then in Panel_2
      JPanel panel_2 = new JPanel();
      labelX = new JLabel("X: ");
      tlabelX = new JTextField("8",3);
      panel_2.add(labelX);
      panel_2.add(tlabelX);
      panel_2.setLayout(new FlowLayout());

     // Step 2.2.Create text field and its label and store then in Panel_3
      JPanel panel_3 = new JPanel();
      labelY = new JLabel("Y: ");
      tlabelY = new JTextField("8",3);
      panel_3.add(labelY);
      panel_3.add(tlabelY);
      panel_3.setLayout(new FlowLayout());
      
      // 2.3.Store  Panel_2  and Panel_3 inside panel_4  by putting panel_2 at North and panel_3 at South.
      JPanel panel_4 = new JPanel();
      
      panel_4.setLayout(new BorderLayout());
      panel_4.add(panel_2,BorderLayout.NORTH);
      panel_4.add(panel_3,BorderLayout.SOUTH);
      add(panel_4);


      //Step 3. Creating three Buttons and store them in panel_5
      JPanel panel_5 = new JPanel();

      ok = new JButton("OK");
      cancel = new JButton("Cancel");
      help = new JButton("Help");
      
      panel_5.add(ok);
      panel_5.add(cancel);
      panel_5.add(help);
      panel_5.setLayout(new GridLayout(3,1,10,5));
      add(panel_5);

     
      //Step 4:Put Panel_1, panel_4 and panel_5 inside frame
      this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
      pack();
      
   } // end AlignFrame constructor
} // end class AlignFrame


