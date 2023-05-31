import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JTextField getUsername;
    private JLabel username;
    private JLabel password;
    private JButton loginButton;
    private JPasswordField getPassword;
    private JPanel main;
public login() {
    JFrame frame = new JFrame();
    frame.setTitle("Login");
    frame.setContentPane(main);
    frame.setMinimumSize(new Dimension(400, 425));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Shape shape =new Shape();
            frame.setVisible(true);
            frame.dispose();
        }
    });
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(login::new);
    }
}
