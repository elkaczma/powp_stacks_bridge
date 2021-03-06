package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		
		testStacks(factory);
		testStacks(arrayStacksFactory);
		testStacks(listStacksFactory);
	}
	// zle sformatowane wiersze: 19, 20, 21, 26
	// alt + <- cofa kursor do ostatniego miejsca edycji
	// alt + -> ponawia miejsce kursora	

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(),
				factory.GetFIFOStack(), factory.GetHanoiStack()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);
			
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));
			
		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected());
	}
	
	// 3.1.17: Zasade izolacji lamia klasy fabryk - zwracane abstrakcje stosow sa uzaleznione od implementacji (StackArray lub StackList).
}