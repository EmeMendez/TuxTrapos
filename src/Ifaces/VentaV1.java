/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifaces;

import Control.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melón
 */
public class VentaV1 extends javax.swing.JFrame {
    DefaultTableModel tabla;
    String nro;
    public JComboBox<Clases.Enum> combo;


    /**
     * Creates new form VentaV1
     */
    public VentaV1() {
        initComponents();
        VentaC vC = new VentaC();
        nro=vC.miNumero();
        setLocationRelativeTo(null); 
        combo = new javax.swing.JComboBox<>();
        medioPago.setModel(new DefaultComboBoxModel(Clases.Enum.values()));        
        }
    
    public void TotalVenta(){
        int totalV=0;
        int totalRow= tb.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
             int sumaT= Integer.parseInt(String.valueOf(tb.getValueAt(i,4)));
             totalV+=sumaT;
 
          txtVtotal.setText(""+totalV);
        }
    }
    
    
    public void IngresaVentaYdetalle(){
       if(!txtVtotal.getText().isEmpty() && !txtrutEmpleado.getText().isEmpty() && !txtrutCliente.getText().isEmpty()){
            VentaC miVentaC = new VentaC();
            miVentaC.InsertarVenta(nro,txtRutPro.getText(),txtrutEmpleado.getText(),txtrutCliente.getText(), txtVcomision.getText(),txtVtotal.getText(),medioPago.getSelectedItem().toString());
            
        for(int i=0;i<tb.getRowCount();i++){
            DetVentaC detC = new DetVentaC();
            detC.InsertarDetalle(nro,tb.getValueAt(i, 0).toString(),tb.getValueAt(i,2 ).toString(),tb.getValueAt(i, 3).toString(),tb.getValueAt(i, 4).toString());

        }
        this.setVisible(false);
        subVenta misubVenta= new subVenta();
        misubVenta.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Debe los completar datos y calcular el total ");
                   
        }
    }

    public void EliminarFila(){
            DefaultTableModel modelo = (DefaultTableModel)tb.getModel();
            int fila = tb.getSelectedRow();
            if(fila>=0)
            {
            modelo.removeRow(fila);
            txtVtotal.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Selecciono ninguna fila");
            }
    }
    
    
    public void VerCliente(){
         ClienteC cliC = new ClienteC();       
                if(cliC.siExisteCliente(txtrutCliente.getText()))
                    txtnombreCliente.setText(cliC.MuestraNombre(txtrutCliente.getText()));
        else{
            JOptionPane.showMessageDialog(null, "no existe el cliente, ó el campo está vacio");
            txtnombreCliente.setText("");
            txtrutCliente.setText("");

        }
    
    }
    
    public void VerEmpleado(){
        EmpleadoC miC = new EmpleadoC();
        ContratoC miCC = new ContratoC();
        if(miC.siExisteEmpleado(txtrutEmpleado.getText()) &&  miCC.siTrabaja(txtrutEmpleado.getText())){
            txtnombreEmpleado.setText(miC.MuestraNombre(txtrutEmpleado.getText()));
        }
        else{
            JOptionPane.showMessageDialog(null, "no existe el empleado");
            txtnombreEmpleado.setText("");
            txtrutEmpleado.setText("");
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrutCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtrutEmpleado = new javax.swing.JTextField();
        txtVcomision = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnombreCliente = new javax.swing.JTextField();
        txtnombreEmpleado = new javax.swing.JTextField();
        add = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        txtVtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnArteliminar = new javax.swing.JToggleButton();
        btnTotal = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        GenerarVenta = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        txtRutPro = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        medioPago = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Realizar Venta");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Rut cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Rut Empleado");

        txtrutCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtrutCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrutClienteFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Venta Comisón");

        txtrutEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtrutEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrutEmpleadoFocusLost(evt);
            }
        });

        txtVcomision.setEditable(false);
        txtVcomision.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtVcomision.setText("2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombre Cliente");

        txtnombreCliente.setEditable(false);
        txtnombreCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtnombreEmpleado.setEditable(false);
        txtnombreEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setText("Agregar Articulo");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre Empleado");

        tb = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio", "Cantidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(tb);

        txtVtotal.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total Compra");

        btnArteliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnArteliminar.setForeground(new java.awt.Color(204, 0, 0));
        btnArteliminar.setText("Eliminar Articulo");
        btnArteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArteliminarActionPerformed(evt);
            }
        });

        btnTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTotal.setText("Calcular Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("%");

        GenerarVenta.setBackground(new java.awt.Color(102, 255, 0));
        GenerarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenerarVenta.setText("Generar Venta");
        GenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarVentaActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(255, 51, 51));
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(204, 204, 204));
        jToggleButton4.setText("Cancelar Venta");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel10.setText("Ingrese cero (\"0\") si no tiene Rut");

        txtRutPro.setEditable(false);
        txtRutPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRutPro.setText("3004");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setText("Tux Trapos Ltda");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre Proveedor");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Rut Proveedor");

        medioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Medio Pago");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(4, 4, 4)))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtVcomision, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(129, 129, 129))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtRutPro, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtrutEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                                    .addComponent(txtrutCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(26, 26, 26))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18))))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(txtnombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(jTextField2)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnArteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(medioPago, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jLabel8)))
                        .addContainerGap(50, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTotal)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtVtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton4)
                    .addComponent(GenerarVenta))
                .addGap(132, 132, 132))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRutPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombreEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtrutEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVcomision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(medioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(btnArteliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(GenerarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtVtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton4)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTotal)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrutEmpleadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrutEmpleadoFocusLost
        VerEmpleado();
    }//GEN-LAST:event_txtrutEmpleadoFocusLost

    private void txtrutClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrutClienteFocusLost
        VerCliente();
    }//GEN-LAST:event_txtrutClienteFocusLost

    private void GenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarVentaActionPerformed
        this.IngresaVentaYdetalle();
    }//GEN-LAST:event_GenerarVentaActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
          try {
           ArticuloV midetArtV= new ArticuloV();
         
           midetArtV.setVisible(true);
           } 
           catch (Exception e) {
               System.out.print(e);
           }
            
    }//GEN-LAST:event_addActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        subVenta misubVenta= new subVenta();
        misubVenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void btnArteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArteliminarActionPerformed
        EliminarFila();
    }//GEN-LAST:event_btnArteliminarActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
            if(tb.getRowCount()<1)
    {
        JOptionPane.showMessageDialog(this, "Error, no ingreso ningun producto");
    }
           else{
        TotalVenta();
    }
    }//GEN-LAST:event_btnTotalActionPerformed
       
    
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
            java.util.logging.Logger.getLogger(VentaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaV1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton GenerarVenta;
    private javax.swing.JToggleButton add;
    private javax.swing.JToggleButton btnArteliminar;
    private javax.swing.JToggleButton btnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JComboBox<String> medioPago;
    public static javax.swing.JTable tb;
    private javax.swing.JTextField txtRutPro;
    private javax.swing.JTextField txtVcomision;
    private javax.swing.JTextField txtVtotal;
    private javax.swing.JTextField txtnombreCliente;
    private javax.swing.JTextField txtnombreEmpleado;
    private javax.swing.JTextField txtrutCliente;
    private javax.swing.JTextField txtrutEmpleado;
    // End of variables declaration//GEN-END:variables
}
