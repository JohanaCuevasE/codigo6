package codigo6;
import java.util.Scanner; // se Importo la clase Scanner
  //el programa genera, muestra números dependiendo de la preferencia del usuario.
public class Codigo6 {

	    public static void main(String[] args) {
	        int[] n = new int[20]; // se corrigio la inicializacion del array

	    
	        for (int i = 0; i < 20; i++) { // se Corrigio  el incremento de i++
	            n[i] = (int) (Math.random() * 381) + 20; 
	            System.out.print(n[i] + " "); 
	        }
	        System.out.println(); // se agrego como un salto de linea 
	        
	        Scanner scanner = new Scanner(System.in); // se creo un Scanner para leer la entrada del usuario
	        System.out.print("¿Qué números quiere resaltar? ");
	        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	        int opcion = scanner.nextInt(); // Lo leemos con scanner 
	        
	       
	        int multiplo = (opcion == 1) ? 5 : 7;
	        
	        System.out.println(); // Agregamos otro salto de linea 

	        //modificamos el foreach 
	        for (int e : n) { 
	            if (e % multiplo == 0) { 
	                System.out.print("[" + e + "] ");
	            } else {
	                System.out.print(e + " "); 
	            }
	        }
	        scanner.close(); // agregamos un cierre al scanner
	    
	}
}


