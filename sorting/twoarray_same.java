package sorting;

import java.util.Arrays;

public class twoarray_same {
  public static boolean same(int[] arr,int[] brr){
    Arrays.sort(arr);
    Arrays.sort(brr);
    if(arr.length != brr.length) return false;
    for(int i=0;i<arr.length;i++){
      if(arr[i] != brr[i]) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(same(new int[]{14,3,21}, new int[]{21,14,3}));
        System.out.println(same(new int[]{14,3,21}, new int[]{21,14,5}));
  }
}
