package hashing;

import java.util.HashSet;

public class countpair_withgiven_diff {
  public static void main(String[] args) {
     int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
         int cnt=0;
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr) set.add(x);
       
        for(int x:arr){
         if(set.contains(x-k)) cnt++;
    }
        System.out.println(cnt);

  }
}
