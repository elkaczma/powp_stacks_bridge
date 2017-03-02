package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

	public interface IStacksFactory {
	
		public Stack GetStandardStack();
		
		public Stack GetFalseStack();
		
		public StackFIFO GetFIFOStack();
		
		public StackHanoi GetHanoiStack();
		
	}
