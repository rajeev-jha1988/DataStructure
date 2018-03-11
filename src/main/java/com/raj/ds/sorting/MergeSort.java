/**
 * 
 */
package com.raj.ds.sorting;

import java.util.Arrays;


/**
 * @author rajeev
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	
	
	public static void merge(int a[],int la[],int ra[]) {
		int i=0,j=0,k=0;

		int nl=la.length;
		int nr=ra.length;
		while(i<nl && j < nr) {
			if(la[i] < ra[j]) {
				a[k]=la[i];
				i++;
			}else {
				a[k]=ra[j];
				j++;
			}
			k++;
		}
		while(i<nl) {
			a[k]=la[i];
			i++;
			k++;
		}
		while( j < nr) {
			a[k]=ra[j];
			j++;
			k++;
		}
		
		
		/*for (int p = 0; p < a.length; p++) {
			System.out.println(a[p]);
		}*/
	}
	
	public static void mergesort(int arr[]) {
		if(arr.length==1) 
			return ;
		
		int median = arr.length/2+arr.length%2;
		int left[]= new int[median];
		int right[]= new int[arr.length-median];
		
		split(arr, left, right);

		mergesort(left);
		mergesort(right);
		
		merge(arr, left, right);
		
		
	}
	
	public static void split(int a[],int left[],int right[]) {
		if(a.length==1)
			return;
		int median= left.length;
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(i<median) {
				left[i]=a[i];
			}else {
				right[j]=a[i];
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,7,2,6,9,3,8,1,10};
		mergesort(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
	}

}
