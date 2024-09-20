import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window extends JPanel{
    private int width = 800;
    private int height = 600;

    private final JFrame frame;
    private final JPanel panel;

    private final JButton showStock;
    private final JButton buyingReport;
    private final JButton sellingReport;

    Window() {
        //Screen
        frame = new JFrame("Store Manager");
        panel = new JPanel();

        //Buttons
        showStock = new JButton("Show Items in Stock");
        buyingReport = new JButton("Buying Report");
        sellingReport = new JButton("Selling Report");
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(width, height);

        showStock.setBounds(25, 25, 150, 20);
        buyingReport.setBounds(180, 25, 125, 20);
        sellingReport.setBounds(310, 25, 125, 20);

        frame.add(panel);
        frame.add(showStock);
        frame.add(buyingReport);
        frame.add(sellingReport);

        showStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Show Items in Stock");
            }
        });
        buyingReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buying Items Report");
            }
        });
        sellingReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selling Report Items");
            }
        });

        frame.setVisible(true);
    }
}