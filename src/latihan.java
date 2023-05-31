import javax.swing.*;

public class latihan extends JFrame {

    private JButton nextButton;
    private JLabel text;
    private JPanel latihanPanel;

    public latihan() {
        setTitle("Panel 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        nextButton.addActionListener(e -> {
            latihan2 next = new latihan2();
            next.setVisible(true);
            dispose();
        });


        setContentPane(latihanPanel);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(latihan::new);
    }
}
