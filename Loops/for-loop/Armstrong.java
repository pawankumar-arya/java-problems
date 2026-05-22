// package for-loop;

public class Armstrong {
  public static void main(String[] args) {
    int n = 153; // Number to check for Armstrong
    int originalNumber = n;
    int sum = 0;

    while (n != 0) {
      int digit = n % 10;
      sum += Math.pow(digit, 3);
      n /= 10;
    }

    if (sum == originalNumber) {
      System.out.println(originalNumber + " is an Armstrong number.");
    } else {
      System.out.println(originalNumber + " is not an Armstrong number.");
    }
  }
}
