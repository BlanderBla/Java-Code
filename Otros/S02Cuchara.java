/**
 * @(#)S02Cuchara.java
 * @Brayan Adrian Galvan Flores || 181112
 * @version 1.00 2020/1/27
 */
public class S02Cuchara {
    //  ATRIBUTOS
    String tamanio;
    String color;
    float precio;
    //  METODOS
    public S02Cuchara() {//METODO CONTRUCTOR
    }
    public void mezclar(int cant){
    	System.out.println("MEZCLANDO!..."+cant);
    	
    }
    public void contener(){
    	System.out.println("CONTENIENDO: ");
    	
    }
    public static void main(String args[]){
    	//Generacion de objeto de la clase
    	//manera 1
    	S02Cuchara cuchara1= new S02Cuchara();
    	//manera2
    	S02Cuchara cuchara2;//declarando el objeto
    	cuchara2=new S02Cuchara();//iniciando el objeto
    	
    	cuchara1.contener();
    	cuchara1.mezclar(5);
    	cuchara1.color="PLATA";
    	
    	cuchara2.contener();
    	cuchara2.mezclar(2);
    	cuchara2.color="SUCIO";
    	System.out.println("Cuchara de color: "+cuchara1.color);
    }
    
    
    
}