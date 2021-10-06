package com.bridgelabz.stackandqueue;

public class MyStack {

	private final MyLinkedList MyLinkedList;

	public MyStack() {
		this.MyLinkedList = new MyLinkedList();
	}

	public void push(INode Node) {
		MyLinkedList.add(Node);
	}

	public void printStack() {
		MyLinkedList.printMyNodes();
	}

	public INode peak() {
		return MyLinkedList.head;
	}

	public INode pop() {
		return MyLinkedList.pop();
	}

}
