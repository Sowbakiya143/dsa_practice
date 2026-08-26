package sorting;

import java.util.Arrays;
import java.util.Collections;

public class sort_des_order {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17};
    Arrays.sort(arr);
    for(int i=arr.length-1;i>=0;i--){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    Integer[] brr={14,2,21,8,13};
      Arrays.sort(brr,Collections.reverseOrder());
      System.out.println(Arrays.toString(brr));
    }
  }

