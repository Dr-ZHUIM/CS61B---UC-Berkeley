package lesson7_Test;

public class TestSort {

  /** This will test the Sort.sort() method */
  public static void testSort(){
    String[] input = new String[]{"You", "had", "breakfast", "didn't", "you"};
    // String[] expected = new String[]{"You", "had", "breakfast", "didn't", "you"};
    String[] expected = new String[]{"didn't", "you", "You", "had", "breakfast"};

    Sort.sort(input);

    for(int i = 0; i < expected.length; i++){
      if(!expected[i].equals(input[i])){
        System.out.println("Error! Mismatch in position " + i + ", expected: " + expected[i] + ", but found: " + input[i] );
    }}
  }
  public static void main(String[] args) {
    TestSort.testSort();
  }
}
