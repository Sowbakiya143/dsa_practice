public class slar {
  public static void main(String[] args) {
    int arr[]= {14, 3, 21, 8, 17, 6, 11};
    int lar=arr[0];
    int slar=-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]> lar){
        slar=lar;
        lar=arr[i];
      }else if(arr[i] > slar && arr[i]<lar) slar=arr[i];
    }
    System.out.println(slar);
  }
}
