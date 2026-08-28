package hashing;

import java.util.HashSet;

public class union_intersection {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4};
    int[] b = {3, 4, 5};
    HashSet<Integer> set1=new HashSet<>();
    for(int x:a){
      set1.add(x);
    }
    HashSet<Integer> inter=new HashSet<>();
    for(int y:b){
      if(set1.contains(y)) inter.add(y);
    }
    for(int z:b) set1.add(z);
    System.out.println("union: "+set1);
    System.out.println("Intersection: "+inter);

  }
}
