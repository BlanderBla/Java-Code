/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * Brayan Adrian Galván Flores || 181112
 */
public class AltaLibro extends javax.swing.JFrame {

    /**
     * Creates new form AltaLibro
     */
    int ejemplar;
    String autors,ejemplarString;
    String titulo;
    String isbn;
    String autor;
    String editorial;
    String edicion;
    int edicionF,idAutor,idGenero,idEditorial,idPais;
    String pais;
    String subgenero;
    String descripcion;
    String noPag;
    int noPagF;
    String idioma;
    String fechaPublicacion;
        String dia;
        int diaNum;
        String mes;
        int mesNum;
        String anio;
        int anioNum;
    
    String url = "jdbc:derby://localhost:1527/Biblioteca_Proyecto";
    String usuarioBD = "root";
    String passwordBD = "12345";
    
    public AltaLibro() {
        initComponents();
        try{
            Connection conn = DriverManager.getConnection(url,usuarioBD,passwordBD);
            Statement sts = conn.createStatement();
            //  AUTOR
            ResultSet rs = sts.executeQuery("SELECT * FROM AUTOR");
            while(rs.next()){
                autors=rs.getString("NOMBRE_AUTOR");
                cbAutor.addItem(rs.getString("NOMBRE_AUTOR")+" "+rs.getString("APELLIDO_AUTOR"));
                
            }
            //  EDITORIAL
            rs = sts.executeQuery("SELECT * FROM EDITORIAL");
            while(rs.next()){
                cbEditorial.addItem(rs.getString("EDITORIAL"));
            }
            //  PAIS
            rs = sts.executeQuery("SELECT * FROM PAIS");
            while(rs.next()){
                cbPais.addItem(rs.getString("PAIS"));
            }
            //  SUBGENERO
            rs = sts.executeQuery("SELECT * FROM GENERO");
            while(rs.next()){
                cbSubgenero.addItem(rs.getString("SUBGENERO"));
            }
            
          
           
            System.out.println("Proceso terminado");
            sts.close();
            conn.close();
                
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
            System.out.println("No se establecio conexion");
            System.out.println(ex);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        tituloLibro = new javax.swing.JTextField();
        textisbn = new javax.swing.JTextField();
        textdescripcion = new javax.swing.JTextField();
        textidioma = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        textpag = new javax.swing.JTextField();
        cbAutor = new javax.swing.JComboBox();
        cbEditorial = new javax.swing.JComboBox();
        cbPais = new javax.swing.JComboBox();
        cbSubgenero = new javax.swing.JComboBox();
        btnNA = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnE = new javax.swing.JButton();
        cbEdicion = new javax.swing.JComboBox<String>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        taDay = new javax.swing.JTextField();
        taYear = new javax.swing.JTextField();
        cbMonth = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        ejempl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(259, 274));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros96.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("El Futuro de Mexico GESTION DE LIBROS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(105, 105, 105))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(483, 800));

        jLabel2.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel2.setText("Titulo");

        jLabel4.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel4.setText("ISBN");

        jLabel5.setFont(new java.awt.Font("Tunga", 0, 24)); // NOI18N
        jLabel5.setText("Datos del libro");

        jLabel6.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel6.setText("Autor");

        jLabel7.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel7.setText("Editorial");

        jLabel8.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel8.setText("Edición");

        jLabel9.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel9.setText("País");

        jLabel10.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel10.setText("Subgénero");

        jLabel11.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel11.setText("Descripción");

        jLabel12.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel12.setText("Número de Páginas");

        jLabel13.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel13.setText("Idioma");

        jLabel14.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel14.setText("Fecha Publicación");

        textdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdescripcionActionPerformed(evt);
            }
        });

        textidioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidiomaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return26.png"))); // NOI18N
        jButton1.setText("   Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(204, 255, 255));
        registrar.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        btnNA.setText("Nuevo autor");
        btnNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNAActionPerformed(evt);
            }
        });

        jLabel15.setText("Agregar nuevo autor");

        jLabel16.setText("Agregar nueva editorial");

        btnE.setText("Nueva editorial");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        cbEdicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jLabel17.setText("Dia");

        jLabel18.setText("Mes");

        jLabel19.setText("Año");

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel20.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel20.setText("Ejemplares");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(textdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 165, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(textidioma, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(textpag, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(ejempl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14))))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cbSubgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnNA, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cbEditorial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jButton1))
                                .addGap(157, 157, 157)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(18, 18, 18)
                                                .addComponent(taDay, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(taYear))))
                                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textidioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNA)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20)
                    .addComponent(ejempl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btnE)
                    .addComponent(jLabel17)
                    .addComponent(taDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(taYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSubgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       EnlaceLibros e = new EnlaceLibros();
        e.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdescripcionActionPerformed

    private void btnNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNAActionPerformed
        // TODO add your handling code here:
        AltaAutor nAutor = new AltaAutor();
        nAutor.setVisible(true);
    }//GEN-LAST:event_btnNAActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
        AltaEditorial nEditorial = new AltaEditorial();
        nEditorial.setVisible(true);
    }//GEN-LAST:event_btnEActionPerformed

    private void textidiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidiomaActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        Excepciones excepcion = new Excepciones();
        
        String titulo = null,isbn = null,edicion = null,descripcion = null,idioma = null;
        int isbnn = 0;
        int paginas;
        boolean validacion = true,val=true;
        String error = "";
        String errorValid = ""; 
         titulo = tituloLibro.getText();
            if(titulo.length()==0){
                val=false;
             JOptionPane.showMessageDialog(null, "No puede dejar campos vacios en titulo");

            }
        try{
            
            isbn = textisbn.getText();
            if(isbn.length()<6 && isbn.length()>6){
              JOptionPane.showMessageDialog(null, "Ingrese solo 6 digitos del ISBN");
              val=false;
            }
            isbnn=Integer.parseInt(isbn);
            
            excepcion.campoVacio(isbn);
            //  Autor
            autor = cbAutor.getSelectedItem().toString();
            //  Editorial
            editorial = cbEditorial.getSelectedItem().toString();
            //  Edicion
            edicion = cbEdicion.getSelectedItem().toString();
            edicionF = Integer.parseInt(edicion);
            //  Descripción
            descripcion = textdescripcion.getText();
            excepcion.campoVacio(descripcion);
            //  Pais
            pais = cbPais.getSelectedItem().toString();
            //  Subgenero
            subgenero = cbSubgenero.getSelectedItem().toString();
            //  Descripcion
            descripcion = textdescripcion.getText();
            //  Numero de paginas
            noPag = textpag.getText();
            if(noPag.matches("^[A-Za-z]*$")){
                 val=false;
              JOptionPane.showMessageDialog(null, "No puede ingresar letras");

              }
            noPagF = Integer.parseInt(noPag);
             
            //  Idioma
            idioma = textidioma.getText();
           excepcion.campoVacio(idioma);
            //  Fecha de publicacion
                //Dia
            dia = taDay.getText();
            excepcion.campoVacio(dia);
            diaNum = Integer.parseInt(dia);
            excepcion.fechaDia(diaNum);
                //Mes
            mes = cbMonth.getSelectedItem().toString();
            mesNum = Integer.parseInt(mes);
                //Año
            anio = taYear.getText();
           // excepcion.campoVacio(anio);
            anioNum = Integer.parseInt(anio);
            fechaPublicacion = dia+"/"+mesNum+"/"+anioNum;
            //ejemplares
            ejemplarString=ejempl.getText();
            ejemplar = Integer.parseInt(ejemplarString);
            
        }
        
        catch(Exception ex){
            validacion = false;
            JOptionPane.showMessageDialog(null, "No puedes dejar campos vacios");
            
        }
        
        //  SE REALIZA LA CONEXION A LA BASE DE DATOS
        try{    
            Connection conn = DriverManager.getConnection(url,usuarioBD,passwordBD);              
            //  Genero
            String querry = "SELECT * FROM GENERO WHERE SUBGENERO = '"+subgenero+"'";
            Statement sts = conn.createStatement();
            ResultSet rs = sts.executeQuery(querry);
            if(rs.next()){
                System.out.println("Existe");
                idGenero = rs.getInt("ID_GENERO");
            }
            
            //  EDITORIAL
            querry = "SELECT * FROM EDITORIAL WHERE EDITORIAL = '"+editorial+"'";
            sts = conn.createStatement();
            rs = sts.executeQuery(querry);
            if(rs.next()){
                System.out.println("Existe");
                 idEditorial = rs.getInt("ID_EDITORIAL");
            }
            
            //  PAIS
            querry = "SELECT * FROM PAIS WHERE PAIS = '"+pais+"'";
            sts = conn.createStatement();
            rs = sts.executeQuery(querry);
            if(rs.next()){
                System.out.println("Existe");
                 idPais = rs.getInt("ID_PAIS");
            }
            //autor
            querry = "SELECT ID_AUTOR FROM AUTOR WHERE NOMBRE_AUTOR = '"+autors+"'";
            sts = conn.createStatement();
            rs = sts.executeQuery(querry);
            if(rs.next()){
                idAutor = rs.getInt("ID_AUTOR");
            }
            
            if(validacion==true && val==true){
            //  Agregar registro de libro INSERT INTO LIBRO(TITULO,ID_AUTOR,ID_GENERO,ID_EDITORIAL,ID_PAIS,ISBN,EDICION,FECHAPUBLICACION,NO_PAGINAS,IDIOMAS,DESCRIPCION)
            String registro = "INSERT INTO LIBRO (TITULO,ID_AUTOR,ID_GENERO,ID_EDITORIAL,ID_PAIS,ISBN,EDICION,FECHAPUBLICACION,NO_PAGINAS,IDIOMA,DESCRIPCION,NO_EJEMPLARES) VALUES('"+titulo+"' ,"+idAutor+","+idGenero+","+idEditorial+","+idPais+", "+isbnn+", "+edicionF+", '"+fechaPublicacion+"', "+noPagF+", '"+idioma+"','"+descripcion+"',"+ejemplar+")";            
            sts.executeUpdate(registro);
            System.out.println("Registro almacenado");
            JOptionPane.showMessageDialog(null, "Registro almacenado");
            }
            
            sts.close();
            conn.close();
        }
        catch(SQLException e) {
            System.out.println("No se establecio conexion! ");
            System.out.print(e);
        }
        
    }//GEN-LAST:event_registrarActionPerformed
public void noDatosNumericos(String cadena) throws ExcepcionNoNumeros{
           if(!cadena.matches("^[A-Za-z]*$")){
               throw new ExcepcionNoNumeros("");
           }
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
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnNA;
    private javax.swing.JComboBox cbAutor;
    private javax.swing.JComboBox<String> cbEdicion;
    private javax.swing.JComboBox cbEditorial;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbPais;
    private javax.swing.JComboBox cbSubgenero;
    private javax.swing.JTextField ejempl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField taDay;
    private javax.swing.JTextField taYear;
    private javax.swing.JTextField textdescripcion;
    private javax.swing.JTextField textidioma;
    private javax.swing.JTextField textisbn;
    private javax.swing.JTextField textpag;
    private javax.swing.JTextField tituloLibro;
    // End of variables declaration//GEN-END:variables
}