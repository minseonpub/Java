// ConvertFrame.java
// Temperature-conversion program
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertFrame extends JFrame  
{
   //Step 1: Declare necessary Fields( GUI elements) of  a frame 
	private JLabel label_up;
	private JLabel label_down;
	private JTextField text;
	private JFrame result;
	
	
   // constructor sets up GUI
   public ConvertFrame()
   {
      super("Temperature converter");
      //Step 2:  
      // a) Create label with text string "Enter Fahrenheit temperature:"
      label_up = new JLabel("Enter Fahrenheit temperature:");
      add(label_up, BorderLayout.NORTH);
      // b) Create  textfield with size 10 to store value of temperature
      text = new JTextField(10);
      add(text,BorderLayout.CENTER);
     
      //Step 3: register anonymous action listener
      //a) inside  actionPerformed() method, do the convertion.
      text.addActionListener(new ActionListener() // anonymous inner class
      {
         public void actionPerformed(ActionEvent event)
         {
        	//b) in actionPerformed() method, "Temperature in Celsius" is included.
            String temp = text.getText();
	   		int cTemp = Integer.parseInt(temp);
	   		double celsius = (cTemp - 32)*(5.0/9.0);
	   		convertFrame2 cf2;
	   		cf2 = new convertFrame2("Temperature in Celsius is:"+celsius);
         }

      }); // end anonymous inner class

      //Step 4: Add the Enter Fahrenheit temperure(Jlabel),
      //blank textfiled(JTextField) and Temperature in Celsius(JTextFiled) at north, center and South location of BorderLayout Manager
      label_down = new JLabel("Temperature in Celsius is:");
      add(label_down,BorderLayout.SOUTH);
      
   } // end ConvertFrame constructor
   
} // end class ConvertFrame

class convertFrame2 extends JDialog{
	JLabel name = new JLabel("Result of P to C");
	public convertFrame2(String str)
	{
		getContentPane().add(name);
		name.setText(str.toString());
		this.setLocation(0, 90);
		this.setSize(225,90);
		this.setModal(true);
		this.setVisible(true);
	}
}



