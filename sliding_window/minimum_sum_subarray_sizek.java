package sliding_window;

public class minimum_sum_subarray_sizek {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 5, 50, 60, 2};
        int k = 3;
        int sum=0;
        for(int i=0;i<k;i++){
          sum+=arr[i];
        }
        int l=0;
        int r=k;
        int minsum=sum;
        while(r<arr.length){
          sum-=arr[l];
          sum+=arr[r];
          minsum=Math.min(minsum,sum);
          l++;
          r++;
        }
        System.out.println(minsum);
  }
}
