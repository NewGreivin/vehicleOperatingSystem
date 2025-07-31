/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import Core.Simuladores.Simulador;

/**
 *
 * @author UTN
 */
public class DlgEnergia extends javax.swing.JDialog {
    private Simulador simulador;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DlgEnergia.class.getName());
    
    public DlgEnergia(java.awt.Frame parent, boolean modal, Simulador simulador) {
        super(parent, modal);
        this.simulador = simulador;
        initComponents();
        actualizarUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEnergia = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        barraEnergia = new javax.swing.JProgressBar();
        panelBotones = new javax.swing.JPanel();
        btnConsumir = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Energía");
        setPreferredSize(new java.awt.Dimension(350, 250));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        lblEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Energia: 100% (LLENO)");

        barraEnergia.setBackground(new java.awt.Color(204, 204, 204));
        barraEnergia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        barraEnergia.setForeground(new java.awt.Color(153, 204, 255));
        barraEnergia.setValue(100);
        barraEnergia.setName(""); // NOI18N
        barraEnergia.setPreferredSize(new java.awt.Dimension(100, 100));

        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsumir.setText("Consumir 15%");
        btnConsumir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumirActionPerformed(evt);
            }
        });
        panelBotones.add(btnConsumir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 120, -1));

        btnRecargar.setText("Recargar 10%");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        panelBotones.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, -1));

        javax.swing.GroupLayout panelEnergiaLayout = new javax.swing.GroupLayout(panelEnergia);
        panelEnergia.setLayout(panelEnergiaLayout);
        panelEnergiaLayout.setHorizontalGroup(
            panelEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        panelEnergiaLayout.setVerticalGroup(
            panelEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnergiaLayout.createSequentialGroup()
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelEnergia);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsumirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumirActionPerformed
        simulador.getVehiculo().getEnergia().consumirEnergia(15);
        actualizarUI();
    }//GEN-LAST:event_btnConsumirActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        simulador.getVehiculo().getEnergia().recargarEnergia(10);
        actualizarUI();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void actualizarUI() {
        lblEstado.setText(simulador.getVehiculo().getEnergia().estadoActual());
        barraEnergia.setValue(simulador.getVehiculo().getEnergia().getEnergiaActual());
    }

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Simulador simulador = new Simulador(); 
                DlgEnergia dialog = new DlgEnergia(new javax.swing.JFrame(), true, simulador);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraEnergia;
    private javax.swing.JButton btnConsumir;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelEnergia;
    // End of variables declaration//GEN-END:variables
}
