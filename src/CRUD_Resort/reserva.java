package CRUD_Resort;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class reserva extends javax.swing.JFrame {
    
    conexion con1 = new conexion();
    DefaultTableModel modelo;
  
    public reserva() {
        super("Reservacion de Habitaciones"); // Título de la ventana
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        mostrardatos();
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_mensaje = new javax.swing.JLabel();
        txt_idhuesped = new javax.swing.JTextField();
        btn_huesped = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_trabajo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_origen = new javax.swing.JTextField();
        txt_pais = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_room = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_confirmar = new javax.swing.JButton();
        jdc_reservar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_regresar.setBackground(new java.awt.Color(153, 153, 153));
        btn_regresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(255, 0, 51));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 657, 110, 100));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_mensaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lbl_mensaje.setForeground(new java.awt.Color(0, 255, 0));
        jPanel2.add(lbl_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 540, 40));

        txt_idhuesped.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel2.add(txt_idhuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 340, 40));

        btn_huesped.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_huesped.setText("Buscar");
        btn_huesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huespedActionPerformed(evt);
            }
        });
        jPanel2.add(btn_huesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 110, 40));

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 450, 30));

        txt_apellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 510, 30));

        txt_direccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 810, 30));

        txt_trabajo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 650, 30));

        txt_telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 160, 160, 30));

        txt_origen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 260, 30));

        txt_pais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 220, 30));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("HABITACIONES DISPONIBLES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("TELEFONO.......");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("APELLIDOS..........");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("DIRECCION.......");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("TRABAJO........");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("ORIGEN.........");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("NACIONALIDAD.....");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("NOMBRES........");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO CAFIA SMALL.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("ID DEL CLIENTE:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 102, 0));
        jLabel13.setText("DATOS GENERALES DEL CLIENTE");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, 30));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 102, 0));
        jLabel15.setText("Reservacion de Habitaciones");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        btn_actualizar.setBackground(new java.awt.Color(255, 255, 51));
        btn_actualizar.setText("ACTUALIZAR");
        jPanel2.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, 130, 30));

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 130, 30));

        btn_agregar.setBackground(new java.awt.Color(102, 255, 102));
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 250, 130, 30));

        jSeparator1.setBackground(new java.awt.Color(153, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 10));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1320, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1360, 310));

        tabla_room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Room", "Tipo", "Ubicacion", "Observaciones", "Huesped", "Reserva", "Status", "Precio", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_roomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_room);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1360, 270));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Fecha a Reservar...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        btn_confirmar.setBackground(new java.awt.Color(0, 204, 204));
        btn_confirmar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_confirmar.setText("CONFIRMAR");
        jPanel1.add(btn_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 130, 50));

        jdc_reservar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jdc_reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 230, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        new principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

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

            return;

        }
        try {
            Connection conet= con1.Conectar();

            PreparedStatement ps = conet.prepareStatement(
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
            UIManager.put("OptionPane.messageFont", new Font("Arial Black", Font.PLAIN, 18));
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 16));
            //JOptionPane.showMessageDialog(null, "COMPLETAR LOS CAMPOS REQUERIDOS", "Aviso", JOptionPane.WARNING_MESSAGE);
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
conet.close();
ps.close();

        }
        catch (SQLException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar NUEVO Huesped: ");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_huespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huespedActionPerformed
        // TODO add your handling code here:
       
        try{
             Connection conet= con1.Conectar();
             String idhuesped = txt_idhuesped.getText();

            PreparedStatement ps = conet.prepareStatement("SELECT nombre,apellido,origen,direccion,telefono,trabajo,pais FROM huespedes WHERE idhuesped=?");
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
        conet.close();
        ps.close();
        rs.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"ALERTA!!!" + ex.getMessage());
        }
    }//GEN-LAST:event_btn_huespedActionPerformed

    private void tabla_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_roomMouseClicked
        // TODO add your handling code here:
        
        //  PONER TODO LO RELACIONADO A LA RESERVACION
        
        
    }//GEN-LAST:event_tabla_roomMouseClicked

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_origen.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_trabajo.setText("");
        txt_pais.setText("");
        btn_agregar.setEnabled(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reserva().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_huesped;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private com.toedter.calendar.JDateChooser jdc_reservar;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JTable tabla_room;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_idhuesped;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_origen;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_trabajo;
    // End of variables declaration//GEN-END:variables
    
    
private void mostrardatos() {
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID Room");
        modelo.addColumn("Tipo");
        modelo.addColumn("Precio");
        modelo.addColumn("Ubicacion");
        modelo.addColumn("Observaciones");
        modelo.addColumn("ID Huesped");
        modelo.addColumn("ID Reserva");
        modelo.addColumn("Status");
        modelo.addColumn("Check_IN");
        modelo.addColumn("Check_OUT");
        
        tabla_room.setModel(modelo);
        String query="select * from habitacion";
        
        Connection conet=con1.Conectar();
        
        try{
            Statement st = conet.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String[] fila = new String[10];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);
                fila[8] = rs.getString(9);
                fila[9] = rs.getString(10);
                
                modelo.addRow(fila);
            }
            // Limita cada columna a 200 píxeles de ancho máximo
            //ajustarAnchoColumnas(table_datos, 150);
            rs.close();
            st.close();
            //codigo para saber el total de registros
            //lbl_total.setText("Total de registros: " + jtable_datos.getRowCount());
            //txt_total.setText(String.valueOf(jtable_datos.getRowCount()));
        conet.close();
        
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: ");
        }
    }      
    
}
