package hashing;
import java.util.*;
public class store_check {
  public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(10);
    System.out.println(set.size());
    System.out.println(set.contains(10));
    System.out.println(set.contains(50));

  }
}
