
package View;

import Presenter.DersSilPresenter;
import javax.swing.JOptionPane;


public class DersSil extends javax.swing.JInternalFrame implements IView{

    DersSilPresenter presenter;
    
    private static DersSil dersSil;
    
    private DersSil() {
        presenter=new DersSilPresenter(this);
        initComponents();
    }
    
    public static DersSil getDersSil(){
        if(dersSil==null){
            dersSil=new DersSil();
        }
        return dersSil;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDersSilTitle = new javax.swing.JLabel();
        jLabelDersSil = new javax.swing.JLabel();
        jTextFieldDersSil = new javax.swing.JTextField();
        jButtonDersSil = new javax.swing.JButton();

        jLabelDersSilTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDersSilTitle.setText("Ders Sil");

        jLabelDersSil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDersSil.setText("Ders Adi :");

        jTextFieldDersSil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonDersSil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDersSil.setText("Sil");
        jButtonDersSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDersSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDersSilTitle)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDersSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDersSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDersSil, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelDersSilTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDersSil)
                    .addComponent(jTextFieldDersSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonDersSil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDersSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDersSilActionPerformed
        presenter.VeritabanındanDersSil(jTextFieldDersSil.getText());
    }//GEN-LAST:event_jButtonDersSilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDersSil;
    private javax.swing.JLabel jLabelDersSil;
    private javax.swing.JLabel jLabelDersSilTitle;
    private javax.swing.JTextField jTextFieldDersSil;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void IViewSoruEkle(String mesaj) {
        JOptionPane.showMessageDialog(null,mesaj);
    }
}
