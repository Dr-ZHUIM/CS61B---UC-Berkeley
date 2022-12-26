package lesson4;

import lesson8_inheritance_implements.MyList;

public class SLList<T> implements MyList<T> {

  /** The sentinel item (if it exists) is at sentinel.next
   * @point1 rename first to be sentinel
   * @point2 sentinel is never  null
   * @point3 sentinel node's item needs to be some integer, but doesn't matter what value we pick
   * @point4 Had to fix constructors and methods to be compatible with sentinel nodes
   */
  private TNode<T> sentinel;
  private TNode<T> lastNode;
  public int size;

  private static class TNode<T> {
    public T item;
    public TNode<T> next;
    public TNode(T i, TNode<T> n){
      item = i;
      next = n;
    }
  }
  
  /** Creates a empty SLList */

  public SLList(){
    sentinel = new TNode<T>(null,null);
    lastNode = null;
    size = 0;
  }

  public SLList(T x){
    sentinel = new TNode<T>(null,null);
    sentinel.next = new TNode<T>(x,null);
    lastNode = sentinel.next;
    size  = 1;
  }

  /** Adds an item to the front of the list */
  public void addFirst(T x){
    sentinel.next = new TNode<T>(x,sentinel.next);
    size += 1;
  }

  /** Returns the sentinel item in the list */
  public T getFirst() {
    return sentinel.next.item;  
  }

  /** Adds an item to the end of the list */
  public void addLast(T x) {
    TNode<T> p = sentinel;
    /** Move last until ite reaches the end of the list */
    while (p.next != null) {
      p = p.next;
    }
    p.next = new TNode<T>(x,null);
    size += 1;
  }

  public T getLast() {
    return lastNode.item;
  }

  public T get(int index){
    TNode<T> IndexNode = sentinel;
    if(index == 0)return IndexNode.next.item;
    for(int i = 0 ; i < index + 1; i++) {
      IndexNode = IndexNode.next;
    };
    return IndexNode.item;
  }

  private int getSize(TNode<T> p){
    if(p.next == null)return 0;
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
