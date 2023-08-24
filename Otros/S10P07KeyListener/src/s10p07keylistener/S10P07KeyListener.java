/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p07keylistener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S10P07KeyListener extends JFrame implements KeyListener{

    private JPanel panel;
    private JButton btnRight,btnLeft, btnUp,btnDown, btnPlus, btnRest;
    int posX = 20,posY = 20,diametro = 50;
    
    public static void main(String[] args) {
        // TODO code application logic here
        S10P07KeyListener marco = new S10P07KeyListener();
        marco.setSize(new Dimension(650,650));
        marco.setTitle("KeyListener");
        marco.crearGUI();
        marco.setVisible(true);        
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        //  Panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        ventana.addKeyListener((KeyListener) this);
        
        //  Botones
        btnLeft = new JButton("Izquierda");
        ventana.add(btnLeft);
        btnLeft.addKeyListener(this);
        
        btnRight = new JButton("Derecha");
        ventana.add(btnRight);
        btnRight.addKeyListener(this);
        
        btnUp = new JButton("Arriba");
        ventana.add(btnUp);
        btnUp.addKeyListener(this);
        
        btnDown = new JButton("Abajo");
        ventana.add(btnDown);
        btnDown.addKeyListener(this);
        
        btnPlus = new JButton("Cerca");
        ventana.add(btnPlus);
        btnPlus.addKeyListener(this);
        
        btnRest = new JButton("Abajo");
        ventana.add(btnRest);
        btnRest.addKeyListener(this);
    }
    public void keyPressed(KeyEvent event){
        
        Graphics papel = panel.getGraphics();
        //  Borrando el panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 500, 500);
        //  Dibujando
        papel.setColor(Color.BLACK);    //  Definir el color de "pintado"
        
        int key = event.getKeyCode();
        if(key == KeyEvent.VK_LEFT){   //  Izquierda
            posX-=10;
        }if(key == KeyEvent.VK_RIGHT){      //  Derecha
            posX+=10;
        }if(key == KeyEvent.VK_UP){      //  Arriba
            posY-=10;
        }if(key == KeyEvent.VK_DOWN){      //  Abajo
            posY+=10;
        }if(key == KeyEvent.VK_PLUS){      //  Cerca
            diametro+=10;
        }if(key == KeyEvent.VK_MINUS){      //  Lejos
            diametro-=10;
        }    
        
        papel.drawOval(posX++,posY++, diametro, diametro);
        
    }

    public void keyTyped(KeyEvent event) {
    
    }
    
    public void keyReleased(KeyEvent event) {
    
    }
    
}
