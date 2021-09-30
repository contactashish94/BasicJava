package ds.test;

public interface Stack<Y> {
    public void push(Y newItem);
    public Y pop();
    public int size();
    public boolean contains(Y newItem);
    public Y access(Y newItem);

}
