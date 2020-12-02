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
public class TambahUser extends javax.swing.JFrame {

    /**
     * Creates new form TambahUser
     */
    ResultSet rs;
    KoneksiDatabase con;
    
    public TambahUser() {
        con =new KoneksiDatabase(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadTabel(); 
        jPanel2.setBackground(new Color(0,0,0,200));
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
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combo_level = new javax.swing.JComboBox<>();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_user = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_hapus.setBackground(new java.awt.Color(204, 0, 0));
        btn_hapus.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("Hapus");
        btn_hapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus);
        btn_hapus.setBounds(370, 480, 140, 40);

        btn_edit.setBackground(new java.awt.Color(0, 204, 0));
        btn_edit.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit);
        btn_edit.setBounds(210, 480, 140, 40);

        btn_tambah.setBackground(new java.awt.Color(0, 0, 204));
        btn_tambah.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("Tambah");
        btn_tambah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah);
        btn_tambah.setBounds(40, 480, 140, 40);

        btn_refresh.setBackground(new java.awt.Color(255, 255, 255));
        btn_refresh.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refresh);
        btn_refresh.setBounds(210, 540, 140, 40);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txt_nama.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 35, 250, 35));

        txt_username.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 250, 35));

        txt_password.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 250, 35));

        jLabel7.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Level User");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        combo_level.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        combo_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        jPanel2.add(combo_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 250, 35));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 110, 490, 280);

        txt_search.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jPanel1.add(txt_search);
        txt_search.setBounds(600, 110, 660, 35);

        btn_search.setBackground(new java.awt.Color(255, 255, 255));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/search.png"))); // NOI18N
        btn_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search);
        btn_search.setBounds(1260, 110, 35, 35);

        tabel_user.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        tabel_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_user", "Nama", "Username", "Password", "Level"
            }
        ));
        tabel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_user);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(570, 150, 750, 402);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tambah Karyawan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 10, 520, 60);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 10, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jaz.jpg"))); // NOI18N
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

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        create();
    }//GEN-LAST:event_btn_tambahActionPerformed
 
    
    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
        
    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        edit();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
       hapus();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
         loadTabel();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
         if(txt_search.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                 String kolom[] = {"nama","username","password","level"};
                rs=con.querySelect(kolom ,"user", "nama LIKE '%"+txt_search.getText()+"%' OR level LIKE '%"+txt_search.getText()+"%'");
                tabel_user.setModel(new Database.ResultSetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void tabel_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_userMouseClicked
       txt_nama.setText(String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),1)));
        txt_username.setText(String.valueOf( tabel_user.getValueAt(tabel_user.getSelectedRow(),2)));
        txt_password.setText(String.valueOf( tabel_user.getValueAt(tabel_user.getSelectedRow(),3)));
        combo_level.setSelectedItem(String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),4)));
        String jr = tabel_user.getValueAt(tabel_user.getSelectedRow(), 5).toString();
        combo_level.setSelectedItem(jr);
    }//GEN-LAST:event_tabel_userMouseClicked

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
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> combo_level;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_user;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

private void loadTabel() {
       String namaKolom[] = {"id_user","nama","username","password","level"};
        rs=con.querySelect(namaKolom,"user");
        tabel_user.setModel(new ResultSetTable(rs));
       clear();
    }

    private void create() {
        try {
 
            if( !txt_nama.getText().isEmpty() && !txt_username.getText().isEmpty() && !txt_password.getText().isEmpty()){
                String kolom[] = {"nama","username","password","level"};
                String isi[] = { txt_nama.getText(),txt_username.getText(),txt_password.getText(),combo_level.getSelectedItem().toString()};
                
                System.out.println( con.queryInsert("user",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "User Berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Data User Masih ada yang Kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
             System.out.println("salah");
        }
        loadTabel();
        clear();
    }

    private void edit(){
        try {
           if( !txt_nama.getText().isEmpty() && !txt_username.getText().isEmpty() && !txt_password.getText().isEmpty()){
                String kolom[] = {"nama","username","password","level"};
                String isi[] = { txt_nama.getText(),txt_username.getText(),txt_password.getText(),combo_level.getSelectedItem().toString()};
                
                con.queryUpdate("user", kolom, isi,"id_user='"+String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
        loadTabel();
        clear();
    }
    
    private void hapus(){
         try {
            String id=String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),0));
                if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("user","id_user="+id);

            }else{
                return;
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pilih id terlebih dahulu");
        }
        loadTabel();
        clear();
    }
    private void clear() {
        txt_nama.setText("");
        txt_username.setText("");
        combo_level.setSelectedItem("Admin");
        txt_password.setText("");
       
    }
}
