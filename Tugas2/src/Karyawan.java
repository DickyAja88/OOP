import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Karyawan {
    private JTextField getNama;
    private JTextField getAlamat;
    private JTextField getJabatan;
    private JTextField getNip;
    private JTextField getGaji;
    private JTextField getPajak;
    private JButton bayarButton;
    private JLabel nama;
    private JLabel alamat;
    private JLabel jabatan;
    private JLabel nip;
    private JLabel gaji;
    private JLabel pajak;
    private JPanel main;
    private JLabel Nominal;
    private JButton hitungButton;
    private JLabel gajiBersih;

    public Karyawan() {
        JFrame frame = new JFrame();
        frame.setTitle("Bayar Pajak");
        frame.setContentPane(main);
        frame.setMinimumSize(new Dimension(450, 474));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    bayarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            berhasil next = new berhasil();
            frame.setVisible(true);
            frame.dispose();
        }

    });
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //karena kita hanya akan menghitung gaji dan pajak maka yang dibuat hanya keduanya.

                double pajak = Double.parseDouble(getPajak.getText());
                double gaji = Double.parseDouble(getGaji.getText());
                double nominal = gaji*pajak/100;
                double gajibersih = gaji-nominal;
                Nominal.setText(String.valueOf("Nominal : " +nominal));
                gajiBersih.setText(String.valueOf("Gaji Bersih : "+gajibersih));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Karyawan::new);
    }
}
