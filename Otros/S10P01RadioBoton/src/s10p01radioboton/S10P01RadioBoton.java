/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p01radioboton;
import java.awt.*;
import java.awt.event.*;    //  Punto que agregue al programa
import javax.swing.*;
import javax.swing.event.*;
/**
 * Brayan Adrian Galván Flores 181112
 */
public class S10P01RadioBoton extends JFrame implements ActionListener{

    private JPanel panel;
    private JRadioButton btnLinea, btnCirculo, btnRect;
    
    public static void main(String[] args) {
        // TODO code application logic here
        S10P01RadioBoton marco = new S10P01RadioBoton();
        marco.setSize(new Dimension(400,450));
        marco.setTitle("Radio Buton");
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(350,350));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        //  Configuración de los radiobotones
        btnLinea = new JRadioButton("Linea", false);
        ventana.add(btnLinea);
        btnLinea.addActionListener(this);
        
        btnCirculo = new JRadioButton("Circulo", false);
        ventana.add(btnCirculo);
        btnCirculo.addActionListener(this);
        
        btnRect = new JRadioButton("Rectangulo", false);
        ventana.add(btnRect);
        btnRect.addActionListener(this);
        
        //  ButtonGroup agrupa los radiobotones para que sea excluyente
        //  Suscribe los botones a un gruupo y esto nos indica solo seleccionar un RadioBotton
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(btnLinea);
        grupo.add(btnCirculo);
        grupo.add(btnRect);
    }
    
    public void actionPerformed(ActionEvent event){
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 400, 350);
        papel.setColor(Color.RED);
        
        if(btnLinea.isSelected()){
            papel.drawLine(50, 50, 200, 200);
        }else if(btnCirculo.isSelected()){
            papel.fillOval(50, 50, 200, 200);
        }else if(btnRect.isSelected()){
            papel.fillRect(50, 50, 200, 200);
        }
    }
}
