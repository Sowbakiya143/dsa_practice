package sliding_window;

import java.util.LinkedList;
import java.util.Queue;

public class first_negnum_window_sizek {
  public static void main(String[] args) {
    int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++) if(arr[i] <0) q.add(i);

        for(int i=0;i<arr.length;i++){
          k=3;
          int flag=0;
          while(k-->0){
            if(arr[i]<0) {
              flag=1;
              break;
            }
          
          }
          if(flag==1) System.out.println(q.poll());
        }


  }
}
