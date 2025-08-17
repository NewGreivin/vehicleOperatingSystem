/**
 * @author Greivin
 */
package GUI;

import Core.Simuladores.Simulador;
import Subsistemas.Transmicion.PedalAcelerador;
import Subsistemas.Transmicion.PedalFreno;
import Subsistemas.Transmicion.PosicionTransmision;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FrmVehiculo extends javax.swing.JFrame {
    
    private Simulador simulador;
    private PedalAcelerador acelerador;
    private PedalFreno freno;
    private boolean estaAcelerando = false;
    private boolean estaFrenando = false;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmVehiculo.class.getName());
    
    public FrmVehiculo() {
        initComponents();
         SpinnerMarchas.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            Object valor = SpinnerMarchas.getValue();
            CambiarMarchas(valor);
        }
    });
        simulador = new Simulador();
        acelerador = new PedalAcelerador(simulador.getVehiculo().getMotor());
        freno = new PedalFreno(simulador.getVehiculo().getMotor());
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        Iniciarlbl();
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktopvehiculo = new javax.swing.JDesktopPane();
        panelPrincipal = new javax.swing.JPanel();
        panelSecundario = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        btnEnergia = new javax.swing.JButton();
        btnLimpiaParabrisas = new javax.swing.JButton();
        btnMotor = new javax.swing.JToggleButton();
        btnClimatizacion = new javax.swing.JButton();
        btnAlarma = new javax.swing.JButton();
        btnLuces = new javax.swing.JButton();
        panelInferior = new javax.swing.JPanel();
        lblAcelerador = new javax.swing.JLabel();
        lblFreno = new javax.swing.JLabel();
        btnAcelerador = new javax.swing.JButton();
        btnFreno = new javax.swing.JButton();
        SpinnerMarchas = new javax.swing.JSpinner();
        panelTableroDigital = new javax.swing.JPanel();
        lblTituloTablero = new javax.swing.JLabel();
        lblKm = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        lblRPM = new javax.swing.JLabel();
        btnFrenoManoOFF = new javax.swing.JButton();
        btnFrenoManoON = new javax.swing.JButton();
        btnReverseOFF = new javax.swing.JButton();
        btnReverseON = new javax.swing.JButton();
        lblFrenoMano = new javax.swing.JLabel();
        lblReverseSensor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Vehiculo");
        setResizable(false);

        Desktopvehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelPrincipal.setBackground(new java.awt.Color(15, 15, 15));

        panelSecundario.setBackground(new java.awt.Color(15, 15, 15));
        panelSecundario.setMinimumSize(new java.awt.Dimension(0, 1));
        panelSecundario.setLayout(new java.awt.BorderLayout(1, 1));

        panelSuperior.setBackground(new java.awt.Color(30, 30, 30));
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/IndicadorGasolina.png"))); // NOI18N
        btnEnergia.setBorderPainted(false);
        btnEnergia.setContentAreaFilled(false);
        btnEnergia.setFocusPainted(false);
        btnEnergia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/IndicadorGasolina2.png"))); // NOI18N
        btnEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnergiaActionPerformed(evt);
            }
        });
        panelSuperior.add(btnEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 80, 70));

        btnLimpiaParabrisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/OFFLimpiaParabrisas.png"))); // NOI18N
        btnLimpiaParabrisas.setBorderPainted(false);
        btnLimpiaParabrisas.setContentAreaFilled(false);
        btnLimpiaParabrisas.setFocusPainted(false);
        btnLimpiaParabrisas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/OFFLimpiaParabrisas.png"))); // NOI18N
        btnLimpiaParabrisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaParabrisasActionPerformed(evt);
            }
        });
        panelSuperior.add(btnLimpiaParabrisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 100, 90));

        btnMotor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnMotor.setForeground(new java.awt.Color(255, 255, 255));
        btnMotor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonApagado1.png"))); // NOI18N
        btnMotor.setText("<html>MOTOR<br>ENCENDER<br>APAGAR</html>");
        btnMotor.setBorderPainted(false);
        btnMotor.setContentAreaFilled(false);
        btnMotor.setFocusPainted(false);
        btnMotor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMotor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonTranscision.png"))); // NOI18N
        btnMotor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonEncendido1.png"))); // NOI18N
        btnMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotorActionPerformed(evt);
            }
        });
        panelSuperior.add(btnMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 100));

        btnClimatizacion.setBackground(new java.awt.Color(255, 255, 255));
        btnClimatizacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnClimatizacion.setForeground(new java.awt.Color(255, 255, 255));
        btnClimatizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonApagado1.png"))); // NOI18N
        btnClimatizacion.setText("<html>Climatiacion/<br>Radio</html>");
        btnClimatizacion.setBorderPainted(false);
        btnClimatizacion.setContentAreaFilled(false);
        btnClimatizacion.setFocusPainted(false);
        btnClimatizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClimatizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonTranscision.png"))); // NOI18N
        btnClimatizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClimatizacionActionPerformed(evt);
            }
        });
        panelSuperior.add(btnClimatizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        btnAlarma.setBackground(new java.awt.Color(255, 255, 255));
        btnAlarma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlarma.setForeground(new java.awt.Color(255, 255, 255));
        btnAlarma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonApagado1.png"))); // NOI18N
        btnAlarma.setText("Alarma");
        btnAlarma.setBorderPainted(false);
        btnAlarma.setContentAreaFilled(false);
        btnAlarma.setFocusPainted(false);
        btnAlarma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlarma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonTranscision.png"))); // NOI18N
        btnAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmaActionPerformed(evt);
            }
        });
        panelSuperior.add(btnAlarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        btnLuces.setBackground(new java.awt.Color(255, 255, 255));
        btnLuces.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLuces.setForeground(new java.awt.Color(255, 255, 255));
        btnLuces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonApagado1.png"))); // NOI18N
        btnLuces.setText("Luces");
        btnLuces.setBorderPainted(false);
        btnLuces.setContentAreaFilled(false);
        btnLuces.setFocusPainted(false);
        btnLuces.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLuces.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/BotonTranscision.png"))); // NOI18N
        btnLuces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLucesActionPerformed(evt);
            }
        });
        panelSuperior.add(btnLuces, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        panelSecundario.add(panelSuperior, java.awt.BorderLayout.CENTER);

        panelInferior.setBackground(new java.awt.Color(30, 30, 30));
        panelInferior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAcelerador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAcelerador.setForeground(new java.awt.Color(255, 255, 255));
        lblAcelerador.setText("Acelerador");
        panelInferior.add(lblAcelerador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 106, -1));

        lblFreno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFreno.setForeground(new java.awt.Color(255, 255, 255));
        lblFreno.setText("Freno");
        panelInferior.add(lblFreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        btnAcelerador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/PedalAcelerador.png"))); // NOI18N
        btnAcelerador.setBorderPainted(false);
        btnAcelerador.setContentAreaFilled(false);
        btnAcelerador.setFocusPainted(false);
        btnAcelerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceleradorActionPerformed(evt);
            }
        });
        panelInferior.add(btnAcelerador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 136));

        btnFreno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/PedalAcelerador.png"))); // NOI18N
        btnFreno.setBorderPainted(false);
        btnFreno.setContentAreaFilled(false);
        btnFreno.setFocusPainted(false);
        btnFreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenoActionPerformed(evt);
            }
        });
        panelInferior.add(btnFreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 179));

        SpinnerMarchas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SpinnerMarchas.setModel(new javax.swing.SpinnerListModel(new String[] {"PARKING", "REVERSE", "NEUTRO", "DRIVE"}));
        SpinnerMarchas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SpinnerMarchas.setName(""); // NOI18N
        panelInferior.add(SpinnerMarchas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 134, -1));

        panelTableroDigital.setBackground(new java.awt.Color(30, 30, 30));
        panelTableroDigital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        lblTituloTablero.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloTablero.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTablero.setText("TableroDigital");

        lblKm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKm.setForeground(new java.awt.Color(0, 204, 0));
        lblKm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKm.setText("Kilometraje: 0.0 km");

        lblVelocidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVelocidad.setForeground(new java.awt.Color(0, 204, 0));
        lblVelocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVelocidad.setText("Velocidad: 0 km/h");

        lblRPM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRPM.setForeground(new java.awt.Color(0, 204, 0));
        lblRPM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRPM.setText("RPM: 0");

        javax.swing.GroupLayout panelTableroDigitalLayout = new javax.swing.GroupLayout(panelTableroDigital);
        panelTableroDigital.setLayout(panelTableroDigitalLayout);
        panelTableroDigitalLayout.setHorizontalGroup(
            panelTableroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableroDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloTablero, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(lblVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelTableroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTableroDigitalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblKm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelTableroDigitalLayout.setVerticalGroup(
            panelTableroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableroDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloTablero)
                .addGap(73, 73, 73)
                .addComponent(lblVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRPM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(panelTableroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTableroDigitalLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(lblKm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        panelInferior.add(panelTableroDigital, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        btnFrenoManoOFF.setText("<html>Desactivar<br>Freno<br>Mano</html>");
        btnFrenoManoOFF.setToolTipText("");
        btnFrenoManoOFF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrenoManoOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenoManoOFFActionPerformed(evt);
            }
        });
        panelInferior.add(btnFrenoManoOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 80, -1));

        btnFrenoManoON.setText("<html>Activar<br>Freno<br>Mano</html>");
        btnFrenoManoON.setToolTipText("");
        btnFrenoManoON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenoManoONActionPerformed(evt);
            }
        });
        panelInferior.add(btnFrenoManoON, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 80, -1));

        btnReverseOFF.setText("<html>Desactivar<br>Sensor<br>Reversa</html>");
        btnReverseOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseOFFActionPerformed(evt);
            }
        });
        panelInferior.add(btnReverseOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 80, -1));

        btnReverseON.setText("<html>Activar<br>Sensor<br>Reversa</html>");
        btnReverseON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseONActionPerformed(evt);
            }
        });
        panelInferior.add(btnReverseON, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 80, -1));

        lblFrenoMano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrenoMano.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFrenoMano.setOpaque(true);
        panelInferior.add(lblFrenoMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 50, 50));

        lblReverseSensor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReverseSensor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblReverseSensor.setOpaque(true);
        panelInferior.add(lblReverseSensor, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 50, 50));

        panelSecundario.add(panelInferior, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSecundario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        Desktopvehiculo.setLayer(panelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopvehiculoLayout = new javax.swing.GroupLayout(Desktopvehiculo);
        Desktopvehiculo.setLayout(DesktopvehiculoLayout);
        DesktopvehiculoLayout.setHorizontalGroup(
            DesktopvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopvehiculoLayout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        DesktopvehiculoLayout.setVerticalGroup(
            DesktopvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktopvehiculo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktopvehiculo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnergiaActionPerformed
        DlgEnergia dialogoEnergia = new DlgEnergia(null, true, simulador);
        dialogoEnergia.setLocationRelativeTo(null);
        dialogoEnergia.setVisible(true);
    }//GEN-LAST:event_btnEnergiaActionPerformed

    private void btnMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotorActionPerformed
        simulador.getVehiculo().getEncendido().alternarEncendido();
    }//GEN-LAST:event_btnMotorActionPerformed

    private void btnFrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenoActionPerformed
       estaFrenando = true;
       estaAcelerando = false;
    }//GEN-LAST:event_btnFrenoActionPerformed

    private void btnAceleradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceleradorActionPerformed
        estaAcelerando = true;
        estaFrenando = false;
    }//GEN-LAST:event_btnAceleradorActionPerformed

    private void btnClimatizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClimatizacionActionPerformed
        DlgClimatizacion alarma = new DlgClimatizacion(null, true, simulador);
        alarma.setLocationRelativeTo(null);
        alarma.setVisible(true);
    }//GEN-LAST:event_btnClimatizacionActionPerformed

    private void btnLimpiaParabrisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaParabrisasActionPerformed
        DlgLimpiaparabrisas dialogoParabrisas = new DlgLimpiaparabrisas(null, true, simulador);
        dialogoParabrisas.setLocationRelativeTo(null);
        dialogoParabrisas.setVisible(true);
    }//GEN-LAST:event_btnLimpiaParabrisasActionPerformed

    private void btnReverseOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseOFFActionPerformed
        simulador.getVehiculo().getSensores().getReversa().removerObstaculo();
        lblReverseSensor.setBackground(Color.RED);    
    }//GEN-LAST:event_btnReverseOFFActionPerformed

    private void btnFrenoManoOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenoManoOFFActionPerformed
        simulador.getVehiculo().getSensores().getFrenoMano().quitarFreno();
        lblFrenoMano.setBackground(Color.RED);    
    }//GEN-LAST:event_btnFrenoManoOFFActionPerformed

    private void btnFrenoManoONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenoManoONActionPerformed
       simulador.getVehiculo().getSensores().getFrenoMano().ponerFreno();
       lblFrenoMano.setBackground(Color.GREEN);    
    }//GEN-LAST:event_btnFrenoManoONActionPerformed

    private void btnReverseONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseONActionPerformed
        simulador.getVehiculo().getSensores().getReversa().ponerObstaculo();
         lblReverseSensor.setBackground(Color.GREEN); 
    }//GEN-LAST:event_btnReverseONActionPerformed

    private void btnAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmaActionPerformed
        DlgAlarma alarma = new DlgAlarma(null, true, simulador);
        alarma.setLocationRelativeTo(null);
        alarma.setVisible(true);
    }//GEN-LAST:event_btnAlarmaActionPerformed

    private void btnLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLucesActionPerformed
        DlgLuces luces = new DlgLuces(null, true, simulador);
        luces.setLocationRelativeTo(null);
        luces.setVisible(true);
    }//GEN-LAST:event_btnLucesActionPerformed

    private void Iniciarlbl() {
        lblFrenoMano.setBackground(Color.GREEN);    
        lblReverseSensor.setBackground(Color.RED);     
        
    }
        Timer timer = new Timer (1000, new ActionListener(){      
        @Override
        public void actionPerformed(ActionEvent e) {
            iniciarTimer();
        }
     });
    
    
       private void iniciarTimer() {
           
            if (estaAcelerando) {
                acelerador.presionar();
            } else if (estaFrenando) {
                freno.presionar();
            }

            simulador.getVehiculo().getTransmision().actualizarVelocidad();

            // Actualiza kilometraje si el carro se mueve
            int velocidadActual = simulador.getVehiculo().getTransmision().getVelocidad();
            if (velocidadActual > 0) {
                double kmPorSegundo = velocidadActual / 3600.0;
                double kmCada900ms = kmPorSegundo * 0.9;
                simulador.getVehiculo().getKilometraje().getOdometro().setAddkmRecorridos(kmCada900ms);
            }

            int rpm = simulador.getVehiculo().getKilometraje().getTacometro().getMotorRevoluciones();
            double km = simulador.getVehiculo().getKilometraje().getOdometro().getkmRecorridos();

            lblRPM.setText("RPM: " + rpm);
            lblVelocidad.setText("Velocidad: " + velocidadActual + " km/h");
            lblKm.setText("Kilometraje: " + String.format("%.2f", km) + " km");
    }

    private void CambiarMarchas(Object valor) {
    if (valor instanceof String) {
        String marcha = (String) valor;
        if (marcha.equals("DRIVE")) {
            simulador.getVehiculo().getTransmision().setPosicion(PosicionTransmision.DRIVE);
        } else if (marcha.equals("REVERSE")) {
            simulador.getVehiculo().getTransmision().setPosicion(PosicionTransmision.REVERSE);
        } else if (marcha.equals("NEUTRO")) {
            simulador.getVehiculo().getTransmision().setPosicion(PosicionTransmision.NEUTRO);
        } else if (marcha.equals("PARKING")) {
            simulador.getVehiculo().getTransmision().setPosicion(PosicionTransmision.PARKING);
        }
    }
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmVehiculo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktopvehiculo;
    private javax.swing.JSpinner SpinnerMarchas;
    private javax.swing.JButton btnAcelerador;
    private javax.swing.JButton btnAlarma;
    private javax.swing.JButton btnClimatizacion;
    private javax.swing.JButton btnEnergia;
    private javax.swing.JButton btnFreno;
    private javax.swing.JButton btnFrenoManoOFF;
    private javax.swing.JButton btnFrenoManoON;
    private javax.swing.JButton btnLimpiaParabrisas;
    private javax.swing.JButton btnLuces;
    private javax.swing.JToggleButton btnMotor;
    private javax.swing.JButton btnReverseOFF;
    private javax.swing.JButton btnReverseON;
    private javax.swing.JLabel lblAcelerador;
    private javax.swing.JLabel lblFreno;
    private javax.swing.JLabel lblFrenoMano;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblRPM;
    private javax.swing.JLabel lblReverseSensor;
    private javax.swing.JLabel lblTituloTablero;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSecundario;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelTableroDigital;
    // End of variables declaration//GEN-END:variables
}