package two_pointer;

import java.util.Arrays;

public class sort_0s1s {
  public static void main(String[] args) {
     int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
     int l=0;
     int r=arr.length-1;
     while (l<r) {
      if(arr[l]==0) l++;
      else if(arr[r]==1) r--;
      else{
        arr[l]=0;
        arr[r]=1;
        l++;
        r--;
      }
     }
     System.out.println(Arrays.toString(arr));
  }
}
