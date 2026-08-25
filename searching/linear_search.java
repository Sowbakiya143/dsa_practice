public class linear_search {
  public static void main(String[] args) {
    int[] arr = {14, 3, 21, 8, 17, 6, 11};
    int key=0;
    int flag=-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        flag=i;
        break;
      }
    }
    System.out.println(flag);
  }
}
