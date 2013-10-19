import java.applet.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * class TextField2TextArea - String Append using input from Text Field and output to Text Area.
 * 
 * @author (Bishal) 
 * @version (1.0 2013-Oct)
 * 
 * A TextArea object is a multi-line region that displays text. It can be set to allow editing or to be read-only.
 * public class TextArea - extends TextComponent
 * extended from https://www.student.cs.uwaterloo.ca/~cs132/Patterns/guiPatterns/guipat_Button.html
 * https://www.student.cs.uwaterloo.ca/~cs132/Patterns/guiPatterns/guipat_TextField.html
 */
public class AppendText2TextArea extends Applet {
    // instance variables - replace the example below with your own
    private JButton buttonAppend = new JButton();
    StringBuilder stringBuilder = new StringBuilder();
    private JTextField textFieldInput = new JTextField(15);
    private JTextArea textAreaOutput = new JTextArea(5, 15);
    private final static String newline = "\n";
    
    /**
     * Constructor for objects of class AppendText2TextArea
     */
    public AppendText2TextArea()
    {
        // Button
        buttonAppend.setBackground(Color.green);
        buttonAppend.setLabel("Append Text");
        buttonAppend.addActionListener(new ButtonListener());
        
        // Add all the widget to applet
        this.add(textFieldInput);
        this.add(buttonAppend);
        this.add(textAreaOutput);
        textFieldInput.requestFocus();        // start with focus on this field
    }
   
   // The listener for the button.
   private class ButtonListener implements ActionListener {  
      public void actionPerformed(ActionEvent evt) {
         stringBuilder.append(textFieldInput.getText().toString());
         // stringBuilder.append("\n");
         stringBuilder.append(" ");
         textFieldInput.setText("");
         textAreaOutput.setText(stringBuilder.toString());
      }
   }
}
