
package View;

import Presenter.DersGuncellePresenter;
import javax.swing.JOptionPane;


public class DersGuncelle extends javax.swing.JInternalFrame implements IView{

    private static DersGuncelle dersGuncelle;
    private DersGuncellePresenter presenter;
    
    private DersGuncelle() {
        presenter=new DersGuncellePresenter(this);
        initComponents();
    }

    public static DersGuncelle getDersGuncelle(){
        if(dersGuncelle==null)
            dersGuncelle=new DersGuncelle();
        return dersGuncelle;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDersGuncelle = new javax.swing.JLabel();
        jLabelEskiDersAdi = new javax.swing.JLabel();
        jTextFieldEskiDersAdi = new javax.swing.JTextField();
        jLabelGuncelDersAdi = new javax.swing.JLabel();
        jTextFieldGuncelDersAdi = new javax.swing.JTextField();
        jButtonGuncelle = new javax.swing.JButton();

        jLabelDersGuncelle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDersGuncelle.setText("Ders Güncelle");

        jLabelEskiDersAdi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEskiDersAdi.setText("Ders Adi :");

        jTextFieldEskiDersAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelGuncelDersAdi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelGuncelDersAdi.setText("Güncel Ders Adi :");

        jTextFieldGuncelDersAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonGuncelle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonGuncelle.setText("Güncelle");
        jButtonGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabelDersGuncelle)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGuncelDersAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEskiDersAdi, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEskiDersAdi)
                            .addComponent(jTextFieldGuncelDersAdi))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDersGuncelle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEskiDersAdi)
                    .addComponent(jTextFieldEskiDersAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGuncelDersAdi)
                    .addComponent(jTextFieldGuncelDersAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuncelleActionPerformed
        presenter.VeritabaniGuncelle(jTextFieldEskiDersAdi.getText(), jTextFieldGuncelDersAdi.getText());
    }//GEN-LAST:event_jButtonGuncelleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuncelle;
    private javax.swing.JLabel jLabelDersGuncelle;
    private javax.swing.JLabel jLabelEskiDersAdi;
    private javax.swing.JLabel jLabelGuncelDersAdi;
    private javax.swing.JTextField jTextFieldEskiDersAdi;
    private javax.swing.JTextField jTextFieldGuncelDersAdi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void IViewSoruEkle(String mesaj) {
        JOptionPane.showMessageDialog(null,mesaj);
    }
}
