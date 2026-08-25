public class cnt_pos_neg_zero {
  public static void main(String[] args) {
     int[] arr = {14, -3, 0, 8, -17, 0, 11};
     int pos=0;
     int neg=0;
     int zero=0;
     for(int i=0;i<arr.length;i++){
      if(arr[i]>0)pos++;
      else if(arr[i]<0) neg++;
      else zero++;
     }
     System.out.println("positive "+pos);
     System.out.println("negative "+neg);
     System.out.println("zero "+zero);
  }
  
}
