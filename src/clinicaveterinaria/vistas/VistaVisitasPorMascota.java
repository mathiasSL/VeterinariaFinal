package clinicaveterinaria.vistas;

import clinicaveterinaria.Conexion;
import clinicaveterinaria.VisitaDeAtencion;
import clinicaveterinaria.VisitaDeAtencionData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaVisitasPorMascota extends javax.swing.JFrame {
private DefaultTableModel modelo;
private Conexion conexion;
private VisitaDeAtencionData visitaData;
private ArrayList<VisitaDeAtencion> listaVisitas;
   
    public VistaVisitasPorMascota() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        modelo=new DefaultTableModel();
       
        visitaData = new VisitaDeAtencionData(conexion);
        armaCabeceraTabla();    
       } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaVisitasPorMascota.class.getName()).log(Level.SEVERE, null, ex);
    } 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbTodasLasVisitas = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVisitasM = new javax.swing.JTable();
        portadaFondo = new javax.swing.JLabel();
        tfIdV = new javax.swing.JTextField();
        tfIdCliente = new javax.swing.JTextField();
        tfIdM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbTodasLasVisitas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbTodasLasVisitas.setText("Todas las visitas");
        jbTodasLasVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTodasLasVisitasActionPerformed(evt);
            }
        });
        getContentPane().add(jbTodasLasVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, 36));

        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Home.jpg"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 60, 50));

        jbBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico Borrar.jpg"))); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 60, 50));

        tablaVisitasM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVisitasM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVisitasMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVisitasM);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 630, 240));

        portadaFondo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        portadaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada Historia clinica.jpg"))); // NOI18N
        getContentPane().add(portadaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 500));

        tfIdV.setEnabled(false);
        getContentPane().add(tfIdV, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 26, -1));

        tfIdCliente.setEditable(false);
        tfIdCliente.setEnabled(false);
        getContentPane().add(tfIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 26, -1));

        tfIdM.setEditable(false);
        tfIdM.setEnabled(false);
        getContentPane().add(tfIdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 25, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        VistaMascotasPorDueño vmpd = new VistaMascotasPorDueño();
        vmpd.tfIdCliente.setText(tfIdCliente.getText());
        vmpd.setVisible(true);
        vmpd.cargaDatos();
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbTodasLasVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTodasLasVisitasActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();
        portadaFondo.setText("TODAS LAS VISITAS");
        int id = Integer.parseInt(tfIdM.getText());
        listaVisitas=(ArrayList)visitaData.visitasPorMascota(id);
        
        for(VisitaDeAtencion m:listaVisitas){
        
            modelo.addRow(new Object[]{m.getIdVisita(),m.getTratamiento().getTipo(),m.getTratamiento().getDescripcion(),m.getFechaDeVisita()});
       } 
    }//GEN-LAST:event_jbTodasLasVisitasActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        
        if(tfIdV.getText().isEmpty()){
           
JOptionPane.showMessageDialog(null,"Debe seleccionar un dato.","", JOptionPane.WARNING_MESSAGE);
}  else{           
        int decision = JOptionPane.showConfirmDialog(null,"¿Seguro que quieres eliminar la visita de atencion?","",JOptionPane.YES_NO_OPTION);
            if(decision == 0){
                int id = Integer.parseInt(tfIdV.getText());
                visitaData.borrarVisita(id);
                
                 borraFilasTabla();
                 cargaDatos();
                }
            if(decision == 1){
                tfIdV.setText("");
                
                borraFilasTabla();
                cargaDatos();
                }
            }       
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void tablaVisitasMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVisitasMMouseClicked
        // TODO add your handling code here:
        int idVisita = (int)tablaVisitasM.getValueAt(tablaVisitasM.getSelectedRow(), 0);
        tfIdV.setText(idVisita+"");
    }//GEN-LAST:event_tablaVisitasMMouseClicked
    public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        
        columnas.add("ID Visita");
        columnas.add("Tipo");
        columnas.add("Descripcion");
        columnas.add("Fecha De Visita");
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tablaVisitasM.setModel(modelo);
  }
    public void borraFilasTabla(){

            int a =modelo.getRowCount()-1;
            for(int i=a;i>=0;i--){
                modelo.removeRow(i );
            }
      }
      
       public void cargaDatos(){
      
       int id = Integer.parseInt(tfIdM.getText());
        listaVisitas=(ArrayList)visitaData.visitasTipoEnfermedadPorMascota(id);
        
        for(VisitaDeAtencion m:listaVisitas){
        
            modelo.addRow(new Object[]{m.getIdVisita(),m.getTratamiento().getTipo(),m.getTratamiento().getDescripcion(),m.getFechaDeVisita()});
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
            java.util.logging.Logger.getLogger(VistaVisitasPorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVisitasPorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVisitasPorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVisitasPorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVisitasPorMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbTodasLasVisitas;
    private javax.swing.JLabel portadaFondo;
    private javax.swing.JTable tablaVisitasM;
    public javax.swing.JTextField tfIdCliente;
    public javax.swing.JTextField tfIdM;
    private javax.swing.JTextField tfIdV;
    // End of variables declaration//GEN-END:variables
}
