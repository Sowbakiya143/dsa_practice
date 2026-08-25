package nested_loop;

public class cnt_pair {
  public static void main(String[] args) {
     int[] arr = {5, 5, 10, 15, 0, 20};
        int target = 20;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target) cnt++;
          }
        }
        System.out.println(cnt);
  }
}
