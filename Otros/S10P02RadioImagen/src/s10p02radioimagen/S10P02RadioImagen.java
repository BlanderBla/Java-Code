/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p02radioimagen;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S10P02RadioImagen extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    private JPanel panel;
    private JRadioButton btnLinea, btnCirculo, btnRect;
    private JRadioButton btnKoala, btnFaro, btnMedusa;
    
    public static void main(String[] args) {
        // TODO code application logic here
        S10P02RadioImagen marco = new S10P02RadioImagen();
        marco.setSize(new Dimension(400,450));
        marco.setTitle("Radio Boton");
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
        
        //  Configuracion de los radiobotones
        btnLinea = new JRadioButton("Linea",false);
        ventana.add(btnLinea);
        btnLinea.addActionListener(this);
        
        btnCirculo = new JRadioButton("Circulo",false);
        ventana.add(btnCirculo);
        btnCirculo.addActionListener(this);
        
        btnRect = new JRadioButton("Rectangulo",false);
        ventana.add(btnRect);
        btnRect.addActionListener(this);
        
        btnKoala = new JRadioButton("Koala",false);
        ventana.add(btnKoala);
        btnKoala.addActionListener(this);
        
        btnFaro = new JRadioButton("Faro",false);
        ventana.add(btnFaro);
        btnFaro.addActionListener(this);
        
        btnMedusa = new JRadioButton("Medusa",false);
        ventana.add(btnMedusa);
        btnMedusa.addActionListener(this);
    
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(btnLinea);
        grupo.add(btnCirculo);
        grupo.add(btnRect);
        grupo.add(btnKoala);
        grupo.add(btnFaro);
        grupo.add(btnMedusa);
    }
    
    public void actionPerformed(ActionEvent event) {
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.WHITE);
        papel.fillRect(0,0,350,350);
        
        papel.setColor(Color.RED);
        if(btnLinea.isSelected()){
            papel.drawLine(50,50,200,200);
        }if(btnCirculo.isSelected()){
            papel.fillOval(50, 50, 200, 200);
        }if(btnRect.isSelected()){
            papel.fillRect(50, 50, 200, 200);
        }
        
        ImageIcon foto;
        
        if(btnKoala.isSelected()){
            foto = new ImageIcon(getClass().getResource("/image/Koala.jpg"));
            foto.paintIcon(this, papel,0,0);
        }if(btnFaro.isSelected()){
            foto = new ImageIcon(getClass().getResource("/image/Faro.jpg"));
            papel.drawImage(foto.getImage(),0,0,300,200,null);
        }if(btnMedusa.isSelected()){
            Image foto2;
            foto2 = new ImageIcon("src/image/Medusa.jpg").getImage();
            papel.drawImage(foto2, 0, 0, 300,200,null);
        }
        
    }
    
}
