/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ExcepcionesUsuario {
    
    public int nombre(String name){
        int i=0, cont=0;
        if(name.length()>0){
            char[] caracteres = name.toCharArray();;
            if(cont!=0){
                JOptionPane.showMessageDialog(null, "No agregue caracteres especiales al nombre");
            }else{
                i++;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese Nombre");
        }
        return i;
    }
    public int apellidoP(String apellidoPaterno){
        int i=0, cont=0;
        if(apellidoPaterno.length()>0){
            char[] caracteres = apellidoPaterno.toCharArray();;
            for(int j=0; j<apellidoPaterno.length();j++){
                if(caracteres[j]>=0 && caracteres[j]<=31 || caracteres[j]>=33 && caracteres[j]<=64 || caracteres[j]>=91 && caracteres[j]<=96 || caracteres[j]>=123){
                    cont++;
                }
            }
            if(cont!=0){
                JOptionPane.showMessageDialog(null, "No agregue caracteres especiales al apellido paterno");
            }else{
                i++;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese apellido paterno");
        }
        return i;
    }
    //  Eventos para colocar el apellido materno correctamente
    public int apellidoM(String c){
        int i=0, cont=0;
        if(c.length()>0){
            char[] caracteres = c.toCharArray();;
            for(int j=0; j<c.length();j++){
                if(caracteres[j]>=0 && caracteres[j]<=64 || caracteres[j]>=91 && caracteres[j]<=96 || caracteres[j]>=123){
                    cont++;
                }
            }
            if(cont!=0){
                JOptionPane.showMessageDialog(null, "No agregue caracteres especiales al apellido materno");
            }else{
                i++;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese apellido materno");
        }
        return i;
    }
    //  Eventos para colocar la edad correctamente
    public int edad(String e){
        int i=0;
        if(e.length()==0){
            JOptionPane.showMessageDialog(null, "Ingrese edad");
        }else{
            int edad = Integer.parseInt(e);
            if(edad < 18 && edad >=0 || edad >= 100){
                JOptionPane.showMessageDialog(null, "Edad no valida");
            }else{
                i++;
            }
        }
        return i;
    }
    public int telefono(String t){
        int i = 0;
        if(t.length() == 0){
            JOptionPane.showMessageDialog(null, "Ingrese telefono");
        }else{
            if(t.length()>=1 && t.length()<10){
                JOptionPane.showMessageDialog(null, "Telefono no valido");
            }else if(t.length()>10){
                JOptionPane.showMessageDialog(null, "Telefono no valido");
            }else{
                long telefono2 = Long.parseLong(t);
                i++;
            }
        }
        return i;
    }

    
    public int contrasena(String pass){
        int i=0;
        
        return i;
    }
    
}
