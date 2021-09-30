package ds;

import ds.test.Stack;

import java.util.ArrayList;

public class BasicStack<X> implements Stack<X> {
    private ArrayList<X> data;
    private int stackPointer;

    public BasicStack() {
         data = new ArrayList<>();
    }


        public void push(X newItem) {
            data.add(newItem);
        }


    public X pop(){
        if(data.size() <= 0){
            throw new IllegalStateException("No more elements Stored in Stack");
        }
       return data.remove(size()-1);
        //return data.get(size()-1);
    }

    public boolean contains(X item){
        for(int i = 0; i < data.size(); i++){
            if(item == data.get(i)){
                return true;
            }
        }
        return false;
    }
    public boolean containsAnotherWay(X item){
        boolean isFound=false;
        for(int i = 0; i< data.size(); i++){
            if(data.get(i).equals(item)){
                isFound=true;
                break;
            }
        }
        return isFound;
    }
    public X access(X item){
        X temp = null;
        for(int i = 0; i< data.size(); i++){
            if(data.get(i).equals(item)){
                temp = data.get(i);
            }
        }
        return temp;
    }
    public X access2(X item){
        while(data.size() > 0){
            X temp = pop();
            if(temp.equals(item)){
                return temp;
            }
        }
        return null;
    }

    public int size(){
        return data.size();
    }
}
