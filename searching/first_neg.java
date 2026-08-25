
public class first_neg {
  public static void main(String[] args) {
     int[] arr = {14, 3, -21, 8, -17, 6, 11};
     boolean flag=false;
     for(int i=0;i<arr.length;i++){
      if(arr[i] <0){
        flag=true;
        System.out.println("First negative = "+arr[i]+" at index "+i);
        break;
      }
     }
     if(!flag){
      System.out.println("no negative");
     }
  }
  
}
