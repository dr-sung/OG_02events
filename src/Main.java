
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        WindowFrame frame = new WindowFrame();
        frame.initialize();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocation(100, 100);
    }
}
