/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaansmk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Atthoriq
 */
public class KonfirmasiPengembalian extends javax.swing.JFrame {
    public ResultSet rst;
    Connection CC = new koneksi().connect();
    public Statement stt;
    public DefaultTableModel tmdl;
    public PreparedStatement prst;
    String id;
    String idbuku;
    String noAnggota;
    String namaAngg;
     String noanggota;
    String judulbuku;
    String tanggalpinjam;
    /**
     * Creates new form KonfirmasiPengembalian
     */
    public KonfirmasiPengembalian() {
        initComponents();
        judul();
        Datas("");
        jButton1.setEnabled(false);
        jButton6.setEnabled(false);
    }
    public void judul() {
            Object[] judul = {
        "id", "No Anggota ","Nama Peminjam","Id Buku", "Judul Buku", "Tanggal Pinjam", "Tenggat Kembali"
        };
        tmdl = new DefaultTableModel(null, judul);
        tabelkembali.setModel(tmdl);}
    
    public void Datas(String idpem) {
        try {
            stt = CC.createStatement();
            tmdl.getDataVector().removeAllElements();
            tmdl.fireTableDataChanged();
            rst = stt.executeQuery("SELECT * FROM peminjam where status = 3");
            
            while(rst.next()){
            Object[] data = {
                rst.getString("id"),
                rst.getString("noanggota"),
                rst.getString("Nama"),
                rst.getString("idbuku"),
                rst.getString("judulbuku"),
                rst.getString("tanggalpinjam"),
                rst.getString("tenggatkembali")
                
                
            };
            tmdl.addRow(data);
            }
            }catch(Exception e){
          e.printStackTrace();
        }
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkembali = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tanggalkembali = new javax.swing.JTextField();
        pustakawan = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dendaa1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(199, 234, 238));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("KONFIRMASI PENGEMBALIAN BUKU");
        jLabel1.setToolTipText("");

        jButton1.setText("Konfirmasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabelkembali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "No ANggota Peminjam", "Nama Peminjam", "id buku", "Judul Buku", "Tanggal Pinjam", "Tenggat Pengembalian"
            }
        ));
        tabelkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkembaliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelkembali);
        if (tabelkembali.getColumnModel().getColumnCount() > 0) {
            tabelkembali.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton3.setText("Cari");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NAMA PUSTAKAWAN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TANGGAL PENGEMBALIAN");

        tanggalkembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tanggalkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalkembaliActionPerformed(evt);
            }
        });

        pustakawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton6.setText("Tandai Terlambat");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("MASUKAN DENDA");

        dendaa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dendaa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dendaa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dendaa1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(41, 41, 41)
                                        .addComponent(pustakawan))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tanggalkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(6, 6, 6))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pustakawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tanggalkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dendaa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(18, 18, 18))
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

    private void tanggalkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalkembaliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     petugas_menu a = new petugas_menu();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkembaliMouseClicked
        id = tabelkembali.getValueAt(tabelkembali.getSelectedRow(), 0).toString();
        idbuku = tabelkembali.getValueAt(tabelkembali.getSelectedRow(), 3).toString();
        judulbuku = tabelkembali.getValueAt(tabelkembali.getSelectedRow(), 4).toString();
        noAnggota = tabelkembali.getValueAt(tabelkembali.getSelectedRow(), 1).toString();
        namaAngg= tabelkembali.getValueAt(tabelkembali.getSelectedRow(), 2).toString();
        tanggalpinjam= tabelkembali.getValueAt(tabelkembali.getSelectedRow(), 5).toString();
        jButton6.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_tabelkembaliMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            stt = CC.createStatement();
            stt.executeUpdate("INSERT INTO laporankembali VALUES('"+ id+ "','" 
                    + idbuku + "','"
                    + judulbuku + "','"
                    + noAnggota + "','"
                    + namaAngg + "','"
                    + tanggalpinjam + "','"
                    + tanggalkembali.getText() + "','"
                    + pustakawan.getText()+ "','Kembali' )");
            stt = CC.createStatement();
            stt.executeUpdate("DELETE FROM laporanpinjam WHERE idpinjam= " + id);
            stt = CC.createStatement();
            stt.executeUpdate("UPDATE buku Set sisabuku= sisabuku+1 Where buku.idbuku = "+idbuku);
            stt = CC.createStatement();
            stt.executeUpdate("UPDATE peminjam set "
                   + "tanggalkembali='" + tanggalkembali.getText() + "',"
                   + "petugaskonfirkembali='" + pustakawan.getText() + "',"
                   + "status = '4' WHERE peminjam.id = "+ id +  "" );
            Datas("");
            JOptionPane.showMessageDialog(null, "berhasil Dikonfirmasi");
            tanggalkembali.setText("");
            pustakawan.setText("");
            jButton6.setEnabled(false);
            jButton1.setEnabled(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try{  
            stt = CC.createStatement();
            stt.executeUpdate("INSERT INTO laporankembali VALUES('"+ id+ "','" 
                    + idbuku + "','"
                    + judulbuku + "','"
                    + noAnggota + "','"
                    + namaAngg + "','"
                    + tanggalpinjam + "','"
                    + tanggalkembali.getText() + "','"
                    + pustakawan.getText()+ "','Kembali' )");
            stt = CC.createStatement();
            stt.executeUpdate("DELETE FROM laporanpinjam WHERE idpinjam= " + id);
            stt = CC.createStatement();
                        stt.executeUpdate("INSERT INTO Denda(noanggota,namaanggota,namapetugas, sebabdenda, jumlah, status) VALUES('"+ noAnggota + "','"
                        + namaAngg+ "','"
                        + pustakawan.getText() + "','"
                        + "Keterlambatan Pengembalian Buku" + "','"
                        + dendaa1.getText() +"',"
                        + "1" + ")");
            stt = CC.createStatement();
            stt.executeUpdate("UPDATE buku Set sisabuku= sisabuku+1 Where buku.idbuku = "+idbuku);
            stt = CC.createStatement();
            stt.executeUpdate("UPDATE peminjam set "
                   + "tanggalkembali='" + tanggalkembali.getText() + "',"
                   + "petugaskonfirkembali='" + pustakawan.getText() + "',"
                   + "status = '4' WHERE peminjam.id = "+ id +  "" );
            Datas("");
            JOptionPane.showMessageDialog(null, "berhasil Dikonfirmasi");
            
            tanggalkembali.setText("");
            pustakawan.setText("");
            dendaa1.setText("");

            jButton6.setEnabled(false);
            jButton1.setEnabled(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void dendaa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dendaa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dendaa1ActionPerformed

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
            java.util.logging.Logger.getLogger(KonfirmasiPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonfirmasiPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dendaa1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField pustakawan;
    private javax.swing.JTable tabelkembali;
    private javax.swing.JTextField tanggalkembali;
    // End of variables declaration//GEN-END:variables
}