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
  
  /** The sentinel item (if it exists) is at sentinel.next
   * @point1 rename first to be sentinel
   * @point2 sentinel is never  null
   * @point3 sentinel node's item needs to be some integer, but doesn't matter what value we pick
   * @point4 Had to fix constructors and methods to be compatible with sentinel nodes
   */
  private IntNode sentinel;
  public int size;

  /** Creates a empty SLList */

  public SLList(){
    sentinel = new IntNode(12,null);
    size = 0;
  }

  public SLList(int x){
    sentinel = new IntNode(12,null);
    sentinel.next = new IntNode(x,null);
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
    sentinel.next = new IntNode(x,sentinel.next);
    size += 1;
  }

  /** Returns the sentinel item in the list */
  public int getFirst() {
    return sentinel.next.item;  
  }

  /** Adds an item to the end of the list */
  public void addLast(int x) {
    IntNode p = sentinel;
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
    return getSize(sentinel);
  }
}

/** 
 * Hide implementation details from users of your class.
 * - Less for user of class to understand
 * - Safe fo you to change private methods
*/
