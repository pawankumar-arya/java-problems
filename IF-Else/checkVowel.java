public class checkVowel {
  public static void main(String[] args) {
    char letter = 'A'; // You can change this value to test with different characters

    if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
        letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
      System.out.println(letter + " is a vowel.");
    } else {
      System.out.println(letter + " is not a vowel.");
    }
  }
}
