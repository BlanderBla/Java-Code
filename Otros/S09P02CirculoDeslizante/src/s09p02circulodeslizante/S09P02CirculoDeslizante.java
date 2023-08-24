/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09p02circulodeslizante;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
/**
 *  Brayan Adrian Galván Flores || 181112
 */
public class S09P02CirculoDeslizante extends JFrame implements ChangeListener{

    /**
     * @param args the command line arguments
     */
    private JLabel label;
    private JTextField tf;
    private JSlider deslizante;
    private JPanel panel;
    
    public static void main(String[] args) {
        // TODO code application logic here
        S09P02CirculoDeslizante marco = new S09P02CirculoDeslizante();
        marco.setSize(new Dimension(400,400));
        marco.setTitle("Circulo Deslizante");
        marco.crearGUI();
        marco.setVisible(true);
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana =  getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        label = new JLabel("Valor deslizante");
        ventana.add(label);
        tf = new JTextField(7);
        ventana.add(tf);
        
        //  Configuración del deslizante
        deslizante = new JSlider(JSlider.HORIZONTAL,10,250,70);
        ventana.add(deslizante);
        deslizante.addChangeListener(this);
        
        tf.setText(Integer.toString(deslizante.getValue()));
    }
    @Override
    public void stateChanged(ChangeEvent event){
        int n = deslizante.getValue();
        tf.setText(Integer.toString(n));
        
        Graphics papel = panel.getGraphics();
        //  Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 300);
        
        //  Dinbujar circulo
        papel.setColor(Color.GREEN);
        papel.fillOval(5, 5, n, n);
        
    }
}
