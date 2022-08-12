package CollectionsAndGenerics;

import java.util.*;

public class SetExample {

  public static void main(String args[]) {
    HashSet<String> set = new HashSet<String>();
    set.add("Vivek");
    set.add("Abhishek");
    set.add("Rajeev");
    set.add("Harsh");
    set.add("Abhishek");
    for (String s : set) {
      System.out.println(s);
    }
  }
}
