package clinicaveterinaria.vistas;


public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
       // panelTratamientos.setVisible(false);
      //  panelMascotas.setVisible(false);
        portada.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTratamientos = new javax.swing.JPanel();
        jbTratamientosActivos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        portada = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbMascota = new javax.swing.JButton();
        jbTratamientos = new javax.swing.JButton();
        jbRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbRegistrarTratamiento = new javax.swing.JButton();
        jbTratamientosActivos1 = new javax.swing.JButton();
        jLabelTratamientos = new javax.swing.JLabel();
        jbMascotasDueño = new javax.swing.JButton();
        jbMascotasTratamiento = new javax.swing.JButton();
        jlabelMascotas = new javax.swing.JLabel();

        panelTratamientos.setBackground(new java.awt.Color(0, 255, 204));

        jbTratamientosActivos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbTratamientosActivos.setText("Tratamiento Activos");
        jbTratamientosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTratamientosActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTratamientosLayout = new javax.swing.GroupLayout(panelTratamientos);
        panelTratamientos.setLayout(panelTratamientosLayout);
        panelTratamientosLayout.setHorizontalGroup(
            panelTratamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTratamientosLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jbTratamientosActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelTratamientosLayout.setVerticalGroup(
            panelTratamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTratamientosLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jbTratamientosActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proyecto Clinica Veterinaria");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Veterinaria 3.0");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("         Proyecto Clinica Veterinaria - Integrantes: Mathias Angel  Lucero, Laura Magali Lucero, Emmanuel Adrian Medina.    ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 630, 20));

        portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada.jpg"))); // NOI18N
        portada.setText("jLabel2");
        getContentPane().add(portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 500, 460));

        jPanel1.setBackground(new java.awt.Color(224, 224, 251));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbMascota.setBackground(new java.awt.Color(255, 255, 255));
        jbMascota.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico mascota.jpg"))); // NOI18N
        jbMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMascotaActionPerformed(evt);
            }
        });

        jbTratamientos.setBackground(new java.awt.Color(255, 255, 255));
        jbTratamientos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbTratamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tratamientos ico.jpg"))); // NOI18N
        jbTratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTratamientosActionPerformed(evt);
            }
        });

        jbRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jbRegistro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes_Btn.jpg"))); // NOI18N
        jbRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("  Registrar Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("    Mascotas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(" Tratamientos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbTratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbTratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 460));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Linea.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 690, 20));

        jbRegistrarTratamiento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbRegistrarTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro de tratamientos btn.jpg"))); // NOI18N
        jbRegistrarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarTratamientoActionPerformed(evt);
            }
        });
        getContentPane().add(jbRegistrarTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 74, 240, -1));

        jbTratamientosActivos1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbTratamientosActivos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tratamientos Activos btn .jpg"))); // NOI18N
        jbTratamientosActivos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTratamientosActivos1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbTratamientosActivos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 240, 90));

        jLabelTratamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tratamientos.jpg"))); // NOI18N
        jLabelTratamientos.setText("jLabel7");
        getContentPane().add(jLabelTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 500, 460));

        jbMascotasDueño.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbMascotasDueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar por dueño.jpg"))); // NOI18N
        jbMascotasDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMascotasDueñoActionPerformed(evt);
            }
        });
        getContentPane().add(jbMascotasDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 240, 90));

        jbMascotasTratamiento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbMascotasTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn Ver tratamientos o servicios realizados.jpg"))); // NOI18N
        jbMascotasTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMascotasTratamientoActionPerformed(evt);
            }
        });
        getContentPane().add(jbMascotasTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 240, 90));

        jlabelMascotas.setBackground(new java.awt.Color(255, 255, 255));
        jlabelMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada Mascotas.jpg"))); // NOI18N
        getContentPane().add(jlabelMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMascotaActionPerformed
        
       // panelTratamientos.setVisible(false);
        jLabelTratamientos.setVisible(false);
        portada.setVisible(false);
        jbRegistrarTratamiento.setVisible(false);
        jbTratamientosActivos1.setVisible(false);
        jlabelMascotas.setVisible(true);
       
    }//GEN-LAST:event_jbMascotaActionPerformed

    private void jbTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTratamientosActionPerformed
        // TODO add your handling code here:
        jLabelTratamientos.setVisible(true);
        jbRegistrarTratamiento.setVisible(true);
        jbTratamientosActivos1.setVisible(true);
        jlabelMascotas.setVisible(false);
        portada.setVisible(false);
    }//GEN-LAST:event_jbTratamientosActionPerformed

    private void jbRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistroActionPerformed

        VistaClienteRegistro vc = new VistaClienteRegistro();
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbRegistroActionPerformed

    private void jbTratamientosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTratamientosActivosActionPerformed

        VistaTratamientosActivos vta = new VistaTratamientosActivos();
        vta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbTratamientosActivosActionPerformed

    private void jbTratamientosActivos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTratamientosActivos1ActionPerformed

        VistaTratamientosActivos vta = new VistaTratamientosActivos();
        vta.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbTratamientosActivos1ActionPerformed

    private void jbRegistrarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarTratamientoActionPerformed

        VistaTratamientoRegistro vtr = new VistaTratamientoRegistro();
        vtr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbRegistrarTratamientoActionPerformed

    private void jbMascotasTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMascotasTratamientoActionPerformed

        VistaMascotasPorTratamiento vmpt = new VistaMascotasPorTratamiento();
        vmpt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbMascotasTratamientoActionPerformed

    private void jbMascotasDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMascotasDueñoActionPerformed

        VistaMascotasPorDueño vv = new VistaMascotasPorDueño();
        vv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbMascotasDueñoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTratamientos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbMascota;
    private javax.swing.JButton jbMascotasDueño;
    private javax.swing.JButton jbMascotasTratamiento;
    private javax.swing.JButton jbRegistrarTratamiento;
    private javax.swing.JButton jbRegistro;
    private javax.swing.JButton jbTratamientos;
    private javax.swing.JButton jbTratamientosActivos;
    private javax.swing.JButton jbTratamientosActivos1;
    private javax.swing.JLabel jlabelMascotas;
    private javax.swing.JPanel panelTratamientos;
    private javax.swing.JLabel portada;
    // End of variables declaration//GEN-END:variables
}
