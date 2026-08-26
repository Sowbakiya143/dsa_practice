package two_pointer;
import java.util.*;
public class movezero_toend {
  public static void main(String[] args) {
    int[] arr = {0, 1, 0, 3, 12};

        int j = -1;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==0){
            j=i;
            break;
          }
        }
        if(j==-1) System.out.println("No zeroes");
        for(int i=j+1;i<arr.length;i++){
          if(arr[i] != 0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
          }
        }
        System.out.println(Arrays.toString(arr));
  }
}
