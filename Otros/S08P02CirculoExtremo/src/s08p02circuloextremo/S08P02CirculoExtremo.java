/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08p02circuloextremo;
import java.awt.*;  // awt -> Abstract windows t
import java.awt.event.*;
import javax.swing.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S08P02CirculoExtremo extends JFrame implements ActionListener {

    JPanel panel;
    JButton btnIzq;
    JButton btnDer;
    JButton btnArr;
    JButton btnAba;
    JButton btnCerca;
    JButton btnLejos;
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
        if(btnIzq == event.getSource()){
            posX -= 10;
        }else if(btnDer == event.getSource()){
            posX += 10;
        }else if(btnArr == event.getSource()){
            posY -= 10;
        }else if(btnAba == event.getSource()){
            posY += 10;
        }else if(btnCerca == event.getSource()){
            diametro += 10;
        }else{
            diametro -= 10;
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
        //  Boton Izquierda
        btnIzq = new JButton("Izquierda");
        ventana.add(btnIzq);
        btnIzq.addActionListener(this);  //  Suscribirse al listener -> Se va a ejecutar el codigo dentro del actionPerformed
        //  Boton Derecha
        btnDer = new JButton("Derecha");
        ventana.add(btnDer); 
        btnDer.addActionListener(this);
        //  Boton Arriba
        btnArr = new JButton("Arriba");
        ventana.add(btnArr);
        btnArr.addActionListener(this);  //  Suscribirse al listener -> Se va a ejecutar el codigo dentro del actionPerformed
        //  Boton Abajo
        btnAba = new JButton("Abajo");
        ventana.add(btnAba); 
        btnAba.addActionListener(this);
        //  Boton Cerca
        btnCerca = new JButton("Cerca");
        ventana.add(btnCerca);
        btnCerca.addActionListener(this);  //  Suscribirse al listener -> Se va a ejecutar el codigo dentro del actionPerformed
        //  Boton Lejos
        btnLejos = new JButton("Lejos");
        ventana.add(btnLejos); 
        btnLejos.addActionListener(this);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        S08P02CirculoExtremo marco = new S08P02CirculoExtremo();    //  Genera la nueva ventana
        marco.setSize(400,400);                                 //  Da tamaño a la nueva ventana
        marco.setTitle("Mi segundo programa grafico");          //  Da un titulo a la nueva ventana
        marco.crearGUI();                                       //  Hace lo programado en el metodo crearGUI
        marco.setVisible(true);
    }
    
}
