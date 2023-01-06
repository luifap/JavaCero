import java.util.Scanner;

public class MetodoLenght{
  public static void main(String args[]){
   
  String cadena_original = "", cadena_substraccion = "";
  int num_caracteres = 0, desde = 0, hasta = 0;
  Scanner entrada = new Scanner(System.in);
  
  System.out.print("Introducce una cadena de caracteres ");
  cadena_original = entrada.nextLine();

  num_caracteres = cadena_original.length();

  System.out.println("La cadena de caracteres " + cadena_original + " posee " +
                       num_caracteres + " caracteres.");

   System.out.print("¿Desde que caracter deseas obtener la nueva cadea?: ");
   desde = entrada.nextInt();

   System.out.print("¿Hasta que caracter deseas obtener la nueva cadea?: ");
   hasta = entrada.nextInt();

   cadena_substraccion = cadena_original.substring(desde, hasta);
   System.out.println("La nueva cadea es: " + cadena_substraccion);
 }
}