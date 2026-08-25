package nested_loop;

public class twosum {
  public static void main(String[] args) {
     int[] arr = {14, 3, 21, 8, 17, 6, 11};
        int target = 25;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target) {
              flag=true;
              System.out.println(arr[i]+"+"+arr[j]+"="+target);
              break;
            }
          }
        }
         System.out.println(flag);
  }
}
