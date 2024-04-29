package exaesparzais284interface;
//librerias de conexion
import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos
public class exaHernandez284Interface extends javax.swing.JFrame {
 public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
   
        public exaHernandez284Interface() {
        initComponents();
    }
        
        public void conectarBase(){//inicia metodo conectar
    try{//inicia try
    //puente de conexion
    Class.forName("com.mysql.jdbc.Driver");//puente de conexion
       cn=DriverManager.getConnection("jdbc:mysql://localhost/bdexaesparzais284","root","");
       stmt=cn.createStatement();//genera sentencias sql
       JOptionPane.showMessageDialog(null,"CONEXION BD ESTABLECIDA \nEsparza");
    }catch(SQLException ex){//inicia exeption
        JOptionPane.showMessageDialog(null, ex);
    }catch(Exception e){//inica exception errores generales
        JOptionPane.showMessageDialog(null, e);
    }  
    }
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbIdEquipo = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        txtIdEquipo = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnReguistrarEquipo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCosultarEquipo = new javax.swing.JTable();
        btnConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta Equipos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lbIdEquipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbIdEquipo.setForeground(new java.awt.Color(255, 255, 255));
        lbIdEquipo.setText("Id Equipo");

        lbMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMarca.setForeground(new java.awt.Color(255, 255, 255));
        lbMarca.setText("Marca");

        lbModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbModelo.setForeground(new java.awt.Color(255, 255, 255));
        lbModelo.setText("Modelo");

        lbPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecio.setText("Precio");

        btnReguistrarEquipo.setText("Registrar Equipo");
        btnReguistrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReguistrarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbModelo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbIdEquipo)
                                    .addComponent(lbMarca)
                                    .addComponent(lbPrecio))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnReguistrarEquipo)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdEquipo)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnReguistrarEquipo)
                .addContainerGap())
        );

        jtCosultarEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtCosultarEquipo);

        btnConsulta.setText("Consultar Equipo");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConsulta)
                        .addGap(269, 269, 269))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsulta)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReguistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReguistrarEquipoActionPerformed
        conectarBase();//llamada a metodo conectar
        //declaracion de variables de entrada
        int idEquipo=Integer.parseInt(txtIdEquipo.getText());
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        String precio=txtPrecio.getText();
       
        //proceso guardar en la base de datos
  String altaEquipo="INSERT INTO bdexaesparzais284 VALUES ('"+idEquipo+"','"+marca+"','"+modelo+"','"+precio+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaEquipo);
            JOptionPane.showMessageDialog(null, "Se agrego equipo de forma correcta\n"+marca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD :\n"+ e);
        }//termina catch
    }//GEN-LAST:event_btnReguistrarEquipoActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                jtCosultarEquipo.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from bdexaesparzais284");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("IdProducto ");
                 modeloDatos.addColumn("Marca");
                 modeloDatos.addColumn("Modelo");
                 modeloDatos.addColumn("Precio");
                 while (rs.next()) { //inicia                    
                     //arreglo objetos para imprimir filas
                     Object [] fila = new Object[cantidadColumnas];
                     for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                         fila[i]=rs.getObject(i+1);
                     }//termina for
                     modeloDatos.addRow(fila);
                 }//termina while
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error de BD\n"+ ex);
             }//terrmina catch
    }//GEN-LAST:event_btnConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(exaHernandez284Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exaHernandez284Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exaHernandez284Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exaHernandez284Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exaHernandez284Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnReguistrarEquipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCosultarEquipo;
    private javax.swing.JLabel lbIdEquipo;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
