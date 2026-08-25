package sorting;

public class check_array_sorted {
  public static boolean issorted(int [] arr){
    for(int i=1;i<arr.length;i++){
      if(arr[i]<arr[i-1]) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(issorted(new int[]{3,6,8,11,14}));
    System.out.println(issorted(new int[]{14,3,21,8}));
  }
}
