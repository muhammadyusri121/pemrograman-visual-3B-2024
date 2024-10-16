
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DIKNAS
 */
public class PendaftaranUKM extends javax.swing.JFrame {

    /**
     * Creates new form PendaftaranUKM
     */
    public PendaftaranUKM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JenisKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlNama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jlTanggalLahir = new javax.swing.JLabel();
        tfTanggalLahir = new javax.swing.JTextField();
        jlAlamat = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jlNoHandphone = new javax.swing.JLabel();
        tfNoHandphone = new javax.swing.JTextField();
        jlJenisKelamin = new javax.swing.JLabel();
        rbJenisKelaminLaki = new javax.swing.JRadioButton();
        rbJenisKelaminPerempuan = new javax.swing.JRadioButton();
        jlFakultas = new javax.swing.JLabel();
        ComboBoxFakultas = new javax.swing.JComboBox<>();
        pemastian = new javax.swing.JCheckBox();
        batal = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jlProdi = new javax.swing.JLabel();
        tfProdi = new javax.swing.JTextField();
        jlCabor = new javax.swing.JLabel();
        ComboBoxCabor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORMULIR PENDAFTARAN UKM TARUNA JAYA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("UNIVERSITAS TRUNOJOYO MADURA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("JL. Raya Telang, PO. Box. 2 Kamal, Bangkalan - Madura");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText("Telp : (031) 3011146, Fax. (031) 3011506");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTM.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));

        jlNama.setText("Nama :");

        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        jlTanggalLahir.setText("Tanggal Lahir :");

        tfTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTanggalLahirActionPerformed(evt);
            }
        });

        jlAlamat.setText("Alamat :");

        jlEmail.setText("Email :");

        jlNoHandphone.setText("No Handphone :");

        jlJenisKelamin.setText("Jenis Kelamin :");

        JenisKelamin.add(rbJenisKelaminLaki);
        rbJenisKelaminLaki.setText("laki-laki");
        rbJenisKelaminLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJenisKelaminLakiActionPerformed(evt);
            }
        });

        JenisKelamin.add(rbJenisKelaminPerempuan);
        rbJenisKelaminPerempuan.setText("Perempuan");

        jlFakultas.setText("Fakultas :");

        ComboBoxFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fakultas Teknik", "Fakultas Hukum", "Fakultas Pendidikan", "Fakultas Pertanian", "Fakultas Keislaman" }));
        ComboBoxFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFakultasActionPerformed(evt);
            }
        });

        pemastian.setText("data yang anda masukkan sudah benar");
        pemastian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemastianActionPerformed(evt);
            }
        });

        batal.setText("batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        simpan.setText("simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        jlProdi.setText("Prodi :");

        tfProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProdiActionPerformed(evt);
            }
        });

        jlCabor.setText("Cabor :");

        ComboBoxCabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basket", "Futsal", "Badminton", "Bela Diri", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pemastian)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(batal)
                            .addGap(18, 18, 18)
                            .addComponent(reset)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simpan))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jlFakultas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlAlamat)
                                .addComponent(jlTanggalLahir)
                                .addComponent(jlEmail)
                                .addComponent(jlNoHandphone)
                                .addComponent(jlJenisKelamin)
                                .addComponent(jlNama)
                                .addComponent(jlCabor)
                                .addComponent(jlProdi))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNama)
                                .addComponent(tfTanggalLahir)
                                .addComponent(tfAlamat)
                                .addComponent(tfEmail)
                                .addComponent(tfNoHandphone)
                                .addComponent(tfProdi)
                                .addComponent(ComboBoxCabor, 0, 274, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(rbJenisKelaminLaki)
                                    .addGap(63, 63, 63)
                                    .addComponent(rbJenisKelaminPerempuan))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTanggalLahir)
                    .addComponent(tfTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlAlamat)
                    .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNoHandphone)
                    .addComponent(tfNoHandphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJenisKelamin)
                    .addComponent(rbJenisKelaminLaki)
                    .addComponent(rbJenisKelaminPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCabor)
                    .addComponent(ComboBoxCabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlProdi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlFakultas)
                    .addComponent(ComboBoxFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pemastian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batal)
                    .addComponent(reset)
                    .addComponent(simpan))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel2)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(31, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pemastianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemastianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemastianActionPerformed

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTanggalLahirActionPerformed

    private void tfProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProdiActionPerformed

    private void ComboBoxFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxFakultasActionPerformed

    private void rbJenisKelaminLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJenisKelaminLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbJenisKelaminLakiActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah anda mau keluar program?", "Keluar", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_batalActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        tfNama.setText("");
        tfTanggalLahir.setText("");
        tfAlamat.setText("");
        tfEmail.setText("");
        tfNoHandphone.setText("");
        rbJenisKelaminLaki.setSelected(false);
        rbJenisKelaminPerempuan.setSelected(false);
        ComboBoxCabor.setSelectedIndex(0);
        tfProdi.setText("");
        ComboBoxFakultas.setSelectedIndex(0);
        pemastian.setSelected(false);
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String nama = tfNama.getText();
        String tgllahir = tfTanggalLahir.getText();
        String alamat = tfAlamat.getText();
        String email = tfEmail.getText();
        String noHp = tfNoHandphone.getText();
        String jenisKelamin;
        if (rbJenisKelaminLaki.isSelected()){
            jenisKelamin = "Laki-Laki";
        }else{
            jenisKelamin = "Perempuan";
        }
        String cabor = (String)ComboBoxCabor.getSelectedItem();
        String prodi =tfProdi.getText();
        String Fakultas = (String)ComboBoxFakultas.getSelectedItem();
        
        if(nama.isEmpty() || tgllahir.isEmpty() || alamat.isEmpty() || email.isEmpty() || noHp.isEmpty() || jenisKelamin.isEmpty() || cabor.isEmpty() || prodi.isEmpty() || Fakultas.isEmpty()){
            JOptionPane.showMessageDialog(null, "ANDA BELUM MENGISI SEMUA FORM INI", "PERINGATAN", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!pemastian.isSelected()){
            JOptionPane.showMessageDialog(null, "ANDA BELUM MENCENTANG TANDA DI BAWAH", "PERINGATAN", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dua hasil = new dua();
        hasil.tampilkanData(nama, tgllahir, alamat, email, noHp, jenisKelamin, cabor, prodi, Fakultas);
        hasil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(PendaftaranUKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendaftaranUKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendaftaranUKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendaftaranUKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranUKM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCabor;
    private javax.swing.JComboBox<String> ComboBoxFakultas;
    private javax.swing.ButtonGroup JenisKelamin;
    private javax.swing.JButton batal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlAlamat;
    private javax.swing.JLabel jlCabor;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFakultas;
    private javax.swing.JLabel jlJenisKelamin;
    private javax.swing.JLabel jlNama;
    private javax.swing.JLabel jlNoHandphone;
    private javax.swing.JLabel jlProdi;
    private javax.swing.JLabel jlTanggalLahir;
    private javax.swing.JCheckBox pemastian;
    private javax.swing.JRadioButton rbJenisKelaminLaki;
    private javax.swing.JRadioButton rbJenisKelaminPerempuan;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNoHandphone;
    private javax.swing.JTextField tfProdi;
    private javax.swing.JTextField tfTanggalLahir;
    // End of variables declaration//GEN-END:variables
}