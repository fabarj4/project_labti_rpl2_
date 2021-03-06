/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.c_admin_data;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import model.m_buku;

/**
 *
 * @author F
 */
public class v_admin_data extends javax.swing.JFrame {
    
    private int tipe = 0;
    /**
     * Creates new form v_admin_data
     */
    public v_admin_data() {
        initComponents();
        l_judul.setText("FORM TAMBAH");
    }
    
    public v_admin_data(int tipe, m_buku buku) {
        initComponents();
        dataController.setData(buku);
        l_judul.setText("FORM EDIT");
        this.tipe = tipe;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_judul = new javax.swing.JTextField();
        t_kategori = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        t_pengarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_penerbit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_tahun = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t_harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_persediaan = new javax.swing.JSpinner();
        b_selesai = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        l_judul = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Judul");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kategori");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        t_judul.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_judul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        jPanel1.add(t_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 306, -1));

        t_kategori.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_kategori.setForeground(new java.awt.Color(102, 102, 102));
        t_kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semua", "Anak", "Novel", "Komik", "Majalah", "Kuliner", "Edukasi" }));
        t_kategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(t_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 122, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pengarang");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        t_pengarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_pengarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        jPanel1.add(t_pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 306, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Penerbit");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        t_penerbit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_penerbit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        t_penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_penerbitActionPerformed(evt);
            }
        });
        jPanel1.add(t_penerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 306, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tahun Terbit");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        t_tahun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_tahun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        t_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_tahunActionPerformed(evt);
            }
        });
        jPanel1.add(t_tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 306, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Harga");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        t_harga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_harga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        t_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_hargaActionPerformed(evt);
            }
        });
        jPanel1.add(t_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 306, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Persediaan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        t_persediaan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_persediaan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(t_persediaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 55, -1));

        b_selesai.setBackground(new java.awt.Color(0, 204, 102));
        b_selesai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_selesai.setForeground(new java.awt.Color(255, 255, 255));
        b_selesai.setText("SELESAI");
        b_selesai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_selesai.setContentAreaFilled(false);
        b_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_selesaiActionPerformed(evt);
            }
        });
        jPanel1.add(b_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 87, 35));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        l_judul.setBackground(new java.awt.Color(255, 255, 255));
        l_judul.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        l_judul.setForeground(new java.awt.Color(255, 255, 255));
        l_judul.setText("FORM TAMBAH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(l_judul)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(l_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 60));

        jPanel8.setBackground(new java.awt.Color(0, 204, 102));

        jPanel9.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 330, 10));

        jPanel11.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 10, 90));

        jPanel10.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 10, 120));

        jPanel12.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 10, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_tahunActionPerformed

    private void t_penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_penerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_penerbitActionPerformed

    private void t_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_hargaActionPerformed

    private void b_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_selesaiActionPerformed
        // TODO add your handling code here:
        if(tipe == 1){
            dataController.editData();
        }else{
            dataController.tambahData();
        }
    }//GEN-LAST:event_b_selesaiActionPerformed

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
            java.util.logging.Logger.getLogger(v_admin_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_admin_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_admin_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_admin_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_admin_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_selesai;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel l_judul;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_judul;
    private javax.swing.JComboBox t_kategori;
    private javax.swing.JTextField t_penerbit;
    private javax.swing.JTextField t_pengarang;
    private javax.swing.JSpinner t_persediaan;
    private javax.swing.JTextField t_tahun;
    // End of variables declaration//GEN-END:variables
    
    private c_admin_data dataController = new c_admin_data(this);

    public JLabel getL_judul() {
        return l_judul;
    }

    public void setL_judul(JLabel l_judul) {
        this.l_judul = l_judul;
    }

    public JTextField getT_harga() {
        return t_harga;
    }

    public void setT_harga(JTextField t_harga) {
        this.t_harga = t_harga;
    }

    

    public JTextField getT_judul() {
        return t_judul;
    }

    public void setT_judul(JTextField t_judul) {
        this.t_judul = t_judul;
    }

    public JComboBox getT_kategori() {
        return t_kategori;
    }

    public void setT_kategori(JComboBox t_kategori) {
        this.t_kategori = t_kategori;
    }

    public JTextField getT_penerbit() {
        return t_penerbit;
    }

    public void setT_penerbit(JTextField t_penerbit) {
        this.t_penerbit = t_penerbit;
    }

    public JTextField getT_pengarang() {
        return t_pengarang;
    }

    public void setT_pengarang(JTextField t_pengarang) {
        this.t_pengarang = t_pengarang;
    }

    public JSpinner getT_persediaan() {
        return t_persediaan;
    }

    public void setT_persediaan(JSpinner t_persediaan) {
        this.t_persediaan = t_persediaan;
    }

    public JTextField getT_tahun() {
        return t_tahun;
    }

    public void setT_tahun(JTextField t_tahun) {
        this.t_tahun = t_tahun;
    }

    public c_admin_data getDataController() {
        return dataController;
    }

    public void setDataController(c_admin_data dataController) {
        this.dataController = dataController;
    }
    
    
}
