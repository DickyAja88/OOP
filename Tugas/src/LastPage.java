import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastPage {
    private JLabel gambar;
    private JButton kembaliKeBerandaButton;
    private JPanel main;

    public LastPage() {
    JFrame frame = new JFrame();
    frame.setTitle("Login");
    frame.setContentPane(main);
    frame.setMinimumSize(new Dimension(450, 550));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
    kembaliKeBerandaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            SecondPage back = new SecondPage();
            frame.setVisible(true);
            frame.dispose();
        }
    });
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LastPage::new);
    }
}
