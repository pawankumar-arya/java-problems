// package for-loop;

public class multiTable {
  public static void main(String[] args) {
    int n = 5; // Size of the multiplication table

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}
