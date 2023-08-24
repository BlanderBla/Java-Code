/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p04encapsulacion;
/**
 * Brayan Adrian Galvan Flores || 181112
 * Agregar 3 variables de instancia debidamente
 * encapsuladas
 * agregue un metodo diferente a set y get a la clase
 * pruebe los metodos de la clase creando un objeto de la mista
 */
public class Torta {
    //ATRIBUTOS
    private String Contenido;
    private String TipoPan;
    private float Precio;
    
    //METODOS
    public void llenar(){
        System.out.println("LLENANDO LA PANSA...");
    }
    public void setContenido(String cont){
        Contenido = cont;
    }
    public String getContenido(){
        return Contenido;
    }    
    public void setTipoPan(String pan){
        TipoPan = pan;
    }
    public String getTipoPan(){
        return TipoPan;
    }
    public void setPrecio(int precio){
        Precio = precio;
    }
    public float getPrecio(){
        return Precio;
    }
    
}
