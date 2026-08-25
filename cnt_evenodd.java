public class cnt_evenodd {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
    int odd=0;
    int even=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i] % 2 ==0)even++;
      else odd++;

    }
    System.out.println("even "+even);
    System.out.println("odd "+odd);
  }
}
