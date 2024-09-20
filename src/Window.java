import javax.swing.*;

public class Window extends JPanel{
    private final JFrame frame;
    private final JPanel panel;

    Window() {
        frame = new JFrame("Store Manager");
        panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setSize(800, 800);
        frame.setUndecorated(false);
        frame.add(panel);
        frame.setVisible(true);
    }
}