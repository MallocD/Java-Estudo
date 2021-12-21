/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telavetor;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author jovi3
 */
public class TelaVetor extends javax.swing.JFrame {
    
    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    /**
     * Creates new form TelaVetor
     */
    public TelaVetor() {
        initComponents();
         for (int c= 0; c<vetor.length;c++){
           lista.addElement(vetor[c]);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spinV = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRem = new javax.swing.JButton();
        btnOrden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstV = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRem.setText("Remover");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });

        btnOrden.setText("Ordenar");
        btnOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenActionPerformed(evt);
            }
        });

        jLabel1.setText("Vetor");

        lblSe.setText("[0]");

        lstV.setModel(lista);
        lstV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnOrden)
                    .addComponent(btnRem))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblSe))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnRem)
                        .addGap(41, 41, 41)
                        .addComponent(btnOrden))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenActionPerformed
       Arrays.sort(vetor);
       lista.removeAllElements();
       for (int c= 0; c<vetor.length;c++){
           lista.addElement(vetor[c]);
       }
                
    }//GEN-LAST:event_btnOrdenActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       vetor[selecionado]= Integer.parseInt(spinV.getValue().toString());
       lista.removeAllElements();
       for (int c= 0; c<vetor.length;c++){
           lista.addElement(vetor[c]);
       }
    }//GEN-LAST:event_btnAddActionPerformed

    private void lstVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVMouseClicked
        selecionado = lstV.getSelectedIndex();
        lblSe.setText("[" + selecionado + "]");
    }//GEN-LAST:event_lstVMouseClicked

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
        vetor[selecionado] = 0;
        lista.removeAllElements();
        for (int c = 0;c<vetor.length;c++){
            lista.addElement(vetor[c]);}
    }//GEN-LAST:event_btnRemActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrden;
    private javax.swing.JButton btnRem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSe;
    private javax.swing.JList<String> lstV;
    private javax.swing.JSpinner spinV;
    // End of variables declaration//GEN-END:variables
}