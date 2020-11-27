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
public class SewaMobil extends javax.swing.JFrame {
 ResultSet rs;
    KoneksiDatabase con;
    static String nama;
    static String nik;
    static String alamat;
    static String tlp;
    static String email;
    String status1;
    
    /**
     * Creates new form SewaMobil
     */
    public SewaMobil() {
        initComponents();
        jPanel2.setBackground(new Color(0,0,0,120));
        jPanel3.setBackground(new Color(0,0,0,120));
        jPanel4.setBackground(new Color(0,0,0,120));
        
        con = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
        
        loadMobil();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_notelp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButtonprint = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonSewa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_lamaPinjam = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_lamaSupir = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cb_Supir = new javax.swing.JComboBox<>();
        btn_hitung = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabeltotal = new javax.swing.JLabel();
        jDatetglpengembalian = new com.toedter.calendar.JDateChooser();
        jDatetglpeminjaman1 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cb_mobil = new javax.swing.JComboBox<>();
        cb_Nopolisi = new javax.swing.JComboBox<>();
        lb_Merek = new javax.swing.JLabel();
        lb_Tahun = new javax.swing.JLabel();
        lb_Harga = new javax.swing.JLabel();
        lb_Status = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_sewa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Peminjam");

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIK");

        jLabel5.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");

        txt_nik.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N

        txt_nama.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        txt_notelp.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. Telp");

        txt_alamat.setColumns(20);
        txt_alamat.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nama)
                                .addComponent(txt_nik, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_nik, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 70, 380, 320);

        jLabel2.setFont(new java.awt.Font("Quicksand Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEWA MOBIL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 10, 240, 47);

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

        jButtonprint.setBackground(new java.awt.Color(255, 255, 255));
        jButtonprint.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        jButtonprint.setText("Print");
        jButtonprint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonprintActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonprint);
        jButtonprint.setBounds(760, 590, 160, 35);

        jButtonEdit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEdit.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEdit);
        jButtonEdit.setBounds(940, 590, 160, 35);

