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
import javax.swing.JOptionPane;

/**
 *
 * @author zulfi
 */
public class TambahMobil extends javax.swing.JFrame {
    ResultSet rs;
    KoneksiDatabase con;
    /**
     * Creates new form TambahMobil
     */
    public TambahMobil() {
        initComponents();
         jPanel2.setBackground(new Color(0,0,0,200));
         con =new KoneksiDatabase(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
         loadTabel(); 
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_status = new javax.swing.JComboBox<>();
        txt_merk = new javax.swing.JTextField();
        txt_tipe = new javax.swing.JTextField();
        txt_nopolisi = new javax.swing.JTextField();
        txt_tahun = new javax.swing.JTextField();
        txt_hargaSewa = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_Hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemobil = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Mobil");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(550, 10, 390, 60);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Merk Mobil");

        jLabel4.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipe Mobil");

        jLabel5.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. Polisi");

        jLabel6.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tahun");

        jLabel7.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga Sewa");

        jLabel8.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status");

        combo_status.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Keluar" }));
        combo_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_statusActionPerformed(evt);
            }
        });

        txt_merk.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txt_merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_merkActionPerformed(evt);
            }
        });

        txt_tipe.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txt_tipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipeActionPerformed(evt);
            }
        });

        txt_nopolisi.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N

        txt_tahun.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N

        txt_hargaSewa.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(txt_merk, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_status, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(51, 51, 51)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nopolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_hargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_merk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nopolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_hargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_status, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(112, 112, 112))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 110, 490, 360);

        btn_tambah.setBackground(new java.awt.Color(255, 255, 255));
        btn_tambah.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah);
        btn_tambah.setBounds(60, 520, 140, 40);

        btn_search.setBackground(new java.awt.Color(255, 255, 255));
        btn_search.setIcon(new javax.swing.ImageIcon("F:\\search(1).png")); // NOI18N
        btn_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search);
        btn_search.setBounds(1260, 110, 35, 35);

        btn_Hapus.setBackground(new java.awt.Color(255, 255, 255));
        btn_Hapus.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        btn_Hapus.setText("Hapus");
        btn_Hapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Hapus);
        btn_Hapus.setBounds(380, 520, 140, 40);

        btn_edit.setBackground(new java.awt.Color(255, 255, 255));
        btn_edit.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit);
        btn_edit.setBounds(220, 520, 140, 40);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("F:\\left-arrow-square-outlined-button.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 10, 30, 30);

        btn_refresh.setBackground(new java.awt.Color(255, 255, 255));
        btn_refresh.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refresh);
        btn_refresh.setBounds(220, 580, 140, 40);

        txt_search.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jPanel1.add(txt_search);
        txt_search.setBounds(600, 110, 660, 35);

        tablemobil.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        tablemobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id Mobil", "Merk Mobil", "Tipe Mobil", "No. Polisi", "Tahun", "Harga Sewa", "Status"
            }
        ));
        tablemobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablemobil);
        if (tablemobil.getColumnModel().getColumnCount() > 0) {
            tablemobil.getColumnModel().getColumn(0).setHeaderValue("id Mobil");
            tablemobil.getColumnModel().getColumn(1).setHeaderValue("Merk Mobil");
            tablemobil.getColumnModel().getColumn(2).setHeaderValue("Tipe Mobil");
            tablemobil.getColumnModel().getColumn(3).setHeaderValue("No. Polisi");
            tablemobil.getColumnModel().getColumn(4).setHeaderValue("Tahun");
            tablemobil.getColumnModel().getColumn(5).setHeaderValue("Harga Sewa");
            tablemobil.getColumnModel().getColumn(6).setHeaderValue("Status");
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(570, 150, 750, 402);

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\jaz.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_merkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_merkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_merkActionPerformed

    private void txt_tipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipeActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        create();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void combo_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_statusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
            if( !txt_merk.getText().isEmpty() && !txt_tipe.getText().isEmpty() && !txt_nopolisi.getText().isEmpty() && !txt_hargaSewa.getText().isEmpty()){
                String kolom[] = {"merek","tipe","tahun","nopol","harga","status"};
                String isi[] = { txt_merk.getText(),txt_tipe.getText(),txt_tahun.getText().toString(),txt_nopolisi.getText(),txt_hargaSewa.getText(),combo_status.getSelectedItem().toString()};
                con.queryUpdate("tb_mobil", kolom, isi,"id_mobil='"+String.valueOf(tablemobil.getValueAt(tablemobil.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusActionPerformed
        try {
            String id=String.valueOf(tablemobil.getValueAt(tablemobil.getSelectedRow(),0));
                if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("tb_mobil","id_mobil="+id);

            }else{
                return;
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pilih id terlebih dahulu");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_HapusActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        if(txt_search.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                rs=con.querySelectAll("tb_mobil", "id_mobil LIKE '%"+txt_search.getText()+"%' OR merek LIKE '%"+txt_search.getText()+"%' OR tipe LIKE '%"+txt_search.getText()+"%' OR nopol LIKE '%"+txt_search.getText()+"%' OR harga LIKE '%"+txt_search.getText()+"%' OR tahun LIKE '%"+txt_search.getText()+"%'" );
                tablemobil.setModel(new Database.ResultSetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        loadTabel();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void tablemobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemobilMouseClicked
        txt_merk.setText(String.valueOf(tablemobil.getValueAt(tablemobil.getSelectedRow(),1)));
        txt_tipe.setText(String.valueOf( tablemobil.getValueAt(tablemobil.getSelectedRow(),2)));
        txt_tahun.setText(String.valueOf(tablemobil.getValueAt(tablemobil.getSelectedRow(),3)));
        txt_nopolisi.setText(String.valueOf( tablemobil.getValueAt(tablemobil.getSelectedRow(),4)));
        txt_hargaSewa.setText(String.valueOf( tablemobil.getValueAt(tablemobil.getSelectedRow(),5)));
    }//GEN-LAST:event_tablemobilMouseClicked

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
            java.util.logging.Logger.getLogger(TambahMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Hapus;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemobil;
    private javax.swing.JTextField txt_hargaSewa;
    private javax.swing.JTextField txt_merk;
    private javax.swing.JTextField txt_nopolisi;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_tahun;
    private javax.swing.JTextField txt_tipe;
    // End of variables declaration//GEN-END:variables
 
    private void loadTabel() {
        String namaKolom[] = {"id_mobil","merek","tipe","tahun","nopol","harga","status"};
        rs=con.querySelect(namaKolom,"tb_mobil");
        tablemobil.setModel(new ResultSetTable(rs));
    }

    private void create() {
      
        try {
 
            if( !txt_merk.getText().isEmpty() && !txt_tipe.getText().isEmpty() && !txt_nopolisi.getText().isEmpty() && !txt_hargaSewa.getText().isEmpty()){
                String kolom[] = {"merek","tipe","tahun","nopol","harga","status"};
                String isi[] = { txt_merk.getText(),txt_tipe.getText(),txt_tahun.getText(),txt_nopolisi.getText(),txt_hargaSewa.getText(),combo_status.getSelectedItem().toString()};
                
                System.out.println( con.queryInsert("tb_mobil",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
             System.out.println("salah");
        }
        loadTabel();
        clear();
    }

    private void clear() {
        
        txt_merk.setText("");
        txt_tipe.setText("");
        txt_tahun.setText("");
        txt_nopolisi.setText("");
        txt_hargaSewa.setText("");
        
       
    }
}