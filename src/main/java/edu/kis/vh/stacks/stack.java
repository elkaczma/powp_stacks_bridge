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
	
	private IStack iStack;

	public Stack(IStack iStack) {
		this.iStack = iStack;
	}
	
	public Stack() {
		this.iStack = new StackList();
	}

	public void push(int i) {
		iStack.push(i);
	}

	public boolean isEmpty() {
		return iStack.isEmpty();
	}

	public boolean isFull() {
		return iStack.isFull();
	}

	public int top() {
		return iStack.top();
	}

	public int pop() {
		return iStack.pop();
	}
	
	// F3 otwiera implementacje wywolywanej metody w StackArray.java
	
	// Zmiana z podpunktu 3.1.6 zmienia implementacje metod klasy Stack na rzecz wywolan metod klas implementujacych interfejs IStack
}
