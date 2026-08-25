public class cnt_greater10 {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
    int cnt=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>10) cnt++;
    }
    System.out.println(cnt);
  }
}
