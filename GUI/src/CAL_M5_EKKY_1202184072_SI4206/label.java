package CAL_M5_EKKY_1202184072_SI4206;


import javax.swing.*;
import java.awt.*;


/**
 *
 * @author ekky
 */
public class label extends JFrame {

    JFrame frame;
    JLabel heading, nama, jekel, kesulitan, hobby, feedback, hasil;
    JTextField txnama;
    JTextArea txfeedback, txhasil;
    JRadioButton pria, wanita, privasi;
    JButton submit;
    JComboBox cbkesulitan;
    JCheckBox ngoding, nugas, praktikum;
    ButtonGroup radiogrup;
    Container contain = getContentPane();

    public label() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);

        //label
        heading = new JLabel("FORM WA5 PRAKTIKUM OOP");
        heading.setBounds(250, 0, 200, 50);
        nama = new JLabel("Nama");
        nama.setBounds(10, 60, 110, 20);
        jekel = new JLabel("Jenis Kelamin");
        jekel.setBounds(10, 90, 110, 20);
        kesulitan = new JLabel("Tingkat Kesulitan");
        kesulitan.setBounds(10, 120, 110, 20);
        hobby = new JLabel("Hobby");
        hobby.setBounds(10, 150, 110, 20);
        feedback = new JLabel("Feedback Modul 5");
        feedback.setBounds(10, 180, 110, 20);
        hasil = new JLabel("Hasil");
        hasil.setBounds(360, 60, 50, 20);

        //radiobutton & checkbox
        pria = new JRadioButton("Pria");
        pria.setBounds(125, 90, 50, 20);
        wanita = new JRadioButton("Wanita");
        wanita.setBounds(175, 90, 70, 20);
        privasi = new JRadioButton("Privasi");
        privasi.setBounds(250, 90, 70, 20);
        radiogrup = new ButtonGroup();
        radiogrup.add(pria);
        radiogrup.add(wanita);
        radiogrup.add(privasi);

        String[] listkesulitan = {"EZ Pisan", "Susah beud"};
        cbkesulitan = new JComboBox(listkesulitan);
        cbkesulitan.setBounds(125, 120, 100, 20);

        ngoding = new JCheckBox("Ngoding");
        ngoding.setBounds(125, 150, 75, 20);
        nugas = new JCheckBox("Nugas");
        nugas.setBounds(200, 150, 65, 20);
        praktikum = new JCheckBox("Praktikum");
        praktikum.setBounds(265, 150, 90, 20);

        //button
        submit = new JButton("Submit");
        submit.setBounds(305, 320, 90, 30);
        submit.setVisible(true);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit(evt);
            }
        });

        //textarea
        txnama = new JTextField();
        txnama.setBounds(125, 60, 200, 20);
        txfeedback = new JTextArea();
        txfeedback.setBounds(10, 200, 320, 100);
        txhasil = new JTextArea();
        txhasil.setBounds(360, 90, 300, 200);

    }

    private void submit(java.awt.event.ActionEvent evt) {
        String submit = "";
        submit += "Nama : " + txnama.getText() + "\n";
        if (pria.isSelected()) {
            submit += "Jenis Kelamin : Pria\n";
        } else if (wanita.isSelected()) {
            submit += "Jenis Kelamin : Wanita\n";
        } else if (privasi.isSelected()) {
            submit += "Jenis Kelamin : Privasi\n";
        } else {
            submit += "Jenis Kelamin : -\n";
        }
        submit += "Tingkat Kesulitan : " + cbkesulitan.getSelectedItem() + "\n";
        submit += "Hobi : ";
        if (ngoding.isSelected()) {
            submit += "Ngoding ";
        }
        if (nugas.isSelected()) {
            submit += "Nugas ";
        }
        if (praktikum.isSelected()) {
            submit += "Praktikum ";
        }
        submit += "\n";
        submit += "Feedback Modul 5 : \n" + txfeedback.getText();

        txhasil.setText(submit);
    }

    public void tampilkan() {
        frame.add(heading);
        frame.add(nama);
        frame.add(txnama);
        frame.add(hasil);
        frame.add(jekel);
        frame.add(pria);
        frame.add(wanita);
        frame.add(privasi);
        frame.add(kesulitan);
        frame.add(cbkesulitan);
        frame.add(hobby);
        frame.add(ngoding);
        frame.add(nugas);
        frame.add(praktikum);
        frame.add(feedback);
        frame.add(txfeedback);
        frame.add(txhasil);
        frame.add(submit);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        label lb = new label();
        lb.tampilkan();

    }
}
