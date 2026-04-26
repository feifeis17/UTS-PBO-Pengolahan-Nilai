import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormKrs extends javax.swing.JFrame {
    public FormKrs() {
        initComponents();
        setTitle("Form KRS - Kartu Rencana Studi");
        setLocationRelativeTo(null);
        tampil_data();
        tampil_nim();
        tampil_mk();
        kosongkan_form();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void tampil_data() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID KRS");
        model.addColumn("NIM");
        model.addColumn("Kode MK");
        model.addColumn("Semester Aktif");
        tblKrs.setModel(model);

        try {
            Connection conn = Koneksi.configDB();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery("SELECT * FROM krs");
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString("id_krs"), res.getString("nim"),
                    res.getString("kode_mk"), res.getString("semester_aktif")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data KRS: " + e.getMessage());
        }
    }

    private void tampil_nim() {
        try {
            Connection conn = Koneksi.configDB();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery("SELECT nim FROM mahasiswa");
            cbNim.removeAllItems();
            cbNim.addItem("--Pilih NIM--");
            while (res.next()) {
                cbNim.addItem(res.getString("nim"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tampil_mk() {
        try {
            Connection conn = Koneksi.configDB();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery("SELECT kode_mk FROM matakuliah");
            cbKodeMk.removeAllItems();
            cbKodeMk.addItem("--Pilih Kode MK--");
            while (res.next()) {
                cbKodeMk.addItem(res.getString("kode_mk"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void kosongkan_form() {
        txtIdKrs.setText("");
        cbNim.setSelectedIndex(0);
        txtNamaMhs.setText("");
        cbKodeMk.setSelectedIndex(0);
        txtNamaMk.setText("");
        txtSks.setText("");
        txtSemesterAktif.setText("");
        txtIdKrs.requestFocus();
        txtNamaMhs.setEditable(false);
        txtNamaMk.setEditable(false);
        txtSks.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaMk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSks = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSemesterAktif = new javax.swing.JTextField();
        txtIdKrs = new javax.swing.JTextField();
        cbKodeMk = new javax.swing.JComboBox<>();
        txtNamaMhs = new javax.swing.JTextField();
        cbNim = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKrs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input KRS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setText("Nama Mahasiswa :");

        jLabel4.setText("Kode MK :");

        jLabel1.setText("ID KRS :");

        jLabel2.setText("NIM :");

        jLabel5.setText("Nama Mata Kuliah :");

        jLabel6.setText("SKS :");

        jLabel7.setText("SemesterAktif :");

        txtIdKrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdKrsActionPerformed(evt);
            }
        });

        cbKodeMk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbKodeMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKodeMkActionPerformed(evt);
            }
        });

        cbNim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNimActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(40, 160, 70));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(200, 50, 50));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTutup.setBackground(new java.awt.Color(100, 100, 100));
        btnTutup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTutup.setForeground(new java.awt.Color(255, 255, 255));
        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnTutup))
                    .addComponent(txtSks)
                    .addComponent(txtSemesterAktif)
                    .addComponent(txtNamaMk)
                    .addComponent(cbKodeMk, 0, 366, Short.MAX_VALUE)
                    .addComponent(txtNamaMhs)
                    .addComponent(cbNim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdKrs))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdKrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbKodeMk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamaMk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSemesterAktif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnTutup)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblKrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID KRS", "NIM", "Nama Mahasiswa", "Kode MK", "Nama Mata Kuliah", "SKS", "Semester Aktif"
            }
        ));
        tblKrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKrsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKrs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdKrsActionPerformed
        try {
            if (cbNim.getSelectedItem() == null || cbNim.getSelectedItem().equals("--Pilih NIM--")) {
                txtNamaMhs.setText("");
                return;
            }
            String nim = cbNim.getSelectedItem().toString();
            Connection conn = Koneksi.configDB();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery("SELECT nama FROM mahasiswa WHERE nim='" + nim + "'");
            if (res.next()) {
                txtNamaMhs.setText(res.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtIdKrsActionPerformed

    private void cbKodeMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKodeMkActionPerformed
        try {
            if (cbKodeMk.getSelectedItem() == null || cbKodeMk.getSelectedItem().equals("--Pilih Kode MK--")) {
                txtNamaMk.setText("");
                txtSks.setText("");
                return;
            }
            String kode = cbKodeMk.getSelectedItem().toString();
            Connection conn = Koneksi.configDB();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery("SELECT nama_mk, sks FROM matakuliah WHERE kode_mk='" + kode + "'");
            if (res.next()) {
                txtNamaMk.setText(res.getString("nama_mk"));
                txtSks.setText(res.getString("sks"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbKodeMkActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String id = txtIdKrs.getText();
            String nim = cbNim.getSelectedItem().toString();
            String kode = cbKodeMk.getSelectedItem().toString();
            String smt = txtSemesterAktif.getText();

            if (id.isEmpty() || nim.equals("--Pilih NIM--") || kode.equals("--Pilih Kode MK--") || smt.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Data belum lengkap!");
                return;
            }

            String sql = "INSERT INTO krs (id_krs, nim, kode_mk, semester_aktif) VALUES ('"
                    + id + "','" + nim + "','" + kode + "','" + smt + "')";
            Connection conn = Koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "KRS Berhasil Disimpan!");
            tampil_data(); kosongkan_form();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Simpan Gagal: " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (txtIdKrs.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Pilih data KRS yang mau dihapus!");
                return;
            }
            int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin hapus KRS ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM krs WHERE id_krs='" + txtIdKrs.getText() + "'";
                Connection conn = Koneksi.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                tampil_data(); kosongkan_form();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hapus Gagal: " + e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblKrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKrsMouseClicked
        int baris = tblKrs.rowAtPoint(evt.getPoint());
        txtIdKrs.setText(tblKrs.getValueAt(baris, 0).toString());
        cbNim.setSelectedItem(tblKrs.getValueAt(baris, 1).toString());
        cbKodeMk.setSelectedItem(tblKrs.getValueAt(baris, 2).toString());
        txtSemesterAktif.setText(tblKrs.getValueAt(baris, 3).toString());
    }//GEN-LAST:event_tblKrsMouseClicked

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void cbNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNimActionPerformed
        try {
            if (cbNim.getSelectedItem() == null || cbNim.getSelectedItem().equals("--Pilih NIM--")) {
                txtNamaMhs.setText("");
                return;
            }
            
            String nim = cbNim.getSelectedItem().toString();
            Connection conn = Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();

            java.sql.ResultSet res = stm.executeQuery("SELECT nama FROM mahasiswa WHERE nim='" + nim + "'");
            
            if (res.next()) {
                txtNamaMhs.setText(res.getString("nama"));
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error narik data Mahasiswa: " + e.getMessage());
        }
    }//GEN-LAST:event_cbNimActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtIdKrs.setText("");
    txtNamaMhs.setText("");
    txtNamaMk.setText("");
    txtSks.setText("");
    txtSemesterAktif.setText("");
    cbNim.setSelectedIndex(0);
    cbKodeMk.setSelectedIndex(0);
    txtIdKrs.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKrs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTutup;
    private javax.swing.JComboBox<String> cbKodeMk;
    private javax.swing.JComboBox<String> cbNim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKrs;
    private javax.swing.JTextField txtIdKrs;
    private javax.swing.JTextField txtNamaMhs;
    private javax.swing.JTextField txtNamaMk;
    private javax.swing.JTextField txtSemesterAktif;
    private javax.swing.JTextField txtSks;
    // End of variables declaration//GEN-END:variables
}
