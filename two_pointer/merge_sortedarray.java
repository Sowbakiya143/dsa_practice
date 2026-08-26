package two_pointer;
import java.util.*;
public class merge_sortedarray {
  public static void main(String[] args) {
     int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6};
        int[] res = new int[a.length + b.length];
        int l=0;
        int r=0;
        int k=0;
        while(l<a.length && r<b.length){
          if(a[l] <= b[r] ){
            res[k++]=a[l];
            l++;
          }else{
            res[k++]=b[r];
            r++;
          }
        }
        while(l<a.length){
          res[k++]=a[l++];
        }while ((r<b.length)) {
          res[k++]=b[r++];
        }
        System.out.println(Arrays.toString(res));
  }
}
