package two_pointer;

import java.util.Arrays;

public class moveneg_toend {
  public static void main(String[] args) {
     int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        int l = 0;
        int r = arr.length - 1;
        while(l<r){
          if(arr[l] <0) l++;
         else if(arr[r] >=0) r--;
          else{
            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;
          }
        }
        System.out.println(Arrays.toString(arr));
  }
}
