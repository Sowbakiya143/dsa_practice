package two_pointer;
import java.util.*;
public class triplet_sum {
  public static void main(String[] args) {
    int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
          int sum=arr[i];
          int l=i+1;
          int r=arr.length-1;
          int k=target-sum;
          while(l<r){
            int find=arr[l]+arr[r];
            if(find==k){
              System.out.println(arr[l]+" + "+arr[r]+" + "+sum);
              return;
            }else if(find<k) l++;
            else r--;

          }
        }

  }
}
