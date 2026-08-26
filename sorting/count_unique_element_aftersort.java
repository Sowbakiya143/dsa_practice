package sorting;

import java.util.Arrays;

public class count_unique_element_aftersort {
  public static void main(String[] args) {
     int[] arr = {10, 20, 10, 30, 20, 40};
     Arrays.sort(arr);
     int cnt=1;
     for(int i=1;i<arr.length;i++){
      if(arr[i] != arr[i-1]) cnt++;
     }
     System.out.println(cnt);
  }
  
}
