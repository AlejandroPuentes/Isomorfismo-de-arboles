/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolessimi;

import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class arbolesS extends javax.swing.JFrame {

    Arbol Arbol_A;
    Arbol Arbol_B;
    Hilo can1;
    int Ladot=0;
    public arbolesS() {
        initComponents();
        Arbol_A = new Arbol();
        Arbol_B = new Arbol();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lado = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArbolA = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ArbolB = new javax.swing.JPanel();
        AgregaA = new javax.swing.JButton();
        AgregaB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ReciA = new javax.swing.JTextField();
        ReciB = new javax.swing.JTextField();
        MuestraAr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        izq = new javax.swing.JRadioButton();
        der = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ArbolA.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout ArbolALayout = new javax.swing.GroupLayout(ArbolA);
        ArbolA.setLayout(ArbolALayout);
        ArbolALayout.setHorizontalGroup(
            ArbolALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        ArbolALayout.setVerticalGroup(
            ArbolALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ArbolA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 315, 270));

        javax.swing.GroupLayout ArbolBLayout = new javax.swing.GroupLayout(ArbolB);
        ArbolB.setLayout(ArbolBLayout);
        ArbolBLayout.setHorizontalGroup(
            ArbolBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        ArbolBLayout.setVerticalGroup(
            ArbolBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(ArbolB);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 40, 323, 270));

        AgregaA.setText("Agregar A");
        AgregaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregaAActionPerformed(evt);
            }
        });
        getContentPane().add(AgregaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        AgregaB.setText("Agregar B");
        getContentPane().add(AgregaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel1.setText("A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 18, 54, -1));

        jLabel2.setText("B");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1462, 18, 36, -1));
        getContentPane().add(ReciA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 36, -1));
        getContentPane().add(ReciB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 33, -1));
        getContentPane().add(MuestraAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 240, -1));

        jLabel3.setText("El Arbol es:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 94, -1));

        Lado.add(izq);
        izq.setText("Izquierda");
        izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izqActionPerformed(evt);
            }
        });
        getContentPane().add(izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        Lado.add(der);
        der.setText("Derecha");
        der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derActionPerformed(evt);
            }
        });
        getContentPane().add(der, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 80, -1));

        jLabel4.setText("B");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregaAActionPerformed
        int valor = Integer.parseInt(ReciA.getText());
        Arbol_A.insertar(valor, Ladot);
        can1 = new Hilo(this);
        can1.iniciar();
    }//GEN-LAST:event_AgregaAActionPerformed

    private void izqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izqActionPerformed
        Ladot = 2;
    }//GEN-LAST:event_izqActionPerformed

    private void derActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derActionPerformed
       Ladot = 1;
    }//GEN-LAST:event_derActionPerformed

    public Arbol getArbol_A() {
        return Arbol_A;
    }

    public Arbol getArbol_B() {
        return Arbol_B;
    }

    public JPanel getArbolA() {
        return ArbolA;
    }

    public JPanel getArbolB() {
        return ArbolB;
    }
    
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
            java.util.logging.Logger.getLogger(arbolesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arbolesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arbolesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arbolesS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arbolesS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregaA;
    private javax.swing.JButton AgregaB;
    private javax.swing.JPanel ArbolA;
    private javax.swing.JPanel ArbolB;
    public javax.swing.ButtonGroup Lado;
    private javax.swing.JTextField MuestraAr;
    private javax.swing.JTextField ReciA;
    private javax.swing.JTextField ReciB;
    private javax.swing.JRadioButton der;
    private javax.swing.JRadioButton izq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
