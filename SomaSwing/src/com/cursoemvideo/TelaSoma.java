/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoemvideo;

/**
 *
 * @author jovi3
 */
public class TelaSoma extends javax.swing.JFrame {

    /**
     * Creates new form TelaSoma
     */
    public TelaSoma() {
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

        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        btnSoma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblsoma = new javax.swing.JLabel();
        txtN3 = new javax.swing.JTextField();
        txtN4 = new javax.swing.JTextField();
        btnMult = new javax.swing.JButton();
        lblMult = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN5 = new javax.swing.JTextField();
        txtN6 = new javax.swing.JTextField();
        btnDivisao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDivisao = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSubt = new javax.swing.JLabel();
        txtN7 = new javax.swing.JTextField();
        txtN8 = new javax.swing.JTextField();
        btnSub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });

        btnSoma.setText("=");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        jLabel1.setText("+");

        lblsoma.setText("0");

        btnMult.setText("=");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        lblMult.setText("0");

        jLabel3.setText("*");

        txtN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN6ActionPerformed(evt);
            }
        });

        btnDivisao.setText("=");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        jLabel2.setText("/");

        lblDivisao.setText("0");

        jLabel4.setText("-");

        lblSubt.setText("0");

        btnSub.setText("=");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtN7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtN1)
                    .addComponent(txtN3)
                    .addComponent(txtN5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtN4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSoma)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMult, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblsoma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDivisao))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtN8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtN6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(146, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSubt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoma)
                    .addComponent(jLabel1)
                    .addComponent(lblsoma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMult)
                    .addComponent(lblMult)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao)
                    .addComponent(jLabel2)
                    .addComponent(lblDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubt)
                    .addComponent(txtN7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSub)
                    .addComponent(jLabel4))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN1ActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // TODO add your handling code here:
        int n1=Integer.parseInt(txtN1.getText());
        int n2= Integer.parseInt(txtN2.getText());
        int s = n1 + n2;
        lblsoma.setText(Integer.toString(s));
        
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
        float n3 = Float.parseFloat(txtN3.getText());
        float n4 = Float.parseFloat(txtN4.getText());
        float f = n3 * n4;
        lblMult.setText(Float.toString(f));
    }//GEN-LAST:event_btnMultActionPerformed

    private void txtN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN6ActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        // TODO add your handling code here:
        float n5 = Float.parseFloat(txtN5.getText());
        float n6 = Float.parseFloat(txtN6.getText());
        float g = n5 / n6;
        lblDivisao.setText(Float.toString(g));
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        float n7 = Float.parseFloat(txtN7.getText());
        float n8 = Float.parseFloat(txtN8.getText()); 
        float h = n7-n8;
        lblSubt.setText(Float.toString(h));
    }//GEN-LAST:event_btnSubActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSoma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDivisao;
    private javax.swing.JLabel lblMult;
    private javax.swing.JLabel lblSubt;
    private javax.swing.JLabel lblsoma;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtN3;
    private javax.swing.JTextField txtN4;
    private javax.swing.JTextField txtN5;
    private javax.swing.JTextField txtN6;
    private javax.swing.JTextField txtN7;
    private javax.swing.JTextField txtN8;
    // End of variables declaration//GEN-END:variables
}
