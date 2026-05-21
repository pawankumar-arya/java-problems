public class Variable{
  public static void main(String[] args) {
    int a = 10;
    System.out.println("Value of a: " + a);
    
    a = 20; // Reassigning the value of a
    System.out.println("New value of a: " + a);
    
    final int b = 30; // Declaring a constant variable
    System.out.println("Value of b: " + b);
    
    // b = 40; // This will cause an error because b is final
  }
}