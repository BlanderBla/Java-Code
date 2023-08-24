/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author anama
 */
public class Excepciones {
    
    
    public void user(String user) throws Exception{
        
        if(user.length() == 0){
            throw new Exception();
        }else{
            System.out.println("Usuario tecleaco");
        }
    }
    
     public void password(String password) throws Exception{
        if(password.length() == 0){
            throw new Exception();
        }else{
            System.out.println("Contraseña tecleada");
        }
    }
    
    public  void campoVacio(String cadena) throws Exception{
        int i=0, cont=0;
        if(cadena.isEmpty()){
            throw new Exception();
        }
    }
    
    public void edad(int edad) throws Exception{
        if(edad<16){
            throw new Exception();
        }
        
    }
    
    public void fechaDia(int dia)throws Exception{
        if(dia <= 0 || dia >= 32){
            throw new Exception();
        }
    }
    
    public void fechaAnio(int anio)throws Exception{
        if(anio <= 0 || anio>=2022){
            throw new Exception();
        }
    }
    public void soloNumerosEnteros(int num)throws Exception{
        if(num >= 999999999 || (num <= (-999999999))){
            throw new Exception();
        }
    }
    
    public void fechaTotal(String fecha, int dd, int mm, int aa) throws Exception{
        String dia,mes,anio;
        String concat = "";
        dia = fecha.charAt(0)+""+fecha.charAt(1);
        mes = fecha.charAt(3)+""+fecha.charAt(4);
        anio = fecha.charAt(6)+""+fecha.charAt(7)+""+fecha.charAt(8)+""+fecha.charAt(9);
        
        dd = Integer.parseInt(dia);
        mm = Integer.parseInt(mes);
        aa = Integer.parseInt(anio);
        
        if(fecha.length()>=10 || (aa <=0 || aa>=32) || (mm <=0 || mm >= 13) ){
            throw new Exception();
        }else{
            System.out.println("Datos de fecha correctos");
        }
        
    }
    
    static void esSoloLetras(String cadena)throws Exception{
        //Recorremos cada caracter de la cadena y comprobamos si son letras.
        //Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
        //Si está fuera del rango 65 - 90, es que NO son letras.
        //Para ser más exactos al tratarse del idioma español, tambien comprobamos
        //el valor 165 equivalente a la Ñ

        for (int i = 0; i < cadena.length(); i++)
        {
                char caracter = cadena.toUpperCase().charAt(i);
                int valorASCII = (int)caracter;
                if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
                          throw new Exception(); //Se ha encontrado un caracter que no es letra
        }

        //Terminado el bucle sin que se haya retornado false, es que todos los caracteres son letras
    }
}
