import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shape {
    private JLabel Persegi;
    private JTextField getSisi;
    private JTextField getPanjang;
    private JTextField getLebar;
    private JButton hitungbutton1;
    private JButton hitungButton2;
    private JLabel tittle;
    private JPanel main;
    private JLabel hasilPersegi;
    private JLabel hasilPersegiPanjang;
    private JTextField getJari;
    private JLabel hasilLingkaran;
    private JButton hitung3;
    private JLabel lingkaran;
    private JTextField getAlas;
    private JTextField getTinggi;
    private JLabel hasilSegitiga;
    private JButton hitung4;
    private JLabel PersegiPanjang;
    private JLabel Segitiga;
    private JButton logoutButton;
    private JButton komentarButton;

    public Shape() {
    JFrame frame = new JFrame();
    frame.setTitle("Hitung");
    frame.setContentPane(main);
    frame.setMinimumSize(new Dimension(500, 600));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
    hitungbutton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double sisi = Double.parseDouble(getSisi.getText());
            double persegi = sisi*sisi;
            hasilPersegi.setText(String.valueOf(persegi));
        }
    });
        hitungButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double panjang = Double.parseDouble(getPanjang.getText());
                double lebar = Double.parseDouble(getLebar.getText());
                double persegiPanjang = panjang*lebar;
                hasilPersegiPanjang.setText(String.valueOf(persegiPanjang));
            }
        });
        hitung3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double r = Double.parseDouble(getJari.getText());
                double lingkaran = Math.PI *r*r;
                hasilLingkaran.setText(String.valueOf(lingkaran));
            }
        });

        hitung4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tinggi = Double.parseDouble(getTinggi.getText());
                double alas = Double.parseDouble(getAlas.getText());
                double segitiga = 0.5*alas*tinggi;
                hasilSegitiga.setText(String.valueOf(segitiga));
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(logoutButton);
                frame.dispose();
            }
        });
        komentarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                komen comen = new komen();
                frame.setVisible(true);
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Shape::new);
    }
}
