package hashing;

import java.util.HashSet;

public class first_repeating_element {
  public static void main(String[] args) {
    int[] arr = {10, 5, 3, 4, 3, 5, 6};
    HashSet<Integer> set=new HashSet<>();
    for(int x:arr){
      if(set.contains(x)){
        System.out.println(x);
        break;
      }else set.add(x);
    }
  }
}
