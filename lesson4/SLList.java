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
  public int size;
  public SLList(int x){
    first = new IntNode(x,null);
    size  = 1;
  }
  public static void main(String[] args) {
    SLList L = new SLList(15);
    L.addFirst(10);
    L.addFirst(5);
    L.addLast(12);
    System.out.println(L.size);
  }

  /** Adds an item to the front of the list */
  public void addFirst(int x){
    first = new IntNode(x,first);
    size += 1;
  }

  /** Returns the first item in the list */
  public int getFirst() {
    return first.item;  
  }

  /** Adds an item to the end of the list */
  public void addLast(int x) {
    IntNode p = first;
    /** Move last until ite reaches the end of the list */
    while (p.next != null) {
      p = p.next;
    }
    p.next = new IntNode(x,null);
    size += 1;
  }

  private static int getSize(IntNode p){
    if(p.next == null)return 1;
    return 1 + getSize(p.next);
  }

  public int size(){
    return getSize(first);
  }
}

/** 
 * Hide implementation details from users of your class.
 * - Less for user of class to understand
 * - Safe fo you to change private methods
*/
