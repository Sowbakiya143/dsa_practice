package hashing;

import java.util.HashMap;

public class most_freq_element {
  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 1, 4, 1, 3};
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int x:arr){
      map.put(x,map.getOrDefault(x,0)+1);
    }
    int max=0;
    int ele=0;
    for(int key:map.keySet()){
      if(map.get(key) > max){
        max=map.get(key);
        ele=key;
      }
    }
    System.out.println(ele+" appears "+max+" times ");
  }
}
