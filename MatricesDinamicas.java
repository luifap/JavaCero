import java.util.Scanner;

public class MatricesDinamicas {
 public static void main(String args[]){

  int filas = 0, columnas = 0, contador = 1;
  
  Scanner entrada = new Scanner(System.in);

  System.out.println("¿Cuántas filas deseas");
  filas = entrada.nextInt();

  System.out.println("¿Cuántas filas columnas");
  columnas = entrada.nextInt();

  int numeros [][] = new int [filas][columnas];
   
   for(int k = 0; k < filas; k++){
    for(int m = 0; m < columnas; m++){
     numeros[k][m] = contador;
     contador++;
     System.out.print("[" + numeros[k][m] + "]");
    }
     System.out.println("");
   }
 }
}