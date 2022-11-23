package lesson3;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    // lesson3 challenge:
    // write a method get(int i) that returns the ith item in the list

    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        return rest.get(i - 1);
    }

    public int iterativeGet(int i) {
        IntList p = this;
        int index = 0;
        while (index != i) {
            index++;
            p = p.rest;
        }
        return p.first;
    }

    // lesson3 challenge:
    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change.
     * 
     * 15,10,5
     * 17 => 12 => 7
     * 
     * 
     */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        L = new IntList(L.first, L.rest);
        L.first += x;
        if (L.rest != null) {
            L.rest = incrList(L.rest, x);
        }
        return L;
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword.
     */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        L.first += x;
        if (L.rest != null) {
            L.rest = incrList(L.rest, x);
        }
        return L;
    }

    public int size() {
        if (this.rest != null) {
            return 1 + this.rest.size();
        }
        return 1;
    }

    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize++;
            p = this.rest;
        }
        return totalSize;
    }

    public static void main(String[] args) {
        IntList l = new IntList(5, null);
        l = new IntList(10, l);
        l = new IntList(15, l);
        System.out.println(dincrList(l, 2).first);
        System.out.println(incrList(l, 2).rest.first);
        System.out.println(incrList(l, 2).rest.rest.first);
    }
}
