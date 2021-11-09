class Ensyuu_15_06 {

  public static void main(String[] args) {
    double r = 0.0;
    int i = 0;  
    r += Double.parseDouble(args[i]);

    final double PI = 3.1416;

    System.out.println("半径は、" + r + "です。");
    System.out.println("円周は、" + 2 * PI * r +  "です。");
    System.out.println("面積は、" + PI * r * r +  "です。");
  }
}