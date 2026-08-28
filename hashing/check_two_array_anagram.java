package hashing;

import java.util.HashMap;

public class check_two_array_anagram {
  public static boolean isAnagram(int[] arr,int[] brr){
    if(arr.length != brr.length) return false;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int x:arr){
      map.put(x,map.getOrDefault(x, 0)+1);
    }
    for(int x:brr){
      if(map.get(x)==0) return false;
      map.put(x,map.get(x)-1);
    }
    return true;
  }
  public static void main(String[] args) {
        System.out.println(isAnagram(new int[]{1,2,2,3}, new int[]{2,3,1,2}));
        System.out.println(isAnagram(new int[]{1,2,2,3}, new int[]{2,3,1,1}));
  }
}
