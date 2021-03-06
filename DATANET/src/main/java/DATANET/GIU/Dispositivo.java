/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DATANET.GIU;
import DATANET.BL.dispositivoBL;
import DATANET.BL.distritoBL;
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
public class Dispositivo extends javax.swing.JFrame {
    
    DefaultTableModel mode1;
    /**
     * Creates new form Distrito
     */
    public Dispositivo() {
        initComponents();
        String[] titulos = {"CODIGO DE DISPOSITIVO","TIPO DE DISPOSITIVO"};
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
        txtTip_Dispositivo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDispositivo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCod_Dispositivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtTip_Dispositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTip_DispositivoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTip_Dispositivo);
        txtTip_Dispositivo.setBounds(190, 230, 408, 32);

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
        jLabel3.setText("TIP. DISPOSITIVO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 240, 161, 24);

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
        jLabel1.setText("DISPOSITIVO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 60, 310, 57);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("COD. DISPOSITIVO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 200, 180, 24);

        txtCod_Dispositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_DispositivoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCod_Dispositivo);
        txtCod_Dispositivo.setBounds(190, 190, 215, 32);

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

    private void txtTip_DispositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTip_DispositivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTip_DispositivoActionPerformed

    private void txtCod_DispositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_DispositivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCod_DispositivoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Conexion objconexion = new Conexion();
        
        dispositivoBL oDispositivos= recuperarDatosGIU();
        
        String strSentenciaInsert = String.format("INSERT INTO DISPOSITIVO (Cod_Dispositivo, Tip_Dispositivo) "
                + "VALUES('%s','%s')",oDispositivos.getCod_dipositivo(),oDispositivos.getTip_dipositivo());
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrardatos();
        this.limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblDispositivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDispositivoMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount()==1){
            JTable receptor = (JTable) evt.getSource();
            txtCod_Dispositivo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtTip_Dispositivo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
        }
        btnAgregar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblDispositivoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion objconexion = new Conexion();
        dispositivoBL oDispositivos= recuperarDatosGIU();
        String strSentenciaInsert = String.format("DELETE FROM DISTRITO WHERE Cod_Dispositivo = '%s'",oDispositivos.getCod_dipositivo());
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrardatos();
        this.limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Conexion objconexion = new Conexion();
        
        dispositivoBL oDispositivos= recuperarDatosGIU();
        
        String strSentenciaInsert = String.format("UPDATE DISPOSITIVO SET Tip_Dispositivo='%s' "
                + "WHERE Cod_Dispositivo = '%s'",oDispositivos.getTip_dipositivo(),oDispositivos.getCod_dipositivo());
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
            ResultSet resultado = objconexion.consultarRegistros("SELECT * FROM DISPOSITIVO");
            while (resultado.next()) {
                System.out.println(resultado.getString("Cod_Dispositivo"));
                System.out.println(resultado.getString("Tip_Dispositivo"));
                Object[] oDispositivo = {resultado.getString("Cod_Dispositivo"),resultado.getString("Tip_Dispositivo")};
                mode1.addRow(oDispositivo);
            }
        } catch (Exception e) {
                System.out.print(e);
        }
    }
    
    public dispositivoBL recuperarDatosGIU() {
        dispositivoBL oDispositivo = new dispositivoBL();
        
        oDispositivo.setCod_dipositivo(txtCod_Dispositivo.getText());
        oDispositivo.setTip_dipositivo(txtTip_Dispositivo.getText());

        return oDispositivo;
    }
    
    public void limpiar(){
        txtCod_Dispositivo.setText("");
        txtTip_Dispositivo.setText("");
        
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
            java.util.logging.Logger.getLogger(Dispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dispositivo().setVisible(true);
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
    private javax.swing.JTextField txtCod_Dispositivo;
    private javax.swing.JTextField txtTip_Dispositivo;
    // End of variables declaration//GEN-END:variables
}
