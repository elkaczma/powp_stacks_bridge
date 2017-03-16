package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {
	
//	private StackArray stackArray;
//	
//	public Stack(StackArray stackArray) {
//		this.stackArray = stackArray;
//	}
//	
//	public Stack() {
//		this.stackArray = new StackArray();
//	}
//
//	public int getTotal() {
//		return stackArray.getTotal();
//	}
//
//	public void push(int i) {
//		stackArray.push(i);
//	}
//
//	public boolean isEmpty() {
//		return stackArray.isEmpty();
//	}
//
//	public boolean isFull() {
//		return stackArray.isFull();
//	}
//
//	public int top() {
//		return stackArray.top();
//	}
//
//	public int pop() {
//		return stackArray.pop();
//	}
	
	private StackList stackList;

	public Stack(StackList stackList) {
		this.stackList = stackList;
	}
	
	public Stack() {
		this.stackList = new StackList();
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}
	
	// F3 otwiera implementacje wywolywanej metody w StackArray.java
}
