/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08p01circulomueve;
import java.awt.*;  // awt -> Abstract windows t
import java.awt.event.*;
import javax.swing.*;
/*
 * Brayan Adrian Galván Flores || 181112
 */
public class S08P01CirculoMueve extends JFrame implements ActionListener{
    
    JPanel panel;
    JButton btnIzq;
    JButton btnDer;
    int posX = 60;
    int posY = 60;
    int diametro = 50;
    
    //  Aqui se ingresa lo que irá lo que se ejecutará
    public void actionPerformed(ActionEvent event){
        System.out.println("Presionando el boton");
        Graphics papel = panel.getGraphics();
        //  Borrando el panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 200);
        //  Dibujando
        papel.setColor(Color.BLACK);    //  Definir el color de "pintado"
        //  Un circulo a la derecha o izquierda        
            /*
                Object origen = event.getSource();
                if(btnDer == origen){
                    posX += 10;
                else{
                    posX -= 10;
                }
            */
        if(btnIzq == event.getSource()){
            posX -= 10;
        }else{
            posX += 10;
        }
        papel.drawOval(posX++,posY++, diametro, diametro);

    } 
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //  Detiene la aplicacion al presionar x en la ventana
        Container ventana = getContentPane();   //  Contenedor -> Donde vamos a colocar todo en la ventana
        ventana.setLayout(new FlowLayout());    
        //  Layout -> Distribucion ->
            //  FlowLayout nos va cambiando el panel dependiendo si cabe o no
            //  GridLayout 
            //  BorderLayout -> Define fronteras|   
        
        //  El panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,200));
        panel.setBackground(Color.white);
        ventana.add(panel);
        
        //  El boton
        //  Boton izquierda
        btnIzq = new JButton("Izquierda");
        ventana.add(btnIzq);
        btnIzq.addActionListener(this);  //  Suscribirse al listener -> Se va a ejecutar el codigo dentro del actionPerformed
        //  Boton derecha
        btnDer = new JButton("Derecha");
        ventana.add(btnDer); 
        btnDer.addActionListener(this);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        S08P01CirculoMueve marco = new S08P01CirculoMueve();    //  Genera la nueva ventana
        marco.setSize(400,400);                                 //  Da tamaño a la nueva ventana
        marco.setTitle("Mi segundo programa grafico");          //  Da un titulo a la nueva ventana
        marco.crearGUI();                                       //  Hace lo programado en el metodo crearGUI
        marco.setVisible(true);                                 //  Hace que se vea la ventana
    }
}