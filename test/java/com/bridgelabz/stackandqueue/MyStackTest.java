package com.bridgelabz.stackandqueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class MyStackTest {

	@Test
	public void given3NumberWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack() ;
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peak();
		myStack.printStack();
		assertEquals(myThirdNode, myNode);
	}
	
	@Test
	public void  given3NumbersWhenInStackWhenPopedShouldMatchWithLastAddedNode() {
		MyStack myStack = new MyStack() ;
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode popedNode = myStack.pop();
		myStack.printStack();
		assertEquals(myThirdNode, popedNode);

		

	}
}
