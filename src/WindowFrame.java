
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowFrame extends JFrame {

    public void initialize() {

        setTitle("Text input test");
        setSize(300, 300); // frame size

        textFieldNorth = new JTextField();
        textFieldNorth.setEditable(false); // read only
        buttonSouth = new JButton("I am a button");


        // contentPane's default layout: BorderLayout
        Container contentPane = getContentPane();
        contentPane.add(textFieldNorth, "North");
        contentPane.add(buttonSouth, "South");

        // Observer design pattern
        // ConcreteSubject: JTextField
        // Observer: ActionListener
        textFieldNorth.addActionListener(new TextListener());
        buttonSouth.addActionListener(new ButtonListener());
    }

    // ConcreteObserver
    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("The button is pressed.");
        }
    }

    // ConcreteObserver
    private class TextListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String textTyped = textFieldNorth.getText();
            System.out.println("You typed in NORTH = " + textTyped);
        }
    }
    
    private JButton buttonSouth;
    private JTextField textFieldNorth;
    
}
