/**
 * @(#)S02Cuchillo.java
 * @Brayan Adrian Galvan Flores || 181112 
 * @version 1.00 2020/1/27
 */
public class S02Cuchillo {
	//ATRIBUTOS
	String tamanio;
	String color;
	float precio;

    public S02Cuchillo() {
    }
    public void cortar(){
    	System.out.println("CORTANDO");
    }
    public void untar(String ingrediente){
    	System.out.println("UNTAR: "+ingrediente);
    }
}