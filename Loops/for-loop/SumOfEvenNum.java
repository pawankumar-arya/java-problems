// package for-loop;

public class SumOfEvenNum {
  public static void main(String[] args) {
    int n = 100; // Number of even numbers to sum
    int sum = 0;

    for (int i = 2; i <= n; i += 2) {
      sum += i;
    }

    System.out.println("Sum of even numbers: " + sum);
  }
}
