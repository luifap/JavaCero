public class Ejercicio1Ciclos{
 public static void main(String args[]){
   
   int k = 0;
   
   System.out.println("Serie con For: ");
   for(k = 1; k <= 10; k++){
    if(k < 10){
      System.out.print(k + ",");
    }else {
     System.out.print(k);
     }
   }

   k = 1;
   System.out.println("");
    
    System.out.println("Serie con While: ");
    while(k <= 10){
     if(k < 10){
      System.out.print(k + ",");
    }else {
     System.out.print(k);
     }
     k++;
   }
    k = 1;
    System.out.println("");

    System.out.println("Serie con Do-While: ");
     do{
      if(k < 10){
      System.out.print(k + ",");
    }else {
     System.out.print(k);
     }
      k++;
     }while(k <= 10);
 }
}