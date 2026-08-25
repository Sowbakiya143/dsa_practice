public class max_min {
  public static void main(String[] args) {
     int[] arr = {14, 3, 21, 8, 17, 6, 11};
     int max=arr[0];
     int min=arr[0];
     for(int i=1;i<arr.length;i++){
      if(arr[i] > max) max=arr[i];
      if(arr[i]<min) min=arr[i];
     }
     System.out.println("max= "+max+" min= "+min);
  }
}
