public class value_appear {
  public static void main(String[] args) {
     int[] arr = {14, 3, 21, 8, 17, 6, 11, 17, 17};
     int key=17;
     int cnt=0;
     for(int i=0;i<arr.length;i++){
      if(arr[i]==key) cnt++;
     }
     System.out.println(cnt);
  }
}
