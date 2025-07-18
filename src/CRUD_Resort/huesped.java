
package CRUD_Resort;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.UIManager;
/**
 *
 * @author Oscar Caceres Galindo
 */
public class huesped extends javax.swing.JFrame {
    conexion conn = new conexion();
    Connection cn=conn.Conectar();
    /**
     * Creates new form huesped
     */
    public huesped() {
        super("Registro de Huespedes");
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * ESTE METODO LLAMA DESDE EL CONSTRUCTOR PARA INICIALIZAR EL FORMULARIO.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        txt_idhuesped = new javax.swing.JTextField();
        btn_huesped = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_trabajo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_origen = new javax.swing.JTextField();
        txt_pais = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        lbl_mensaje = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("Historial del Huesped");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("ID DEL CLIENTE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("TELEFONO.......");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));

        btn_regresar.setBackground(new java.awt.Color(204, 204, 204));
        btn_regresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(255, 0, 51));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1161, 670, 120, -1));

        txt_idhuesped.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(txt_idhuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 330, 40));

        btn_huesped.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_huesped.setText("Buscar");
        btn_huesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huespedActionPerformed(evt);
            }
        });
        getContentPane().add(btn_huesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 110, 40));

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 440, 40));

        txt_apellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 440, 40));

        txt_direccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 1090, 40));

        txt_trabajo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txt_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 650, 40));

        txt_telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 280, 250, 40));

        txt_origen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txt_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 370, 40));

        txt_pais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txt_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 250, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("APELLIDOS..........");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("TRABAJO........");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("NACIONALIDAD.....");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("ORIGEN.........");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("DIRECCION.......");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("NOMBRES........");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1270, 200));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Registro de Huespedes");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        btn_limpiar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_limpiar.setText("LIMPIAR");
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 160, 80));

        btn_agregar.setBackground(new java.awt.Color(102, 255, 102));
        btn_agregar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 150, 80));

        lbl_mensaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lbl_mensaje.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(lbl_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 540, 40));

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_eliminar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_eliminar.setText("ELIMINAR");
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 670, 150, 80));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 10));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1270, 270));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO CAFIA SMALL.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1241, 16, -1, -1));

        btn_actualizar.setBackground(new java.awt.Color(255, 255, 51));
        btn_actualizar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_actualizar.setText("ACTUALIZAR");
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, 170, 80));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 10));
        jPanel2.add(jSeparator2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1280, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        new principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_huespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huespedActionPerformed
        // TODO add your handling code here:

        String idhuesped = txt_idhuesped.getText();

        try{
            PreparedStatement ps = cn.prepareStatement("SELECT nombre,apellido,origen,direccion,telefono,trabajo,pais FROM huespedes WHERE idhuesped=?");
            ps.setString(1, idhuesped);
            ResultSet rs=ps.executeQuery();

            if (rs.next()) {
                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String nombre       = rs.getString("nombre");
                String apellido     = rs.getString("apellido");
                String origen       = rs.getString("origen");
                String direccion    = rs.getString("direccion");
                String telefono     = rs.getString("telefono");
                String trabajo      = rs.getString("trabajo");
                String pais         = rs.getString("pais");

                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));
                txt_origen.setText(rs.getString("origen"));
                txt_direccion.setText(rs.getString("direccion"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_trabajo.setText(rs.getString("trabajo"));
                txt_pais.setText(rs.getString("pais"));
                String fechaHoraFormateada;
            }
            else {
                JOptionPane.showMessageDialog(this, "NO EXISTE EL HUESPED, \n Favor Agregalo!");
                //txt_idhuesped.setText(""); // Limpiar los campo si no hay huesped
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_origen.setText("");
                txt_direccion.setText("");
                txt_telefono.setText("");
                txt_trabajo.setText("");
                txt_pais.setText("");
                btn_agregar.setEnabled(true);
                lbl_mensaje.setText("HUESPED NUEVO");
            }

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"ALERTA!!!" + ex.getMessage());
        }
    }//GEN-LAST:event_btn_huespedActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        if (txt_idhuesped.getText().trim().isEmpty()||
                txt_nombre.getText().trim().isEmpty()||
                txt_apellido.getText().trim().isEmpty()||
                txt_origen.getText().trim().isEmpty()||
                txt_direccion.getText().trim().isEmpty()||
                txt_telefono.getText().trim().isEmpty()||
                txt_trabajo.getText().trim().isEmpty()||
                txt_pais.getText().trim().isEmpty()){
            
        UIManager.put("OptionPane.messageFont", new Font("Arial Black", Font.PLAIN, 18));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 16));
        JOptionPane.showMessageDialog(null, "COMPLETAR LOS CAMPOS REQUERIDOS", "Aviso", JOptionPane.WARNING_MESSAGE);

            //String mensajeHTML = "<html><body style='font-size: 18px;'>COMPLETAR LOS CAMPOS REQUERIDOS</body></html>";
            //JOptionPane.showMessageDialog(null, mensajeHTML, "Aviso", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(this,"COMPLETAR LOS CAMPOS REQUERIDOS");
           return;
            
        }
        try {
        
        PreparedStatement ps = cn.prepareStatement(
        "INSERT INTO huespedes (idhuesped, nombre, apellido, origen, direccion, telefono, trabajo, pais) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        
        ps.setString(1, txt_idhuesped.getText());
        ps.setString(2, txt_nombre.getText());
        ps.setString(3, txt_apellido.getText());
        ps.setString(4, txt_origen.getText());
        ps.setString(5, txt_direccion.getText());
        ps.setString(6, txt_telefono.getText());
        ps.setString(7, txt_trabajo.getText());
        ps.setString(8, txt_pais.getText());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Huesped Registrado correctamente.");
        
        txt_idhuesped.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_origen.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_trabajo.setText("");
        txt_pais.setText("");
        lbl_mensaje.setText("");
        //mostrardatos();
        //limpiarentradas();
        
        } catch (SQLException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar NUEVO Huesped: ");
}
    }//GEN-LAST:event_btn_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new huesped().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_huesped;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_idhuesped;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_origen;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_trabajo;
    // End of variables declaration//GEN-END:variables
}
