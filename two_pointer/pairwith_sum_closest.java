package two_pointer;

import java.util.Arrays;

public class pairwith_sum_closest {
  public static void main(String[] args) {
     int[] arr = {10, 22, 28, 29, 30, 40};
        int target = 54;
        Arrays.sort(arr);
        int n=arr.length;
        int l=0;
        int r=n-1;
        int bestL=0;
        int bestR=0;
        int bestdiff=Integer.MAX_VALUE;
        while(l<r){
          int sum=arr[l]+arr[r];
          int diff=Math.abs(sum-target);
          if(diff<bestdiff){
            bestdiff=diff;
            bestL=arr[l];
            bestR=arr[r];

          }
          else if(sum<target)l++;
          else r--;
        }
        System.out.println(bestL+" and "+bestR);
  }
}
