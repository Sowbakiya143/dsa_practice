package two_pointer;

public class reverse_onlyvowels {
  public static boolean isvowel(char s){
   
    String vowel="aeiouAEIOU";
    if(vowel.contains(String.valueOf(s))) return true;
    else return false;
  }
  public static void main(String[] args) {
    String s="LeetcodE";
    char[] ch=s.toCharArray();
    int l=0;
    int n=s.length();
    int r=n-1;
    while(l<r){
      if(! isvowel(ch[l])){
        l++;
      }else if(!isvowel(ch[r])){
        r--;
      }else{
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        l++;
        r--;
      }
    }
    System.out.println(new String(ch));
  }
}
