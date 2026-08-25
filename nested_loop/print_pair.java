package nested_loop;


public class print_pair {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8};
 for(int i=0;i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
    System.out.println("("+arr[i]+","+arr[j]+")");
  }
 }
  }
 
  
}