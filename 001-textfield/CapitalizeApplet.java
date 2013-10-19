import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This will show example of how text can be capitalized using text field as both input and output.
 * 
 * @author (Bishal Ghimire) 
 * @version (1.0 2013-Oct)
 */
public class CapitalizeApplet extends Applet {
    // instance variables
    private TextField input;
    private TextField output;

    /**
     * base init class 
     */
    public void init () {
        // Construct the Text Fields 
        this.input = new TextField(40);
        this.output = new TextField(40);
        this.output.setEditable(false);
        Button button = new Button("Capitalize");
        
        // add the buttons and textfields to the layout
        this.add(input);
        this.add(button);
        this.add(output);
        
        // Capitaliz Action Object
        CapitalizeAction ca = new CapitalizeAction(input, output);
        button.addActionListener(ca);
        this.input.addActionListener(ca);
    }
    
    /**
     * CapitalizerAction class for class CapitalizeApplet
     */
    class CapitalizeAction implements ActionListener {
        private TextField in;
        private TextField out;

        /**
         * Class Capuralize
         */
        public CapitalizeAction(TextField in, TextField out) {
            this.in = in;
            this.out = out;
        }
        
        /**
         * An action Performere returns the upperCase Text
         */
        public void actionPerformed(ActionEvent ae) {
            String s = in.getText();
            out.setText(s.toUpperCase());
        }
    }
}
