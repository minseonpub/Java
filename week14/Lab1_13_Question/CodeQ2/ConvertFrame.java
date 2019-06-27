// ConvertFrame.java
// Temperature-conversion program
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertFrame extends JFrame 
{
   /* Step 1: Declare necessary Fields( GUI elements) of  a frame 
    ----------------------------------------------------------
    */
   // constructor sets up GUI
   public ConvertFrame()
   {
      super("Temperature converter");
      /* Step 2:  
       a) Cretae label with text string "Enter Fahrenheit temperature:"
       b) Create  textfield with size 10 to store value of temperature
       ------------------------------------------------ 
       */
      /* Step 3: register anonymous action listener
        a) inside  actionPerformed() method, do the convertion.
        b) in actionPerformed() method, "Temperature in Celsius" is included.
       --------------------------------------------------
       */
      /* Step 4: Add the Enter Fahrenheit temperure(Jlabel),
        blank textfiled(JTextField) and Temperature in Celsius(JTextFiled)
        at north, center and South location of BorderLayout Manager
       -----------------------------------------------------------
       */
   } // end ConvertFrame constructor
} // end class ConvertFrame



