package hashing;


import java.util.HashSet;

public class duplicate_within_kposition {
  public static boolean nearbyDuplicate(int[] arr,int k){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
      if(set.contains(arr[i])) return true;
      set.add(arr[i]);
      if(set.size() > k){
        set.remove(arr[i-k]);
      }
    }
    return false;
  }
  public static void main(String[] args) {
     System.out.println(nearbyDuplicate(new int[]{1,2,3,1}, 3));
     System.out.println(nearbyDuplicate(new int[]{1,2,3,1}, 2));
  }
}
