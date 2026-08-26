package sorting;

import java.util.Arrays;

public class find_median {
  public static void main(String[] args) {
     int[] arr = {14, 3, 21, 8, 17, 6, 11};
     Arrays.sort(arr);
     double median=0;
     int n=arr.length;
     if(n%2 !=0){
      median=arr[n/2];
     }else{
      int len=arr[n/2]+arr[(n/2)-1];
      median=len/2;
     }
     System.out.println(median);

  }
}
