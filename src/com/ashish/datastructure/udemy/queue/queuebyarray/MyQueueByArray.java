package com.ashish.datastructure.udemy.queue.queuebyarray;

public class MyQueueByArray {
    int[] arr;
    int beginQIndex;
    int topQIndex;

    public MyQueueByArray(int size) {
        this.arr = new int[size];
        this.beginQIndex = -1;
        this.topQIndex = -1;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue Full For insertion : " + value);
        }
        else if (isEmpty()){
            beginQIndex=0;
            arr[topQIndex+1]=value;
            topQIndex++;
            System.out.println("Successfully inserted from Else if  "+value+" in the queue");
        }
        else{
            topQIndex++;
            arr[topQIndex]=value;
            System.out.println("Successfully inserted from Else block "+value+" in the queue");
        }
    }

    public void deQueue(){
        if (isEmpty()){
            System.out.println("Error : Queue empty...");
        } else {
            System.out.println("Dequeued value from queue : " + arr[beginQIndex]);
            beginQIndex++;
            if (beginQIndex>topQIndex) beginQIndex=topQIndex=-1;
        }
    }

    public boolean isFull(){
        return topQIndex == arr.length-1;
    }

    public boolean isEmpty(){
        if (beginQIndex==-1 || (beginQIndex==arr.length)){
            return true;
        } else return false;
    }

    void printQueue(){
        if (!isEmpty()){
            for (int i = beginQIndex;i<=topQIndex;i++){
                System.out.println(arr[i]);
            }
        }
    }
    protected void deletequeue(){
        arr = null;
        System.out.println("Queue deleted");
    }

}
