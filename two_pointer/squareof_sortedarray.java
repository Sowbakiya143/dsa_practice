package two_pointer;

import java.util.Arrays;

public class squareof_sortedarray {
  public static void main(String[] args) {
    int[] arr = {-4, -1, 0, 3, 10};
    int l=0;
    int n=arr.length;
    int r=n-1;
    while(l<r){
      if(Math.pow(arr[l],2) < Math.pow(arr[r],2)){
        arr[r]=(int)Math.pow(arr[r],2);
        r--;
      }else{
        int temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
        arr[r]=(int)Math.pow(arr[r],2);
        r--;
      }
    }
    arr[l]=(int)Math.pow(arr[l],2);
    System.out.println(Arrays.toString(arr));

  }
}
