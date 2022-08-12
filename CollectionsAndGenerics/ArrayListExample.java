package CollectionsAndGenerics;

import java.util.*;

class ArrayListExample {

  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Vivek");
    list.add("Abhishek");
    list.add("Rajeev");
    for (String s : list) {
      System.out.println(s);
    }
  }
}
