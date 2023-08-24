/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p05mouselistener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S10P05MouseListener extends JFrame implements MouseListener{

    private JPanel panel; 
    public static void main(String[] args) {
        // TODO code application logic here
        S10P05MouseListener marco = new S10P05MouseListener();
        marco.setSize(new Dimension(650,750));
        marco.setTitle("MOUSELISTENER");
        marco.crearGUI();
        marco.setVisible(true);
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600,600));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        panel.addMouseListener(this);
    }
    public void mouseExited(MouseEvent event){
        Graphics papel = panel.getGraphics();
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.GREEN);
        papel.fillOval(x, y, 30, 30);
    }
    public void mouseEntered(MouseEvent event){
        Graphics papel = panel.getGraphics();
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.YELLOW);
        papel.fillOval(x, y, 30, 30);
    }
    public void mouseReleased(MouseEvent event){
        Graphics papel = panel.getGraphics();
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.RED);
        papel.fillOval(x, y, 30, 30);
    }
    public void mousePressed(MouseEvent event){
        Graphics papel = panel.getGraphics();
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.BLUE);
        papel.fillOval(x, y, 30, 30);
    }
    public void mouseClicked(MouseEvent event){
        Graphics papel = panel.getGraphics();
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.PINK);
        papel.fillOval(x, y, 30, 30);
    }
}
