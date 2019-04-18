
package View;


import Presenter.CoktanSecmeliPresenter;
import Presenter.Helper;
import java.sql.*;
import javax.swing.JOptionPane;

public class CoktanSecmeliSoruEkle extends javax.swing.JInternalFrame implements IView{

    private CoktanSecmeliPresenter presenter;
            
    private static CoktanSecmeliSoruEkle coktanSecmeli;
    
    private Helper helper;
    private CoktanSecmeliSoruEkle() {
        presenter=new CoktanSecmeliPresenter(this);
        helper=new Helper();
        initComponents();
        helper.ComboboxDersler(jComboBoxDersSec);
        helper.ComboboxZorluk(jComboBoxZorlukSec);

    }

    public static CoktanSecmeliSoruEkle getCoktanSecmeli(){
        if(coktanSecmeli==null)
            coktanSecmeli=new CoktanSecmeliSoruEkle();
        return coktanSecmeli;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelSoruEkle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSoruMetni = new javax.swing.JTextArea();
        jLabelASecenegi = new javax.swing.JLabel();
        jTextFieldASecenegi = new javax.swing.JTextField();
        jLabelBSecenegi = new javax.swing.JLabel();
        jTextFieldBSecenegi = new javax.swing.JTextField();
        jLabelCSecenegi = new javax.swing.JLabel();
        jTextFieldCSecenegi = new javax.swing.JTextField();
        jLabelDSecenegi = new javax.swing.JLabel();
        jTextFieldDSecenegi = new javax.swing.JTextField();
        jLabelSoruZorlugu = new javax.swing.JLabel();
        jComboBoxZorlukSec = new javax.swing.JComboBox();
        jLabelPuan = new javax.swing.JLabel();
        jLabelDogruCevap = new javax.swing.JLabel();
        jLabelDers = new javax.swing.JLabel();
        jComboBoxDersSec = new javax.swing.JComboBox();
        jButtonCoktanSecmeliKaydet = new javax.swing.JButton();
        jFormattedTextFieldPuan = new javax.swing.JFormattedTextField();
        jComboBoxDogruCevap = new javax.swing.JComboBox();

        jLabel1.setText("jLabel1");

        jLabelSoruEkle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSoruEkle.setText("Soru Metni");

        jTextAreaSoruMetni.setColumns(20);
        jTextAreaSoruMetni.setRows(2);
        jTextAreaSoruMetni.setTabSize(1);
        jTextAreaSoruMetni.setMaximumSize(new java.awt.Dimension(0, 128));
        jScrollPane1.setViewportView(jTextAreaSoruMetni);

        jLabelASecenegi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelASecenegi.setText("A Secenegi");

        jTextFieldASecenegi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldASecenegi.setMaximumSize(new java.awt.Dimension(0, 128));

        jLabelBSecenegi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBSecenegi.setText("B Secenegi");

        jTextFieldBSecenegi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldBSecenegi.setMaximumSize(new java.awt.Dimension(0, 128));

        jLabelCSecenegi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCSecenegi.setText("C Secenegi");

        jTextFieldCSecenegi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCSecenegi.setMaximumSize(new java.awt.Dimension(0, 128));

        jLabelDSecenegi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDSecenegi.setText("D Secenegi");

        jTextFieldDSecenegi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldDSecenegi.setMaximumSize(new java.awt.Dimension(0, 128));

        jLabelSoruZorlugu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSoruZorlugu.setText("Soru Zorlugu");

        jComboBoxZorlukSec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxZorlukSec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz" }));

        jLabelPuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPuan.setText("Puan");

        jLabelDogruCevap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDogruCevap.setText("Dogru Cevap");

        jLabelDers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDers.setText("Ders");

        jComboBoxDersSec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxDersSec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz" }));

        jButtonCoktanSecmeliKaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCoktanSecmeliKaydet.setText("Kaydet");
        jButtonCoktanSecmeliKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCoktanSecmeliKaydetActionPerformed(evt);
            }
        });

        jFormattedTextFieldPuan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldPuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextFieldPuan.setMaximumSize(new java.awt.Dimension(0, 128));

        jComboBoxDogruCevap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxDogruCevap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz", "A", "B", "C", "D" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCoktanSecmeliKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSoruEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelDogruCevap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDogruCevap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelSoruZorlugu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxZorlukSec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelCSecenegi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCSecenegi, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelASecenegi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldASecenegi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBSecenegi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBSecenegi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDSecenegi)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabelPuan))
                                    .addComponent(jLabelDers, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDersSec, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldPuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDSecenegi, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoruEkle))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelASecenegi)
                    .addComponent(jTextFieldASecenegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBSecenegi)
                    .addComponent(jTextFieldBSecenegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCSecenegi)
                    .addComponent(jTextFieldCSecenegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDSecenegi)
                    .addComponent(jTextFieldDSecenegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSoruZorlugu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxZorlukSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDogruCevap)
                    .addComponent(jComboBoxDogruCevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDersSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDers))
                .addGap(18, 18, 18)
                .addComponent(jButtonCoktanSecmeliKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCoktanSecmeliKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCoktanSecmeliKaydetActionPerformed
        int puan=Integer.parseInt(jFormattedTextFieldPuan.getText());
        presenter.veritabaninaEkle(jTextAreaSoruMetni.getText(), jTextFieldASecenegi.getText(), jTextFieldBSecenegi.getText(), jTextFieldCSecenegi.getText(), jTextFieldDSecenegi.getText(), jComboBoxZorlukSec.getSelectedIndex(), puan, jComboBoxDogruCevap.getSelectedIndex(), jComboBoxDersSec.getSelectedIndex());
    }//GEN-LAST:event_jButtonCoktanSecmeliKaydetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCoktanSecmeliKaydet;
    private javax.swing.JComboBox jComboBoxDersSec;
    private javax.swing.JComboBox jComboBoxDogruCevap;
    private javax.swing.JComboBox jComboBoxZorlukSec;
    private javax.swing.JFormattedTextField jFormattedTextFieldPuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelASecenegi;
    private javax.swing.JLabel jLabelBSecenegi;
    private javax.swing.JLabel jLabelCSecenegi;
    private javax.swing.JLabel jLabelDSecenegi;
    private javax.swing.JLabel jLabelDers;
    private javax.swing.JLabel jLabelDogruCevap;
    private javax.swing.JLabel jLabelPuan;
    private javax.swing.JLabel jLabelSoruEkle;
    private javax.swing.JLabel jLabelSoruZorlugu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSoruMetni;
    private javax.swing.JTextField jTextFieldASecenegi;
    private javax.swing.JTextField jTextFieldBSecenegi;
    private javax.swing.JTextField jTextFieldCSecenegi;
    private javax.swing.JTextField jTextFieldDSecenegi;
    // End of variables declaration//GEN-END:variables

    public void IViewSoruEkle(String mesaj) {
       JOptionPane.showMessageDialog(null,mesaj);
    }
   
   
}
