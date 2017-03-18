package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.impl.StackList;

public class ListStacksFactory implements IStacksFactory {

	@Override
	public Stack GetStandardStack() {
		return new Stack(new StackList());
	}

	@Override
	public Stack GetFalseStack() {
		return new Stack(new StackList());
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO(new StackList());
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(new StackList());
	}

}
