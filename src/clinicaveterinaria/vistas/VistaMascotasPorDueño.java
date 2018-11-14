package clinicaveterinaria.vistas;

import clinicaveterinaria.Cliente;
import clinicaveterinaria.ClienteData;
import clinicaveterinaria.Conexion;
import clinicaveterinaria.Mascota;
import clinicaveterinaria.MascotaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaMascotasPorDueño extends javax.swing.JFrame {
private MascotaData mascotaData;
private ArrayList<Mascota> listaMascotas;
private DefaultTableModel modelo;
private Conexion conexion;
private ClienteData clienteData;
private ArrayList<Cliente> listaClientes; 


    public VistaMascotasPorDueño() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        mascotaData = new MascotaData(conexion);
        modelo=new DefaultTableModel();
        armaCabeceraTabla();
        clienteData = new ClienteData(conexion);
          
       } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaMascotasPorDueño.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        buscarpordueñoIMG = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfIdMascota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jbBuscarCliente = new javax.swing.JButton();
        jbAgregarMascota = new javax.swing.JButton();
        jbModificarDatos = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbRealizarVisita = new javax.swing.JButton();
        jbVerVisitas = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mascotas por dueño");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMascotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tablaMascotas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMascotas.setGridColor(new java.awt.Color(204, 204, 204));
        tablaMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMascotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMascotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 720, 190));

        buscarpordueñoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar por dueño imagen.jpg"))); // NOI18N
        buscarpordueñoIMG.setText("jLabel1");
        getContentPane().add(buscarpordueñoIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 150, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfIdMascota.setEditable(false);
        tfIdMascota.setBackground(new java.awt.Color(255, 255, 255));
        tfIdMascota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfIdMascota.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel4.setText("id Mascota :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setText("id Cliente :");

        tfIdCliente.setEditable(false);
        tfIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfIdCliente.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setText("DNI:");

        tfDni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDniKeyTyped(evt);
            }
        });

        jbBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Lupa 25X80.jpg"))); // NOI18N
        jbBuscarCliente.setBorder(null);
        jbBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscarCliente))
                    .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jbBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 350, 140));

        jbAgregarMascota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbAgregarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Nueva Mascota.jpg"))); // NOI18N
        jbAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(jbAgregarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 60, 50));

        jbModificarDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Modificar.jpg"))); // NOI18N
        jbModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 60, 50));

        jbBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico Borrar.jpg"))); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 60, 50));

        jbRealizarVisita.setBackground(new java.awt.Color(204, 204, 255));
        jbRealizarVisita.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbRealizarVisita.setText("Realizar Visita");
        jbRealizarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarVisitaActionPerformed(evt);
            }
        });
        getContentPane().add(jbRealizarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, 36));

        jbVerVisitas.setBackground(new java.awt.Color(204, 204, 255));
        jbVerVisitas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbVerVisitas.setText("Ver Visitas");
        jbVerVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerVisitasActionPerformed(evt);
            }
        });
        getContentPane().add(jbVerVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, 36));

        jbLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Limpiar.jpg"))); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 60, 50));

        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Home.jpg"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 60, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vista Mascotas por dueño.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        
        VistaPrincipal vcr = new VistaPrincipal();
        vcr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMascotaActionPerformed
        
        if(!tfIdCliente.getText().isEmpty()){
        VistaMascotaRegistro vmr = new VistaMascotaRegistro();
        vmr.setVisible(true);
        vmr.tfIdCliente.setText(tfIdCliente.getText());
        //vmr.tfIdMascota.setText(tfIdMascota.getText());
        this.dispose();}else{
            JOptionPane.showMessageDialog(null,"Buscar o registrar nuevo cliente","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAgregarMascotaActionPerformed

    private void tablaMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMascotasMouseClicked
        
        int idMascota = (int)tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0);
        tfIdMascota.setText(idMascota+"");
    }//GEN-LAST:event_tablaMascotasMouseClicked

    private void jbModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarDatosActionPerformed
        
        if(tfIdMascota.getText().length()!=0){    
        VistaMascotaRegistro vmr = new VistaMascotaRegistro();
        
        vmr.jbGuardar.setEnabled(false);
        vmr.tfIdCliente.setText(tfIdCliente.getText());
        vmr.tfIdMascota.setText(tfIdMascota.getText());
        vmr.cargaTextFields();
        vmr.setVisible(true);
        this.dispose();}else{
        JOptionPane.showMessageDialog(null,"Seleccionar mascota de la tabla","Mis Mascotas", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbModificarDatosActionPerformed

    private void jbRealizarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarVisitaActionPerformed
        
        if(!tfIdMascota.getText().isEmpty()) {  
        VistaVisitaDeAtencion vmm=new VistaVisitaDeAtencion();
            vmm.tfIdMascota.setText(tfIdMascota.getText());
            vmm.setVisible(true);
            this.dispose();}
        else{
        JOptionPane.showMessageDialog(null,"Seleccionar mascota de la tabla","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbRealizarVisitaActionPerformed

    private void jbBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarClienteActionPerformed
        
        listaClientes=clienteData.buscarClientePorDni(tfDni.getText());
        if(listaClientes.size()==0){
            JOptionPane.showMessageDialog(null,"Cliente no encontrado","Error", JOptionPane.ERROR_MESSAGE);
        borraFilasTabla();
        tfDni.setText("");
        tfIdCliente.setText("");
        }
        else{
            for(Cliente m:listaClientes){
                tfIdCliente.setText(m.getIdCliente()+"");
            }
        int id = Integer.parseInt(tfIdCliente.getText());
        listaMascotas=(ArrayList)mascotaData.buscarMascotasPorCliente(id);
        borraFilasTabla();
        tfIdMascota.setText("");
        cargaDatos();
        } 
    }//GEN-LAST:event_jbBuscarClienteActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        
        tfDni.setText("");
        tfIdCliente.setText("");
        tfIdMascota.setText("");
        borraFilasTabla();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbVerVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerVisitasActionPerformed
       
       if(tfIdMascota.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Seleccionar mascota en la tabla","Error", JOptionPane.ERROR_MESSAGE);}
       else{VistaVisitasPorMascota vvpm = new VistaVisitasPorMascota();
        vvpm.tfIdM.setText(tfIdMascota.getText());
        vvpm.tfIdCliente.setText(tfIdCliente.getText());
        vvpm.setVisible(true);
        vvpm.cargaDatos();
        this.dispose();
       }
      
    }//GEN-LAST:event_jbVerVisitasActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
    if(tfIdMascota.getText().isEmpty()){
    JOptionPane.showMessageDialog(null,"Error al borrar","Error", JOptionPane.ERROR_MESSAGE);
    }  
    else{
            int decision = JOptionPane.showConfirmDialog(null,"¿Seguro que quieres eliminar los datos de la mascota?","",JOptionPane.YES_NO_OPTION);
            if(decision == 0){
                int id = Integer.parseInt(tfIdMascota.getText());
                mascotaData.borrarMascota(id);
                
                borraFilasTabla();
                cargaDatos();
                }
        }  
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter<'0' || caracter>'9') && (caracter != '\b')) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar numeros");
        }   
    }//GEN-LAST:event_tfDniKeyTyped
