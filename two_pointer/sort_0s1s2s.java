package two_pointer;

import java.util.Arrays;

public class sort_0s1s2s {
  public static void main(String[] args) {
    int[] arr = {2, 0, 2, 1, 1, 0};
    int low=0;
    int high=arr.length-1;
    int mid=0;
    while(mid<high){
      if(arr[mid]==0){
        int temp=arr[low];
        arr[low]=arr[mid];
        arr[mid]=temp;
        low++;
        mid++;
      }else if(arr[mid]==1) mid++;
      else{
        int temp2=arr[high];
        arr[high]=arr[mid];
        arr[mid]=temp2;
        high--;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
