/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DATANET.GIU;
import DATANET.BL.cargoBL;
import DATANET.BL.categoriaBL;
import DATANET.BL.dispositivoBL;
import DATANET.BL.distritoBL;
import DATANET.BL.estadoBL;
import DATANET.GIU.OPCIONES.EXITOSO;
import static java.lang.Short.toString;
import java.sql.ResultSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pe.edu.upn.datanet.Conexion;


/**
 *
 * @author Màximo
 */
public class Cargo extends javax.swing.JFrame {
    
    DefaultTableModel mode1;
    /**
     * Creates new form Distrito
     */
    public Cargo() {
        initComponents();
        String[] titulos = {"CODIGO DE CARGO","DESCRIPCION DE CARGO"};
        mode1 = new DefaultTableModel(null,titulos);
        tblDispositivo.setModel(mode1);
        this.mostrardatos();
        this.limpiar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDes_Cargo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDispositivo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCod_Cargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtDes_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDes_CargoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDes_Cargo);
        txtDes_Cargo.setBounds(190, 230, 408, 32);

        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Màximo\\Desktop\\DATANET\\DATANET\\IMAGENES\\OK_16.png")); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(110, 300, 125, 41);

        btnModificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Màximo\\Desktop\\DATANET\\DATANET\\IMAGENES\\EDITAR_16.png")); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(250, 300, 125, 41);

        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Màximo\\Desktop\\DATANET\\DATANET\\IMAGENES\\ELIMINAR_CIRCULO_16.png")); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(390, 300, 125, 41);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("DES. CARGO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 240, 121, 24);

        tblDispositivo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDispositivo.setAutoscrolls(false);
        tblDispositivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDispositivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDispositivo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(6, 375, 600, 289);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CARGO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 50, 190, 57);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("COD. CARGO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 200, 180, 24);

        txtCod_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_CargoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCod_Cargo);
        txtCod_Cargo.setBounds(190, 190, 215, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Màximo\\Desktop\\DATANET\\DATANET\\IMAGENES\\VOLVER.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(570, 10, 30, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Màximo\\Desktop\\DATANET\\DATANET\\IMAGENES\\FONDO.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 610, 150);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDes_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDes_CargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDes_CargoActionPerformed

    private void txtCod_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_CargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCod_CargoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Conexion objconexion = new Conexion();
        cargoBL oCargo= recuperarDatosGIU();
        String strSentenciaInsert = String.format("INSERT INTO CARGO (Cod_Cargo, Des_Cargo) "
                + "VALUES('%s','%s')",oCargo.getCod_cargo(),oCargo.getDes_cargo());
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrardatos();
        this.limpiar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblDispositivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDispositivoMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount()==1){
            JTable receptor = (JTable) evt.getSource();
            txtCod_Cargo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtDes_Cargo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
        }
        btnAgregar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblDispositivoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion objconexion = new Conexion();
        cargoBL oCargo= recuperarDatosGIU();
        String strSentenciaInsert = String.format("DELETE FROM CARGO WHERE Cod_Cargo = '%s'",oCargo.getCod_cargo());
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrardatos();
        this.limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Conexion objconexion = new Conexion();
        
        cargoBL oCargo= recuperarDatosGIU();
        
        String strSentenciaInsert = String.format("UPDATE CARGO SET Des_Cargo='%s' "
                + "WHERE Cod_Cargo = '%s'",oCargo.getDes_cargo(),oCargo.getCod_cargo());
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrardatos();
        this.limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        INTERFAZ_2 f = new INTERFAZ_2();
        f.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked
    
    public void mostrardatos(){
        
        while (mode1.getRowCount()>0) {
            mode1.removeRow(0);
        }
        
        Conexion objconexion = new Conexion();
        try {
            ResultSet resultado = objconexion.consultarRegistros("SELECT * FROM CARGO");
            while (resultado.next()) {
                System.out.println(resultado.getString("Cod_Cargo"));
                System.out.println(resultado.getString("Des_Cargo"));
                Object[] oCargo= {resultado.getString("Cod_Cargo"),resultado.getString("Des_Cargo")};
                mode1.addRow(oCargo);
            }
        } catch (Exception e) {
                System.out.print(e);
        }
    }
    
    public cargoBL recuperarDatosGIU() {
        cargoBL oCargo = new cargoBL();
        
        oCargo.setCod_cargo(txtCod_Cargo.getText());
        oCargo.setDes_cargo(txtDes_Cargo.getText());

        return oCargo;
    }
    
    public void limpiar(){
        txtCod_Cargo.setText("");
        txtDes_Cargo.setText("");
        
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDispositivo;
    private javax.swing.JTextField txtCod_Cargo;
    private javax.swing.JTextField txtDes_Cargo;
    // End of variables declaration//GEN-END:variables
}
