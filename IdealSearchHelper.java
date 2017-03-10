package idealSearch;

import java.util.Arrays;

/**
 * Created by parmeshwor on 1/23/16.
 */
public class IdealSearchHelper {

    private static int NUM_DIGITS = 4;
    private static int val = 0;

    public static void main(String[] args) {

        // value to integer
        int arr[] = integerToArray(val);
        for(int x:arr) System.out.print(x+" ");
    }

   public static int[] integerToArray(int val){

        int temp[] = new int[NUM_DIGITS];

       for(int i=NUM_DIGITS-1;i>=0;i--)
       {
           temp[i]=val%10;
           val = val/10;
       }
       return temp.clone();
   }
   
   public static int[] integerToArray2(long val){

       int temp[] = new int[String.valueOf(val).length()];

      for(int i=temp.length-1;i>=0;i--)
      {
          temp[i]=(int)val%10;
          val = val/10;
      }
      return temp.clone();
  }
   
   public static int[] integerToArray2(int val){

       int temp[] = new int[String.valueOf(val).length()];

      for(int i=temp.length-1;i>=0;i--)
      {
          temp[i]=val%10;
          val = val/10;
      }
      return temp.clone();
  }
   
   //incomplete
   public static int[] stringToArrayOfInt(String str){
	   
	  return  Arrays.stream(str.trim().split(""))
	    .parallel()
	    .mapToInt(Integer::parseInt)
	    .toArray();   
   }
}
