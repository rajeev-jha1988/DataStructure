/**
 * 
 */
package com.raj.ds.sorting;

import java.util.Arrays;

import com.sun.javafx.collections.SortableList;

/**
 * @author rajeev
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	
	
	public static void mergesort(int a[],int la[],int ra[]) {
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
	
	
	static void  sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            mergesort(arr, l, m, r);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,7,2,6,9,3,8,1,10};
		int median=a.length/2;
		int l[]=Arrays.copyOfRange(a, 0, median+1);
		int r[]=Arrays.copyOfRange(a, median+1, a.length);
		
		mergesort(a, l, r);
		sort(a,0,a.length);
		
		
	}

}
