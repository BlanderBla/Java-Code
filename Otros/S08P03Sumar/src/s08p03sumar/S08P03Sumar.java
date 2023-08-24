/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08p03sumar;
import java.awt.*;  // awt -> Abstract windows t
import java.awt.event.*;
import javax.swing.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S08P03Sumar extends JFrame implements ActionListener{
    
    private JButton btnSumar;
    private JLabel lblNum1, lblNum2, lblRes;
    private JTextField tfNum1, tfNum2, tfRes;
    public static void main(String[] args) {
        // TODO code application logic here
        S08P03Sumar marco = new S08P03Sumar();
        marco.setSize(200, 300);    //  Darle las dimensiones a la ventana
        marco.setTitle("SUMAR");    //  Asignarle un titulo a la ventana
        marco.crearGUI();           //  Metodo crear GUI
        marco.setVisible(true);     //  Hace visible la ventana
    }
    public void actionPerformed(ActionEvent event){
        //  Integer es un metodo estatico
        int n1 = Integer.parseInt(tfNum1.getText()); 
        int n2 = Integer.parseInt(tfNum2.getText());
        int suma = n1+n2;
        tfRes.setText(Integer.toString(suma));
        
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //  Detiene la aplicacion al presionar x en la ventana
        Container ventana = getContentPane();   //  Contenedor -> Donde vamos a colocar todo en la ventana
        ventana.setLayout(new FlowLayout());    
        
        //  Configurar pares de labels con textfields
        //  Label 1
        lblNum1 = new JLabel("Numero 1: ");
        ventana.add(lblNum1);
        tfNum1 = new JTextField(7);
        ventana.add(tfNum1);
        //  Label 2
        lblNum2 = new JLabel("Numero 2: ");
        ventana.add(lblNum2);
        tfNum2 = new JTextField(7);
        ventana.add(tfNum2);
        //  Boton
        btnSumar = new JButton("        SUMAR        ");
        ventana.add(btnSumar);
        btnSumar.addActionListener(this);
        //  Resultado
        lblRes = new JLabel("Resultado");
        ventana.add(lblRes);
        tfRes = new JTextField(7);
        ventana.add(tfRes);
    }
}