package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

public class StackTest {
	
	@Test
	public void testStackArrayPush() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.GetStandardStack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackArrayIsEmpty() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.GetStandardStack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testStackArrayIsFull() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.GetStandardStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
		// zmiany w tescie: test sprawdza dzialanie metody isFull() dla stosu implementujacego StackArray
	}

	@Test
	public void testStackArrayTop() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.GetStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackArrayPop() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.GetStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testFIFOPop() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack stackObj = factory.GetFIFOStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testHanoiPush() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack stackObj = factory.GetHanoiStack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testReportRejected() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack stackObj = factory.GetHanoiStack();
		final int REPORTED_REJECTED = 1;
		
		int testValue1 = 4;
		stackObj.push(testValue1);
		int testValue2 = 5;
		stackObj.push(testValue2);
		
		int result = ((StackHanoi)stackObj).reportRejected();
		Assert.assertEquals(REPORTED_REJECTED, result);
	}
	
	// 3.2.1: Niektore testy konczyly sie porazka. W celu poprawy przywrocono wartosc
	// EMPTY_STACK_INDICATOR na -1 w interfejsie IStack (zmiana na 0 wynikala z podpunktu 11)
	
	@Test
	public void testStackListPush() {
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		Stack stackObj = listStacksFactory.GetStandardStack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackListIsEmpty() {
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		Stack stackObj = listStacksFactory.GetStandardStack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testStackListIsFull() {
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		Stack stackObj = listStacksFactory.GetStandardStack();
		final int TEST_STACKLIST_SIZE = 100;
		
		boolean result = stackObj.isFull();		
		Assert.assertEquals(false, result);
		
		for (int i = 0; i < TEST_STACKLIST_SIZE; i++) {
			stackObj.push(888);
		}
		
		result = stackObj.isFull();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testStackListTop() {
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		Stack stackObj = listStacksFactory.GetStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackListPop() {
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		Stack stackObj = listStacksFactory.GetStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	// 3.2.2: Zmieniono nazwy kilku dotychczasowych testow na zwiazane z implementacja stosu w postaci StackArray
	// Dodano testy zwiazane z implementacja stosu w postaci StackList
}
