package two_pointer;

import java.util.Arrays;

public class count_twosum {
  public static void main(String[] args) {
    int[] arr = {2, 4, 3, 1, 5};
        int target = 6;
        Arrays.sort(arr);
        int n=arr.length;
        int l=0;
        int r=n-1;
        int cnt=0;
        while(l<r){
          int sum=arr[l]+arr[r];
          if(sum==target){
            cnt++;
            l++;
            r--;
          }else if(sum<target) l++;
          else r--;
        }
        System.out.println(cnt);
  }
}
