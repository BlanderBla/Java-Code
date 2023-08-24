package s07p01herencia;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S07P01Herencia {
    public static void main(String[] args) {
        /*
            La clase ClaseB hereda los metodos y atributos de la clase ClaseA
        */
        ClaseB b = new ClaseB();
        b.cantidad = 5;
        b.nombre = "No se";
        b.unMetodo();
        b.color = "negro";
        b.metodoEnB();
        /*
            La clase ClaseC hereda los metodos y atributos de la clase ClaseB
            Sin embargo, La clase ClaseB hereda los metodos y atributos de la clase ClaseA
            Por lo tanto, la clase ClaseC hereda los metodos y atributos de la clase ClaseA
        */
        ClaseC c = new ClaseC();
            c.cantidad = 8;
            c.nombre = "Otro nombre";
            c.unMetodo();
            c.metodoEnB();
            c.metodoEnC();
        Perro a = new Perro();
            a.nombre = "Chuchu";
            a.color = "Cafe";
            a.especie = "Perro";
            a.tamanio = "Mediano";
            a.raza = "Mestiza";
            a.habitad = "Patio";
            a.ladrar();
            a.correr();
            a.comer();
            a.procrear();
    }   
}
