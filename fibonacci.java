public class fibonacci{
 public static void main(String args[]){
   
   int k = 0, a = 0, b = 1, c = 0;

   System.out.println("Serie con for: ");
   for(k = 0; k < 10; k++){
    if(k < 9){
     System.out.print(a + ",");
      c = a + b;
      a = b;
      b = c;
    }else {
     System.out.print(a);
   }
  }
   System.out.println("");
   k = 0;
   b = 1;
   a = 0;
   c = 0;

   System.out.println("Serie con while: ");
   while(k < 10){
    if(k < 9){
     System.out.print(a + ",");
      c = a + b;
      a = b;
      b = c;
    }else {
     System.out.print(a);
    }
     k++;
   }
   System.out.println("");
   k = 0;
   b = 1;
   a = 0;
   c = 0;

   System.out.println("Serie con do-while: ");
   do{
     if(k < 9){
     System.out.print(a + ",");
      c = a + b;
      a = b;
      b = c;
    }else {
     System.out.print(a);
    }
     k++;
   }while(k < 10);
 }

}