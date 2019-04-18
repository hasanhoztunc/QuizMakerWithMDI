
package View;

import Presenter.DersEklePresenter;
import javax.swing.JOptionPane;


public class DersEkle extends javax.swing.JInternalFrame implements IView{

    private static DersEkle dersEkle;
    private DersEklePresenter presenter;
    
    private DersEkle() {
        presenter=new DersEklePresenter(this);
        initComponents();
    }

   public static DersEkle getDersEkle(){
       if(dersEkle==null){
           dersEkle=new DersEkle();
       }
       return dersEkle;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDersEkleTitle = new javax.swing.JLabel();
        jLabelDersAdi = new javax.swing.JLabel();
        jTextFieldDersAdi = new javax.swing.JTextField();
        jButtonDersEkle = new javax.swing.JButton();

        jLabelDersEkleTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDersEkleTitle.setText("Ders Ekle");

        jLabelDersAdi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDersAdi.setText("Ders Adi :");

        jTextFieldDersAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonDersEkle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDersEkle.setText("Ekle");
        jButtonDersEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDersEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabelDersEkleTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelDersAdi)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDersAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonDersEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelDersEkleTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDersAdi)
                    .addComponent(jTextFieldDersAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonDersEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDersEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDersEkleActionPerformed
        presenter.VeritabanınaEkle(jTextFieldDersAdi.getText());
    }//GEN-LAST:event_jButtonDersEkleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDersEkle;
    private javax.swing.JLabel jLabelDersAdi;
    private javax.swing.JLabel jLabelDersEkleTitle;
    private javax.swing.JTextField jTextFieldDersAdi;
    // End of variables declaration//GEN-END:variables

    public void IViewSoruEkle(String mesaj){
        JOptionPane.showMessageDialog(null,mesaj);
    }
}
