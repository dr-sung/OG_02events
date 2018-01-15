
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowFrame extends JFrame {

    private JButton buttonSouth;
    private JTextField textFieldNorth;

    public void initialize() {

        setTitle("Text input test");
        setSize(300, 300); // frame size

        textFieldNorth = new JTextField();
        buttonSouth = new JButton("I am a button");

        // contentPane's default layout: BorderLayout
        Container contentPane = getContentPane();
        contentPane.add(textFieldNorth, BorderLayout.NORTH);
        contentPane.add(buttonSouth, BorderLayout.SOUTH);

        textFieldNorth.addActionListener(event -> {
            System.out.println("Enter is pressed on TextField. Value = "
                    + textFieldNorth.getText());
        });
        
        buttonSouth.addActionListener(event -> {
            textFieldNorth.setText("Button is pressed");
        });
    }

}
