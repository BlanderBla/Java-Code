/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p05optionpane;
import javax.swing.*;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S10P05OptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Show an error dialog that displays the message, 'alert':");
        JOptionPane.showMessageDialog(null, "Vas a repetir la materia", "Alert", JOptionPane.ERROR_MESSAGE);
        
        System.out.println("Show an internal information dialog with the message, 'information':");
        //JOptionPane.ShowInternalMessageDialog(null,"information","information",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Show an information panel with the options yes/no and message 'choose one':");
        JOptionPane.showConfirmDialog(null, "Elige SI/NO","ELIGE",JOptionPane.YES_NO_OPTION);
        
        String s[] = {"UNO","DOS","TRES","CUATRO"};
        int x = JOptionPane.showOptionDialog(null, "Hola Mundo","Titulo2",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, s, null);
        JOptionPane.showConfirmDialog(null, s[x]);
        
        String inputValue = JOptionPane.showInputDialog("Please input a value");
        JOptionPane.showMessageDialog(null, inputValue);
    }
}
