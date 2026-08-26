package two_pointer;

public class container_withmost_water {
  public static void main(String[] args) {
    int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int l=0;
    int n=h.length;
    int r=n-1;
    int maxarea=0;
    while(l<r){
      int length=Math.min(h[l],h[r]);
      int breadth=r-l;
      int area=length*breadth;
      maxarea=Math.max(maxarea,area);
      if(h[l] < h[r])l++;
      else r--;
    }
    System.out.println(maxarea);
  }
}
