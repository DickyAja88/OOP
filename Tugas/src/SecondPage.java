import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondPage extends JFrame {
    private JLabel judul;
    private JButton backbutton;
    private JPanel main;
    private JLabel UseId;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JButton OKButton;
    private JButton buktiButton;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JLabel gambar;
    private JButton btn;

    public SecondPage() {
        ImageIcon image = new ImageIcon("Tugas/src/logo2.jpg");
        gambar.setIcon(image);
        setTitle("Top-Up Page");
        setContentPane(main);
        setMinimumSize(new Dimension(450, 800));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                setVisible(true);
                dispose();
            }
        });

        btn = new JButton("Bukti");
        btn.setFocusable(false);
        buktiButton.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(SecondPage.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                    System.out.println("File yang dipilih: " + selectedFilePath);
                } else if (result == JFileChooser.CANCEL_OPTION) {
                    System.out.println("Pemilihan file dibatalkan");
                }
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LastPage next = new LastPage();
                setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SecondPage::new);
    }
}
