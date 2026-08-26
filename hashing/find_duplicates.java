package hashing;

import java.util.HashSet;

public class find_duplicates {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 20, 40, 10};
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
      if(set.contains(arr[i])) System.out.println(arr[i]);
      else set.add(arr[i]);
      
    }
  }
}
