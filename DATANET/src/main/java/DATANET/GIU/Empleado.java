/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DATANET.GIU;


import DATANET.BL.empleadoBL;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pe.edu.upn.datanet.Conexion;


/**
 *
 * @author USER
 */
public class Empleado extends javax.swing.JFrame {

    DefaultTableModel mode1;
    /**
     * Creates new form frmEmpleado
     */
    public Empleado() {
        initComponents();
        String[] titulos = {"CODIGO", "DNI", "NOMBRE", "APELLIDO PATERNO" , "APELLIDO MATERNO" , "DIRECCION" , "CODIGO DEL DISTRITO" , "EDAD" , "TELEFONO" , "CELULAR", "CODIGO DEL CARGO", "CODIGO DEL LOCAL", "USUARIO", "CONTRASEÑA"};
        mode1 = new DefaultTableModel(null,titulos);
        tblEmpleado.setModel(mode1);
        mostrarDatos() ;
        limpiar();
    }
    
    public void mostrarDatos(){
        while (mode1.getRowCount()>0) {
            mode1.removeRow(0);
        }
        
        Conexion objetoConexion = new Conexion();
        try {
            ResultSet resultado = objetoConexion.consultarRegistros("SELECT * FROM EMPLEADO");
            while (resultado.next()) {
                System.out.println(resultado.getString("Cod_Empleado"));
                System.out.println(resultado.getString("Dni_Empleado"));
                System.out.println(resultado.getString("Nom_Empleado"));
                System.out.println(resultado.getString("Appat_Empleado"));
                System.out.println(resultado.getString("Apmat_Empleado"));
                System.out.println(resultado.getString("Direc_Empleado"));
                System.out.println(resultado.getString("Cod_Distrito"));
                System.out.println(resultado.getString("Fnac_Empleado"));
                System.out.println(resultado.getString("Telef_Empleado"));
                System.out.println(resultado.getString("Cel_Empleado"));
                System.out.println(resultado.getString("Cod_Cargo"));
                System.out.println(resultado.getString("Cod_Local"));
                System.out.println(resultado.getString("User_Empleado"));
                System.out.println(resultado.getString("Password_Empleado"));
                
                Object[] oEmpleados = {resultado.getString("Cod_Empleado"),resultado.getString("Dni_Empleado"),resultado.getString("Nom_Empleado"),resultado.getString("Appat_Empleado"),resultado.getString("Apmat_Empleado"),resultado.getString("Direc_Empleado"),resultado.getString("Cod_Distrito"),resultado.getString("Fnac_Empleado"),resultado.getString("Telef_Empleado"),resultado.getString("Cel_Empleado"),resultado.getString("Cod_Cargo"),resultado.getString("Cod_Local"),resultado.getString("User_Empleado"),resultado.getString("Password_Empleado")};
                mode1.addRow(oEmpleados);
            }
        } catch (Exception e) {
                System.out.print(e);
        }
    }
    
   
    public void limpiar(){
        txtCodigo.setText("");
        txtDNI.setText("");
        txtNombre.setText("");
        txtAppat.setText("");
        txtApmat.setText("");
        txtDireccion.setText("");
        txtCodigoDistrito.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtCodigoCargo.setText("");
        txtCodigoLocal.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAppat = new javax.swing.JTextField();
        txtApmat = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCodigoDistrito = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCodigoLocal = new javax.swing.JTextField();
        txtCodigoCargo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("CODIGO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 110, 55, -1));

        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 138, 37, -1));

