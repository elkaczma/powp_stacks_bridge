package edu.kis.vh.stacks;

public interface IStack {
	
	public static final int EMPTY_STACK_INDICATOR = 0;
	
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
	
	// 3.1.11: Realizacja zadania 3.1.10 pomogla, poniewaz w celu okreslonych zmian wystarczyla zmiana wartosci jednej stalej w intefejsie.

}