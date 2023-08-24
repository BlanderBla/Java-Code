/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s07p07lineamueve;
import java.util.Scanner;
import java.awt.*;  // awt -> Abstract windows t
import java.awt.event.*;
import javax.swing.*;   //  Java extension -> javax
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S07P07LineaMueve extends JFrame implements ActionListener{
    /*
        La diferencia entre awt y swing es que awt depende del SO mientras que swing es mas independiente
        JFrame -> 
    */    
    JPanel panel;   //  La J indica que es un control de swing
    JButton boton;
    Button boton2;  //  Sin J es control de awt
    int posX=50;
    int posY=50;
    int posXX = 100;
    int posYY = 100;
    /*
        Debe llamarse identico (actionPerfomed)
    */
    @Override   // Es la capacidad que tiene una clase que hereda de poder modificar los métodos de su clase padre
    public void actionPerformed(ActionEvent event){
        System.out.println("Presionando el boton");
        
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.RED);
        papel.fillRect(0, 0, 300, 200);
        
        papel.setColor(Color.BLACK);    //  Definir el color de "pintado"
        papel.drawLine(posX++,posY++, posXX, posYY);
         posX += 10;
         posY += 10;
         posXX += 10;
         posYY += 10;
         
         
    }
    public static void main(String[] args) {
        // TODO code application logic here
        S07P07LineaMueve marco = new S07P07LineaMueve();
        marco.setSize(400,400);
        marco.setTitle("Mi primer programa grafico");
        marco.crearGUI();
        marco.setVisible(true);
    }
    //  Creamos el elemento  
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
        boton = new JButton("Presiona aqui");
        ventana.add(boton); 
        
        boton.addActionListener(this);  //  Suscribirse al listener -> Se va a ejecutar el codigo dentro del actionPerformed
    } 
}
