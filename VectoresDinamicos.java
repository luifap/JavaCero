import java.util.Scanner;

public class VectoresDinamicos {
  public static void main(String args[]){
    
   int longitud = 0;
   Scanner entrada = new Scanner(System.in);

   System.out.print("¿Cuántos números deseas ingresar?: ");
   longitud = entrada.nextInt();
   
   int numeros[] = new int[longitud];

   for(int k = 0; k < numeros.length; k++){
      System.out.println("Por favor dame el valor #" + (k + 1));
      numeros[k] = entrada.nextInt();
   }
   for(int k = 0; k < numeros.length; k++){
     System.out.print("[" + numeros[k] + "]");  
   }
 }
}