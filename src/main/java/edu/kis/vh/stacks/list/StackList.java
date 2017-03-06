package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_INDICATOR = -1;
	Node last;
	int i;

	private void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	private boolean empty() {
		return last == null;
	}

	private boolean full() {
		return false;
	}

	private int peek() {
		if (empty())
			return EMPTY_STACK_INDICATOR;
		return last.value;
	}

	private int pop() {
		if (empty())
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
