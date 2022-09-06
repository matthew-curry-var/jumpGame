import javax.swing.JFrame;

public class Window extends JFrame {

    public Window(int h1, int w1, String t1) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(h1, w1);
        frame.setVisible(true);
    }
}
