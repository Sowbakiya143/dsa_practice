package sorting;
import java.util.*;
public class bubble_sort {
  public static void main(String[] args) {
     int[] arr = {5, 2, 8, 1};
     int n=arr.length;
     for(int i=n-1;i>=1;i--){
      for(int j=0;j<=i-1;j++){
          if(arr[j] > arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
      }
     }
     System.out.println(Arrays.toString(arr));
  }
}
