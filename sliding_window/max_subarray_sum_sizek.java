package sliding_window;

public class max_subarray_sum_sizek {
  public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;
        int sum=0;
        for(int i=0;i<k;i++) sum+=arr[i];
        int l=0;
        int r=k;
        int maxsum=sum;
        while(r<arr.length){
          sum-=arr[l];
          sum+=arr[r];
          maxsum=Math.max(maxsum,sum);
          l++;
          r++;

        }
      System.out.println(maxsum);
      }
}
