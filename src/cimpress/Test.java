package cimpress;

public class Test {
    public static void main(String[] args) {
        cimpress.BasicLinkedList<String> list = new cimpress.BasicLinkedList();
        //ds.BasicLinkedList<String> list = new ds.BasicLinkedList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list.toString());
        list.traverseByN(2);
    }
}
