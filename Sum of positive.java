public class Positive{

  public static int sum(int[] arr){
  int a=0;
   for (int i=0;i<arr.length;i++){
     if (arr[i]>0){
     a += arr[i];
     } 
   }
   if (a<0) {
   return 0;
   } else return a; 
  }

}