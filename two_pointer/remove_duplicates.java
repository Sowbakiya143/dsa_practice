package two_pointer;

public class remove_duplicates {
  public static void main(String[] args) {
         int[] arr = {1, 1, 2, 2, 2, 3, 4, 4};
         int j=0;
         for(int i=1;i<arr.length;i++){
          if(arr[j] != arr[i]){
            arr[j+1]=arr[i];
            j++;
          }
         }
         System.out.println("length = "+(j+1));
         for(int i=0;i<=j;i++){
          System.out.print(arr[i]+" ");
         }


  }
}
