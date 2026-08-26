package hashing;

import java.util.HashMap;

public class first_nonrepeating {
  public static void main(String[] args) {
  int[] arr = {9, 4, 9, 6, 7, 4};
  HashMap<Integer,Integer> map=new HashMap<>();
  for(int x:arr){
    map.put(x,map.getOrDefault(x,0)+1);

  }
  for(int key:arr){
    if(map.get(key)==1){
      System.out.println(key);
      return;
    }
  }
  System.out.println("All elements repeat");
  }
}
