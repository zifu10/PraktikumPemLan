package TugasPemLan7;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RegistrationForm extends JFrame {
    JTextField namaField, tglLahirField, noPendaftaranField, noTelpField, alamatField, emailField;

    public RegistrationForm() {
        setTitle("Form Pendaftaran Ulang Mahasiswa Baru");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adding padding

        JLabel namaLabel = new JLabel("Nama Lengkap:");
        namaField = new JTextField();
        JLabel tglLahirLabel = new JLabel("Tanggal Lahir:");
        tglLahirField = new JTextField();
        JLabel noPendaftaranLabel = new JLabel("Nomor Pendaftaran:");
        noPendaftaranField = new JTextField();
        JLabel noTelpLabel = new JLabel("No. Telp:");
        noTelpField = new JTextField();
        JLabel alamatLabel = new JLabel("Alamat:");
        alamatField = new JTextField();
        JLabel emailLabel = new JLabel("E-mail:");
        emailField = new JTextField();

        JButton submitButton = new JButton("Submit");

        panel.add(namaLabel);
        panel.add(namaField);
        panel.add(tglLahirLabel);
        panel.add(tglLahirField);
        panel.add(noPendaftaranLabel);
        panel.add(noPendaftaranField);
        panel.add(noTelpLabel);
        panel.add(noTelpField);
        panel.add(alamatLabel);
        panel.add(alamatField);
        panel.add(emailLabel);
        panel.add(emailField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
        buttonPanel.add(submitButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH); 

        Font labelFont = new Font("Arial", Font.BOLD, 14);
        namaLabel.setFont(labelFont);
        tglLahirLabel.setFont(labelFont);
        noPendaftaranLabel.setFont(labelFont);
        noTelpLabel.setFont(labelFont);
        alamatLabel.setFont(labelFont);
        emailLabel.setFont(labelFont);

        Font fieldFont = new Font("Arial", Font.PLAIN, 14);
        namaField.setFont(fieldFont);
        tglLahirField.setFont(fieldFont);
        noPendaftaranField.setFont(fieldFont);
        noTelpField.setFont(fieldFont);
        alamatField.setFont(fieldFont);
        emailField.setFont(fieldFont);

        submitButton.setFont(new Font("Arial", Font.BOLD, 14));

        panel.setBackground(Color.WHITE);
        buttonPanel.setBackground(Color.WHITE);

        Color borderColor = new Color(169, 169, 169);
        Border fieldBorder = BorderFactory.createLineBorder(borderColor);
        namaField.setBorder(fieldBorder);
        tglLahirField.setBorder(fieldBorder);
        noPendaftaranField.setBorder(fieldBorder);
        noTelpField.setBorder(fieldBorder);
        alamatField.setBorder(fieldBorder);
        emailField.setBorder(fieldBorder);

        Color buttonColor = new Color(70, 130, 180);
        submitButton.setBackground(buttonColor);
        submitButton.setForeground(Color.WHITE);

        submitButton.addActionListener(new SubmitAction(this));
    }
}