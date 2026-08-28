package prefix_sum;

public class equilibrium_index {
 public static void main(String[] args) {
  int[] arr = {1, 3, 5, 2, 2};
  int totsum=0;
  for(int x:arr) totsum+=x;
  int leftsum=0;
  for(int i=0;i<arr.length;i++){
    int rightsum=totsum -leftsum-arr[i];
    if(rightsum==leftsum){
      System.out.println(i);
      return ;

    } 
    leftsum+=arr[i];
  }
  System.out.println(-1);
 } 
}
