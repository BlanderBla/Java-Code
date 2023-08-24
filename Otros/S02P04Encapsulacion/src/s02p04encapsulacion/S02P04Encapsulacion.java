/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p04encapsulacion;
/**
 * Brayan Adrian galvan Flores || 181112
 */
public class S02P04Encapsulacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tacos taco = new Tacos();
        taco.engordar();
        //ESTO YA NO PORQUE ES PRIVATE. taco.ingrediente="PASTOR";
        taco.setIngrediente("PASTOR");//ESTO SI COMO ES PRIVATE
        System.out.println("MI TACO ES DE: "+taco.getIngrediente());
        //TORTILLA
        taco.setTortilla("MAIZ");
        System.out.println("LA TORTILLA ES DE: "+taco.getTortilla());
        //TORTAS
        Torta torta=new Torta();
        torta.llenar();
        torta.setTipoPan("BOLILLO DE LA PENY");
        System.out.println("EL PAN ES DE: "+torta.getTipoPan());
        
        torta.setContenido("PASTOR CON QURESO");
        System.out.println("LA TORTA ES DE: "+torta.getContenido());
        
        torta.setPrecio(25);
        System.out.println("TIENE UN PRECIO DE : "+torta.getPrecio());
        
               
        
    }
    
}
