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
public class buku extends javax.swing.JFrame {

    /**
     * Creates new form buku
     */
    Connection con;
    Statement stat;
    PreparedStatement state;
    ResultSet rs;
    String sql;
    
    
    private void Kosongkan(){
        txtidbuku.setEditable(true);
        txtjudulbuku.setText(null);
        txtjenisbuku.setSelectedItem(null);
        txtpengarang.setText(null);
        
        
        
    }
    private void data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Jenis Buku");
        model.addColumn("Penerbit");
        
        
        
         
        //Menampilkan semua tabel
        String cari = caritxt.getText();
        try{
            String sql = "SELECT * FROM buku WHERE BINARY "+"judul LIKE'%"+cari+"%'"+"OR pengarang LIKE'%"+cari+"%'"+"OR id_buku LIKE'%"+cari+"%'"+"OR jenis_buku LIKE'%"+cari+"%'"+ "ORDER BY id_buku ASC";
            Koneksi DB = new Koneksi();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            con = DB.con;
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                
            }
            tb_buku.setModel(model);
        }catch(Exception e){
            
        }
        
    }
    public buku() {
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
        txtidbuku = new javax.swing.JTextField();
        txtjudulbuku = new javax.swing.JTextField();
        txtpengarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_buku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tambahbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        hapustxt = new javax.swing.JButton();
        caribtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        caritxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kembali_btn = new javax.swing.JButton();
        cetakbtn = new javax.swing.JButton();
        txtjenisbuku = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        txtidbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbukuActionPerformed(evt);
            }
        });

        tb_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul Buku", "Jenis Buku", "Penerbit", "Stok"
            }
        ));
        tb_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_buku);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Buku");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Judul Buku");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Buku");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Penerbit");

        tambahbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        tambahbtn.setForeground(new java.awt.Color(0, 102, 102));
        tambahbtn.setIcon(new javax.swing.ImageIcon("D:\\Kuliah semester 5\\IPL\\TUBES\\plus-circle-solid.png")); // NOI18N
        tambahbtn.setText("Tambah");
        tambahbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahbtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 12)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(0, 102, 102));
        updatebtn.setIcon(new javax.swing.ImageIcon("D:\\Kuliah semester 5\\IPL\\TUBES\\pen-square-solid.png")); // NOI18N
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        hapustxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 12)); // NOI18N
        hapustxt.setForeground(new java.awt.Color(0, 102, 102));
        hapustxt.setIcon(new javax.swing.ImageIcon("D:\\Kuliah semester 5\\IPL\\TUBES\\trash-solid.png")); // NOI18N
        hapustxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapustxtActionPerformed(evt);
            }
        });

        caribtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        caribtn.setForeground(new java.awt.Color(0, 102, 102));
        caribtn.setText("Cari");
        caribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caribtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cari :");

        caritxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caritxtActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUKU");

        kembali_btn.setBackground(new java.awt.Color(0, 153, 153));
        kembali_btn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        kembali_btn.setForeground(new java.awt.Color(255, 255, 255));
        kembali_btn.setIcon(new javax.swing.ImageIcon("D:\\Kuliah semester 5\\IPL\\TUBES\\arrow-left-solid2.png")); // NOI18N
        kembali_btn.setText("Kembali");
        kembali_btn.setBorder(null);
        kembali_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali_btnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembali_btn)
                .addGap(335, 335, 335)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cetakbtn))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cetakbtn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kembali_btn)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        txtjenisbuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novel", "Komik", "Edukasi", "Bisinis", "Student" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(caritxt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caribtn)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(hapustxt)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tambahbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtjudulbuku, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtidbuku)
                            .addComponent(txtpengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtjenisbuku, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(caritxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caribtn))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjudulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtjenisbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(58, 58, 58)
                        .addComponent(tambahbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapustxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "UPDATE buku SET id_buku='"+txtidbuku.getText()+"',judul='"+txtjudulbuku.getText()+"',jenis_buku='"+txtjenisbuku.getSelectedItem()+"',pengarang='"+txtpengarang.getText()+"'WHERE id_buku='"+txtidbuku.getText()+"'";
            Koneksi DB = new Koneksi();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            java.sql.PreparedStatement state = con.prepareStatement(sql);
            state.execute();
            JOptionPane.showMessageDialog(null,"Edit Data Berhasil!");
            data();
            Kosongkan();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Edit Data Tidak Berhasil!");

        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void caribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caribtnActionPerformed
        // TODO add your handling code here:
        data();
    }//GEN-LAST:event_caribtnActionPerformed

    private void caritxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caritxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caritxtActionPerformed

    private void kembali_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali_btnActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kembali_btnActionPerformed

    private void txtidbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidbukuActionPerformed

    private void tambahbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahbtnActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "INSERT INTO buku VALUES  ('"+txtidbuku.getText()+"','"+txtjudulbuku.getText()+"','"+txtjenisbuku.getSelectedItem()+"','"+txtpengarang.getText()+"')";
            Koneksi DB = new Koneksi();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            java.sql.PreparedStatement state = con.prepareStatement(sql);
            state.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            data();
            Kosongkan();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Data Tidak Berhasil Disimpan");

        }
    }//GEN-LAST:event_tambahbtnActionPerformed

    private void tb_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bukuMouseClicked
        // TODO add your handling code here:
        int baris = tb_buku.rowAtPoint(evt.getPoint());
        String idbuku = tb_buku.getValueAt(baris, 0).toString();
        txtidbuku.setText(idbuku);
        
        String judulbuku = tb_buku.getValueAt(baris, 1).toString();
        txtjudulbuku.setText(judulbuku);

        String jenisbuku = tb_buku.getValueAt(baris, 2).toString();
        txtjenisbuku.setSelectedItem(jenisbuku);
        
        String pengarang = tb_buku.getValueAt(baris, 3).toString();
        txtpengarang.setText(pengarang);

        
        
        
    }//GEN-LAST:event_tb_bukuMouseClicked

    private void hapustxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapustxtActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM buku WHERE id_buku='"+txtidbuku.getText()+"'";
            Koneksi DB = new Koneksi();
            DB.config();
            con = DB.con;
            stat = DB.stm;
            java.sql.PreparedStatement state = con.prepareStatement(sql);
            state.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!");
            data();
            Kosongkan();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Data Tidak Berhasil Dihapus!");

        }
    }//GEN-LAST:event_hapustxtActionPerformed

    private void cetakbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakbtnActionPerformed
        // TODO add your handling code here:
        try{
            File namaFile = new File("src/sisteminformasiperpus/report/laporanbuku.jasper");
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
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caribtn;
    private javax.swing.JTextField caritxt;
    private javax.swing.JButton cetakbtn;
    private javax.swing.JButton hapustxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali_btn;
    private javax.swing.JButton tambahbtn;
    private javax.swing.JTable tb_buku;
    private javax.swing.JTextField txtidbuku;
    private javax.swing.JComboBox<String> txtjenisbuku;
    private javax.swing.JTextField txtjudulbuku;
    private javax.swing.JTextField txtpengarang;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
