public class Promedio{
 public static void main(String args[]){
   
  int matemati = 5;
  int biologia = 5;
  int quimica  = 5;
  int promedio = 0;

  promedio = (matemati + biologia + quimica)/3;
  
  if (promedio >= 6) { 
   System.out.println("El alumno aprobó " + promedio);
  }else{
   System.out.println("El alumno reprobó " + promedio);
  }
 }
}