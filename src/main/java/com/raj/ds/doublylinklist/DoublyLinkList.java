/**
 * 
 */
package com.raj.ds.doublylinklist;

/**
 * @author rajeev
 *
 */
public class DoublyLinkList {

	/**
	 * @param args
	 */
	Node head;
	Node tail;
	
	
	public void addNode(String data) {
		
		if(head==null) {
			head= new Node(data);
			head.next=tail;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp= temp.next;
			}
			Node link = new Node(data);
			temp.next=link;
			link.prev=temp;
			tail=link;
		}
		
	}
	
	public void remove() {
		
	}
	public void search() {
		
	}
	
	public void insertBefore() {
		
	}
	
	public void reverse() {
		
	}
	
	public void print() {
		
		Node temp =head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	static class Node{
		Node next;
		Node prev;
		String data;
		
		public Node(String data) {
			this.next=null;
			this.prev=null;
			this.data=data;
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkList doublyLinkList = new DoublyLinkList();
		doublyLinkList.addNode("rajeev");
		doublyLinkList.addNode("vishal");
		doublyLinkList.addNode("Sanjeev");
		doublyLinkList.addNode("Kamreon");
		doublyLinkList.print();

	}

}
