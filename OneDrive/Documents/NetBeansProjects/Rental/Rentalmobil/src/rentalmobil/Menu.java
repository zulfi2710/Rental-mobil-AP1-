/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import java.awt.Color;

/**
 *
 * @author zulfi
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        jPanel2.setBackground(new Color(0,0,0,200));
        setExtendedState(MAXIMIZED_BOTH);
        btn_keluar.setVisible(false);
        btn_tambahMobil.setVisible(false);
        btn_sewaMobil.setVisible(false);
        btn_tambahUser.setVisible(false);
        btn_tambahSupir.setVisible(false);
        btn_pengembalianMobil.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_sewaMobil = new javax.swing.JButton();
        btn_pengembalianMobil = new javax.swing.JButton();
        btn_tambahMobil = new javax.swing.JButton();
        btn_tambahSupir = new javax.swing.JButton();
        btn_tambahUser = new javax.swing.JButton();
        btn_Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selamat Datang Di");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 50, 480, 60);

        jLabel3.setFont(new java.awt.Font("Quicksand Medium", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Sewa Mobil Hiace");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 110, 470, 60);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btn_sewaMobil.setBackground(new java.awt.Color(255, 255, 255));
        btn_sewaMobil.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_sewaMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/sewa.png"))); // NOI18N
        btn_sewaMobil.setText(" Sewa Mobil              ");
        btn_sewaMobil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_sewaMobil.setPreferredSize(new java.awt.Dimension(389, 111));
        btn_sewaMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sewaMobilActionPerformed(evt);
            }
        });

        btn_pengembalianMobil.setBackground(new java.awt.Color(255, 255, 255));
        btn_pengembalianMobil.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_pengembalianMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kembali.png"))); // NOI18N
        btn_pengembalianMobil.setText("Pengembalian Mobil");
        btn_pengembalianMobil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_pengembalianMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pengembalianMobilActionPerformed(evt);
            }
        });

        btn_tambahMobil.setBackground(new java.awt.Color(255, 255, 255));
        btn_tambahMobil.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_tambahMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah.png"))); // NOI18N
        btn_tambahMobil.setText("Tambah Mobil         ");
        btn_tambahMobil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_tambahMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahMobilActionPerformed(evt);
            }
        });

        btn_tambahSupir.setBackground(new java.awt.Color(255, 255, 255));
        btn_tambahSupir.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_tambahSupir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/seatbelt.png"))); // NOI18N
        btn_tambahSupir.setText("Tambah Supir           ");
        btn_tambahSupir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_tambahSupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahSupirActionPerformed(evt);
            }
        });

        btn_tambahUser.setBackground(new java.awt.Color(255, 255, 255));
        btn_tambahUser.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_tambahUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/add-user.png"))); // NOI18N
        btn_tambahUser.setText("Tambah Karyawan   ");
        btn_tambahUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_tambahUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahUserActionPerformed(evt);
            }
        });

        btn_Login.setBackground(new java.awt.Color(255, 255, 255));
        btn_Login.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/arrow.png"))); // NOI18N
        btn_Login.setText(" Keluar                   ");
        btn_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tambahUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tambahSupir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sewaMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tambahMobil, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(btn_pengembalianMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pengembalianMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sewaMobil, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tambahMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tambahSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btn_tambahUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(260, 180, 840, 400);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jaz.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 730);

        btn_keluar.setBackground(new java.awt.Color(255, 255, 255));
        btn_keluar.setFont(new java.awt.Font("Quicksand Medium", 1, 24)); // NOI18N
        btn_keluar.setIcon(new javax.swing.ImageIcon("F:\\arrow.png")); // NOI18N
        btn_keluar.setText("Keluar                     ");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar);
        btn_keluar.setBounds(0, 0, 389, 111);

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

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        removeAll();
        repaint();
        btn_Login.setVisible(true);
        btn_keluar.setVisible(false);
        btn_keluar.setVisible(false);
        btn_tambahMobil.setVisible(false);
        btn_sewaMobil.setVisible(false);
        btn_tambahUser.setVisible(false);
        btn_tambahSupir.setVisible(false);
        btn_pengembalianMobil.setVisible(false);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_sewaMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sewaMobilActionPerformed
        new SewaMobil().setVisible(true);
    }//GEN-LAST:event_btn_sewaMobilActionPerformed

    private void btn_tambahSupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahSupirActionPerformed
        new TambahSupir().setVisible(true);
    }//GEN-LAST:event_btn_tambahSupirActionPerformed

    private void btn_pengembalianMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pengembalianMobilActionPerformed
       new Pengembalian().setVisible(true);
    }//GEN-LAST:event_btn_pengembalianMobilActionPerformed

    private void btn_tambahMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahMobilActionPerformed
        TambahMobil fm = new TambahMobil();
        fm.setVisible(true);
    }//GEN-LAST:event_btn_tambahMobilActionPerformed

    private void btn_tambahUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahUserActionPerformed
         new TambahUser().setVisible(true);
    }//GEN-LAST:event_btn_tambahUserActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        dispose();
        login fm = new login();
        fm.setVisible(true);
    }//GEN-LAST:event_btn_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_pengembalianMobil;
    private javax.swing.JButton btn_sewaMobil;
    private javax.swing.JButton btn_tambahMobil;
    private javax.swing.JButton btn_tambahSupir;
    private javax.swing.JButton btn_tambahUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public void admin() {
        btn_keluar.setVisible(true);
        btn_tambahMobil.setVisible(true);
        btn_sewaMobil.setVisible(true);
        btn_tambahUser.setVisible(true);
        btn_tambahSupir.setVisible(true);
        btn_pengembalianMobil.setVisible(true);
    }

    public void user() {
       btn_keluar.setVisible(true);
        btn_tambahMobil.setVisible(true);
        btn_sewaMobil.setVisible(true);
        btn_tambahUser.setVisible(false);
        btn_tambahSupir.setVisible(true);
        btn_pengembalianMobil.setVisible(true);
    }
}
