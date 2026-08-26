package two_pointer;

import java.util.Arrays;

public class twosum_returnindex {
  public static void main(String[] args) {
     int[] arr = {14, 3, 21, 8, 17, 6, 11};
        int target = 25;
        int n=arr.length;
        int[][] pairs=new int[n][2];
        for(int i=0;i<n;i++){
          pairs[i][0]=arr[i];
          pairs[i][1]=i;

        }
        Arrays.sort(pairs,(a,b)-> a[0]-b[0]);
        int l=0;
        int r=n-1;
        while(l<r){
          int sum=pairs[l][0]+pairs[r][0];
          if(sum==target){
            System.out.println("("+pairs[l][1]+","+pairs[r][1]+")");
            break;
          }else if(sum<target) l++;
          else r--;
        }
  }
}
