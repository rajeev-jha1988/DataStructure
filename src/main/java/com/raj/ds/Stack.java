/**
 * 
 */
package com.raj.ds;

/**
 * @author rajeev
 *
 */
public class Stack {
	private int maxSize;
	private int top ;
	private int[] arr;
	
	public Stack(int size) {
		this.maxSize=size;
		this.top=-1;
		this.arr = new int[size];
	}
	
	public void push(int ele) throws Exception {
		if(isStackFull()) {
			throw new Exception("Stack is full maxSize:"+maxSize );
		}
		top++;
		arr[top]=ele;
		
	}
	
	public long pop() {
		return -1;
	}
	public boolean isStackFull() {
		return top ==maxSize-1; 
	}

}
