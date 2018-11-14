package clinicaveterinaria.vistas;

import clinicaveterinaria.Conexion;
import clinicaveterinaria.Tratamiento;
import clinicaveterinaria.TratamientoData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaTratamientoRegistro extends javax.swing.JFrame {
private TratamientoData tratamientoData;
private Conexion conexion;
private DefaultTableModel modelo;
private ArrayList<Tratamiento> listaTratamientos;


    public VistaTratamientoRegistro() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        tratamientoData = new TratamientoData(conexion);
        modelo=new DefaultTableModel();
        armaCabeceraTabla();
        cargaDatos();

      } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaTratamientoRegistro.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tfImporte = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescripcion = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        tfIdTratamiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbActivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTratamientos = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        portada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Tratamientos y Servicios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tfImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfImporteKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel2.setText("Tipo :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel3.setText("Importe :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Descripción :");

        cbxTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA", "VACUNACION", "ENFERMEDAD", "CURACION", "CORTE Y BAÑO", "CIRUGIA" }));
        cbxTipo.setSelectedItem(cbxTipo);
        cbxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jScrollPane1.setViewportView(tfDescripcion);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel6.setText("id :");

        tfIdTratamiento.setEditable(false);
        tfIdTratamiento.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel5.setText("Activo :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("$");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img Registro tratamientos o serv.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(tfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfIdTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(cbActivo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfIdTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbActivo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 610, 260));

        tablaTratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaTratamientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaTratamientos.setGridColor(new java.awt.Color(204, 204, 255));
        tablaTratamientos.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tablaTratamientos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaTratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTratamientosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaTratamientos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 610, 190));

        jbGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Guardar.jpg"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 60, 50));

        jbModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Modificar.jpg"))); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 60, 50));

        jbBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico Borrar.jpg"))); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 60, 50));

        jbLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Limpiar.jpg"))); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 60, 50));

        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Home.jpg"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 60, 50));

        portada.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vista Registro trat y serv.jpg"))); // NOI18N
        getContentPane().add(portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
if(tfImporte.getText().isEmpty()||tfDescripcion.getText().isEmpty()){
JOptionPane.showMessageDialog(null,"Faltan completar campo/s","Nuevo Tratamiento", JOptionPane.ERROR_MESSAGE);
}  else{      
        String tipo=cbxTipo.getSelectedItem().toString();
        double importe = Double.parseDouble(tfImporte.getText());
        String descripcion = tfDescripcion.getText();
        boolean activo = cbActivo.isSelected();
         
    if (tratamientoRepetido(descripcion) == true) {
           JOptionPane.showMessageDialog(null,"No puedes cargar tratamientos repetidos, modifica la descripcion","", JOptionPane.ERROR_MESSAGE);
        }
        else {
        Tratamiento tratamiento=new Tratamiento(tipo,descripcion,activo,importe);
        tratamientoData.guardarTratamiento(tratamiento);
        
        JOptionPane.showMessageDialog(null,"Tratamiento guardado");
        jbGuardar.setEnabled(false);
        borraFilasTabla();
        cargaDatos();
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed

        VistaPrincipal vp = new VistaPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

     public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        
        columnas.add("ID Tratamiento");
        columnas.add("Tipo");
        columnas.add("Descripcion");
        columnas.add("Activo");
        columnas.add("Importe");
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tablaTratamientos.setModel(modelo);
  }
    public void borraFilasTabla(){

            int a =modelo.getRowCount()-1;
            for(int i=a;i>=0;i--){
                modelo.removeRow(i );
            }
      }
      
       public void cargaDatos(){
        
        listaTratamientos=(ArrayList)tratamientoData.obtenerTratamientos();
        
        for(Tratamiento m:listaTratamientos){
        
            modelo.addRow(new Object[]{m.getIdTratamiento(),m.getTipo(),m.getDescripcion(),m.getActivo(),m.getImporte()});
       }
    }
    
    private void tfImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfImporteKeyTyped
        
        char caracter = evt.getKeyChar();
        if ((caracter<'0' || caracter>'9') && (caracter != '\b')) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo puedes ingresar numeros");
        }      
    }//GEN-LAST:event_tfImporteKeyTyped

    private void tablaTratamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTratamientosMouseClicked
        // TODO add your handling code here:
        int idTratamiento = (int)tablaTratamientos.getValueAt(tablaTratamientos.getSelectedRow(), 0);
        String tipo = (String)tablaTratamientos.getValueAt(tablaTratamientos.getSelectedRow(), 1);
        String descripcion = (String)tablaTratamientos.getValueAt(tablaTratamientos.getSelectedRow(), 2);
        Boolean activo = (boolean)tablaTratamientos.getValueAt(tablaTratamientos.getSelectedRow(), 3);
        Double importe = (Double)tablaTratamientos.getValueAt(tablaTratamientos.getSelectedRow(), 4);
        
        tfIdTratamiento.setText(idTratamiento+"");
        cbxTipo.setSelectedItem(tipo);
        tfDescripcion.setText(descripcion);
        cbActivo.setSelected(activo);
        tfImporte.setText(importe+"");
    }//GEN-LAST:event_tablaTratamientosMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if(tfIdTratamiento.getText().isEmpty()||tfImporte.getText().isEmpty()||tfDescripcion.getText().isEmpty()){
