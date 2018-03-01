/**
 * 
 */
package com.raj.ds.queue;

/**
 * @author rajeev.jha
 *
 */
public class CustomQueue {

	private int a[];
	private int max_size;
	private int front,rear;
	private int noOfItem;
	
	public CustomQueue(int maxSize) {
		this.a = new int[maxSize];
		this.front=0;
		this.rear=-1;
		this.max_size=maxSize;
	}
	
	public void insert(int data){
		if(rear > max_size){
		System.out.println("max element exceed");
		}else{
			rear++;
			a[rear]=data;
			noOfItem++;
		}
	}
	
	public int remove(){
		int ele=-1;
		if(rear ==-1){
			System.out.println("no element");
		}else{
			ele= a[front];
			front++;
		}
		return ele;
	}
	public void print(){
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		CustomQueue customQueue = new CustomQueue(5);
		customQueue.insert(10);
		customQueue.insert(12);
		customQueue.insert(14);
		customQueue.insert(15);
		customQueue.insert(16);
		System.out.println(customQueue.remove());
		System.out.println(customQueue.remove());
		customQueue.print();
		
	}
	
	
}
