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
			Node temp =head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			Node ele = new Node(data);
			temp.next=ele;
		}
	}
	
	public void insertBefore(int position,Node node) {
		Node current=head;
		Node privious=null;
		int poss=0;
		while(current!=null) {
			if(poss==position) {
				break;
			}
			poss++;
			privious=current;
			current = current.next;
		}

		if(position==0) {
			node.next=current;
			head=node;
		}else {
			node.next=current;
			privious.next=node;
		}

	}
	
	
	public Node reverse(Node head1) {
		if(head1==null) {
			return null;
		}
		Node p=head1;
		Node q=p.next;
		
		if(q==null)
		return null;
		
		q=reverse(q);
		
		p.next.next=p;
		p.next=null;
		
		return q;
	}
	
	public void delete(String data){
		Node temp=head;
		Node actual =null;
		while (temp!=null){
			if(temp.data == data){
				break;
			}
		}
		Node next= temp.next;
		
	}
	
	public void print(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
static class Node{
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
	
	System.out.println("insert before");
	System.out.println();
	
	linkList.insertBefore(0, new Node("Chandan"));
	
	linkList.print();
	
	System.out.println("reverse");
	System.out.println();
	linkList.reverse(linkList.head);
	
	linkList.print();
	
}
	
	
	
}
