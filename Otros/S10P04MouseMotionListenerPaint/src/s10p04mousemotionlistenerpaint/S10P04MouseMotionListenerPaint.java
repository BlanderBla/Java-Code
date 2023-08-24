/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p04mousemotionlistenerpaint;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S10P04MouseMotionListenerPaint extends JFrame implements MouseMotionListener, ChangeListener, ActionListener{

    private JPanel panel;
    private JRadioButton btnRojo, btnAzul, btnAmarillo, btnVerde, btnBlanco;
    private JLabel label;
    private JTextField tf;
    private JSlider deslizante;
    
    private String CLO;
    int n,x,y;
    
    public static void main(String[] args) {
        // TODO code application logic here
        S10P04MouseMotionListenerPaint marco = new S10P04MouseMotionListenerPaint();
        marco.setSize(new Dimension(550,550));
        marco.setTitle("PAINT");
        marco.crearGUI();
        marco.setVisible(true);
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        //  Panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,400));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        panel.addMouseMotionListener(this);
        
        //  Label
        label = new JLabel("Valor deslizante: ");
        ventana.add(label);
        tf = new JTextField(7); //  Se le carga el valor entero que tiene el deslizante
        ventana.add(tf);
        
        //  RadioButton
        btnRojo = new JRadioButton("Rojo",false);
        ventana.add(btnRojo);
        btnRojo.addActionListener(this);
        
        btnAzul = new JRadioButton("Azul",false);
        ventana.add(btnAzul);
        btnAzul.addActionListener(this);
        
        btnAmarillo = new JRadioButton("Amarillo",false);
        ventana.add(btnAmarillo);
        btnAmarillo.addActionListener(this);
        
        btnVerde = new JRadioButton("Verde",false);
        ventana.add(btnVerde);
        btnVerde.addActionListener(this);
        
        btnBlanco = new JRadioButton("Blaco",false);
        ventana.add(btnBlanco);
        btnBlanco.addActionListener(this);
        
        //  Configuración del deslizante
        deslizante = new JSlider(JSlider.HORIZONTAL,10,300,150);    //  JSlider.Horizntal
        ventana.add(deslizante);
        deslizante.addChangeListener(this); //  
        tf.setText(Integer.toString(deslizante.getValue()));
    }
    //  MOUSE MOVIENDOSE
    public void mouseMoved(MouseEvent event){    //  Se desata cuando se mueve el mouse
        Graphics papel = panel.getGraphics();
                
        x = event.getX();
        y = event.getY();
        /*
        if(btnRojo.isSelected()){
           papel.setColor(Color.RED);
           papel.fillOval(x, y, n, n);
        }if(btnAzul.isSelected()){
           papel.setColor(Color.BLUE);
           papel.fillOval(x, y, n, n);
        }if(btnAmarillo.isSelected()){
           papel.setColor(Color.YELLOW);
           papel.fillOval(x, y, n, n);
        }if(btnVerde.isSelected()){
           papel.setColor(Color.GREEN);
           papel.fillOval(x, y, n, n);
        }if(btnBlanco.isSelected()){
           papel.setColor(Color.WHITE);
           papel.fillOval(x, y, n, n);
        }*/
    }
    //  SE ARRASTRA EL MOUSE
    public void mouseDragged(MouseEvent event){
        Graphics papel = panel.getGraphics();
                
        x = event.getX();
        y = event.getY();
        
        if(btnRojo.isSelected()){
           papel.setColor(Color.RED);
           papel.fillOval(x, y, n, n);
        }if(btnAzul.isSelected()){
           papel.setColor(Color.BLUE);
           papel.fillOval(x, y, n, n);
        }if(btnAmarillo.isSelected()){
           papel.setColor(Color.YELLOW);
           papel.fillOval(x, y, n, n);
        }if(btnVerde.isSelected()){
           papel.setColor(Color.GREEN);
           papel.fillOval(x, y, n, n);
        }if(btnBlanco.isSelected()){
           papel.setColor(Color.WHITE);
           papel.fillOval(x, y, n, n);
        }
    }
    //  VALOR DEL DESLIZANTE
    public void stateChanged(ChangeEvent event) {
        n = deslizante.getValue();
        tf.setText(Integer.toString(n));
    }
    //  ACCIONES DE LOS BOTONES
    public void actionPerformed(ActionEvent event) {
        Graphics papel = panel.getGraphics();
        
        
    }
    
}
