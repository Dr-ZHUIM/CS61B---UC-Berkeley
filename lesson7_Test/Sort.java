package lesson7_Test;

public class Sort {
  /**
   * - find the smallest item
   * - move it to the first
   * - selection sort the rest
   */
  public static void SelectionSort(String[] array) {

  }

  // step I find the smallest item
  public static int findSmallestElementIndex(String[] input, int startIndex) {
    int smallElementIndex = startIndex;
    for (int i = startIndex; i < input.length; i++) {
      if (input[i].compareTo(input[smallElementIndex]) < 0) {
        smallElementIndex = i;
      }
    }
    return smallElementIndex;
  }

  // step II move it to the first
  public static void swap(String[] input, int index1, int index2) {
    String cache = input[index1];
    input[index1] = input[index2];
    input[index2] = cache;
  }

  public static void sort(String[] input) {
    sort(input, 0);
  }

  private static void sort(String[] input, int index) {
    if (index == input.length) {
      return;
    }
    int smallElementIndex = findSmallestElementIndex(input,index);
    swap(input, index, smallElementIndex);
    sort(input, index + 1);
  }
}
