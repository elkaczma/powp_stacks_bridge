package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackList;

public class StackFIFO extends Stack {

	private Stack temp = new Stack(new StackList());
	// po enkapsulacji nastapila zmiana modyfikatora i dodanie gettera/settera
	// 3.1.14: Lepszym wyborem bedzie StackList ze wzgledu na wieksza wydajnosc i brak ograniczen liczby elementow.
	
	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(IStack iStack) {
		super(iStack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		int ret = temp.pop();
		while (!temp.isEmpty())
			push(temp.pop());
		return ret;
	}

	public Stack getTemp() {
		return temp;
	}

}
