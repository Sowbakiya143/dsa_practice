public class cnt_div_by3 {
  public static void main(String[] args) {
     int[] arr = {14, 3, 21, 8, 17, 6, 11};

        int count = 0;
        for(int x:arr){
          if(x%3 ==0) count++;
        }
        System.out.println(count);
  }
}
