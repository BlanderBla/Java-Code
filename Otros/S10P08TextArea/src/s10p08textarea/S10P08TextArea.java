/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p08textarea;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Brayan Adrian Galván Flores || 181112
 */
public class S10P08TextArea extends JFrame implements ActionListener{

    JLabel lbTitulo1, lbCad1, lbCad2, lbCad3, lbTitulo2, lbCad11, lbCad22, lbCad33;
    JTextField txCad1, txCad2, txCad3, txCad11, txCad22, txCad33;
    JButton btnConvertir;
    
    public static void main(String[] args) {
        // TODO code application logic here
        S10P08TextArea marco = new S10P08TextArea();
        marco.setSize(new Dimension(200,400));
        marco.setTitle("OrdenarCadenas");
        marco.crearGUI();
        marco.setVisible(true);
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        lbTitulo1 = new JLabel("     INGRESE CADENAS    ");
        ventana.add(lbTitulo1);
        //  Label 1 - CADENA 1
        lbCad1 = new JLabel("Cadena 1: ");
        ventana.add(lbCad1);
        txCad1 = new JTextField(7);
        ventana.add(txCad1);
        
        //  Label 2 - CADENA 2
        lbCad2 = new JLabel("Cadena 2: ");
        ventana.add(lbCad2);
        txCad2 = new JTextField(7);
        ventana.add(txCad2);
        
        //  Label 3 - CADENA 3
        lbCad3 = new JLabel("Cadena 3: ");
        ventana.add(lbCad3);
        txCad3 = new JTextField(7);
        ventana.add(txCad3);
        
        //  Boton
        btnConvertir = new JButton("     CONVERTIR     ");
        ventana.add(btnConvertir);
        btnConvertir.addActionListener(this);
        
        lbTitulo2 = new JLabel("     CADENAS ORDENADAS    ");
        ventana.add(lbTitulo2);
        
        //  Label 1.1 - CADENA 1.1
        lbCad11 = new JLabel("Cadena 1: ");
        ventana.add(lbCad11);
        txCad11 = new JTextField(7);
        ventana.add(txCad11);
        
        //  Label 2 - CADENA 2
        lbCad22 = new JLabel("Cadena 2: ");
        ventana.add(lbCad22);
        txCad22 = new JTextField(7);
        ventana.add(txCad22);
        
        //  Label 3 - CADENA 3
        lbCad33 = new JLabel("Cadena 3: ");
        ventana.add(lbCad33);
        txCad33 = new JTextField(7);
        ventana.add(txCad33);        
    }
    public void actionPerformed(ActionEvent event){
        //  Integer es un metodo estatico
        String Cad1 = txCad1.getText();
        String Cad2 = txCad2.getText();
        String Cad3 = txCad3.getText();
        
        if(Cad1.compareTo(Cad2) == 0 && Cad2.compareTo(Cad3) == 0 ){    //  Si todas las cadenas son iguales
            txCad11.setText(Cad1);
            txCad22.setText(Cad2);
            txCad33.setText(Cad3);
        }if(Cad1.compareTo(Cad2) == 0 && Cad2.compareTo(Cad3) != 0){    //  Si C1 y C2 son iguales y C3 es diferente
            if(Cad2.compareTo(Cad3) > 0){       //
                txCad11.setText(Cad1);
                txCad22.setText(Cad2);
                txCad33.setText(Cad3);
            }else{
                txCad11.setText(Cad3);
                txCad22.setText(Cad1);
                txCad33.setText(Cad2);
            }
        }if(Cad2.compareTo(Cad3) == 0 && Cad2.compareTo(Cad1) != 0){    //  Si C2 y C3 son iguales y C1 es diferente
            if(Cad1.compareTo(Cad2) > 0){       //
                txCad11.setText(Cad1);
                txCad22.setText(Cad2);
                txCad33.setText(Cad3);
            }else{
                txCad11.setText(Cad2);
                txCad22.setText(Cad3);
                txCad33.setText(Cad1);
            }
        }if(Cad1.compareTo(Cad3) == 0 && Cad1.compareTo(Cad2) != 0){    //  Si C1 y C3 son iguales y C2 es diferente
            if(Cad1.compareTo(Cad2) > 0){
                txCad11.setText(Cad1);
                txCad22.setText(Cad3);
                txCad33.setText(Cad2);
            }else{
                txCad11.setText(Cad2);
                txCad22.setText(Cad1);
                txCad33.setText(Cad3);
            }
        }if(Cad1.compareTo(Cad2) != 0 && Cad2.compareTo(Cad3) != 0 && Cad1.compareTo(Cad3) != 0){    //  Si C1, C2 y C3 son diferentes
            if(Cad1.compareTo(Cad2) > 0 && Cad1.compareTo(Cad3) > 0){
                txCad11.setText(Cad1);
                if(Cad2.compareTo(Cad3)>0){
                    txCad22.setText(Cad2);
                    txCad33.setText(Cad3);
                }if(Cad2.compareTo(Cad3)<0){
                    txCad22.setText(Cad3);
                    txCad33.setText(Cad2);
                }
            }if(Cad1.compareTo(Cad2) > 0 && Cad1.compareTo(Cad3) < 0){
                txCad11.setText(Cad3);
                if(Cad1.compareTo(Cad2)>0){
                    txCad22.setText(Cad1);
                    txCad33.setText(Cad2);
                }if(Cad1.compareTo(Cad2)<0){
                    txCad22.setText(Cad2);
                    txCad33.setText(Cad3);
                }
            }if(Cad1.compareTo(Cad3) > 0 && Cad1.compareTo(Cad2) < 0){
                txCad11.setText(Cad2);
                if(Cad1.compareTo(Cad3)>0){
                    txCad22.setText(Cad1);
                    txCad33.setText(Cad3);
                }if(Cad1.compareTo(Cad3)<0){
                    txCad22.setText(Cad3);
                    txCad33.setText(Cad1);
                }
            }
            
            if(Cad2.compareTo(Cad1) > 0 && Cad2.compareTo(Cad3) > 0){
                txCad11.setText(Cad2);
                if(Cad1.compareTo(Cad3)>0){
                    txCad22.setText(Cad1);
                    txCad33.setText(Cad3);
                }if(Cad1.compareTo(Cad3)<0){
                    txCad22.setText(Cad3);
                    txCad33.setText(Cad1);
                }
            }if(Cad3.compareTo(Cad1) > 0 && Cad3.compareTo(Cad2) > 0){
                txCad11.setText(Cad3);
                if(Cad1.compareTo(Cad2)>0){
                    txCad22.setText(Cad1);
                    txCad33.setText(Cad2);
                }if(Cad1.compareTo(Cad2)<0){
                    txCad22.setText(Cad2);
                    txCad33.setText(Cad1);
                }
            }
        }
        
    }
}
