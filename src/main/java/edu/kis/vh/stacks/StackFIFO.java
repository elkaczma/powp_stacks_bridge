package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private Stack temp = new Stack();
	// po enkapsulacji nastapila zmiana modyfikatora i dodanie gettera/settera	
	
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
