package prefix_sum;
import java.util.*;
/**
 * build_prefixsum_array
 */
public class build_prefixsum_array {

  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 4};
    int[] prefix = new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      prefix[i]=prefix[i-1]+arr[i];
    }
    System.out.println(Arrays.toString(prefix));
  }
}