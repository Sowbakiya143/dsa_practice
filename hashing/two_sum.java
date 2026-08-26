package hashing;

import java.util.HashMap;

public class two_sum {
  public static int[] twosum(int[] arr,int target){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
      int more=target-arr[i];
      if(map.containsKey(more)){
        return new int[]{i,map.get(more)};
      }
      map.put(arr[i],i);
    }
    return new int[]{-1,-1};
  } 
  public static void main(String[] args) {
    int[] nums = {14, 3, 21, 8, 17, 6, 11};
    int[] res=twosum(nums,25);
    System.out.println("("+res[0]+" , "+res[1]+")");
  }
}
