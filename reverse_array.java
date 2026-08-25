import java.util.*;
public class reverse_array {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
    int l=0;
    int n=arr.length;
    int r=n-1;
    while(l<r){
      int temp=arr[l];
      arr[l]=arr[r];
      arr[r]=temp;
      l++;
      r--;
    }
    System.out.println(Arrays.toString(arr));
  }
}
