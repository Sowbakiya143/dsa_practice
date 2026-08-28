package prefix_sum;

public class rangesum_query {
  public static int rangesum(int l,int r,int[] prefix){
    if(l==0) return prefix[r];
    return prefix[r]-prefix[l-1];
  }
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 4, 1, 6};
       int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println(rangesum(1,3,prefix));
        System.out.println(rangesum(0,2,prefix));
  }
}
