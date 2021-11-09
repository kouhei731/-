import java.util.Scanner;

class ReverseArray4 {

  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void reverse(int[] a) {
    try {
      for (int i = 0; i < a.length / 2; i++)
        swap(a, i, a.length - i);
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new RuntimeException("reverseのバグ？", e);
    }
  }

  try {
    reverse(x);

    System.out.println("要素の並びを反転しました。");
    for (int i =0; i < num; i++) {
      System.out.println("x[" + i + "] = " + x[1]);
    } catch (RuntimeException e) {
      System.out.println("例外      :" + e);
      System.out.println("例外の原因 :" + e.getCause());
    }
  }
}
