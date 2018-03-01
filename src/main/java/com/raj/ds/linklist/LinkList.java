/**
 * 
 */
package com.raj.ds.linklist;

/**
 * @author rajeev.jha
 *
 */
public class LinkList {

	/**
	 * @param args
	 */
	
	private Node head;
	
	public void add(String data){
		if(head==null){
			head = new Node(data);
		}else{
			Node ele = new Node(data);
			ele.next=head;
			head=ele;
		}
	}
	public void delete(String data){
		Node temp=head;
		while (temp!=null){
			if(temp.data == data){
				Node tempV=	temp.next;
			}
		}
		
	}
	
	public void print(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
private class Node{
	private Node next;
	private String data;
	public Node(String data) {
		this.data=data;
		this.next=null;
	}
	
}

public static void main(String[] args) {
	LinkList linkList = new LinkList();
	linkList.add("rajeev");
	linkList.add("sanjeev");
	linkList.add("aman");
	linkList.add("kamak");
	linkList.print();
	
}
	
	
	
}
