/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09p01deslizante;
import java.awt.*;
import javax.swing.event.*; // Es para poder utilizar el change event
import javax.swing.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S09P01Deslizante extends JFrame implements ChangeListener{ //  Herencia e implementar una interfaz
    //  El metodo que utiliza changeListener es stateChanged
    private JLabel label;
    private JTextField tf;
    private JSlider deslizante; 
    
    public static void main(String[] args) {
        // TODO code application logic here
        S09P01Deslizante marco = new S09P01Deslizante();    //  Generamos objeto
        marco.setSize(new Dimension(300,150));  //  Tamaño de la ventana
        marco.setTitle("Deslizante");   
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    public void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();   //  Definimos un contenedor donde vamos a agregar todos los controles
        ventana.setLayout(new FlowLayout());
        
        label = new JLabel("Valor deslizante: ");
        ventana.add(label);
        tf = new JTextField(7); //  Se le carga el valor entero que tiene el deslizante
        ventana.add(tf);
        
        //  Configuración del deslizante
        deslizante = new JSlider(JSlider.HORIZONTAL,10,300,150);    //  JSlider.Horizntal
        ventana.add(deslizante);
        deslizante.addChangeListener(this); //  
        
        tf.setText(Integer.toString(deslizante.getValue()));    //  Deesde un principio va a aparecer el valor del deslizante
        // Los textField slolo lleva cadenas por eso convertimos el valor del deslizante a cadena
        /*
            Obtener el valor de n
            Convertirlo a cadena
            Pasarlo como cadena
        */
    }
    
    public void stateChanged(ChangeEvent event){
        int n = deslizante.getValue();
        tf.setText(Integer.toString(n));
    }
    
}
