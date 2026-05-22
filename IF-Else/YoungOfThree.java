public class YoungOfThree {
  public static void main(String[] args) {
    int age1 = 25; // You can change this value to test with different ages
    int age2 = 30;
    int age3 = 20;

    if (age1 < age2 && age1 < age3) {
      System.out.println("The youngest person is " + age1 + " years old.");
    } else if (age2 < age1 && age2 < age3) {
      System.out.println("The youngest person is " + age2 + " years old.");
    } else {
      System.out.println("The youngest person is " + age3 + " years old.");
    }
  }
}
