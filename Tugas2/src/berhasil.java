import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class berhasil {
    private JPanel main;
    private JLabel Nominal;
    private JLabel namaBerhasil;
    private JButton okButton;
    private JLabel gambar;

    public berhasil() {
//    ImageIcon icon = new ImageIcon("Tugas2/src/logo1.jpg");
//    gambar.setIcon(icon);
    JFrame frame = new JFrame();
    frame.setTitle("Berhasil");
    frame.setContentPane(main);
    frame.setMinimumSize(new Dimension(450, 474));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
    okButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(okButton);
            frame.dispose();

        }
    });
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(berhasil::new );
    }
}
