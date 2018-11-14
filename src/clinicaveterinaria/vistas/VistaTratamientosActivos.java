package clinicaveterinaria.vistas;

import clinicaveterinaria.Conexion;
import clinicaveterinaria.Tratamiento;
import clinicaveterinaria.TratamientoData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VistaTratamientosActivos extends javax.swing.JFrame {

private Conexion conexion;
private TratamientoData tratamientoData;
private ArrayList<Tratamiento> listaTratamientos;
private DefaultTableModel modelo;
    
    public VistaTratamientosActivos() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        tratamientoData=new TratamientoData(conexion);
        modelo=new DefaultTableModel();
        armaCabeceraTabla();
        cargaDatos();
       } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaTratamientosActivos.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();
        portadaTratamientoActivos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 470, 320));

        jbCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ico Home.jpg"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 60, -1));

        portadaTratamientoActivos.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        portadaTratamientoActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portada Tratamientos y serv activos.jpg"))); // NOI18N
        getContentPane().add(portadaTratamientoActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tabla.setModel(modelo);
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
        
            modelo.addRow(new Object[]{m.getIdTratamiento(),m.getTipo(),m.getDescripcion()});
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
            java.util.logging.Logger.getLogger(VistaTratamientosActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTratamientosActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTratamientosActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTratamientosActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTratamientosActivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JLabel portadaTratamientoActivos;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
