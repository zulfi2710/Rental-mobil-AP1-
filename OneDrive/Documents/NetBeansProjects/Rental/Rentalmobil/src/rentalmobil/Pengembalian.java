/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author zulfi
 */
public class Pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form Pengembalian
     */
    ResultSet rs;
    KoneksiDatabase con;
    String status1;
    public Pengembalian() {
        initComponents();
         jPanel2.setBackground(new Color(0,0,0,200));
         con = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
         loadTabel();
         loadMobil();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cb_nopol = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        lb_pemnjaman = new javax.swing.JLabel();
        lb_nama = new javax.swing.JLabel();
        lb_pengembalian = new javax.swing.JLabel();
        lb_lama = new javax.swing.JLabel();
        lb_notelp = new javax.swing.JLabel();
        lb_lamasupir = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        lb_harga = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_supir = new javax.swing.JLabel();
        lb_tipe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pengembalian = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButtonKembalikan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pengembalian Mobil");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 10, 390, 50);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");

        jLabel7.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. Telp");

        jLabel8.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No Polisi");

        jLabel10.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Harga(perhari)");

        jLabel11.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tanggal Peminjaman");

        jLabel12.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tanggal Pengembalian");

        jLabel13.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Lama Peminjaman");

        jLabel14.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Supir");

        jLabel15.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Lama Supir");

        jLabel17.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Hari");

        jLabel18.setFont(new java.awt.Font("Quicksand Medium", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total");

        jLabel19.setFont(new java.awt.Font("Quicksand Medium", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Rp.");

        cb_nopol.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        cb_nopol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih" }));
        cb_nopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nopolActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Hari");

        lb_pemnjaman.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_pemnjaman.setForeground(new java.awt.Color(255, 255, 255));
        lb_pemnjaman.setText("Tanggal Peminjaman");

        lb_nama.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_nama.setForeground(new java.awt.Color(255, 255, 255));
        lb_nama.setText("Nama");

        lb_pengembalian.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        lb_pengembalian.setText("Tanggal Pengembalian");

        lb_lama.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_lama.setForeground(new java.awt.Color(255, 255, 255));
        lb_lama.setText("0");

        lb_notelp.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_notelp.setForeground(new java.awt.Color(255, 255, 255));
        lb_notelp.setText("No. Telp");

        lb_lamasupir.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_lamasupir.setForeground(new java.awt.Color(255, 255, 255));
        lb_lamasupir.setText("0");

        lb_total.setFont(new java.awt.Font("Quicksand Medium", 1, 36)); // NOI18N
        lb_total.setForeground(new java.awt.Color(255, 255, 255));
        lb_total.setText("00000");

        lb_harga.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_harga.setForeground(new java.awt.Color(255, 255, 255));
        lb_harga.setText("Harga(perhari)");

        jLabel16.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tipe Mobil");

        lb_supir.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_supir.setForeground(new java.awt.Color(255, 255, 255));
        lb_supir.setText("Supir");

        lb_tipe.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        lb_tipe.setForeground(new java.awt.Color(255, 255, 255));
        lb_tipe.setText("Tipe Mobil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cb_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lb_nama)
                    .addComponent(lb_notelp)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10)
                    .addComponent(lb_harga)
                    .addComponent(lb_tipe))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(lb_pengembalian)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(lb_pemnjaman)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lb_lama)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lb_lamasupir)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel17))))
                    .addComponent(lb_supir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nama)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_notelp)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_lama)
                            .addComponent(jLabel20)
                            .addComponent(lb_tipe))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_pemnjaman)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_pengembalian)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lb_supir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_lamasupir)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_harga)))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lb_total))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 430, 590);

        tb_pengembalian.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        tb_pengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        tb_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_pengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_pengembalian);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 80, 890, 460);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 10, 30, 30);

        jButtonKembalikan.setBackground(new java.awt.Color(255, 255, 255));
        jButtonKembalikan.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        jButtonKembalikan.setText("Kembalikan Mobil");
        jButtonKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKembalikanActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonKembalikan);
        jButtonKembalikan.setBounds(770, 590, 250, 39);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jaz.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb_nopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nopolActionPerformed
       String st = (String) cb_nopol.getSelectedItem();
        ResultSet rst = con.querySelectAll("sewa_mobil", "No_polisi='" + st + "'");
        try {
            while (rst.next()) {
                this.lb_nama.setText(rst.getString("Nama"));
                this.lb_notelp.setText(rst.getString("No_telp"));   
                this.lb_harga.setText(rst.getString("Harga"));
                this.lb_tipe.setText(rst.getString("Tipe_mobil"));
                this.lb_pengembalian.setText(rst.getString("Tgl_pengembalian"));
                this.lb_pemnjaman.setText(rst.getString("Tgl_peminjaman"));
                this.lb_lama.setText(rst.getString("Lama_mobil"));
                this.lb_supir.setText(rst.getString("Supir"));
                this.lb_lamasupir.setText(rst.getString("Lama_supir"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_nopolActionPerformed

    private void jButtonKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKembalikanActionPerformed
        try {
            hapus_transaksi();
            cekstatus();
            loadTabel();

        } catch (SQLException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButtonKembalikanActionPerformed

    private void tb_pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_pengembalianMouseClicked
           
        lb_nama.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),0)));       //2
        lb_notelp.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),1)));
        lb_tipe.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),2)));
        String jr = tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(), 3).toString();
        cb_nopol.setSelectedItem(jr);
        lb_harga.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),4)));
        lb_pemnjaman.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),5)));
        lb_pengembalian.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),6)));
        lb_lama.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),7)));
        lb_supir.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),8)));
        lb_lamasupir.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),9)));
        lb_total.setText(String.valueOf(tb_pengembalian.getValueAt(tb_pengembalian.getSelectedRow(),10)));
    }//GEN-LAST:event_tb_pengembalianMouseClicked

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_nopol;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonKembalikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_harga;
    private javax.swing.JLabel lb_lama;
    private javax.swing.JLabel lb_lamasupir;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_notelp;
    private javax.swing.JLabel lb_pemnjaman;
    private javax.swing.JLabel lb_pengembalian;
    private javax.swing.JLabel lb_supir;
    private javax.swing.JLabel lb_tipe;
    private javax.swing.JLabel lb_total;
    private javax.swing.JTable tb_pengembalian;
    // End of variables declaration//GEN-END:variables

    private void loadMobil() {  // mengambil database

        rs = con.querySelectAll("sewa_mobil");
        try {
            while (rs.next()) {
                cb_nopol.addItem(rs.getString("No_polisi"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cekstatus() throws SQLException {
        rs = con.querySelectAll("tb_mobil", "nopol ='" + cb_nopol.getSelectedItem().toString() + "'");
        while (rs.next()) {
            status1 = rs.getString("status");

        }
        String update_status = "Tersedia";
        String kolom[] = {"status"};
        String isi[] = {update_status};
        con.queryUpdate("tb_mobil", kolom, isi, "nopol='" + cb_nopol.getSelectedItem().toString() + "'");
    }

    public void hapus_transaksi() {
        if (JOptionPane.showConfirmDialog(this, "Yakin Mengembalikan Mobil ?", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("sewa_mobil", "No_polisi='" + cb_nopol.getSelectedItem().toString() + "'");
        }

    }
  
    private void loadTabel() {
        String namaKolom[] = {"Nama", "No_telp", "Tipe_mobil", "No_polisi", "harga","Tgl_peminjaman","Tgl_pengembalian","Lama_mobil", "Supir","Lama_supir","Total"}; //,
        rs = con.querySelect(namaKolom, "sewa_mobil");
        tb_pengembalian.setModel(new ResultSetTable(rs)); //,"tgl_pinjam","tgl_kembali" ,jDateChooser1.getDateFormatString(),jDateChooser2.getDateFormatString()
    }
}
