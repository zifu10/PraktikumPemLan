package TugasPemLan7;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitAction implements ActionListener {
    private RegistrationForm form;

    public SubmitAction(RegistrationForm form) {
        this.form = form;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (form.namaField.getText().isEmpty() || form.tglLahirField.getText().isEmpty() ||
            form.noPendaftaranField.getText().isEmpty() || form.noTelpField.getText().isEmpty() ||
            form.alamatField.getText().isEmpty() || form.emailField.getText().isEmpty()) {
                
            JOptionPane.showMessageDialog(null, "Semua kolom harus terisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                JFrame dataFrame = new JFrame("Data Mahasiswa");
                dataFrame.setSize(400, 300);
                dataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                dataFrame.setLocationRelativeTo(null);

                String[] columnNames = {"Data", "Mahasiswa"};
                Object[][] data = {
                    {"Nama", form.namaField.getText()},
                    {"Tanggal Lahir", form.tglLahirField.getText()},
                    {"No. Pendaftaran", form.noPendaftaranField.getText()},
                    {"No. Telp", form.noTelpField.getText()},
                    {"Alamat", form.alamatField.getText()},
                    {"E-mail", form.emailField.getText()}
                };

                JTable table = new JTable(data, columnNames);
                table.setFont(new Font("Serif", Font.PLAIN, 14));
                table.setRowHeight(20);

                JTableHeader header = table.getTableHeader();
                header.setFont(new Font("Serif", Font.BOLD, 16));
                header.setBackground(Color.LIGHT_GRAY);

                JScrollPane scrollPane = new JScrollPane(table);
                dataFrame.add(scrollPane, BorderLayout.CENTER);

                dataFrame.setVisible(true);
            }
        }
    }
}