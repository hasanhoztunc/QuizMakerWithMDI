

package View;

import Presenter.ListeleHelper;


public class TipListele extends javax.swing.JInternalFrame {

    private static TipListele tipeGore;
    
    private ListeleHelper helper;
    
    private TipListele() {
        helper=new ListeleHelper();
        initComponents();
    }
    
    public static TipListele getTipeListele(){
        if(tipeGore==null)
            tipeGore=new TipListele();
        return tipeGore;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSoruTipi = new javax.swing.JLabel();
        jComboBoxSoruTipi = new javax.swing.JComboBox();
        jButtonListele = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabelSoruTipi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSoruTipi.setText("Listelenecek Soru Tipi : ");

        jComboBoxSoruTipi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSoruTipi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz", "Çoktan Seçmeli", "Doğru Yanlış", "Klasik" }));

        jButtonListele.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonListele.setText("Listele");
        jButtonListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListeleActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Soru Metni", "Ders", "Zorluk", "Puan"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSoruTipi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSoruTipi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButtonListele, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSoruTipi)
                    .addComponent(jComboBoxSoruTipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonListele)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListeleActionPerformed
        if(jComboBoxSoruTipi.getSelectedIndex()==1){
            helper.TipListeleCoktanSecmeli(jTable1);
        }
        else if(jComboBoxSoruTipi.getSelectedIndex()==2){
            helper.TipListeleDogruYanlis(jTable1);
        }
        else if(jComboBoxSoruTipi.getSelectedIndex()==3){
            helper.TipListeleKlasikSoru(jTable1);
        }
        
    }//GEN-LAST:event_jButtonListeleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListele;
    private javax.swing.JComboBox jComboBoxSoruTipi;
    private javax.swing.JLabel jLabelSoruTipi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
