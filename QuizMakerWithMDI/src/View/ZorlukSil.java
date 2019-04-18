
package View;

import Presenter.ZorlukSilPresenter;
import javax.swing.JOptionPane;


public class ZorlukSil extends javax.swing.JInternalFrame implements IView{

    private static ZorlukSil zorlukSil;
    
    private ZorlukSilPresenter presenter;
    
    public ZorlukSil() {
        presenter=new ZorlukSilPresenter(this);
        initComponents();
    }

    public static ZorlukSil getZorlukSil(){
        if(zorlukSil==null)
            zorlukSil=new ZorlukSil();
        return zorlukSil;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonZorlukSil = new javax.swing.JButton();
        jLabelZorlukSil = new javax.swing.JLabel();
        jLabelSilinecekZorluk = new javax.swing.JLabel();
        jTextFieldSilinecekZorluk = new javax.swing.JTextField();

        jButtonZorlukSil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonZorlukSil.setText("Sil");
        jButtonZorlukSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZorlukSilActionPerformed(evt);
            }
        });

        jLabelZorlukSil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelZorlukSil.setText("Zorluk Sil");

        jLabelSilinecekZorluk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSilinecekZorluk.setText("Silinecek Zorluk Seviyesi");

        jTextFieldSilinecekZorluk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonZorlukSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSilinecekZorluk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSilinecekZorluk, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabelZorlukSil)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelZorlukSil)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSilinecekZorluk)
                    .addComponent(jTextFieldSilinecekZorluk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonZorlukSil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonZorlukSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZorlukSilActionPerformed
       presenter.VeritabanindanZorlukSil(jTextFieldSilinecekZorluk.getText());
    }//GEN-LAST:event_jButtonZorlukSilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonZorlukSil;
    private javax.swing.JLabel jLabelSilinecekZorluk;
    private javax.swing.JLabel jLabelZorlukSil;
    private javax.swing.JTextField jTextFieldSilinecekZorluk;
    // End of variables declaration//GEN-END:variables

    @Override
    public void IViewSoruEkle(String mesaj) {
        JOptionPane.showMessageDialog(null,mesaj);
    }
}
