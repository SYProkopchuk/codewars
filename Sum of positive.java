public class Positive{

  public static int sum(int[] arr){
  int a=0;
   for (int i=0;iarr.length;i++){
     if (arr[i]0){
     a += arr[i];
     } 
   }
   if (a0) {
   return 0;
   } else return a; 
  }

}