        jButtonSewa.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSewa.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        jButtonSewa.setText("Sewa Mobil");
        jButtonSewa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSewaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSewa);
        jButtonSewa.setBounds(1120, 590, 135, 35);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Peminjaman");

        jLabel9.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tanggal Pengembalian");

        jLabel10.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lama Peminjaman");

        jLabel11.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Supir");

        jLabel12.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total :");

        jLabel13.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rp.");

        txt_lamaPinjam.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txt_lamaPinjam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_lamaPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lamaPinjamActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hari");

        jLabel22.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Lama Supir");

        txt_lamaSupir.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txt_lamaSupir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_lamaSupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lamaSupirActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Hari");

        cb_Supir.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        cb_Supir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_hitung.setBackground(new java.awt.Color(255, 255, 255));
        btn_hitung.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        btn_hitung.setText("Hitung");
        btn_hitung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Transaksi");

        jLabeltotal.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabeltotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltotal.setText("0000");

        jDatetglpengembalian.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N

        jDatetglpeminjaman1.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_hitung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cb_Supir, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDatetglpeminjaman1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(txt_lamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel14))
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDatetglpengembalian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel22)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_lamaSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)))
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDatetglpeminjaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDatetglpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_Supir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lamaSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btn_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 70, 240, 640);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mobil");

        jLabel16.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tipe Mobil          :");

        jLabel17.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Merk Mobil         :");

        jLabel18.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("No. Polisi            :");

        jLabel19.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Th Mobil             :");

        jLabel20.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Harga(perhari) :");

        jLabel21.setFont(new java.awt.Font("Quicksand", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Status                :");

        cb_mobil.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        cb_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mobilActionPerformed(evt);
            }
        });

        lb_Merek.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        lb_Merek.setForeground(new java.awt.Color(255, 255, 255));
        lb_Merek.setText("Merk");

        lb_Tahun.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        lb_Tahun.setForeground(new java.awt.Color(255, 255, 255));
        lb_Tahun.setText("th mobil");

        lb_Harga.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        lb_Harga.setForeground(new java.awt.Color(255, 255, 255));
        lb_Harga.setText("Harga");

        lb_Status.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        lb_Status.setForeground(new java.awt.Color(255, 255, 255));
        lb_Status.setText("Status");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_mobil, 0, 221, Short.MAX_VALUE)
                            .addComponent(lb_Tahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_Merek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_Harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_Status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cb_Nopolisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lb_Merek, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_Nopolisi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lb_Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lb_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 400, 380, 310);

        tbl_sewa.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        tbl_sewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane3.setViewportView(tbl_sewa);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(650, 70, 700, 402);

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

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonprintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonprintActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void txt_lamaSupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lamaSupirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lamaSupirActionPerformed

    private void txt_lamaPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lamaPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lamaPinjamActionPerformed

    private void jButtonSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSewaActionPerformed
        // 
        
         if (txt_nik.getText().isEmpty() || txt_nama.getText().isEmpty() || txt_alamat.getText().isEmpty ()|| txt_notelp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
        } else {
            String nik = txt_nik.getText();
            String nama = txt_nama.getText();
            String alamat = txt_alamat.getText();
            String tlp = txt_notelp.getText();
            
//            Menu.jDesktopPane1.removeAll();
//            Menu.jDesktopPane1.repaint();
//            Form_Transaksi fm = new Form_Transaksi(nama, nik, alamat, tlp, email);

//            fm.setVisible(true);
//            Home.jDesktopPane1.add(fm);
        }
    
    }//GEN-LAST:event_jButtonSewaActionPerformed

    private void cb_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mobilActionPerformed
        // panel mobil
        String st = (String) cb_mobil.getSelectedItem();
        ResultSet rst = con.querySelectAll("tb_mobil", "tipe='" + st + "'");
        try {
            while (rst.next()) {

                this.lb_Merek.setText(rst.getString("merek"));
//                this.cb_Nopolisi.getSelectedItem(rst.get);
                this.lb_Tahun.setText(rst.getString("tahun"));
                this.lb_Harga.setText(rst.getString("harga"));
                this.lb_Status.setText(rst.getString("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SewaMobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_mobilActionPerformed

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
            java.util.logging.Logger.getLogger(SewaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SewaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SewaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SewaMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SewaMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JComboBox<String> cb_Nopolisi;
    private javax.swing.JComboBox<String> cb_Supir;
    private javax.swing.JComboBox<String> cb_mobil;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSewa;
    private javax.swing.JButton jButtonprint;
    private com.toedter.calendar.JDateChooser jDatetglpeminjaman1;
    private com.toedter.calendar.JDateChooser jDatetglpengembalian;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_Harga;
    private javax.swing.JLabel lb_Merek;
    private javax.swing.JLabel lb_Status;
    private javax.swing.JLabel lb_Tahun;
    private javax.swing.JTable tbl_sewa;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_lamaPinjam;
    private javax.swing.JTextField txt_lamaSupir;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_notelp;
    // End of variables declaration//GEN-END:variables

 private void loadMobil() {  // mengambil database

        rs = con.querySelectAll("tb_mobil");
        try {
            while (rs.next()) {
                cb_mobil.addItem(rs.getString("tipe"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SewaMobil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
 private void loadTabel() {
        String namaKolom[] = {"id_sewa", "NIK", "Nama", "Alamat", "No_telp", "Tipe_mobil", "No_polisi", "harga","Tgl_peminjaman","Tgl_pengembalian"}; //,
        rs = con.querySelect(namaKolom, "sewa_mobil");
        tbl_sewa.setModel(new ResultSetTable(rs)); //,"tgl_pinjam","tgl_kembali" ,jDateChooser1.getDateFormatString(),jDateChooser2.getDateFormatString()
    }

}
