public class exist_ornot {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
    int key=1;
    boolean found=false;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key) {
        found=true;
        break;
      }
    }
    System.out.println(found);
  }
}
