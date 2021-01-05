import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()) {
      System.out.println();
      Scanner x = new Scanner(n.nextLine());
      while (x.hasNext()) {
        String y = x.next();
        String z = "";
        for(int i = 0; i < y.length(); i++) {
          z += "*";
        }
        System.out.print(z + " ");
      }
    }
  }
}
