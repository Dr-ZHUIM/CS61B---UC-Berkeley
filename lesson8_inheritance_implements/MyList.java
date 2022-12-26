package lesson8_inheritance_implements;

public interface MyList<T> {
    public void addLast(T x);
    // public void addFirst(T x);
    // public void insert(T x, int index);
    public T getLast();
    // public T getFirst();
    public T get(int index);
    public int size();
    // public T removeLast();
}
