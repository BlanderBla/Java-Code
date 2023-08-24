/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ConsultarBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarBiblioteca
     */
    public ConsultarBiblioteca() {
        initComponents();
    }
    
    int id_Alumno;
    String nombre_Alumno;
    String apellido_Paterno;
    String apellido_Materno;
    
    public void informacion(int id, String c1, String c2, String c3){
        id_Alumno = id;
        nombre_Alumno = c1;
        apellido_Paterno = c2;
        apellido_Materno = c3;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
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
        jLabel16 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        txtAutor = new javax.swing.JLabel();
        txtGenero = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JLabel();
        txtPais = new javax.swing.JLabel();
        txtISBN = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtNPag = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JLabel();
        txtEjemplares = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        regrsar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtID_Libro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros96.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("El Futuro de Mexico CONSULTAR LIBROS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Ingrese titulo del libro a consultar");

        btn_buscar.setBackground(new java.awt.Color(204, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Libro");

        jLabel6.setText("Autor");

        jLabel7.setText("Genero");

        jLabel8.setText("Editorial");

        jLabel9.setText("País");

        jLabel10.setText("ISBN");

        jLabel11.setText("Edición");

        jLabel12.setText("Fecha de publicacion");

        jLabel13.setText("No. Paginas");

        jLabel14.setText("Idioma");

        jLabel15.setText("Descripcion");

        jLabel16.setText("Ejemplares");

        txtTitulo.setText("_");

        txtAutor.setText("_");

        txtGenero.setText("_");

        txtEditorial.setText("_");

        txtPais.setText("_");

        txtISBN.setText("_");

        txtEdicion.setText("_");

        txtFecha.setText("_");

        txtNPag.setText("_");

        txtIdioma.setText("_");

        txtEjemplares.setText("_");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        regrsar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return26.png"))); // NOI18N
        regrsar.setText("Regresar");
        regrsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrsarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Libro");

        txtID_Libro.setText("_");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regrsar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtEjemplares))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdioma))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtNPag))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtID_Libro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtAutor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtGenero))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtEditorial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtPais))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtISBN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdicion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID_Libro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEditorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtISBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEdicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNPag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtIdioma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtEjemplares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regrsar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        Excepciones exception = new Excepciones();
        String tituloR = tfTitulo.getText(), titulo = "";
        int idLibro;
        int idAutor;
        int idGenero;
        int idEditorial;
        int idPais;
        String nombre, apellido, nombreT = "", generoF = "", editorialF = "", paisF = "", fecha = "", idioma = "", descripcion = "";
        int isbn, edicion, noPaginas, noEjemplares;
        
        String url = "jdbc:derby://localhost:1527/Biblioteca_Proyecto";
        String usuarioBD = "root";
        String passwordBD = "12345";
        
        try{
            //  Validamos que se hayan ingresado los datos
            exception.campoVacio(tituloR);
            if(tituloR.length() != 0){
                titulo = tituloR;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese al menos un valor");
        }
        
        try{
            Connection conn = DriverManager.getConnection(url,usuarioBD,passwordBD);
            //  Si el usuario ingrso titulo y autor
            if(titulo.length() != 0){
                //  Primero consultamos el ID del autor
                String querry = "SELECT * FROM LIBRO WHERE TITULO = '"+titulo+"'";
                Statement sts = conn.createStatement();
                ResultSet rs = sts.executeQuery(querry);
                if(rs.next()){
                    System.out.println("Existe");
                    idLibro = rs.getInt("ID_LIBRO");
                    idAutor = rs.getInt("ID_AUTOR");
                    idGenero = rs.getInt("ID_GENERO");
                    idEditorial = rs.getInt("ID_EDITORIAL");
                    idPais = rs.getInt("ID_PAIS");
                    isbn = rs.getInt("ISBN");
                    edicion = rs.getInt("EDICION");
                    fecha = rs.getString("FECHAPUBLICACION");
                    noPaginas = rs.getInt("NO_PAGINAS");
                    idioma = rs.getString("IDIOMA");
                    descripcion = rs.getString("DESCRIPCION");  
                    noEjemplares = rs.getInt("NO_EJEMPLARES");
                    
                    txtID_Libro.setText(Integer.toString(idLibro));
                    //  Buscamos Autor
                    querry = "SELECT * FROM AUTOR WHERE ID_AUTOR = "+idAutor+"";
                    sts = conn.createStatement();
                    rs = sts.executeQuery(querry);
                    if(rs.next()){
                        nombre = rs.getString("NOMBRE_AUTOR");
                        apellido = rs.getString("APELLIDO_AUTOR");
                        nombreT = nombre+" "+apellido;
                        System.out.println(nombreT);
                    }
                    //  Buscamos Genero
                    querry = "SELECT * FROM GENERO WHERE ID_GENERO = "+idGenero+"";
                    sts = conn.createStatement();
                    rs = sts.executeQuery(querry);
                    if(rs.next()){
                        String genero = rs.getString("SUBGENERO");
                        generoF = genero;
                        System.out.println(generoF);
                    }
                    //  Buscamos Editorial
                    querry = "SELECT * FROM EDITORIAL WHERE ID_EDITORIAL = "+idEditorial+"";
                    sts = conn.createStatement();
                    rs = sts.executeQuery(querry);
                    if(rs.next()){
                        String editorial = rs.getString("EDITORIAL");
                        editorialF = editorial;
                        System.out.println(editorialF);
                    }
                    //  Buscamos Pais
                    querry = "SELECT * FROM PAIS WHERE ID_PAIS = "+idPais+"";
                    sts = conn.createStatement();
                    rs = sts.executeQuery(querry);
                    if(rs.next()){
                        String pais = rs.getString("PAIS");
                        paisF = pais;
                        System.out.println(paisF);
                    }
                    
                    txtTitulo.setText(titulo);
                    txtAutor.setText(nombreT);
                    txtGenero.setText(generoF);
                    txtEditorial.setText(editorialF);
                    txtPais.setText(paisF);
                    txtISBN.setText(Integer.toString(isbn));
                    txtEdicion.setText(Integer.toString(edicion));
                    txtFecha.setText(fecha);
                    txtNPag.setText(Integer.toString(noPaginas));
                    txtIdioma.setText(idioma);
                    txtDescripcion.setText(descripcion);
                    txtEjemplares.setText(Integer.toString(noEjemplares));
                    
                }else{
                    System.out.println("no existe");
                    JOptionPane.showMessageDialog(null, "No se encontro el libro");
                }
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
            System.out.println("No se establecio conexion");
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void regrsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrsarActionPerformed
        // TODO add your handling code here:
        MenuAlumno mA = new MenuAlumno();
        mA.informacion(id_Alumno, nombre_Alumno, apellido_Paterno, apellido_Materno);
        mA.setVisible(true);
        dispose();
    }//GEN-LAST:event_regrsarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JButton regrsar;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JLabel txtEdicion;
    private javax.swing.JLabel txtEditorial;
    private javax.swing.JLabel txtEjemplares;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtID_Libro;
    private javax.swing.JLabel txtISBN;
    private javax.swing.JLabel txtIdioma;
    private javax.swing.JLabel txtNPag;
    private javax.swing.JLabel txtPais;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
