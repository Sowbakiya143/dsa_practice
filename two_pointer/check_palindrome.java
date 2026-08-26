package two_pointer;

public class check_palindrome {
  public static boolean checkpali(String s){
    int l=0;
    int n=s.length();
    int r=n-1;
    while(l<=r){
      if(s.charAt(l) != s.charAt(r)) return false;
      l++;
      r--;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(checkpali("MADAM"));
    System.out.println(checkpali("HELLO"));
  }
}
