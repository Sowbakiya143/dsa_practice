package prefix_sum;

import java.util.HashMap;

public class longest_subarray_withsum_k {
  public static void main(String[] args) {
     int[] arr = {10, 5, 2, 7, 1, 9};
     int k = 15;
     HashMap<Integer,Integer> map=new HashMap<>();
     int sum=0;
   
     int maxlen=0;
     for(int i=0;i<arr.length;i++){
      sum+=arr[i];
      if(sum==k) maxlen=i+1;
      if(map.containsKey(sum-k)){
       int len=map.get(sum-k);
        maxlen=Math.max(maxlen,i-len);
      }
      if(!map.containsKey(sum))
      map.put(sum,i);
     }
     System.out.println(maxlen);
  }
}
