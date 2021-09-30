package cimpress;

import java.util.Stack;

public class BasicLinkedList<X> {

    private Node head;
    private Node last;
    private int size;

    public int size(){
        return size;
    }
    public void add(X item){
        if(head==null){
            head = new Node(item);
            last=head;
        }
        else {
            Node newNode = new Node(item);
            last.setNextNode(newNode);
            last = newNode;
        }
        size++;
    }

    public void traverseByN(int k){
        Stack<String> stack = new Stack<>();
        if(size() != 0){
                Node tempNode = head;
                for (int i = 0; i < size();i++){
                    //stack.push(tempNode.getNodeVale().toString());
                    tempNode = tempNode.getNextNode().getNextNode();
                    if(tempNode == null){
                        break;
                    } else {
                        stack.push(tempNode.getNodeVale().toString());
                    }
                }
            System.out.println("Executing in reverse");
                int k1 = stack.size();
                /*for(int i = 0;i<k1;i++){
                    System.out.print(stack.pop()+" ");
                }*/
                while (stack.size()!=0){
                    System.out.print(stack.pop()+" ");
                }
        } else {
            throw new RuntimeException("Empty List");
        }
    }

    public String toString(){

        StringBuffer contents = new StringBuffer();

        Node currentNode = head;

        while (currentNode != null){
            contents.append(currentNode.getNodeVale());
            currentNode = currentNode.getNextNode();
            if(currentNode!=null){
                contents.append(", ");
            }
        }
        return contents.toString();

    }


    private class Node {

        private Node nextNode;
        private X nodeVale;

        public Node(X nodeItemValue) {
            this.nextNode = null;
            this.nodeVale = nodeItemValue;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeVale() {
            return nodeVale;
        }

        public void setNodeVale(X nodeVale) {
            this.nodeVale = nodeVale;
        }
    }
}
