package array;

import java.util.HashMap;

public class FindFirstRepeatedWord {
  public static void main(String[] args) {
    String firstRepeatWordFound = findFirstRepeated();
    System.out.println(firstRepeatWordFound);
  }

  private static String findFirstRepeated() {
    HashMap<Integer, String> store = new HashMap<Integer, String>();
    String s = "Supriya had been saying that she had been there";

    String[] splitString = s.split(" ");

    for (int i = 0; i < splitString.length; i++) {
      String delta = splitString[i];
      if(store.containsValue(delta))
      {
         store.put(i,splitString[i]);
         return delta;
      }
      store.put(i,splitString[i]);
    }
    return "nothing";
  }
}

