/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifaces;

import Clases.Asistencia;
import Control.AsistenciaC;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melón
 */
public class AsistenciaV1 extends javax.swing.JFrame {
    DefaultTableModel tablaAsis;
    String a;
    String b;
    

    /**
     * Creates new form AsistenciaV1
     */
    public AsistenciaV1() {
        initComponents();
        CargarAsistencias();
        this.setLocationRelativeTo(null);
        fechaHoy();
    }
    
    
    
public boolean ValidaFechas(){
        boolean melon=false;
    try {
        Date desde = Cdesde.getDate();
        Date hasta = Chasta.getDate();
        SimpleDateFormat miFormato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();    
             if ( hasta.before(desde) ){
        JOptionPane.showMessageDialog(null, "La fecha Desde no puede ser mayor");
            }else{
                     if ( hasta.after(fechaActual) ){
                        JOptionPane.showMessageDialog(null, "La fecha no puede ser mayor a la actual");
                        } 
                    else{
                    a = miFormato.format(desde);
                    b = miFormato.format(hasta);
                    melon=true;
                    }
                }
    }catch(NullPointerException ex){
         JOptionPane.showMessageDialog(this, "Seleccione una fecha válida!", "Error!", JOptionPane.ERROR_MESSAGE);
    } 
    return melon;
}
     
public void llenaTabla(){
 
        String [] Titulo = {"Fecha","Rut Empleado","Nombre","Asistencia"};
        tablaAsis=new DefaultTableModel(null,Titulo);
        try {
        AsistenciaC  miC = new AsistenciaC();
        ArrayList<Asistencia> Lista=miC.MostrarAsistencia(a, b, txtBusqueda.getText());
        Object []fila= new Object[4];
        
        for(int i =0; i < Lista.size(); i++){
                fila[0]=Lista.get(i).getAsisFecha();
                fila[1]=Lista.get(i).getMiEmpleado().getPerID();
                fila[2]=Lista.get(i).getMiEmpleado().getPerNombre();
                fila[3]=Lista.get(i).getAsisDescripcion();
                       
                tablaAsis.addRow(fila);
        }
       
           tAsis.setModel(tablaAsis);
        }
        catch(Exception e ){
         JOptionPane.showMessageDialog(null, "no se puede agregar" + e );
        }
}    
    
    public void fechaHoy(){
        SimpleDateFormat miFormato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();    
        Cdesde.setDate(fechaActual);
        Chasta.setDate(fechaActual);
    }
        
    public void CargarAsistencias(){

        String [] Titulo = {"Fecha","Rut Empleado","Nombre","Asistencia"};
        tablaAsis=new DefaultTableModel(null,Titulo);
        try {
         AsistenciaC miC = new AsistenciaC();   
         ArrayList<Asistencia> Lista = miC.ListarAsistencia();
        Object []fila= new Object[4];
        
        for(int i =0; i < Lista.size(); i++){
                fila[0]=Lista.get(i).getAsisFecha();
                fila[1]=Lista.get(i).getMiEmpleado().getPerID();
                fila[2]=Lista.get(i).getMiEmpleado().getPerNombre();
                fila[3]=Lista.get(i).getAsisDescripcion();
                       
                tablaAsis.addRow(fila);
        }
       
           tAsis.setModel(tablaAsis);
        }
        catch(Exception e ){
         JOptionPane.showMessageDialog(null, "no se puede agregar" + e );
        }

    }    
    

    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cdesde = new com.toedter.calendar.JDateChooser();
        Chasta = new com.toedter.calendar.JDateChooser();
        BUSCAR = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAsis = new javax.swing.JTable();
        QUITAR = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Desde");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Hasta");

        Cdesde.setDateFormatString("yyyy-MM-dd");
        Cdesde.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Chasta.setDateFormatString("yyyy-MM-dd");
        Chasta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BUSCAR.setText("Buscar");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        tAsis = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }};
            tAsis.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane1.setViewportView(tAsis);

            QUITAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            QUITAR.setText("X");
            QUITAR.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    QUITARActionPerformed(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
            jLabel3.setText("Quitar filtro");

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel4.setText("Ingrese Rut o Nombre");

            jToggleButton4.setText("Volver Menu Principal");
            jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jToggleButton4ActionPerformed(evt);
                }
            });

            jToggleButton5.setText("Volver Atrás");
            jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jToggleButton5ActionPerformed(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel5.setText("Ver Asistencias");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(153, 153, 153)
                                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(196, 196, 196)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(20, 20, 20)
                                                    .addComponent(jLabel1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Cdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(269, 269, 269)
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(Chasta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(QUITAR)))))
                            .addGap(47, 47, 47))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton5)
                            .addGap(18, 18, 18)
                            .addComponent(jToggleButton4)))
                    .addContainerGap(17, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(199, 199, 199))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BUSCAR))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(QUITAR)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(Cdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Chasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(13, 13, 13)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton4)
                        .addComponent(jToggleButton5))
                    .addGap(85, 85, 85))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        if(ValidaFechas())
            this.llenaTabla();
        
    }//GEN-LAST:event_BUSCARActionPerformed

    private void QUITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUITARActionPerformed
                CargarAsistencias();
                txtBusqueda.setText("");
                fechaHoy();
    }//GEN-LAST:event_QUITARActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
      subEmpleados se = new subEmpleados();
      se.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        Menu miMenu = new Menu();
        miMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AsistenciaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsistenciaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsistenciaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsistenciaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsistenciaV1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private com.toedter.calendar.JDateChooser Cdesde;
    private com.toedter.calendar.JDateChooser Chasta;
    private javax.swing.JToggleButton QUITAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTable tAsis;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
