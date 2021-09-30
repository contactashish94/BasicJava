package ds;

public class BasicQueue<X> {
    private X[] data;
    private int front;
    private int end;

    public BasicQueue(){
        this(1000);
    }
    public BasicQueue(int size){
        this.front = -1;
        this.end = -1;
        data = (X[]) new Object[size];
    }
    public int size(){
        return (front == -1 & end == -1 ) ? 0 : end-front + 1;
    }
    public void enQueue(X newItem){
        if(end == data.length-1){
            throw new IllegalStateException("This queue is full");
        }else if(size()==0){
            end++;
            front++;
            data[end]=newItem;
        } else {
            end++;
            data[end]=newItem;
        }

    }
    public X deQueue(){
        X item = null;
        if(size()<=0){
            throw new IllegalStateException("There is no entry in the queue");
        } else if(end == front){
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(X item){
        for(int i = front; i < end ; i++){
            if(item.equals(data[i])){
                    return true;
            }
        }
        return false;
    }
    public X access(X item){
        for(int i = 0; i < data.length ; i++){
            if(item.equals(data[i])){
                return item;
            }
        }
        throw new IllegalStateException("Item Not Found");
    }
    public X accessItemAt(int position){
        if(size()<=0 || position >= size() || position < 0){
            return null;
        }
        return data[position];
    }
}