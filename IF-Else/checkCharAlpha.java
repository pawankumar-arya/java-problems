public class checkCharAlpha{
  public static void main(String[] args) {
    char ch = 'A'; // You can change this value to test with different characters

    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      System.out.println(ch + " is an alphabetic character.");
    } else {
      System.out.println(ch + " is not an alphabetic character.");
    }
  }

}