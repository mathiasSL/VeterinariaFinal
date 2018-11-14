package clinicaveterinaria.vistas;

import clinicaveterinaria.Cliente;
import clinicaveterinaria.Conexion;
import clinicaveterinaria.Mascota;
import clinicaveterinaria.MascotaData;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaMascotaRegistro extends javax.swing.JFrame {
private MascotaData mascotaData;
private Conexion conexion;

    public VistaMascotaRegistro() {
        initComponents();
       try {
        conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        mascotaData = new MascotaData(conexion);
        
        
       } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaMascotaRegistro.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCerrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfAlias = new javax.swing.JTextField();
        tfRaza = new javax.swing.JTextField();
        tfPelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxEspecie = new javax.swing.JComboBox<>();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfIdMascota = new javax.swing.JTextField();
        tfIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RegistroMascotas_IMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de mascotas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico volver.jpg"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 60, -1));

        jbModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Modificar.jpg"))); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 60, 50));

        jbGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Guardar.jpg"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 60, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel4.setText("Raza :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel3.setText("Especie :");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel2.setText("Alias :");

        cbxSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra" }));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel7.setText("Color de Pelo :");

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel10.setText("Sexo :");

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento :");

        cbxEspecie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canino", "Felino", "Ave", "Roedor", "Conejo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfRaza))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPelo)
                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(cbxEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 580, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel11.setText("id Dueño :");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel6.setText("id Mascota :");

        tfIdMascota.setEditable(false);
        tfIdMascota.setEnabled(false);

        tfIdCliente.setEditable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG Mascotas.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tfIdMascota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 80, 500, 160));

        RegistroMascotas_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vista Registro Mascotas.jpg"))); // NOI18N
        getContentPane().add(RegistroMascotas_IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed

        VistaMascotasPorDueño vp = new VistaMascotasPorDueño();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        if(tfIdCliente.getText().isEmpty()||tfAlias.getText().isEmpty()||tfRaza.getText().isEmpty()||tfPelo.getText().isEmpty()||dcFecha.getDate()==null){
            JOptionPane.showMessageDialog(null,"Faltan completar campos","", JOptionPane.ERROR_MESSAGE);}
        else{ 
        int idCliente = Integer.parseInt(tfIdCliente.getText());
        Cliente cliente = mascotaData.buscarCliente(idCliente);
        String alias = tfAlias.getText();    
        String especie = cbxEspecie.getSelectedItem().toString();
        String sexo = cbxSexo.getSelectedItem().toString();
        String raza = tfRaza.getText();
        String colorPelo = tfPelo.getText();
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(dcFecha.getDate());
        LocalDate fecNac= LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        Mascota mascota = new Mascota(cliente,alias,especie,sexo,raza,colorPelo,fecNac);
        mascotaData.guardarMascota(mascota);
        
        JOptionPane.showMessageDialog(null,"Mascota guardada correctamente");
     
        VistaMascotasPorDueño vmpd = new VistaMascotasPorDueño();
        vmpd.tfIdCliente.setText(tfIdCliente.getText());
        vmpd.cargaDatos();
        vmpd.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
     if(tfAlias.getText().length()==0||dcFecha.getDate()==null){
            JOptionPane.showMessageDialog(null,"Faltan completar campo/s","", JOptionPane.ERROR_MESSAGE);}
        else{ 
        int idMascota = Integer.parseInt(tfIdMascota.getText());
        int idCliente = Integer.parseInt(tfIdCliente.getText());
        Cliente cliente = mascotaData.buscarCliente(idCliente);
        String alias = tfAlias.getText();
        String especie = cbxEspecie.getSelectedItem().toString();
        String sexo = cbxSexo.getSelectedItem().toString();
        String raza = tfRaza.getText();
        String colorPelo = tfPelo.getText();
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(dcFecha.getDate());
        LocalDate fecNac= LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
    
        Mascota mascota = new Mascota();
        mascota.setIdMascota(idMascota);
        mascota.setCliente(cliente);
        mascota.setAlias(alias);
        mascota.setEspecie(especie);
        mascota.setSexo(sexo);
        mascota.setRaza(raza); 
        mascota.setColorPelo(colorPelo);
        mascota.setFecNac(fecNac);
        
        mascotaData.actualizarMascota(mascota);
        JOptionPane.showMessageDialog(null,"Datos modificados correctamente");}
        
    }//GEN-LAST:event_jbModificarActionPerformed
        public void cargaTextFields(){
           
        int id = Integer.parseInt(tfIdMascota.getText());
        Mascota mascota = mascotaData.buscarMascota(id);
        tfAlias.setText(mascota.getAlias());
        cbxEspecie.setSelectedItem(mascota.getEspecie());
        tfRaza.setText(mascota.getRaza());
        tfPelo.setText(mascota.getColorPelo());
        cbxSexo.setSelectedItem(mascota.getSexo());  
        
        Date date = java.sql.Date.valueOf(mascota.getFecNac());
        dcFecha.setDate(date);
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
            java.util.logging.Logger.getLogger(VistaMascotaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMascotaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMascotaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMascotaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMascotaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegistroMascotas_IMG;
    private javax.swing.JComboBox<String> cbxEspecie;
    private javax.swing.JComboBox<String> cbxSexo;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCerrar;
    public javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField tfAlias;
    public javax.swing.JTextField tfIdCliente;
    public javax.swing.JTextField tfIdMascota;
    private javax.swing.JTextField tfPelo;
    private javax.swing.JTextField tfRaza;
    // End of variables declaration//GEN-END:variables
}
