public class sum_atevenindex {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
    int sum=0;
    for(int i=0;i<arr.length;i+=2){
      sum+=arr[i];
    }
    System.out.println(sum);
  }
}
