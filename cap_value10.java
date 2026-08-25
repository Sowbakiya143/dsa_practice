import java.util.Arrays;

public class cap_value10 {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
    int change=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>10){
        arr[i]=10;
        change++;
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(change);
  }
  
}
