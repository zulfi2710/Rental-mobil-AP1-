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
public class Pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form Pengembalian
     */
    public Pengembalian() {
        initComponents();
         jPanel2.setBackground(new Color(0,0,0,120));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxSupir = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxTipeMobil = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabelNik = new javax.swing.JLabel();
        jLabelTglpeminjman = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jLabelTglpengembalian = new javax.swing.JLabel();
        jLabelAlamat = new javax.swing.JLabel();
        jLabelLamaPeminjamanMobil = new javax.swing.JLabel();
        jLabelNotelp = new javax.swing.JLabel();
        jLabelLamaSupir = new javax.swing.JLabel();
        jLabelThMobil = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelhargaperhari = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIk");

        jLabel6.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat");

        jLabel7.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. Telp");

        jLabel8.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipe Mobil");

        jLabel9.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Th Mobil");

        jLabel10.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Harga(perhari)");

        jLabel11.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tanggal Peminjaman");

        jLabel12.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tanggal Pengembalian");

        jLabel13.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Lama Peminjaman");

        jLabel14.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Supir");

        jLabel15.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Lama Supir");

        jComboBoxSupir.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jComboBoxSupir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Hari");

        jLabel18.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total");

        jLabel19.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Rp.");

        jComboBoxTipeMobil.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jComboBoxTipeMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTipeMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipeMobilActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Hari");

        jLabelNik.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelNik.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNik.setText("NIk");

        jLabelTglpeminjman.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelTglpeminjman.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTglpeminjman.setText("Tanggal Peminjaman");

        jLabelNama.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelNama.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNama.setText("Nama");

        jLabelTglpengembalian.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelTglpengembalian.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTglpengembalian.setText("Tanggal Pengembalian");

        jLabelAlamat.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelAlamat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlamat.setText("Alamat");

        jLabelLamaPeminjamanMobil.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelLamaPeminjamanMobil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLamaPeminjamanMobil.setText("Lama Peminjaman");

        jLabelNotelp.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelNotelp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotelp.setText("No. Telp");

        jLabelLamaSupir.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelLamaSupir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLamaSupir.setText("Lama Supir");

        jLabelThMobil.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelThMobil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelThMobil.setText("Th Mobil");

        jLabelTotal.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setText("00000");

        jLabelhargaperhari.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabelhargaperhari.setForeground(new java.awt.Color(255, 255, 255));
        jLabelhargaperhari.setText("Harga(perhari)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxTipeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelNik)
                            .addComponent(jLabel6)
                            .addComponent(jLabelNama)
                            .addComponent(jLabel5)
                            .addComponent(jLabelAlamat)
                            .addComponent(jLabelNotelp)
                            .addComponent(jLabel9)
                            .addComponent(jLabelThMobil))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTotal))
                            .addComponent(jLabel18)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabelTglpengembalian)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jComboBoxSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTglpeminjman)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelLamaSupir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelLamaPeminjamanMobil)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel20)))))
                    .addComponent(jLabelhargaperhari))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNik)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNama))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTglpeminjman)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTglpengembalian)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlamat)
                    .addComponent(jLabel20)
                    .addComponent(jLabelLamaPeminjamanMobil))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNotelp)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelThMobil)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLamaSupir)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabelTotal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelhargaperhari)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 430, 610);

        jTable1.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 80, 890, 460);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\zulfi\\OneDrive\\Documents\\NetBeansProjects\\Rental\\Rentalmobil\\src\\gambar\\left-arrow-square-outlined-button.png")); // NOI18N
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
        jPanel1.add(jButtonKembalikan);
        jButtonKembalikan.setBounds(770, 590, 250, 39);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\zulfi\\OneDrive\\Documents\\NetBeansProjects\\Rental\\Rentalmobil\\src\\gambar\\jaz.jpg")); // NOI18N
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

    private void jComboBoxTipeMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipeMobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipeMobilActionPerformed

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonKembalikan;
    private javax.swing.JComboBox<String> jComboBoxSupir;
    private javax.swing.JComboBox<String> jComboBoxTipeMobil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelLamaPeminjamanMobil;
    private javax.swing.JLabel jLabelLamaSupir;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNik;
    private javax.swing.JLabel jLabelNotelp;
    private javax.swing.JLabel jLabelTglpeminjman;
    private javax.swing.JLabel jLabelTglpengembalian;
    private javax.swing.JLabel jLabelThMobil;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelhargaperhari;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
