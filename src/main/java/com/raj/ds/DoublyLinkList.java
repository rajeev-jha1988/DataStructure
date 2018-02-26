/**
 * 
 */
package com.raj.ds;

/**
 * @author rajeev.jha
 *
 */
public class DoublyLinkList<T> {
	
	
	static class Node<T>{
		private T data;
		private Node<T> next;
		private Node<T> prev;

		Node(T data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
		
	}
}
