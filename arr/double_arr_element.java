package arr;
import java.util.*;
public class double_arr_element {
  public static void main(String[] args) {
     int[] arr = {14, -3, 0, 8, -17, 0, 11};
     for(int i=0;i<arr.length;i++){
      arr[i]=arr[i]*2;
     }
     System.out.println(Arrays.toString(arr));
  }
}
