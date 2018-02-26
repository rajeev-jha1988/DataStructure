/**
 * 
 */
package com.raj.ds;

/**
 * @author rajeev.jha
 *
 */
public class ParanthesisChecker {
	
	public static void main(String[] args) {
		
		Stack<Character>  barches= new Stack<Character>();
		String expresion ="a{b(+c)}]";
		
		for (int i = 0; i <= expresion.length()-1; i++) {
			char ch =expresion.charAt(i);
			switch (ch){
			case '{':
			case '[':
			case '(': barches.push(ch); break;
			case ')':
			case ']':
			case '}': 
					if(!barches.isStackEmpty()){		
						char recent=barches.peek(); 
						if(recent=='(' && ch ==')' ){
							barches.pop();
						}else if(recent=='{' && ch =='}'){
							barches.pop();
						}else if(recent=='[' && ch ==']'){
							barches.pop();
						}else{
							System.out.println("Error closing not found"+ch);
						}
						break;
					}else{
						System.out.println("Error opeing not found"+ch);
						break;
					}
						
					
				
			}
		}
	}
	
	
}
