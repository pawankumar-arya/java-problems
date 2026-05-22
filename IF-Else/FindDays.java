public class FindDays {
  public static void main(String[] args) {
    int month = 2; // You can change this value to test with different months
    int year = 2024; // You can change this value to test with different years

    int days;

    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        days = 31;
        break;
      case 4: case 6: case 9: case 11:
        days = 30;
        break;
      case 2:
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          days = 29; // Leap year
        } else {
          days = 28; // Non-leap year
        }
        break;
      default:
        System.out.println("Invalid month. Please enter a value between 1 and 12.");
        return;
    }

    System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);
  }
}
