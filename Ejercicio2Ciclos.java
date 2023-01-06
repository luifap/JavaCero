public class Ejercicio2Ciclos{
 public static void main(String args[]){
   
   int k = 1;
   int m = 99;
   
   System.out.println("Serie con For: ");
   for(k = 1; k <= 5; k++){
    if(k < 5){
      System.out.print(k + ",");
      System.out.print(m + ",");
    }else {
     System.out.print(k + ",");
     System.out.print(m);
     }

     m--;
   }
   System.out.println("");
    
   k = 1;
   m = 99;

    System.out.println("Serie con While: ");
    while(k <= 5){
     if(k < 5){
      System.out.print(k + ",");
      System.out.print(m + ",");
    }else {
     System.out.print(k + ",");
     System.out.print(m);
     }
     k++;    
     m--;
   }
    
    System.out.println("");
     k = 1;
     m = 99;

    System.out.println("Serie con Do-While: ");
     do{
      if(k < 5){
      System.out.print(k + ",");
      System.out.print(m + ",");
    }else {
     System.out.print(k + ",");
     System.out.print(m);
     }
     k++;    
     m--;
     }while(k <= 5);
 }
}