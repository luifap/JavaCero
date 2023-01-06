import java.util.Scanner;

public class MetodoEquals2{
 public static void main(String args[]){
   
  String usuario = "", password = "";
  Scanner entrada = new Scanner(System.in);
  
  System.out.print("Por favor ingresa el nombre de usuario: ");
  usuario = entrada.nextLine();
   
  System.out. print("Por favor ingresa la contraseña: ");
  password = entrada.nextLine();

  if(usuario.equals("luisa") && password.equals("123456")){
   System.out.println("Inicio sesión correcto");
  }else {
   System.out.println("Nombre de usuario o password incorrectos");
  }
 }
}