package sorting;

import java.util.Arrays;

public class selection_sort {
  public static void main(String[] args) {
      int[] arr = {14, 3, 21, 8, 17};
      int n=arr.length;
      for(int i=0;i<=n-2;i++){
        int mini=i;
        for(int j=i;j<=n-1;j++){
          if(arr[j]<arr[mini]) mini=j;
        }
        int temp=arr[mini];
        arr[mini]=arr[i];
        arr[i]=temp;
      }
      System.out.println(Arrays.toString(arr));
  }
}