public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("idMascota");
        columnas.add("Alias");
        columnas.add("Especie");
        columnas.add("Sexo");
        columnas.add("Raza");
        columnas.add("Color");
        columnas.add("FechaNacimiento");
        columnas.add("Peso");
       
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tablaMascotas.setModel(modelo);
  }
    public void borraFilasTabla(){

            int a =modelo.getRowCount()-1;
            for(int i=a;i>=0;i--){
                modelo.removeRow(i );
            }
      }
      
       public void cargaDatos(){
        int id = Integer.parseInt(tfIdCliente.getText());
        listaMascotas=(ArrayList)mascotaData.buscarMascotasPorCliente(id);
        
       for(Mascota m:listaMascotas){
        
            modelo.addRow(new Object[]{m.getIdMascota(),m.getAlias(),m.getEspecie(),m.getSexo(),m.getRaza(),m.getColorPelo(),m.getFecNac(),m.getPesoMedio()});
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMascotasPorDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMascotasPorDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMascotasPorDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMascotasPorDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMascotasPorDueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarpordueñoIMG;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregarMascota;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificarDatos;
    private javax.swing.JButton jbRealizarVisita;
    private javax.swing.JButton jbVerVisitas;
    private javax.swing.JTable tablaMascotas;
    private javax.swing.JTextField tfDni;
    public javax.swing.JTextField tfIdCliente;
    public javax.swing.JTextField tfIdMascota;
    // End of variables declaration//GEN-END:variables
}
