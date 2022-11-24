package lesson4;

public class SLList {

  private static class IntNode {
    public int item;
    public IntNode next;
    public IntNode(int i, IntNode n){
      item = i;
      next = n;
    }
  }
  
  private IntNode first;
  public SLList(int x){
    first = new IntNode(x,null);
  }
  public static void main(String[] args) {
    SLList L = new SLList(15);
    L.addFirst(10);
    L.addFirst(5);
    System.out.println(L.getFirst());
  }

  /** Adds x to the front of the list */
  public void addFirst(int x){
    first = new IntNode(x,first);
  }

  /** Returns the first item in the list */
  public int getFirst() {
    return first.item;  
  }
}

/** 
 * Hide implementation details from users of your class.
 * - Less for user of class to understand
 * - Safe fo you to change private methods
*/
