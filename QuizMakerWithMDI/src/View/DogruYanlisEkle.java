
package View;

import Presenter.Helper;
import Presenter.DogruYanlisPresenter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class DogruYanlisEkle extends javax.swing.JInternalFrame implements IView{

    private DogruYanlisPresenter presenter;
    private Helper comboHelper;
    private static DogruYanlisEkle dogruYanlis;
    
   private DogruYanlisEkle() {   
        presenter=new DogruYanlisPresenter(this); 
        comboHelper=new Helper();
        //comboHelper.setComboBoxDersler(jComboBoxDers);
        initComponents();
        comboHelper.ComboboxDersler(jComboBoxDers);
        comboHelper.ComboboxZorluk(jComboBoxSoruZorlugu);     
   }
   
   public static DogruYanlisEkle getDogruYanlis(){
        if(dogruYanlis==null){
            dogruYanlis=new DogruYanlisEkle();
        }
        return dogruYanlis;
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
        jLabelDers = new javax.swing.JLabel();
        jComboBoxDers = new javax.swing.JComboBox();
        jButtonDogruYanlisKaydet = new javax.swing.JButton();
        jComboBoxDogruCevap = new javax.swing.JComboBox();

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

        jLabelDers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDers.setText("Ders");

        jComboBoxDers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxDers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz" }));

        jButtonDogruYanlisKaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDogruYanlisKaydet.setText("Kaydet");
        jButtonDogruYanlisKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDogruYanlisKaydetActionPerformed(evt);
            }
        });

        jComboBoxDogruCevap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxDogruCevap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz", "Dogru", "Yanlis" }));

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDogruYanlisKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSoruZorlugu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxSoruZorlugu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPuan))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDogruCevap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxDogruCevap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelDers)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPuan, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoruEkle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSoruZorlugu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSoruZorlugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDogruCevap)
                    .addComponent(jComboBoxDogruCevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDers))
                .addGap(18, 18, 18)
                .addComponent(jButtonDogruYanlisKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDogruYanlisKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDogruYanlisKaydetActionPerformed
        int puan=Integer.parseInt(jTextFieldPuan.getText());
        int dogruCevap;
        if(jComboBoxDogruCevap.getSelectedIndex()==1){
            dogruCevap=5;
        }else{
            dogruCevap=6;
        }
        presenter.veritabaninaEkle(jTextAreaSoruMetni.getText(),jComboBoxSoruZorlugu.getSelectedIndex() , puan,dogruCevap , jComboBoxDers.getSelectedIndex());
    }//GEN-LAST:event_jButtonDogruYanlisKaydetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDogruYanlisKaydet;
    private javax.swing.JComboBox jComboBoxDers;
    private javax.swing.JComboBox jComboBoxDogruCevap;
    private javax.swing.JComboBox jComboBoxSoruZorlugu;
    private javax.swing.JLabel jLabelDers;
    private javax.swing.JLabel jLabelDogruCevap;
    private javax.swing.JLabel jLabelPuan;
    private javax.swing.JLabel jLabelSoruEkle;
    private javax.swing.JLabel jLabelSoruZorlugu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSoruMetni;
    private javax.swing.JTextField jTextFieldPuan;
    // End of variables declaration//GEN-END:variables

    
    public void IViewSoruEkle(String mesaj){
        JOptionPane.showMessageDialog(null,mesaj);
    }

    
        
        
    }

   

