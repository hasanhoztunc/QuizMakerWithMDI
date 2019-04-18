
package View;

import Presenter.ZorlukEklePresenter;
import javax.swing.JOptionPane;


public class ZorlukEkle extends javax.swing.JInternalFrame implements IView{

   private static ZorlukEkle zorlukEkle;
   private ZorlukEklePresenter presenter; 
   
    public ZorlukEkle() {
        presenter=new ZorlukEklePresenter(this);
        initComponents();
    }

    public static ZorlukEkle getZorlukEkle(){
        if(zorlukEkle==null)
            zorlukEkle=new ZorlukEkle();
        return zorlukEkle;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelZorlukEkle = new javax.swing.JLabel();
        jLabelZorlukAdi = new javax.swing.JLabel();
        jTextFieldZorlukAdi = new javax.swing.JTextField();
        jButtonEkle = new javax.swing.JButton();

        jLabelZorlukEkle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelZorlukEkle.setText("Zorluk Ekle");

        jLabelZorlukAdi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelZorlukAdi.setText("Zorluk Adi :");

        jTextFieldZorlukAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonEkle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEkle.setText("Ekle");
        jButtonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabelZorlukEkle)
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelZorlukAdi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldZorlukAdi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelZorlukEkle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelZorlukAdi)
                    .addComponent(jTextFieldZorlukAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEkleActionPerformed
        presenter.VeritabaninaZorlukEkle(jTextFieldZorlukAdi.getText());
    }//GEN-LAST:event_jButtonEkleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEkle;
    private javax.swing.JLabel jLabelZorlukAdi;
    private javax.swing.JLabel jLabelZorlukEkle;
    private javax.swing.JTextField jTextFieldZorlukAdi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void IViewSoruEkle(String mesaj) {
        JOptionPane.showMessageDialog(null,mesaj);
    }
}
