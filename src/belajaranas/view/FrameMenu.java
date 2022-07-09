/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaranas.view;
import javax.swing.JFrame;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.xml.JRXmlDigesterFactory;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
/**
 *
 * @author user
 */
public class FrameMenu extends javax.swing.JFrame {
public static String levelUser;

JasperReport jasrep;
JasperPrint jasprint;
JasperDesign jasdes;
Map param = new HashMap();
    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
        initComponents();
        loginGagal();
    }
    
    public  static void loginGagal () {
        mnNilai.setVisible(false);
        mnJurusan.setVisible(false);
        mnMatkul.setVisible(false);
        mnMahasiswa.setVisible(false);
        mnUser.setVisible(false);
        smLogin.setText("Login");
    }
    
    public  static void loginSukses () {
        mnNilai.setVisible(true);
        mnJurusan.setVisible(true);
        mnMatkul.setVisible(true);
        mnMahasiswa.setVisible(true);
        mnUser.setVisible(true);
        smEntryNilai.setVisible(true);
        smEntryMhs.setVisible(true);

//Pengaturan Menu Bar & Sub Menu Berdasar Level Akses 
//Ke-2 Akses level Petugas 
        if (levelUser.equals("petugas")) {
            mnUser.setVisible(false);
        }

//Ke-3 Akses level Mahasiswa
        if (levelUser.equals("mahasiswa")) {
              mnUser.setVisible(false);
              smEntryNilai.setVisible(false);
              smEntryMhs.setVisible(false);
              mnJurusan.setVisible(false);
              mnMatkul.setVisible(false);
        }             
        smLogin.setText("Logout");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnUtilitas = new javax.swing.JMenu();
        smLogin = new javax.swing.JCheckBoxMenuItem();
        smKeluar = new javax.swing.JCheckBoxMenuItem();
        mnNilai = new javax.swing.JMenu();
        smEntryNilai = new javax.swing.JCheckBoxMenuItem();
        smLapNilai = new javax.swing.JCheckBoxMenuItem();
        mnJurusan = new javax.swing.JMenu();
        smEntryProdi = new javax.swing.JCheckBoxMenuItem();
        smEntryKelas = new javax.swing.JCheckBoxMenuItem();
        smEntryKonsen = new javax.swing.JCheckBoxMenuItem();
        mnMatkul = new javax.swing.JMenu();
        smEntryMatkul = new javax.swing.JCheckBoxMenuItem();
        mnMahasiswa = new javax.swing.JMenu();
        smEntryMhs = new javax.swing.JCheckBoxMenuItem();
        smLapDataMhs = new javax.swing.JCheckBoxMenuItem();
        mnUser = new javax.swing.JMenu();
        smEditUser = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnUtilitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajaranas/image/Userp.jpg"))); // NOI18N
        mnUtilitas.setText("Utitlitas");

        smLogin.setSelected(true);
        smLogin.setText("Login");
        smLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smLoginActionPerformed(evt);
            }
        });
        mnUtilitas.add(smLogin);

        smKeluar.setSelected(true);
        smKeluar.setText("Keluar");
        smKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smKeluarActionPerformed(evt);
            }
        });
        mnUtilitas.add(smKeluar);

        jMenuBar1.add(mnUtilitas);

        mnNilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajaranas/image/nilai1.png"))); // NOI18N
        mnNilai.setText("Nilai");

        smEntryNilai.setSelected(true);
        smEntryNilai.setText("Entri Nilai");
        smEntryNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smEntryNilaiActionPerformed(evt);
            }
        });
        mnNilai.add(smEntryNilai);

        smLapNilai.setSelected(true);
        smLapNilai.setText("Laporan Data Nilai");
        smLapNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smLapNilaiActionPerformed(evt);
            }
        });
        mnNilai.add(smLapNilai);

        jMenuBar1.add(mnNilai);

        mnJurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajaranas/image/kelas.png"))); // NOI18N
        mnJurusan.setText("Jurusan");

        smEntryProdi.setSelected(true);
        smEntryProdi.setText("Entri Prodi");
        smEntryProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smEntryProdiActionPerformed(evt);
            }
        });
        mnJurusan.add(smEntryProdi);

        smEntryKelas.setSelected(true);
        smEntryKelas.setText("Entri Kelas");
        smEntryKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smEntryKelasActionPerformed(evt);
            }
        });
        mnJurusan.add(smEntryKelas);

        smEntryKonsen.setSelected(true);
        smEntryKonsen.setText("Entri Konsentrasi");
        smEntryKonsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smEntryKonsenActionPerformed(evt);
            }
        });
        mnJurusan.add(smEntryKonsen);

        jMenuBar1.add(mnJurusan);

        mnMatkul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajaranas/image/matkul.png"))); // NOI18N
        mnMatkul.setText("Matakuliah");

        smEntryMatkul.setSelected(true);
        smEntryMatkul.setText("Entri Mata Kuliah");
        smEntryMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smEntryMatkulActionPerformed(evt);
            }
        });
        mnMatkul.add(smEntryMatkul);

        jMenuBar1.add(mnMatkul);

        mnMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajaranas/image/mhs.png"))); // NOI18N
        mnMahasiswa.setText("Mahasiswa");

        smEntryMhs.setSelected(true);
        smEntryMhs.setText(" Entri Data Mahasiswa");
        smEntryMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smEntryMhsActionPerformed(evt);
            }
        });
        mnMahasiswa.add(smEntryMhs);

        smLapDataMhs.setSelected(true);
        smLapDataMhs.setText("Laporan Data Mahasiswa");
        smLapDataMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smLapDataMhsActionPerformed(evt);
            }
        });
        mnMahasiswa.add(smLapDataMhs);

        jMenuBar1.add(mnMahasiswa);

        mnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajaranas/image/Profile.png"))); // NOI18N
        mnUser.setText("User");
        mnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUserActionPerformed(evt);
            }
        });

        smEditUser.setSelected(true);
        smEditUser.setText("Edit user");
        mnUser.add(smEditUser);

        jMenuBar1.add(mnUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smLoginActionPerformed
       // TODO add your handling code here:
          if ("Login".equals(FrameMenu.smLogin.getText())) {
            FrameLOGIN login = new FrameLOGIN();
            login.setVisible(true);
        }
        else {
            FrameMenu.loginGagal();
        }
    
    }//GEN-LAST:event_smLoginActionPerformed

    private void smLapNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smLapNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smLapNilaiActionPerformed

    private void smEntryKonsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smEntryKonsenActionPerformed
        // TODO add your handling code here:
         FKonsentrasi a = new FKonsentrasi();
        a.setVisible(true);
    }//GEN-LAST:event_smEntryKonsenActionPerformed

    private void smLapDataMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smLapDataMhsActionPerformed
        // TODO add your handling code here:
        try{
            File report = new File("src/belajaranas/report/RepMHS.jrxml");
            jasdes = JRXmlLoader.load(report);
            jasrep = JasperCompileManager.compileReport(jasdes);
            jasprint = JasperFillManager.fillReport(jasrep,null,belajaranas.koneksi.konkesi.getConnection());
            JasperViewer.viewReport(jasprint,false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch (JRException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal membuka laporan",
                    "Cetak laporan", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_smLapDataMhsActionPerformed

    private void smKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_smKeluarActionPerformed

    private void smEntryProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smEntryProdiActionPerformed
        // TODO add your handling code here:
        FProgramStudi a = new FProgramStudi();
        a.setVisible(true);
    }//GEN-LAST:event_smEntryProdiActionPerformed

    private void smEntryMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smEntryMhsActionPerformed
        // TODO add your handling code here:
        FMahasiswa a = new FMahasiswa();
        a.setVisible(true);
    }//GEN-LAST:event_smEntryMhsActionPerformed

    private void smEntryMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smEntryMatkulActionPerformed
        // TODO add your handling code here:
        FMataKuliah a = new FMataKuliah();
        a.setVisible(true);
    }//GEN-LAST:event_smEntryMatkulActionPerformed

    private void smEntryNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smEntryNilaiActionPerformed
        // TODO add your handling code here:
        FrameNILAI a = new FrameNILAI();
        a.setVisible(true);
    }//GEN-LAST:event_smEntryNilaiActionPerformed

    private void smEntryKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smEntryKelasActionPerformed
        // TODO add your handling code here:
        FKelas a = new FKelas();
        a.setVisible(true);
    }//GEN-LAST:event_smEntryKelasActionPerformed

    private void mnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUserActionPerformed
        // TODO add your handling code here:
        FUser a = new FUser();
        a.setVisible(true);
    }//GEN-LAST:event_mnUserActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private static javax.swing.JMenu mnJurusan;
    private static javax.swing.JMenu mnMahasiswa;
    private static javax.swing.JMenu mnMatkul;
    private static javax.swing.JMenu mnNilai;
    private static javax.swing.JMenu mnUser;
    private javax.swing.JMenu mnUtilitas;
    private javax.swing.JCheckBoxMenuItem smEditUser;
    private javax.swing.JCheckBoxMenuItem smEntryKelas;
    private javax.swing.JCheckBoxMenuItem smEntryKonsen;
    private javax.swing.JCheckBoxMenuItem smEntryMatkul;
    private static javax.swing.JCheckBoxMenuItem smEntryMhs;
    private static javax.swing.JCheckBoxMenuItem smEntryNilai;
    private javax.swing.JCheckBoxMenuItem smEntryProdi;
    private javax.swing.JCheckBoxMenuItem smKeluar;
    private javax.swing.JCheckBoxMenuItem smLapDataMhs;
    private javax.swing.JCheckBoxMenuItem smLapNilai;
    private static javax.swing.JCheckBoxMenuItem smLogin;
    // End of variables declaration//GEN-END:variables
}
