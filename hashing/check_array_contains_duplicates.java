package hashing;

import java.util.HashSet;

public class check_array_contains_duplicates {
  public static boolean hasDuplicate(int[] arr){
    HashSet<Integer> set=new HashSet<>();
    for(int x:arr) set.add(x);
    if(set.size() < arr.length) return true;
    return false;
  }
  public static void main(String[] args) {
     System.out.println(hasDuplicate(new int[]{1,2,3,1}));
     System.out.println(hasDuplicate(new int[]{1,2,3,4}));
  }
}
