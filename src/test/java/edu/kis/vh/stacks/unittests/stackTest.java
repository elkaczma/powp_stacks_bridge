package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class StackTest {
	
	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
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
	public void testTop() {
		Stack stackObj = new Stack();
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
	public void testPop() {
		Stack stackObj = new Stack();
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
}
