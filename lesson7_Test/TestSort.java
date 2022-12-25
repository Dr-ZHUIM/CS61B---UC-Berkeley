package lesson7_Test;

public class TestSort {
  /** This will test the Sort.sort() method */
  public static void testSort() {
    String[] input = new String[] { "i", "have", "an", "egg" };
    String[] expected = new String[] { "an", "egg", "have", "i"};
    Sort.sort(input);
    org.junit.Assert.assertArrayEquals(expected, input);
  }

  /** test the Sort.findeSmallestElement method. */
  public static void testFindSmallestElement() {
    String[] input = { "i", "have", "an", "egg" };
    int expected = 2;
    String[] input2 = {"there","are","many","pigs"};
    int expected2 = 1;
    int actual = Sort.findSmallestElementIndex(input,0);
    org.junit.Assert.assertEquals(expected, actual);
    int actual2 = Sort.findSmallestElementIndex(input2,0);
    org.junit.Assert.assertEquals(expected2, actual2);
  }

  public static void testSwap(){
    String[] input = { "i", "have", "an", "egg" };
    int a = 0;
    int b = 2;
    String expectedA = "an";
    String expectedB = "i";
    Sort.swap(input, a, b);
    org.junit.Assert.assertEquals(expectedA, input[a]);
    org.junit.Assert.assertEquals(expectedB, input[b]);
  }

  public static void main(String[] args) {
    testSwap();
    testSort();
    testFindSmallestElement();
  }
}
