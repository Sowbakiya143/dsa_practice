package hashing;

import java.util.HashSet;

public class longest_consecutive_number {
  public static void main(String[] args) {
     int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set= new HashSet<>();
        for(int x:arr) set.add(x);
        int maxlen=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
          int ele=arr[i];
          if(!set.contains(ele-1)){
             cnt=1;
            while(set.contains(ele+1)){
              cnt++;
              ele++;
            }
          }
          maxlen=Math.max(maxlen,cnt);

        }
        System.out.println(maxlen);
  }
}
