package clinicaveterinaria.vistas;

import clinicaveterinaria.Cliente;
import clinicaveterinaria.ClienteData;
import clinicaveterinaria.Conexion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaClienteRegistro extends javax.swing.JFrame {
   private Conexion conexion;
   private ClienteData clienteData;
   private ArrayList<Cliente> listaClientes;
  
    public VistaClienteRegistro() {
        initComponents();
        try {
                conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", ""); 
                clienteData = new ClienteData(conexion);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VistaClienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
                }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfBuscarDni = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfPersonaAlternativa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbMisMascotas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        portada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de clientes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel7.setText("Busqueda por D.N.I");

        tfBuscarDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarDniKeyTyped(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Lupa.jpg"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(tfBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(tfBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 430, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel1.setText("Nombre :");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel5.setText("Telefono :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setText("D.N.I :");

        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel4.setText("Domicilio :");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setText("Apellido :");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel6.setText("Persona Alternativa :");

        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDniKeyTyped(evt);
            }
        });

        tfId.setEditable(false);
        tfId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfId.setEnabled(false);
        tfId.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPersonaAlternativa))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPersonaAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 430, 370));

        jbModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Modificar.jpg"))); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 60, 50));

        jbBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico Borrar.jpg"))); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 60, 50));

        jbLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Limpiar.jpg"))); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 60, 50));

        jbGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Guardar.jpg"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 60, -1));

        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Home.jpg"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 60, 50));

        jbMisMascotas.setBackground(new java.awt.Color(204, 204, 255));
        jbMisMascotas.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jbMisMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono pata.jpg"))); // NOI18N
        jbMisMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMisMascotasActionPerformed(evt);
            }
        });
        getContentPane().add(jbMisMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 110, -1));

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel8.setText("       Ver Mascotas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 110, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interfaz Registro Clientes.jpg"))); // NOI18N
        getContentPane().add(portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarDniKeyTyped

        char caracter = evt.getKeyChar();
        if ((caracter<'0' || caracter>'9') && (caracter != '\b')) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar numeros");
        }
    }//GEN-LAST:event_tfBuscarDniKeyTyped

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        listaClientes = clienteData.buscarClientePorDni(tfBuscarDni.getText());
        if(!listaClientes.isEmpty()){
            for(Cliente m:listaClientes){
                tfId.setText(m.getIdCliente()+"");
                tfDni.setText(m.getDni());
                tfApellido.setText(m.getApellido());
                tfNombre.setText(m.getNombre());
                tfDireccion.setText(m.getDireccion());
                tfTelefono.setText(m.getTelefono());
                tfPersonaAlternativa.setText(m.getPersonaAlternativa());}
        }else{
            int decision = JOptionPane.showConfirmDialog(null,"El cliente no existe, ¿desea crearlo?","Registro Cliente",JOptionPane.YES_NO_OPTION);
            if(decision == 0){
                tfDni.setText(tfBuscarDni.getText());
                tfBuscarDni.setText("");
            }
            if(decision == 1){
                tfBuscarDni.setText("");
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void tfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyTyped

        char caracter = evt.getKeyChar();
        if ((caracter<'0' || caracter>'9') && (caracter != '\b')) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar numeros");
        }
    }//GEN-LAST:event_tfTelefonoKeyTyped

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped

        char caracter = evt.getKeyChar();
        if ((caracter<'0' || caracter>'9') && (caracter != '\b')) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar numeros");
        }
    }//GEN-LAST:event_tfDniKeyTyped

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String dni = tfDni.getText();
        String direccion = tfDireccion.getText();
        String telefono = tfTelefono.getText();
        String personaAlternativa = tfPersonaAlternativa.getText();

        if (dniNoDisponible(dni) == true) {
            JOptionPane.showMessageDialog(null,"El dni ingresado ya se encuentra en uso","Dni no disponible", JOptionPane.ERROR_MESSAGE);
        }

        else {

            if(dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || personaAlternativa.isEmpty()){
                JOptionPane.showMessageDialog(null,"Faltan completar campo/s","Guardar Cliente", JOptionPane.ERROR_MESSAGE);}
            else{
                Cliente cliente = new Cliente(nombre,apellido,dni,direccion,telefono,personaAlternativa);
                clienteData.guardarCliente(cliente);
                JOptionPane.showMessageDialog(rootPane, "Cliente guardado correctamente");

            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if(tfBuscarDni.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Buscar o crear nuevo cliente","Error", JOptionPane.ERROR_MESSAGE);
        }else{
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String dni = tfDni.getText();
            String direccion = tfDireccion.getText();
            String telefono = tfTelefono.getText();
            String personaAlternativa = tfPersonaAlternativa.getText();
            if(nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || direccion.isEmpty() || telefono.isEmpty()){
                JOptionPane.showMessageDialog(null,"Faltan completar campo/s","Actualizar Cliente", JOptionPane.ERROR_MESSAGE);}
            else{
                Cliente cliente=new Cliente(Integer.parseInt(tfId.getText()),nombre,apellido,dni,direccion,telefono,personaAlternativa);
                clienteData.actualizarCliente(cliente);

                JOptionPane.showMessageDialog(null,"Datos del cliente actualizado");
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        if(tfId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"ID invalida","Borrar cliente", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int id = Integer.parseInt(tfId.getText());
            clienteData.borrarCliente(id);
            JOptionPane.showMessageDialog(null,"Se elimina cliente y mascotas asociadas");
            tfBuscarDni.setText("");
            tfId.setText("");
            tfDni.setText("");
            tfApellido.setText("");
            tfNombre.setText("");
            tfDireccion.setText("");
            tfTelefono.setText("");
            tfPersonaAlternativa.setText("");
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        tfBuscarDni.setText("");
        tfId.setText("");
        tfDni.setText("");
        tfApellido.setText("");
        tfNombre.setText("");
        tfDireccion.setText("");
        tfTelefono.setText("");
        tfPersonaAlternativa.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed

        VistaPrincipal vistap = new VistaPrincipal();
        vistap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbMisMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMisMascotasActionPerformed

        if(tfId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Primero busque un cliente","", JOptionPane.ERROR_MESSAGE);}
        else{VistaMascotasPorDueño vmpd = new VistaMascotasPorDueño();
            vmpd.tfIdCliente.setText(tfId.getText());
            vmpd.cargaDatos();
            vmpd.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_jbMisMascotasActionPerformed

    
    public boolean dniNoDisponible(String dni){
     ArrayList<String> dnis = new ArrayList();  
     dnis = clienteData.obtenerListaDeDnis(); 
     
     for (String x:dnis){
         if(x.equals(dni)){
             return true;
         }
     }
            return false;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaClienteRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaClienteRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaClienteRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaClienteRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaClienteRegistro().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbMisMascotas;
    private javax.swing.JButton jbModificar;
    private javax.swing.JLabel portada;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfBuscarDni;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPersonaAlternativa;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
