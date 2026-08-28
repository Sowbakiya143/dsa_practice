package prefix_sum;

import java.util.HashMap;



public class count_subarray_withsum_equal_k {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      int cnt=0;
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(map.containsKey(sum-k)){
          cnt+=map.get(sum-k);
        }
        map.put(sum,map.getOrDefault(sum, 0)+1);
      }
      System.out.println(cnt);
  }
}
