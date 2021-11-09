public class Ensyu06 {
  public static void main(String[] args) {
    Func func = new Func();
    int total = 0;
    func.x = 100;
    func.y = 200;
    total = func.sum();
    System.out.println("Sum from " + func.x + " to " + func.y + " = " + total);
  }
}

class Func{
  int x = 0;
  int y = 0; 

  public int sum(){
    int total = 0;
    for(int i = x; i <= y; i++){
      total += i;
    }
    return total;
  }
}