/**
 * 
 */
package com.raj.ds;

import java.util.ArrayList;

/**
 * @author rajeev
 *
 */
public class Stack<T> {
	private int maxSize;
	private int top ;
	private ArrayList<T> arr;

	public Stack() {
		this.top=-1;
		this.arr = new ArrayList<T>();
	}

	public void push(T ele)  {
		top++;
		arr.add(top, ele);
	}

	public T pop() {
		T data =arr.get(top);
		arr.remove(top);
		top--;
		return data;
	}
	
	public T peek(){
		System.out.println(top);
		return top==-1?(T)null:arr.get(top);
	}
	public boolean isStackFull() {
		return top ==maxSize-1; 
	}
	public boolean isStackEmpty() {
		return top ==-1; 
	}

}
