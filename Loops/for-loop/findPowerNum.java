// package for-loop;

public class findPowerNum {
  public static void main(String[] args) {
    int base = 2; // Base number
    int exponent = 3; // Exponent
    long result = 1;

    for (int i = 1; i <= exponent; i++) {
      result *= base;
    }

    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
  }
}
