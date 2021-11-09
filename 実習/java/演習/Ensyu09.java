public class Ensyu09 {
  public static void main(String[] args) {
    int rad = 3;
    Circle cir = new Circle();
    System.out.println("radius = " + rad);
    System.out.println("circumference =" + cir.circfer(rad));
    System.out.println("area = " + cir.area(rad));
  }
}

class Circle{
  final double PI = 3.1415;
  public double circfer(int rad) {
    return PI * rad * 2;
  }

  public double area(int rad) {
    return PI * Math.pow(rad, 2);
  }
}