package com.ashish.datastructure.udemy.queue.queuebylinkedlist;

import com.ashish.datastructure.practice.linkedlist.MyLL;

public class QueueByLinkedList {

	MyLL list;
	
	
	//constructor
	public QueueByLinkedList() {
		list = new MyLL();
	}//end of method

	
	public void enQueue(int value) {
		if (list.getHead() == null) {
			list.createLL(value);
		} else {
			// push a value on last of queue, update list tail too
			list.insertInToLL(value, list.getSize());
		}
	}//end of method

	
	public int deQueue() {
		int value = -1;
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!");
		} else {
			value = list.getHead().getValue();
//		------------>     list.deleteList(0);
		}
		return value;
	}//end of method
	
	
	public int peek() {
		if (!isQueueEmpty())
			return list.getHead().getValue();
		else {
			System.out.println("The queue is empty!!");
			return -1;
		}
	}//end of method

	
	public boolean isQueueEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}//end of method
	
	
	public void deleteStack() {
		list.setHead(null);
	}//end of method

}//end of class
