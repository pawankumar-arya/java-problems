// package for-loop;

public class SumOfDigit {
  public static void main(String[] args) {
    int n = 12345; // Number whose digits need to be summed
    int sum = 0;

    while (n != 0) {
      sum += n % 10; // Add the last digit to the sum
      n /= 10; // Remove the last digit
    }

    System.out.println("Sum of digits: " + sum);
  }
}
