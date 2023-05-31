import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class komen {
    private JTextField textField1;
    private JTextField textField2;
    private JButton uploadButton;
    private JPanel main;

    public komen() {
    JFrame frame = new JFrame();
    frame.setTitle("Komen dulu bang");
    frame.setContentPane(main);
    frame.setMinimumSize(new Dimension(450, 475));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
    uploadButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Berhasil Menambahka Komentar!");
        }
    });
}
}
