/**
 * 
 */
package com.raj.ds;

/**
 * @author rajeev
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int a[] = {8,3,4,2,11,9,6,1,5,13};
		 
		 for (int i = 1; i < a.length-1; i++) {
			int curentValue=a[i];
			int postion =i;
			while(postion >0 && a[postion-1] > curentValue){
				a[postion]=a[postion-1];
				postion=postion-1;
			}
			a[postion]=curentValue;
			System.out.println();
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k] +" ");
			}
		}
		

	}

}
