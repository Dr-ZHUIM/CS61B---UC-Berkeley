package lesson3;

public class parameter {
  public static double average(double x, double y){
    return (x + y)/2;
  }
  public static void main(String[] args) {
    double x = 5.5;
    double y = 10;
    double avg = average(x, y);
    System.out.println(avg);
  }
}

/**
 * The Gloden Rule of Equals in function parameters
 * Passing parameters obeys the same rule: Simply copy the bits to the new scope
*/