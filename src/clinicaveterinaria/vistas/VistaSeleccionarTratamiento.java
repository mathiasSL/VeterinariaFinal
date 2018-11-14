package clinicaveterinaria.vistas;

import clinicaveterinaria.Conexion;
import clinicaveterinaria.Tratamiento;
import clinicaveterinaria.TratamientoData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaSeleccionarTratamiento extends javax.swing.JFrame {
private Conexion conexion;
private DefaultTableModel modelo;
private TratamientoData tratamientoData;
private ArrayList<Tratamiento> listaTratamientos;

    public VistaSeleccionarTratamiento() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        modelo=new DefaultTableModel();
        tratamientoData=new TratamientoData(conexion);
        
        armaCabeceraTabla();
        cargaDatos();
       } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaSeleccionarTratamiento.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTratamientos = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfIdMascota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaTratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaTratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTratamientosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTratamientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 79, 470, 320));

        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setText("Realizar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, 36));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada Tratamientos y serv.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 460));

        tfId.setEnabled(false);
        getContentPane().add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 30, -1));

        tfIdMascota.setEnabled(false);
        getContentPane().add(tfIdMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 20, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
    if(tfId.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Seleccionar tratamiento de la tabla");
    }else{    
        VistaVisitaDeAtencion vvda = new VistaVisitaDeAtencion();
        vvda.tfIdMascota.setText(tfIdMascota.getText());
        int fila = tablaTratamientos.getSelectedRow();
        vvda.tfIdTratamiento.setText(tablaTratamientos.getValueAt(fila,0).toString());
        vvda.tfNombreTratamiento.setText(tablaTratamientos.getValueAt(fila,1).toString());
        vvda.tfDescripcion.setText(tablaTratamientos.getValueAt(fila,2).toString());
        vvda.tfImporteTotal.setText(tablaTratamientos.getValueAt(fila,3).toString());
        vvda.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void tablaTratamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTratamientosMouseClicked
        
        int id = (int)tablaTratamientos.getValueAt(tablaTratamientos.getSelectedRow(), 0);
        tfId.setText(id+"");
    }//GEN-LAST:event_tablaTratamientosMouseClicked

    public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        
        columnas.add("ID Tratamiento");
        columnas.add("Tipo");
        columnas.add("Descripcion");
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
           
        listaTratamientos=(ArrayList)tratamientoData.tratamientosActivos();
        
        for(Tratamiento m:listaTratamientos){
        
            modelo.addRow(new Object[]{m.getIdTratamiento(),m.getTipo(),m.getDescripcion(),m.getImporte()});
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
            java.util.logging.Logger.getLogger(VistaSeleccionarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSeleccionarTratamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JTable tablaTratamientos;
    private javax.swing.JTextField tfId;
    public javax.swing.JTextField tfIdMascota;
    // End of variables declaration//GEN-END:variables
}
