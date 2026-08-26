package two_pointer;
import java.util.*;
public class two_sum {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
        int target = 25;
        int l=0;
        int n=arr.length;
        int r=n-1;
        Arrays.sort(arr);
        while(l<r){
          int sum=arr[l]+arr[r];
          if(sum== target){
            System.out.println(arr[l]+" + "+arr[r]+" = "+target);
            break;
          }
          else if(sum<target) l++;
          else r--;
        }
  }
}
