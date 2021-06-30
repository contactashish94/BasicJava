/*
package com.ashish.practiceinterview.linkedlist;

import com.ashish.datastructure.mylinkedlist.MySingleNode;

public class SumOf2LinkedList {
    public MySingleNode addTwoLL(MySingleNode l1, MySingleNode l2){
        MySingleNode dummyNode = new MySingleNode();
        MySingleNode tempNode = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry==1){
            int sum = 0;
            if(l1 != null){
                sum = sum + l1.getValue();
                l1 = l1.getNext();
            }
            if(l2 != null){
                sum = sum + l2.getValue();
                l2 = l2.getNext();
            }
            sum = sum + carry;
            carry = sum / 10;
            MySingleNode node = new MySingleNode(sum%10);
            tempNode.setNext(node);
            tempNode = tempNode.getNext();
        }
        return dummyNode.getNext();
    }
}
*/
