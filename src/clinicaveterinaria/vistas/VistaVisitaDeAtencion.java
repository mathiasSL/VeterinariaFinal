package clinicaveterinaria.vistas;

import clinicaveterinaria.Conexion;
import clinicaveterinaria.Mascota;
import clinicaveterinaria.MascotaData;
import clinicaveterinaria.Tratamiento;
import clinicaveterinaria.VisitaDeAtencion;
import clinicaveterinaria.VisitaDeAtencionData;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaVisitaDeAtencion extends javax.swing.JFrame {
private VisitaDeAtencionData visitaData;
private Conexion conexion;
private MascotaData mascotaData;
    public VistaVisitaDeAtencion() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        visitaData = new VisitaDeAtencionData(conexion);
        mascotaData = new MascotaData(conexion);
      
       } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaVisitaDeAtencion.class.getName()).log(Level.SEVERE, null, ex);
    } 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfIdVisita = new javax.swing.JTextField();
        tfIdMascota = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        tfPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPesoPromedio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfDescripcion = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfImporteTotal = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfIdTratamiento = new javax.swing.JTextField();
        tfNombreTratamiento = new javax.swing.JTextField();
        jbSeleccionar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visita de atencion");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setText("id Visita :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setText("id Mascota :");

        tfIdVisita.setEditable(false);
        tfIdVisita.setEnabled(false);

        tfIdMascota.setEditable(false);
        tfIdMascota.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tfIdVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfIdVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 330, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(204, 204, 204)));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel4.setText("Fecha :");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel5.setText("Peso :");

        tfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPesoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel7.setText("Peso Promedio :");

        tfPesoPromedio.setEditable(false);
        tfPesoPromedio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tfPesoPromedio.setForeground(new java.awt.Color(255, 0, 0));
        tfPesoPromedio.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel10.setText("Descripcion :");

        tfDescripcion.setEditable(false);
        jScrollPane2.setViewportView(tfDescripcion);

        jPanel4.setBackground(new java.awt.Color(239, 239, 239));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel9.setText("IMPORTE TOTAL");

        tfImporteTotal.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        tfImporteTotal.setForeground(new java.awt.Color(102, 153, 0));
        tfImporteTotal.setCaretColor(new java.awt.Color(255, 0, 0));
        tfImporteTotal.setEnabled(false);
        jScrollPane1.setViewportView(tfImporteTotal);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("$");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel8.setText("Tratamiento :");

        tfIdTratamiento.setEditable(false);
        tfIdTratamiento.setEnabled(false);

        tfNombreTratamiento.setEditable(false);

        jbSeleccionar.setBackground(new java.awt.Color(204, 204, 204));
        jbSeleccionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbSeleccionar.setText("Seleccionar Tratamiento o servicio");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tfIdTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombreTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbSeleccionar)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfNombreTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 620, 310));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario imagen.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 150, 150));

        jbModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Modificar.jpg"))); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 60, 50));

        jbGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 153, 0));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Guardar.jpg"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 60, 50));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setForeground(new java.awt.Color(204, 204, 204));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico volver.jpg"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 60, -1));

        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Home.jpg"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vista Visita de atencion.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed

            VistaPrincipal vmm=new VistaPrincipal();
            vmm.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       if(tfIdTratamiento.getText().isEmpty()||dcFecha.getDate()==null||tfPeso.getText().isEmpty()||tfImporteTotal.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Faltan completar campo/s","", JOptionPane.ERROR_MESSAGE);
       }else{
          
           int idTratamiento = Integer.parseInt(tfIdTratamiento.getText());
        Tratamiento tratamiento = visitaData.buscarTratamiento(idTratamiento);
        int idMascota= Integer.parseInt(tfIdMascota.getText());
        
        Mascota mascota = visitaData.buscarMascota(idMascota);
        String date = new SimpleDateFormat("dd/MM/yyyy").format(dcFecha.getDate());
        LocalDate fecha= LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        double peso = Double.parseDouble(tfPeso.getText());
        double importe = Double.parseDouble(tfImporteTotal.getText());
        
        VisitaDeAtencion visita = new VisitaDeAtencion(tratamiento,mascota,fecha,peso,importe);
        visitaData.guardarVisita(visita);
        
        //SETEA FORMATO AL PESO PROMEDIO PARA QUE NO DE CON MAS DE 2 DIGITOS DESPUES DEL PUNTO
        //ACTUALIZA EL PESO DE LA MASCOTA CON EL PESO YA PROMEDIADO.
        DecimalFormat formato = new DecimalFormat("#.##");
        double aux = visitaData.obtenerPesoPromedio(idMascota);
        String pesoFormateado = formato.format(aux);
        String x = pesoFormateado.replaceAll(",", ".");
        mascota.setPesoMedio(Double.parseDouble(x));
        mascotaData.actualizarPeso(mascota);
        tfPesoPromedio.setText(""+pesoFormateado);
        //////////////////////////////////////////////////////////////////////////////////////
        
        tfIdVisita.setText(visita.getIdVisita()+"");
       
       JOptionPane.showMessageDialog(null,"Visita guardada correctamente");
       jbGuardar.setEnabled(false);
       }
       
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       if(tfIdVisita.getText().isEmpty()||tfIdMascota.getText().isEmpty()||tfIdTratamiento.getText().isEmpty()||dcFecha.getDate()==null||tfPeso.getText().isEmpty()||tfImporteTotal.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Faltan completar campo/s","", JOptionPane.ERROR_MESSAGE);
       }else{ 
        int idVisita = Integer.parseInt(tfIdVisita.getText());
        int idTratamiento = Integer.parseInt(tfIdTratamiento.getText());
        Tratamiento tratamiento = visitaData.buscarTratamiento(idTratamiento);
        int idMascota= Integer.parseInt(tfIdMascota.getText());
        Mascota mascota = visitaData.buscarMascota(idMascota);
        String date = new SimpleDateFormat("dd/MM/yyyy").format(dcFecha.getDate());
        LocalDate fecha= LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        double peso = Double.parseDouble(tfPeso.getText());
        double importe = Double.parseDouble(tfImporteTotal.getText());
           
        VisitaDeAtencion visita=new VisitaDeAtencion();
        visita.setIdVisita(idVisita);
        visita.setTratamiento(tratamiento);
        visita.setMascota(mascota);
        visita.setFechaDeVisita(fecha);
        visita.setPesoMascota(peso);
        visita.setImporteTotal(importe);
        visitaData.actualizarVisita(visita);
        
        //SETEA FORMATO AL PESO PROMEDIO PARA QUE NO DE CON MAS DE 2 DIGITOS DESPUES DEL PUNTO
        //ACTUALIZA EL PESO DE LA MASCOTA CON EL PESO YA PROMEDIADO.
        DecimalFormat formato = new DecimalFormat("#.##");
        double aux = visitaData.obtenerPesoPromedio(idMascota);
        String pesoFormateado = formato.format(aux);
        String x = pesoFormateado.replaceAll(",", ".");
        mascota.setPesoMedio(Double.parseDouble(x));
        mascotaData.actualizarPeso(mascota);
        tfPesoPromedio.setText(""+pesoFormateado);
        ///////////////////////////////////////////////////////////////////////////////////////
        
       JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
       }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
   
        VistaSeleccionarTratamiento vst = new VistaSeleccionarTratamiento();
        vst.tfIdMascota.setText(tfIdMascota.getText());
        vst.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    
    private void tfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesoKeyTyped
        
        char caracter = evt.getKeyChar();
        if ((caracter<'0' || caracter>'9') && (caracter != '\b') && (caracter<'.' || caracter>'.')) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar numeros");
        }   
    }//GEN-LAST:event_tfPesoKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaMascotasPorDueño vmpd = new VistaMascotasPorDueño();
        vmpd.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVisitaDeAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVisitaDeAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVisitaDeAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVisitaDeAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVisitaDeAtencion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    public com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCerrar;
    public javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    public javax.swing.JButton jbSeleccionar;
    public javax.swing.JTextPane tfDescripcion;
    public javax.swing.JTextField tfIdMascota;
    public javax.swing.JTextField tfIdTratamiento;
    public javax.swing.JTextField tfIdVisita;
    public javax.swing.JTextPane tfImporteTotal;
    public javax.swing.JTextField tfNombreTratamiento;
    public javax.swing.JTextField tfPeso;
    public javax.swing.JTextField tfPesoPromedio;
    // End of variables declaration//GEN-END:variables
}