        jLabel4.setText("NOMBRE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 172, 57, -1));

        jLabel5.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 246, -1, -1));

        jLabel6.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 212, -1, -1));

        jLabel7.setText("DIRECCION");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 280, -1, -1));

        jLabel8.setText("CODIGO DEL DISTRITO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 314, -1, -1));

        jLabel9.setText("EDAD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 342, 37, -1));

        jLabel10.setText("TELEFONO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 382, 65, -1));

        jLabel11.setText("CELULAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 416, 65, -1));

        jLabel12.setText("CODIGO DEL CARGO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 450, 144, -1));

        jLabel13.setText("CODIGO DEL LOCAL");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 484, -1, -1));

        jLabel14.setText("USUARIO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 518, 80, -1));

        jLabel15.setText("CONTRASEÑA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 552, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 104, 128, -1));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 138, 128, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 172, 128, -1));
        getContentPane().add(txtAppat, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 206, 128, -1));
        getContentPane().add(txtApmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 240, 128, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 274, 128, -1));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 342, 128, -1));
        getContentPane().add(txtCodigoDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 308, 128, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 376, 128, -1));
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 410, 128, -1));
        getContentPane().add(txtCodigoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 478, 128, -1));
        getContentPane().add(txtCodigoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 444, 128, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 512, 128, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 546, 128, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Màximo\\Desktop\\DATANET\\DATANET\\IMAGENES\\VOLVER.png")); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLEADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Màximo\\Desktop\\DATANET\\DATANET\\IMAGENES\\FONDO.jpg")); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 960));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Conexion objetoConexion = new Conexion();
        
        empleadoBL oEmpleados = new empleadoBL();
        
        String strSentenciaInsert = String.format("INSERT INTO EMPLEADO (Cod_Empleado, Dni_Empleado, Nom_Empleado, Appat_Empleado, Apmat_Empleado, Direc_Empleado, Cod_Distrito, Fnac_Empleado, Telef_Empleado, Cel_Empleado, Cod_Cargo, Cod_Local, User_Empleado, Password_Empleado) VALUES ('%s', '%d', '%s', '%s', '%s', '%s', '%s', '%d', '%d', '%d', '%s', '%s', '%s', '%s')", oEmpleados.getCod_Empleado(), oEmpleados.getDni_Empleado(), oEmpleados.getNom_Empleado(),oEmpleados.getAppat_Empleado(), oEmpleados.getApmat_Empleado(), oEmpleados.getDirec_Empleado(), oEmpleados.getCod_Distrito(), oEmpleados.getFnac_Empleado(), oEmpleados.getTelef_Empleado(), oEmpleados.getCel_Empleado(), oEmpleados.getCod_Cargo(), oEmpleados.getCod_Local(), oEmpleados.getUser_Empleado(), oEmpleados.getPassword_Empleado());
        
        objetoConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1){
            JTable receptor = (JTable) evt.getSource();
            txtCodigo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtDNI.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            txtAppat.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
            txtApmat.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
            txtDireccion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
            txtCodigoDistrito.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),6).toString());
            txtEdad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),7).toString());
            txtTelefono.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),8).toString());
            txtCelular.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),9).toString());
            txtCodigoCargo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),10).toString());
            txtCodigoLocal.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),11).toString());
            txtUsuario.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),12).toString());
            txtContraseña.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),13).toString());

        }
        btnAgregar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        Conexion objetoConexion = new Conexion();
        
        empleadoBL oEmpleados= recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("UPDATE Empleado SET Dni_Empleado='%d', Nom_Empleado='%s', Appat_Empleado='%s', Apmat_Empleado='%s',Direc_Empleado='%s',Cod_Distrito='%s',Fnac_Empleado='%d',Telef_Empleado='%d',Cel_Empleado='%d', Cod_Cargo='%s', Cod_Local='%s', User_Empleado='%s', Password_Empleado='%s' "
                + "WHERE Cod_Empleado = '%s'",oEmpleados.getDni_Empleado(),oEmpleados.getNom_Empleado(),oEmpleados.getAppat_Empleado(),oEmpleados.getApmat_Empleado(),oEmpleados.getDirec_Empleado(),oEmpleados.getCod_Distrito(),oEmpleados.getFnac_Empleado(),oEmpleados.getTelef_Empleado(),oEmpleados.getCel_Empleado(),oEmpleados.getCod_Cargo(),oEmpleados.getCod_Local(),oEmpleados.getUser_Empleado(),oEmpleados.getPassword_Empleado(),oEmpleados.getCod_Empleado());
        objetoConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Conexion objetoConexion = new Conexion();
        empleadoBL oEmpleados= recuperarDatosGUI();
        String strSentenciaInsert = String.format("DELETE FROM Empleado WHERE Cod_Empleado = '%s'",oEmpleados.getCod_Empleado());
        objetoConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        INTERFAZ_2 f = new INTERFAZ_2();
        f.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    public empleadoBL recuperarDatosGUI(){
        empleadoBL oEmpleados = new empleadoBL();

        int DNI = (txtDNI.getText().isEmpty()?0: Integer.parseInt(txtDNI.getText()));
        int Telefono = (txtTelefono.getText().isEmpty()?0: Integer.parseInt(txtTelefono.getText()));
        int Edad = (txtEdad.getText().isEmpty()?0: Integer.parseInt(txtEdad.getText()));
        int Celular = (txtCelular.getText().isEmpty()?0: Integer.parseInt(txtCelular.getText()));

        oEmpleados.setCod_Empleado(txtCodigo.getText());
        oEmpleados.setDni_Empleado(Integer.parseInt(txtDNI.getText()));
        oEmpleados.setNom_Empleado(txtNombre.getText());
        oEmpleados.setAppat_Empleado(txtAppat.getText());
        oEmpleados.setApmat_Empleado(txtApmat.getText());
        oEmpleados.setDirec_Empleado(txtDireccion.getText());
        oEmpleados.setCod_Distrito(txtCodigoDistrito.getText());
        oEmpleados.setFnac_Empleado(txtEdad.getText());
        oEmpleados.setTelef_Empleado(txtTelefono.getText().isEmpty()?0: Integer.parseInt(txtTelefono.getText()));
        oEmpleados.setCel_Empleado(txtCelular.getText().isEmpty()?0: Integer.parseInt(txtCelular.getText()));
        oEmpleados.setCod_Cargo(txtCodigoCargo.getText());
        oEmpleados.setCod_Local(txtCodigoLocal.getText());
        oEmpleados.setUser_Empleado(txtUsuario.getText());
        oEmpleados.setPassword_Empleado(txtContraseña.getText());

        return oEmpleados;
    }
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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApmat;
    private javax.swing.JTextField txtAppat;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoCargo;
    private javax.swing.JTextField txtCodigoDistrito;
    private javax.swing.JTextField txtCodigoLocal;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
