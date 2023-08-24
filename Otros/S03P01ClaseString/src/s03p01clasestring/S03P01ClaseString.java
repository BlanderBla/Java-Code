/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s03p01clasestring;
/**
 * Brayan Adrian galvan Flores || 181112
 */
public class S03P01ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a= "HOLA MUNDO";
        //SE PUEDE
        //Stringa  a=new String;
        //1.- charAt";
        System.out.println("charAt");
        System.out.println("DEVUELVE EL CARACTAR EN UN INDICE ESPECIFICADO");
        char c = a.charAt(5);
        System.out.println("a EN CARACTER 5"+c);
        
        //2.- compareTo
        System.out.println("compereTo");
        System.out.println("compara dos cadenas lexicograficamente");
        int x = a.compareTo("HOLA MUNDO");
        System.out.println("compareTo: "+x);
        
        //3.- compareToIgnoreCase
        System.out.println("compereToIgnoreCase");
        System.out.println("compara dos cadenas lexicograficamente ignorando mayus y mins");
        x = a.compareToIgnoreCase("HoLa MuNdO");
        System.out.println("compareToIgnoreCase: "+x);
        
        //4.- copyValueOf
        System.out.println("CopyValueOf");
        System.out.println("Devuelve como cadena la sec de caracteres de un arreglo de char");
        char []d={'h','o','l','a'};
        String otra = String.copyValueOf(d);
        System.out.println("Cadena otra: "+otra);
        
        //5.- equals
        System.out.println("\nequals");
        System.out.println("Compara 2 cadenas y devuelve un boleano si son iguales");
        otra = "HOLA MUNDO";
        boolean e = a.equals(otra);
        System.out.println("boolean: "+e);
        
        //6.- conCat
        System.out.println("\nConcat");
        System.out.println("Concatena una cadena con el final de otra");
        String f = otra.concat(" VACIO");
        System.out.println("Concatenar: "+f);
        
        //7.- trim
        System.out.println("trim");
        System.out.println("devuelve una cadena omitiendo los espacios al principio y final de esta");
        System.out.println("cadena otra sin trin: "+otra+"xdxdxd");
        System.out.println("");
        String otra2 = otra.trim();
        System.out.println("Cadena otra2 con trim: "+otra2);
        System.out.println("\ncadena otra con trim: "+otra.trim());
        System.out.println("");
        
        //8.- ToCharArray
        System.out.println("");
        System.out.println("ToCharArray");
        char []g = a.toCharArray();
        for (int i = 0; i < g.length; i++) {
            //Si le quitas el "ln" se imprime seguido
            System.out.println(g[i]);
        }
        
        //9.- contains
        System.out.println("\nContains");
        String cont = "BABY LA VIDA ES UN CICLO";
        boolean con = cont.contains("");
        System.out.println("Contains: "+con);
        
        //10.- endsWith
        System.out.println("\nEnds with");
        String ends = "PERO HICE TORO ESTE LLANTO POR NARA";
        boolean end = ends.endsWith("NARA");
        System.out.println("Ends With: "+end);
        
        //11.- isEmpty
        System.out.println("\nis empty");
        boolean emp = ends.isEmpty();
        System.out.println("Is empty: "+emp);
        
        //12.- lenght 
        System.out.println("\nLength");
        int leng = ends.length();
        System.out.println("Length: "+leng);
        
        //13.- matches
        System.out.println("\nMatches: ");
        boolean mat = ends.matches("PERO HICE TORO ESTE LLANTO POR NARA");
        System.out.println("Matches; "+mat);
        
        //14.- replace
        System.out.println("\nReplace");
        String text = "TEXTO PARA SER REEMPLAZADO";
        System.out.println("Texto original; "+text);
        System.out.println("REEMPLAZO DE TEXTO POR NOVIO:  "+text.replace("TEXTO", "NOVIO"));
        
        //15.- replaceAll
        System.out.println("\nReplace all");
        String texto = "LAS TIAS";
        System.out.println("TEXTO A RREMPLAZAR: "+texto);
        System.out.println("TEXTO NUEVO REEMPLAZADO: "+texto.replaceAll(texto, "NUEVO TEXTO"));
        
        //16.- replaceFirst
        System.out.println("\nReplace first: ");        
        String replacetext = "HOLA MUNDO";
        System.out.println("Texto original: "+replacetext);
        System.out.println("Nuevo texto modificado del inicio; "+replacetext.replaceFirst(replacetext, "ADIOS"));
        
        //17.- startsWith
        System.out.println("\nStarts with");
        System.out.println("Starts with: "+ends.startsWith("V"));
        
        //18.- toLowerCase
        System.out.println("\nTolowerCase");
        String tol = "TEXTO PARA PASAR A MINUSCULAS";
        System.out.println("Texto original: "+tol);
        System.out.println("En MINUSCULAS; "+tol.toLowerCase());
        
        //19.- ToUpperCase
        System.out.println("\nToOpperCase");
        String upp = "texto para pasar a mayusculas";
        System.out.println("Texto original: "+upp);
        System.out.println("En MINUSCULAS; "+upp.toUpperCase());
        
        //20.- codePointAt
        System.out.println("[ncode point at");
        String cod = "HOLA";
        System.out.println("Code point at: "+ends.codePointAt(1));
        
        //21.- regionMatches
        System.out.println("\nRegion Matches");
        boolean reg = ends.regionMatches(2, "NARA", 2, 2);
        System.out.println("Region matches: "+reg);
        
        //22.- startsWith
        System.out.println("\nStarts with 2: ");
        boolean star = ends.startsWith("PE", 2);
        System.out.println("Starts with: "+star);      
    }
    
}
