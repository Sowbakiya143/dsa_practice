package hashing;

/**
 * missing_num_1ton
 */
public class missing_num_1ton {

  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 3, 6, 7};
        int n = 7;
        int totsum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
          sum+=arr[i];
        }
        System.out.println(totsum-sum);
  }
}