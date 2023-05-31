import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JTextField textUsername;
    private JPasswordField textpassword;
    private JButton loginbutton;
    private JPanel title;
    private JLabel Login;
    private JPanel main;
    private JLabel password;
    private JLabel username;
    private JLabel gambar;









    public Login() {
        ImageIcon icon = new ImageIcon("Tugas/src/logo1.jpg");
        gambar.setIcon(icon);
        setTitle("Login");
        setContentPane(main);
        setMinimumSize(new Dimension(450, 474));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        textUsername = new JTextField(20);
        textpassword = new JPasswordField(20);
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondPage page = new SecondPage();
                setVisible(true);
                dispose();
//                String enterUsename = textUsername.getText();
//                String enterPassword = new String(textpassword.getPassword());
//                if(enterUsename.equals("megachan") && enterPassword.equals("mo")){
//                    Page1 page = new Page1();
//                    setVisible(true);
//                    dispose();
//                }else{
//                    JOptionPane.showMessageDialog(Login.this, "Salah");
//                }
            }
        });
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(Login::new);
    }
}
