
package View;

import Presenter.Helper;
import Presenter.KlasikPresenter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class KlasikSoruEkle extends javax.swing.JInternalFrame implements IView{

    private KlasikPresenter presenter;
    private Helper helper;
    private static KlasikSoruEkle klasikSoru;
    
    
    private KlasikSoruEkle() {
        presenter=new KlasikPresenter(this);
        helper=new Helper();
        initComponents();
        helper.ComboboxDersler(jComboBoxDers);
        helper.ComboboxZorluk(jComboBoxSoruZorlugu);
         
    }

    public static KlasikSoruEkle getKlasik(){
        if(klasikSoru==null)
            klasikSoru=new KlasikSoruEkle();
        return klasikSoru;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSoruMetni = new javax.swing.JTextArea();
        jLabelSoruEkle = new javax.swing.JLabel();
        jLabelSoruZorlugu = new javax.swing.JLabel();
        jComboBoxSoruZorlugu = new javax.swing.JComboBox();
        jLabelPuan = new javax.swing.JLabel();
        jTextFieldPuan = new javax.swing.JTextField();
        jLabelDogruCevap = new javax.swing.JLabel();
        jTextFieldDogruCevap = new javax.swing.JTextField();
        jLabelDers = new javax.swing.JLabel();
        jComboBoxDers = new javax.swing.JComboBox();
        jButtonKlasikKaydet = new javax.swing.JButton();

        jTextAreaSoruMetni.setColumns(20);
        jTextAreaSoruMetni.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSoruMetni);

        jLabelSoruEkle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSoruEkle.setText("Soru Metni");

        jLabelSoruZorlugu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSoruZorlugu.setText("Soru Zorlugu");

        jComboBoxSoruZorlugu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxSoruZorlugu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz" }));

        jLabelPuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPuan.setText("Puan");

        jTextFieldPuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDogruCevap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDogruCevap.setText("Dogru Cevap");

        jTextFieldDogruCevap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDers.setText("Ders");

        jComboBoxDers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxDers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz" }));

        jButtonKlasikKaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonKlasikKaydet.setText("Kaydet");
        jButtonKlasikKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKlasikKaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSoruEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSoruZorlugu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSoruZorlugu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPuan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPuan, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDers)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxDers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonKlasikKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDogruCevap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDogruCevap)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoruEkle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSoruZorlugu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSoruZorlugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDogruCevap)
                    .addComponent(jTextFieldDogruCevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDers)
                    .addComponent(jComboBoxDers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKlasikKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKlasikKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKlasikKaydetActionPerformed
        int puan=Integer.parseInt(jTextFieldPuan.getText());
        presenter.veritabaninaEkle(jTextAreaSoruMetni.getText(),jComboBoxSoruZorlugu.getSelectedIndex() , puan,jTextFieldDogruCevap.getText() , jComboBoxDers.getSelectedIndex());
    }//GEN-LAST:event_jButtonKlasikKaydetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKlasikKaydet;
    private javax.swing.JComboBox jComboBoxDers;
    private javax.swing.JComboBox jComboBoxSoruZorlugu;
    private javax.swing.JLabel jLabelDers;
    private javax.swing.JLabel jLabelDogruCevap;
    private javax.swing.JLabel jLabelPuan;
    private javax.swing.JLabel jLabelSoruEkle;
    private javax.swing.JLabel jLabelSoruZorlugu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSoruMetni;
    private javax.swing.JTextField jTextFieldDogruCevap;
    private javax.swing.JTextField jTextFieldPuan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void IViewSoruEkle(String mesaj){
        JOptionPane.showMessageDialog(null,mesaj);
    }
}