JOptionPane.showMessageDialog(null,"Faltan completar campos / Seleccione tratamiento de la tabla","", JOptionPane.ERROR_MESSAGE);
}  else{     
        int id = Integer.parseInt(tfIdTratamiento.getText());
        String tipo=cbxTipo.getSelectedItem().toString();
        String descripcion = tfDescripcion.getText();
        boolean activo = cbActivo.isSelected();
        double importe = Double.parseDouble(tfImporte.getText());
        
        Tratamiento tratamiento=new Tratamiento();
        tratamiento.setIdTratamiento(id);
        tratamiento.setTipo(tipo);
        tratamiento.setDescripcion(descripcion);
        tratamiento.setActivo(activo);
        tratamiento.setImporte(importe);
        tratamientoData.actualizarTratamiento(tratamiento);
        
        JOptionPane.showMessageDialog(null,"Tratamiento modificado");
        borraFilasTabla();
        cargaDatos();
        tfIdTratamiento.setText("");
        cbxTipo.setSelectedIndex(0);
        tfDescripcion.setText("");
        cbActivo.setSelected(false);
        tfImporte.setText("");
        
        } 
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        
         if(tfIdTratamiento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selecciona fila de la tabla para borrar el tratamiento","Borrar Tratamiento", JOptionPane.ERROR_MESSAGE);
        }
        else {
        int id = Integer.parseInt(tfIdTratamiento.getText());
        tratamientoData.borrarTratamiento(id);
        tfIdTratamiento.setText("");
        tfDescripcion.setText("");
        tfImporte.setText("");
        cbxTipo.setSelectedIndex(0);
        cbActivo.setSelected(false);
        borraFilasTabla();
        cargaDatos();
         }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
       
        tfIdTratamiento.setText("");
        cbxTipo.setSelectedIndex(0);
        tfDescripcion.setText("");
        cbActivo.setSelected(false);
        tfImporte.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    public boolean tratamientoRepetido(String desc){
     ArrayList<String> tratamientos = new ArrayList();  
     tratamientos = tratamientoData.obtenerDescripciones(); 
     
     for (String x:tratamientos){
         if(x.equals(desc)){
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
            java.util.logging.Logger.getLogger(VistaTratamientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTratamientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTratamientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTratamientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTratamientoRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbActivo;
    public javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JLabel portada;
    private javax.swing.JTable tablaTratamientos;
    private javax.swing.JTextPane tfDescripcion;
    public javax.swing.JTextField tfIdTratamiento;
    public javax.swing.JTextField tfImporte;
    // End of variables declaration//GEN-END:variables
}
