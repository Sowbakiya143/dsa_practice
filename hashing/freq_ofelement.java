package hashing;

import java.util.*;

public class freq_ofelement {
  public static void main(String[] args) {
      int[] arr = {10, 20, 10, 30, 20, 10};
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int x:arr){
        map.put(x,map.getOrDefault(x,0)+1);
      }
    //  for(int key:map.keySet()){
    //  System.out.println(key+" -> "+map.get(key));

     // }
     for(Map.Entry<Integer,Integer> e:map.entrySet()){
      System.out.println(e.getKey()+" -> "+e.getValue());
     }
  }
}
