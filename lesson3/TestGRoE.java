package lesson3;

public class TestGRoE {
  public static void doStuff(Walrus walrus, int x){
    walrus._weight -= 100;
    x -=5;
  }
  public static void main(String[] args) {
    Walrus walrus = new Walrus(2000);
    int x = 22;
    doStuff(walrus, x);
    //1900
    System.out.println(walrus._weight);
    //22
    System.out.println(x);
  }
}
