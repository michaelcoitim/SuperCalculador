/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producao;

import java.awt.Color;

/**
 *
 * @author Michael Coitim
 */
public class Calculador extends javax.swing.JFrame {

    /**
     * Creates new form Calculador
     */
    public Calculador() {
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

        jLabel1 = new javax.swing.JLabel();
        btncalc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vValor = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblResDiv = new javax.swing.JLabel();
        lblResCubo = new javax.swing.JLabel();
        lblResQuadado = new javax.swing.JLabel();
        lblResRaizCubica = new javax.swing.JLabel();
        lblResAbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(27, 27, 27));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 154, -1, -1));

        btncalc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncalc.setForeground(new java.awt.Color(0, 0, 153));
        btncalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btncalc.jpg"))); // NOI18N
        btncalc.setText("Calcular");
        btncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcActionPerformed(evt);
            }
        });
        getContentPane().add(btncalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 62, 154, 66));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Super Calculadora");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Informe um valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 62, -1, -1));

        vValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vValor.setModel(new javax.swing.SpinnerNumberModel());
        getContentPane().add(vValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 59, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Resto da Divis??o por 2 ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 145, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Elevado ao Cubo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 178, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Raiz Quadrada");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Raiz C??bica");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 244, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Valor Abisoluto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 277, -1, -1));

        lblResDiv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResDiv.setForeground(new java.awt.Color(204, 204, 204));
        lblResDiv.setText("0");
        getContentPane().add(lblResDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 145, 130, -1));

        lblResCubo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResCubo.setForeground(new java.awt.Color(204, 204, 204));
        lblResCubo.setText("0");
        getContentPane().add(lblResCubo, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 178, 120, -1));

        lblResQuadado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResQuadado.setForeground(new java.awt.Color(204, 204, 204));
        lblResQuadado.setText("0");
        getContentPane().add(lblResQuadado, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 211, 110, -1));

        lblResRaizCubica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResRaizCubica.setForeground(new java.awt.Color(204, 204, 204));
        lblResRaizCubica.setText("0");
        getContentPane().add(lblResRaizCubica, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 244, 130, -1));

        lblResAbs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResAbs.setForeground(new java.awt.Color(204, 204, 204));
        lblResAbs.setText("0");
        getContentPane().add(lblResAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 277, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcActionPerformed
        
        double valor = Double.parseDouble(vValor.getValue().toString());
        // resto da divis??o
        lblResDiv.setText(Double.toString(valor % 2));
        lblResDiv.setForeground(Color.blue);
        // elevado ao cubo
        lblResCubo.setText(Double.toString(Math.pow( valor,3)));
        lblResCubo.setForeground(Color.blue);
        //raiz quadrada       
        lblResQuadado.setText(String.format ("%.2f",(Math.sqrt(valor))));
        lblResQuadado.setForeground(Color.blue);
        // raiz c??bica
        lblResRaizCubica.setText(String.format("%.2f", (Math.cbrt(valor))));
        lblResRaizCubica.setForeground(Color.blue);
        // valor abs 
        lblResAbs.setText(Double.toString(Math.abs(valor)));
        lblResAbs.setForeground(Color.blue);
    }//GEN-LAST:event_btncalcActionPerformed

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
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblResAbs;
    private javax.swing.JLabel lblResCubo;
    private javax.swing.JLabel lblResDiv;
    private javax.swing.JLabel lblResQuadado;
    private javax.swing.JLabel lblResRaizCubica;
    private javax.swing.JSpinner vValor;
    // End of variables declaration//GEN-END:variables
}
