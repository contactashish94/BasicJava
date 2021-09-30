package ds;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList(){
        first=null;
        last=null;
        nodeCount=0;
    }

    public int size(){
        return nodeCount;
    }

    public void add(X item){
        if(first==null){
            first = new Node(item);
            last=first;
        } else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    public void insert(X item, int position){
        Node newNode = new Node(item);
        if(size() < position){
            throw new IllegalStateException("Linked list smaller than inserted position");
        }

        Node currentNode = first;

        for(int i = 0; i < position && currentNode != null ; i++){
            currentNode = currentNode.getNextNode();
        }

        Node nextNode = currentNode.getNextNode();

        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    public X removeAt(int position){

        if(first==null){
            throw new IllegalStateException("Empty Linked List");
        }
        Node currentNode=first;
        Node prevNode=first;

        for(int i = 0 ; i < position && currentNode != null ; i++){
            prevNode = currentNode;
            currentNode=currentNode.getNextNode();
        }

        X nodeItem = currentNode.getNodeItemValue();
        prevNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return nodeItem;

    }

    public X get(int position){

        if(first==null){
            throw new IllegalStateException("Empty Linked List");
        }
        Node currentNode=first;

        for(int i = 0 ; i < size() && currentNode != null ; i++){
            if(i == position) {
                return currentNode.getNodeItemValue();
            }
            currentNode=currentNode.getNextNode();
        }

        throw new IllegalStateException("Node Not found");

    }

    public int find(X item){

        if(first==null){
            throw new IllegalStateException("Empty Linked List");
        }
        Node currentNode=first;

        for(int i = 0 ; i < size() && currentNode != null ; i++){
            if(item == currentNode.getNodeItemValue()) {
                return i;
            }
            currentNode=currentNode.getNextNode();
        }

        throw new IllegalStateException("Node Not found");

    }

    public String toString(){

        StringBuffer contents = new StringBuffer();

        Node currentNode = first;

        while (currentNode != null){
            contents.append(currentNode.getNodeItemValue());
            currentNode = currentNode.getNextNode();
            if(currentNode!=null){
                contents.append(", ");
            }
        }
        return contents.toString();

    }

    public X remove(){
        if(first==null){
            throw new IllegalStateException("Empty Linked List");
        }
        X realFirstNodeItem = first.getNodeItemValue();
        first = first.getNextNode();
        nodeCount--;
        return realFirstNodeItem;
    }


    private class Node {

        private Node nextNode;
        private X nodeItemValue;

        public Node(X nodeItemValue) {
            this.nextNode = null;
            this.nodeItemValue = nodeItemValue;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public void setNodeItemValue(X nodeItemValue) {
            this.nodeItemValue = nodeItemValue;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public X getNodeItemValue() {
            return nodeItemValue;
        }
    }
}
