/**
 * 
 */
package com.raj.ds.sorting;

/**
 * @author rajeev.jha
 *
 */
public class QuickSort {


	public static int split(int a[],int l,int u){
		int pivot=a[u];
		int i=l-1;
		for (int j = l; j < u; j++) {
			if(a[j]<=pivot){
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp =a[i+1];
		a[i+1]=a[u];
		a[u]=temp;
		return i+1;
	}

	public static void quicksort(int a[],int l,int u){
		if(l<u){
			int pivotindex= split(a,l,u);
			quicksort(a, 0, pivotindex-1);
			quicksort(a, pivotindex+1,u);
		}
	}


	public static void main(String[] args) {
		int a[]={8,3,2,9,6,4,5,1};
		quicksort(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
	}
}
