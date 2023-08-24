/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p04mousemotionlistener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Brayan Adrian Galvan Flores 181112
 */
public class S10P04MouseMotionListener extends JFrame implements MouseMotionListener{

    private JPanel panel;
    
    public static void main(String[] args) {
        S10P04MouseMotionListener marco = new S10P04MouseMotionListener();
        marco.setSize(new Dimension(600,600));
        marco.setTitle("MouseMotionListener");
        marco.crearGUI();
        marco.setVisible(true);
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(550,550));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        panel.addMouseMotionListener(this);
    }
    
    public void mouseMoved(MouseEvent event){    //  Se desata cuando se mueve el mouse
        Graphics papel = panel.getGraphics();
                
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.BLUE);
        papel.fillOval(x, y, 50, 50);
    }
    
    public void mouseDragged(MouseEvent event){
        Graphics papel = panel.getGraphics();
                
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.BLUE);
        papel.fillOval(x, y, 50, 50);
    }
}
