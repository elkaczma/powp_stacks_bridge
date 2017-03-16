package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {

	private static final int EMPTY_STACK_INDICATOR = -1;
	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}

class Node {

	protected final int value;
	protected Node prev, next;

	public Node(int i) {
		value = i;
	}
	
}
