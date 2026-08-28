package sliding_window;

public class avg_everywindow_sizek {
  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        int l=0;
        int r=k;
        float sum=0;
        int n=arr.length;
        for(int i=0;i<k;i++) sum+=arr[i];
        System.out.print((sum/k)+"  ");
        while(r<n){
          sum-=arr[l];
          sum+=arr[r];
          System.out.print((sum/k)+"  ");
          l++;
          r++;

        }
  }
}
