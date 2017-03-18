package edu.kis.vh.stacks;

/**
 * Klasa reprezentuje stos Hanoi, na ktorym nie jest mozliwe polozenie liczby wiekszej niz obecna na wierzchu stosu.
 * 
 * @author TworcaProgramu
 *
 */
public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(IStack iStack) {
		super(iStack);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return liczba odrzuconych elementow podczas prob dodania na stos
	 */
	public int reportRejected() {
		return totalRejected;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.Stack#push(int)
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
