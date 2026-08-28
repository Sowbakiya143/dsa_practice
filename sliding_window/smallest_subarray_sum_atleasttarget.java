package sliding_window;

public class smallest_subarray_sum_atleasttarget {
  public static void main(String[] args) {
    int[] arr = {2, 3, 1, 2, 4, 3};
    int target = 7;
    int l=0;
    int r=0;
    int sum=0;
    int min=Integer.MAX_VALUE;
    while(r<arr.length){
      sum+=arr[r];
   
      while(sum>= target){
    min=Math.min(min,r-l+1);
        sum-=arr[l];
        l++;
      }
      r++;
    }
    System.out.println(min);
  }
}
