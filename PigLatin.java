import java.util.*;
public class PigLatin{
  public static void main(String[] args) {
    // System.out.println(pigLatinSimple("mock"));
    // System.out.println(pigLatinSimple("pie"));
    // System.out.println(pigLatinSimple("david"));
    // System.out.println(pigLatinSimple("aaron"));
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
  }

  public static String pigLatinSimple(String s){
    boolean x = false;
    String vowels = "aeiou";
    String y = s.toLowerCase();
    for(int i = 0; i < vowels.length() && x == false; i++) {
      if(y.charAt(0) == vowels.charAt(i)) {
        x = true;
      }
    }
    if (x == true) {
      return (y + "hay");
    } else {
      String returnString = "";
      for (int i = 1; i < y.length(); i++) {
        returnString += s.charAt(i);
      }
      return (returnString + y.charAt(0) + "ay");
    }
  }

  public static String pigLatin(String s){
    boolean x = false;
    String[] digraph = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String y = s.toLowerCase();
    for(int i = 0; i < digraph.length && x == false; i++) {
      if (y.substring(0,2).equals(digraph[i])) {
        x = true;
      }
    }
    if (x == true) {
      String returnString = "";
      for (int i = 2; i < y.length(); i++) {
        returnString += y.charAt(i);
      }
      return (returnString + y.substring(0,2) + "ay");
    } else {
      return pigLatinSimple(y);
    }
  }
}
