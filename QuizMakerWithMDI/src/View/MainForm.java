
package View;

import Model.SqlServerConnect;
import Presenter.Helper;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class MainForm extends javax.swing.JFrame {

    
    CoktanSecmeliSoruEkle coktanSecmeliEkle;
    KlasikSoruEkle klasikSoruEkle;
    DogruYanlisEkle dogruYanlis;
    DersEkle dersEkle;
    DersSil dersSil;
    DersGuncelle dersGuncelle;
    ZorlukEkle zorlukEkle;
    ZorlukSil zorlukSil;
    TipListele tipListele;
    SqlServerConnect sqlConnect;
    public MainForm() {
        sqlConnect=SqlServerConnect.getSqlServerConnect();
        initComponents();
    }
    
    public void PencereleriKapat(){
        for(JInternalFrame internalFrm:jDesktopPane1.getAllFrames()){
            internalFrm.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSoruIslemleri = new javax.swing.JMenu();
        jMenuItemCoktanSecmeli = new javax.swing.JMenuItem();
        jMenuItemKlasik = new javax.swing.JMenuItem();
        jMenuItemDogruYanlis = new javax.swing.JMenuItem();
        jMenuDersIslemleri = new javax.swing.JMenu();
        jMenuItemDersEkle = new javax.swing.JMenuItem();
        jMenuItemDersSil = new javax.swing.JMenuItem();
        jMenuItemDersGuncelle = new javax.swing.JMenuItem();
        jMenuZorlukIslemleri = new javax.swing.JMenu();
        jMenuItemZorlukEkle = new javax.swing.JMenuItem();
        jMenuItemZorlukSil = new javax.swing.JMenuItem();
        jMenuItemZorlukGuncelle = new javax.swing.JMenuItem();
        jMenuListele = new javax.swing.JMenu();
        jMenuItemTipListele = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuSoruIslemleri.setText("Soruİşlemleri");

        jMenuItemCoktanSecmeli.setText("Coktan Seçmeli");
        jMenuItemCoktanSecmeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCoktanSecmeliActionPerformed(evt);
            }
        });
        jMenuSoruIslemleri.add(jMenuItemCoktanSecmeli);

        jMenuItemKlasik.setText("Klasik");
        jMenuItemKlasik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKlasikActionPerformed(evt);
            }
        });
        jMenuSoruIslemleri.add(jMenuItemKlasik);

        jMenuItemDogruYanlis.setText("Doğru Yanlış");
        jMenuItemDogruYanlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDogruYanlisActionPerformed(evt);
            }
        });
        jMenuSoruIslemleri.add(jMenuItemDogruYanlis);

        jMenuBar1.add(jMenuSoruIslemleri);

        jMenuDersIslemleri.setText("Ders İşlemleri");

        jMenuItemDersEkle.setText("Ders Ekle");
        jMenuItemDersEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDersEkleActionPerformed(evt);
            }
        });
        jMenuDersIslemleri.add(jMenuItemDersEkle);

        jMenuItemDersSil.setText("Ders Sil");
        jMenuItemDersSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDersSilActionPerformed(evt);
            }
        });
        jMenuDersIslemleri.add(jMenuItemDersSil);

        jMenuItemDersGuncelle.setText("Ders Güncelle");
        jMenuItemDersGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDersGuncelleActionPerformed(evt);
            }
        });
        jMenuDersIslemleri.add(jMenuItemDersGuncelle);

        jMenuBar1.add(jMenuDersIslemleri);

        jMenuZorlukIslemleri.setText("Zorluk İşlemleri");

        jMenuItemZorlukEkle.setText("Zorluk Ekle");
        jMenuItemZorlukEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemZorlukEkleActionPerformed(evt);
            }
        });
        jMenuZorlukIslemleri.add(jMenuItemZorlukEkle);

        jMenuItemZorlukSil.setText("Zorluk Sil");
        jMenuItemZorlukSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemZorlukSilActionPerformed(evt);
            }
        });
        jMenuZorlukIslemleri.add(jMenuItemZorlukSil);

        jMenuItemZorlukGuncelle.setText("Zorluk Güncelle");
        jMenuZorlukIslemleri.add(jMenuItemZorlukGuncelle);

        jMenuBar1.add(jMenuZorlukIslemleri);

        jMenuListele.setText("Listele");

        jMenuItemTipListele.setText("Soru Tipine Göre");
        jMenuItemTipListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipListeleActionPerformed(evt);
            }
        });
        jMenuListele.add(jMenuItemTipListele);

        jMenuBar1.add(jMenuListele);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItemCoktanSecmeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCoktanSecmeliActionPerformed
        PencereleriKapat();
        //CoktanSecmeliSoruEkle coktanSecmeliEkle;
        
        if(coktanSecmeliEkle == null || coktanSecmeliEkle.isClosed()){
            coktanSecmeliEkle=CoktanSecmeliSoruEkle.getCoktanSecmeli();
            
            jDesktopPane1.add(coktanSecmeliEkle);
            coktanSecmeliEkle.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jMenuItemCoktanSecmeliActionPerformed

    private void jMenuItemKlasikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKlasikActionPerformed
        
        PencereleriKapat();
        
        if(klasikSoruEkle == null || klasikSoruEkle.isClosed()){
            klasikSoruEkle=KlasikSoruEkle.getKlasik();
            
            jDesktopPane1.add(klasikSoruEkle);
            klasikSoruEkle.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemKlasikActionPerformed

    private void jMenuItemDogruYanlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDogruYanlisActionPerformed
        // TODO add your handling code here:
        PencereleriKapat();
        if(dogruYanlis == null || dogruYanlis.isClosed()){
            dogruYanlis=DogruYanlisEkle.getDogruYanlis();
            
            jDesktopPane1.add(dogruYanlis);
            dogruYanlis.setVisible(true);
            
        }
    }//GEN-LAST:event_jMenuItemDogruYanlisActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void jMenuItemDersEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDersEkleActionPerformed
        PencereleriKapat();
         if(dersEkle == null || dersEkle.isClosed()){
            dersEkle=dersEkle.getDersEkle();
            
            jDesktopPane1.add(dersEkle);
            dersEkle.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemDersEkleActionPerformed

    private void jMenuItemDersSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDersSilActionPerformed
       PencereleriKapat();
         if(dersSil == null || dersSil.isClosed()){
            dersSil=dersSil.getDersSil();
            
            jDesktopPane1.add(dersSil);
            dersSil.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemDersSilActionPerformed

    private void jMenuItemDersGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDersGuncelleActionPerformed
        PencereleriKapat();
         if(dersGuncelle == null || dersGuncelle.isClosed()){
            dersGuncelle=dersGuncelle.getDersGuncelle();
            
            jDesktopPane1.add(dersGuncelle);
            dersGuncelle.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemDersGuncelleActionPerformed

    private void jMenuItemZorlukEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemZorlukEkleActionPerformed
        PencereleriKapat();
        if(zorlukEkle == null || zorlukEkle.isClosed()){
            zorlukEkle=zorlukEkle.getZorlukEkle();
            
            jDesktopPane1.add(zorlukEkle);
            zorlukEkle.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemZorlukEkleActionPerformed

    private void jMenuItemZorlukSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemZorlukSilActionPerformed
        PencereleriKapat();
        if(zorlukSil == null || zorlukSil.isClosed()){
            zorlukSil=zorlukSil.getZorlukSil();
            
            jDesktopPane1.add(zorlukSil);
            zorlukSil.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemZorlukSilActionPerformed

    private void jMenuItemTipListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipListeleActionPerformed
        PencereleriKapat();
        if(tipListele == null || tipListele.isClosed()){
            tipListele=tipListele.getTipeListele();
            
            jDesktopPane1.add(tipListele);
            tipListele.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemTipListeleActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDersIslemleri;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCoktanSecmeli;
    private javax.swing.JMenuItem jMenuItemDersEkle;
    private javax.swing.JMenuItem jMenuItemDersGuncelle;
    private javax.swing.JMenuItem jMenuItemDersSil;
    private javax.swing.JMenuItem jMenuItemDogruYanlis;
    private javax.swing.JMenuItem jMenuItemKlasik;
    private javax.swing.JMenuItem jMenuItemTipListele;
    private javax.swing.JMenuItem jMenuItemZorlukEkle;
    private javax.swing.JMenuItem jMenuItemZorlukGuncelle;
    private javax.swing.JMenuItem jMenuItemZorlukSil;
    private javax.swing.JMenu jMenuListele;
    private javax.swing.JMenu jMenuSoruIslemleri;
    private javax.swing.JMenu jMenuZorlukIslemleri;
    // End of variables declaration//GEN-END:variables
}
