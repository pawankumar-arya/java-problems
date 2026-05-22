public class checkTriangle {
  public static void main(String[] args) {
    int side1 = 3; 
    int side2 = 4;
    int side3 = 5;

    if(side1==side2 && side2==side3){
      System.out.println("Equilateral triangle");
    }else if(side1==side2 || side2==side3 || side1==side3){
      System.out.println("Isosceles triangle");
    }else{
      System.out.println("Scalene triangle");
    }
  }
}
