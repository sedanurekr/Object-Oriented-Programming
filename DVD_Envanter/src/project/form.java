/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sedan
 */
public class form extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form form
     */
    NodeList nodeList, otherList;
    Node node;
    String sonuc;
    ArrayList list;
    DVD newData=new DVD();
    public form() {
        initComponents();
    }
    public form(NodeList nodeList) {
        this.nodeList = nodeList;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EnvanterPanel = new javax.swing.JPanel();
        ekleButon = new javax.swing.JButton();
        silButon = new javax.swing.JButton();
        siralaA_ZButon = new javax.swing.JButton();
        siralaZ_AButon = new javax.swing.JButton();
        goster2000buton = new javax.swing.JButton();
        cikisButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EnvanterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DVD Envanteri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 102, 204))); // NOI18N
        EnvanterPanel.setForeground(new java.awt.Color(0, 102, 204));

        ekleButon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ekleButon.setForeground(new java.awt.Color(0, 51, 51));
        ekleButon.setText("DVD Ekle");
        ekleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonActionPerformed(evt);
            }
        });

        silButon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        silButon.setForeground(new java.awt.Color(0, 51, 51));
        silButon.setText("DVD Sil");
        silButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButonActionPerformed(evt);
            }
        });

        siralaA_ZButon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        siralaA_ZButon.setForeground(new java.awt.Color(0, 51, 51));
        siralaA_ZButon.setText("A'dan Z'ye Sirala");
        siralaA_ZButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siralaA_ZButonActionPerformed(evt);
            }
        });

        siralaZ_AButon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        siralaZ_AButon.setForeground(new java.awt.Color(0, 51, 51));
        siralaZ_AButon.setText("Z'den A'ya Sirala");
        siralaZ_AButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siralaZ_AButonActionPerformed(evt);
            }
        });

        goster2000buton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        goster2000buton.setForeground(new java.awt.Color(0, 51, 51));
        goster2000buton.setText("2000 Yilindan Onceki Basimlar");
        goster2000buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goster2000butonActionPerformed(evt);
            }
        });

        cikisButon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cikisButon.setForeground(new java.awt.Color(0, 51, 51));
        cikisButon.setText("Cikis");
        cikisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnvanterPanelLayout = new javax.swing.GroupLayout(EnvanterPanel);
        EnvanterPanel.setLayout(EnvanterPanelLayout);
        EnvanterPanelLayout.setHorizontalGroup(
            EnvanterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnvanterPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(EnvanterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cikisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siralaZ_AButon, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siralaA_ZButon, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goster2000buton)
                    .addComponent(ekleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silButon, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        EnvanterPanelLayout.setVerticalGroup(
            EnvanterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnvanterPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(siralaA_ZButon)
                .addGap(18, 18, 18)
                .addComponent(siralaZ_AButon)
                .addGap(18, 18, 18)
                .addComponent(goster2000buton)
                .addGap(21, 21, 21)
                .addComponent(ekleButon)
                .addGap(18, 18, 18)
                .addComponent(silButon)
                .addGap(18, 18, 18)
                .addComponent(cikisButon)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(EnvanterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(EnvanterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisButonActionPerformed
        try {
            Method.Cikis(nodeList);
        } catch (IOException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cikisButonActionPerformed

    private void goster2000butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goster2000butonActionPerformed
        sonuc=Method.ListeleAZ(Method.goster2000(nodeList));
        JOptionPane.showMessageDialog(null, sonuc);

    }//GEN-LAST:event_goster2000butonActionPerformed

    private void siralaZ_AButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siralaZ_AButonActionPerformed
        sonuc = Method.ListeleZA(nodeList);
        JOptionPane.showMessageDialog(null, sonuc);
    }//GEN-LAST:event_siralaZ_AButonActionPerformed

    private void siralaA_ZButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siralaA_ZButonActionPerformed
        sonuc = Method.ListeleAZ(nodeList);
        JOptionPane.showMessageDialog(null, sonuc);
    }//GEN-LAST:event_siralaA_ZButonActionPerformed

    private void silButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButonActionPerformed
        Method.DVDSil(nodeList, node);

    }//GEN-LAST:event_silButonActionPerformed

    private void ekleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonActionPerformed
        Method.DVDEkle(nodeList);
    }//GEN-LAST:event_ekleButonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EnvanterPanel;
    private javax.swing.JButton cikisButon;
    private javax.swing.JButton ekleButon;
    private javax.swing.JButton goster2000buton;
    private javax.swing.JButton silButon;
    private javax.swing.JButton siralaA_ZButon;
    private javax.swing.JButton siralaZ_AButon;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}