import javax.swing.*;


public class latihan2 extends JFrame{
    private JButton backButton;
    private JPanel latihanPanel2;
    private JPanel text2;

    public latihan2() {
        setTitle("Panel 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        backButton.addActionListener(e -> {
                latihan back = new latihan();
                back.setVisible(true);
             dispose();
            });
         setContentPane(latihanPanel2);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(latihan2::new);
    }

}

