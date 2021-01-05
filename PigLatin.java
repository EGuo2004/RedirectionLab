import java.util.*;
public class PigLatin{
  public static void main(String[] args) {
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
  }

  public static String pigLatinSimple(String s){
    boolean x = false;
    String vowels = "aeiou";
    for(int i = 0; i < vowels.length() && x == false; i++) {
      if(s.charAt(0) == vowels.charAt(i)) {
        x = true;
      }
    }
    if (x == true) {
      return (s + "hay");
    } else {
      String returnString = "";
      for (int i = 1; i < s.length(); i++) {
        returnString += s.charAt(i);
      }
      return (returnString + s.charAt(0) + "ay").toLowerCase();
    }

  }
}
