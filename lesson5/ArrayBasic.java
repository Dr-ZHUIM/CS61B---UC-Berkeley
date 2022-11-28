public class ArrayBasic {

  private static class TestClass {
    int _a;
    int _b;
    public TestClass(int a, int b) {
      _a = a;
      _b = b;
    }
  }

  public static void main(String[] args) {
    String fieldOfInterest =  "_a";
    TestClass test = new TestClass(2,3);
    double testvalue = test._a;
    System.out.println(testvalue);
    int[] z = null;
    int[] x, y;
    x = new int[] { 1, 2, 3, 4, 5 };
    y = x;
    x = new int[] { -1, 2, 5, 4, 99 };
    y = new int[3];
    z = new int[0];
    int xL = x.length;

    String[] s = new String[6];
    s[4] = "ketchup";
    s[x[3] - x[1]] = "muffins";

    int[] b = { 9, 10, 11 };
    System.arraycopy(b, 0, x, 3, 2);
  }
}

/**
 * Arrays vs Classes
 * Arrays and Classes can both be used to organize a bunch of memory boxes.
 * Arrays boxes are accessed using [] notation.
 * Class boxes are accessed using dot notation.
 * Array boxes must all be of the same type.
 * Class boxes can be of different types.
 * Both have a fixed number of boxes.
 */
