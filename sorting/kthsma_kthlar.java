package sorting;

import java.util.Arrays;

public class kthsma_kthlar {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
        int k = 3;
        Arrays.sort(arr);
        int n=arr.length;
        System.out.println(k+"th largest = "+arr[n-k]);
        System.out.println(k+"th smallest = "+arr[k-1]);
  }
  
}
