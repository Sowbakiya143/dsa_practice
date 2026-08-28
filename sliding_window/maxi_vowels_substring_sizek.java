package sliding_window;

public class maxi_vowels_substring_sizek {
  public static boolean isvowel(char ch){
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
    return false;
  }
  public static void main(String[] args) {
    String s = "abciiidef";
        int k = 3;
        int cnt=0;
        for(int i=0;i<k;i++) if(isvowel(s.charAt(i))) cnt++;
        int l=0;
        int r=k;
        int max=cnt;
        while(r<s.length()){
          if(isvowel(s.charAt(r)))cnt++;
          if(isvowel(s.charAt(l))) cnt--;
          max=Math.max(max,cnt);
          l++;
          r++;

        }
System.out.println(max);
  }
}
