package two_pointer;

public class string_subseq {
  public static boolean issubsequence(String s1,String s2){
    int l=0;
    int r=0;
    while(l<s1.length()  && r<s2.length()){
      if(s1.charAt(l) == s2.charAt(r) ){
        l++;
        r++;
      }else r++;
    }
    if(l==s1.length()) return true;
    else return false;
  }
  public static void main(String[] args) {
    System.out.println(issubsequence("abc","ahbgdc"));
    System.out.println(issubsequence("axc","ahbgdc"));
  }
}
