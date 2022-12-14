/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sisteminformasiperpus;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Fadil
 */
public class peminjaman extends javax.swing.JFrame {

    /**
     * Creates new form peminjaman
     */
    Connection con;
    Statement stat;
    PreparedStatement state;
    ResultSet rs;
    String sql;
    
    private void Kosongkan(){
        txtidpinjam.setEditable(true);
        txtiduser.setText(null);
        txtusername.setText(null);
        txtidbuku.setText(null);
        txtjudul.setText(null);
        
        
    }
    private void data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Peminjaman");
        model.addColumn("ID Anggota");
        model.addColumn("Username");
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Tanggal Peminjaman");
        model.addColumn("Tanggal Pengembalian");
        model.addColumn("Status");
        
         
        //Menampilkan semua tabel
        String cari = caritxt.getText();
        try{
            String sql = "SELECT * FROM peminjaman WHERE "
                    +" username LIKE'%"+cari+"%'"
                    +"OR judul LIKE'%"+cari+"%'"
                    + "ORDER BY id_peminjaman ASC";
            Koneksi DB = new Koneksi();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            con = DB.con;
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
            }
            tb_peminjaman.setModel(model);
        }catch(Exception e){
            
        }
        
    }
    public peminjaman() {
        initComponents();
        data();
        Kosongkan();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtidpinjam = new javax.swing.JTextField();
        txtiduser = new javax.swing.JTextField();
        txtidbuku = new javax.swing.JTextField();
        txtjudul = new javax.swing.JTextField();
        pinjambtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kembali_btn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_peminjaman = new javax.swing.JTable();
        caribtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        caritxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtstat = new javax.swing.JCheckBox();
        cetakbtn = new javax.swing.JButton();
        txtwktpeminjaman = new com.toedter.calendar.JDateChooser();
        txtwktpengembalian = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        txtidpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpinjamActionPerformed(evt);
            }
        });

        txtiduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiduserActionPerformed(evt);
            }
        });

        txtidbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbukuActionPerformed(evt);
            }
        });

        txtjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjudulActionPerformed(evt);
            }
        });

        pinjambtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        pinjambtn.setForeground(new java.awt.Color(0, 102, 102));
        pinjambtn.setIcon(new javax.swing.ImageIcon("D:\\Kuliah semester 5\\IPL\\TUBES\\plus-circle-solid.png")); // NOI18N
        pinjambtn.setText("PINJAM");
        pinjambtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjambtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Peminjam");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID User");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Buku");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Judul Buku");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Waktu Peminjaman");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PEMINJAMAN");

        kembali_btn1.setBackground(new java.awt.Color(0, 153, 153));
        kembali_btn1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        kembali_btn1.setForeground(new java.awt.Color(255, 255, 255));
        kembali_btn1.setIcon(new javax.swing.ImageIcon("D:\\Kuliah semester 5\\IPL\\TUBES\\arrow-left-solid2.png")); // NOI18N
        kembali_btn1.setText("Kembali");
        kembali_btn1.setBorder(null);
        kembali_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(kembali_btn1)
                .addGap(327, 327, 327)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembali_btn1)
                    .addComponent(jLabel1)))
        );

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Waktu Pengembalian");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        tb_peminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_peminjaman);

        caribtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        caribtn.setForeground(new java.awt.Color(0, 102, 102));
        caribtn.setText("Cari");
        caribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caribtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cari :");

        caritxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caritxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Status");

        txtstat.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        txtstat.setForeground(new java.awt.Color(255, 255, 255));
        txtstat.setText("Pinjam");

        cetakbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        cetakbtn.setForeground(new java.awt.Color(0, 102, 102));
        cetakbtn.setIcon(new javax.swing.ImageIcon("D:\\Kuliah semester 5\\IPL\\TUBES\\inbox-solid.png")); // NOI18N
        cetakbtn.setText("CETAK");
        cetakbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cetakbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cetakbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtiduser, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtidpinjam)
                            .addComponent(txtidbuku)
                            .addComponent(txtjudul)
                            .addComponent(txtusername)
                            .addComponent(txtstat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtwktpeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtwktpengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(pinjambtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(caritxt, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caribtn)
                                .addGap(95, 95, 95)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cetakbtn)
                        .addGap(229, 229, 229))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtidpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtidbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(txtwktpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtwktpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtstat))
                        .addGap(18, 18, 18)
                        .addComponent(pinjambtn)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(caritxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caribtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cetakbtn)
                        .addGap(88, 88, 88))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpinjamActionPerformed

    private void txtiduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiduserActionPerformed

    private void txtidbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidbukuActionPerformed

    private void txtjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjudulActionPerformed

    private void pinjambtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjambtnActionPerformed
        // TODO add your handling code here:
        
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(txtwktpeminjaman.getDate()));
        
        String tampilan2 = "yyyy-MM-dd";
        SimpleDateFormat fm2 = new SimpleDateFormat(tampilan2);
        String tanggal2 = String.valueOf(fm2.format(txtwktpengembalian.getDate()));
        
        try{
            String sql = "INSERT INTO peminjaman VALUES  ('"+txtidpinjam.getText()+"','"+txtiduser.getText()+"','"+txtusername.getText()+"','"+txtidbuku.getText()+"','"+txtjudul.getText()+"','"+tanggal+"','"+tanggal2+"','"+txtstat.getActionCommand()+"')";
            Koneksi DB = new Koneksi();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            java.sql.PreparedStatement state = con.prepareStatement(sql);
            state.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
            data();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Data Tidak Berhasil Disimpan","Kesalahan", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_pinjambtnActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void caribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caribtnActionPerformed
        // TODO add your handling code here:
        data();
    }//GEN-LAST:event_caribtnActionPerformed

    private void caritxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caritxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caritxtActionPerformed

    private void kembali_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali_btn1ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kembali_btn1ActionPerformed

    private void cetakbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakbtnActionPerformed
        // TODO add your handling code here:
        try{
            File namaFile = new File("src/sisteminformasiperpus/report/laporancetak.jasper");
            JasperPrint js = JasperFillManager.fillReport(namaFile.getPath(),null,con);
            JasperViewer.viewReport(js,false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Data Tidak Berhasil Mencetak","Kesalahan", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_cetakbtnActionPerformed

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
            java.util.logging.Logger.getLogger(peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caribtn;
    private javax.swing.JTextField caritxt;
    private javax.swing.JButton cetakbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali_btn1;
    private javax.swing.JButton pinjambtn;
    private javax.swing.JTable tb_peminjaman;
    private javax.swing.JTextField txtidbuku;
    private javax.swing.JTextField txtidpinjam;
    private javax.swing.JTextField txtiduser;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JCheckBox txtstat;
    private javax.swing.JTextField txtusername;
    private com.toedter.calendar.JDateChooser txtwktpeminjaman;
    private com.toedter.calendar.JDateChooser txtwktpengembalian;
    // End of variables declaration//GEN-END:variables
}
