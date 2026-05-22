public class calPercGrade {
  public static void main(String[] args) {
    double score = 85; // You can change this value to test with different scores

    if (score >= 90) {
      System.out.println("Grade: A");
    } else if (score >= 80) {
      System.out.println("Grade: B");
    } else if (score >= 70) {
      System.out.println("Grade: C");
    } else if (score >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }
  }
}
