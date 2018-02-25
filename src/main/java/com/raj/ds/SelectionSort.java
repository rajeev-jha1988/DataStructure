package com.raj.ds;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class SelectionSort 
{
    public static void main( String[] args )
    {
        
        int a[] = {8,3,4,2,11,9,6,1,5,13};
        int min=-1;
        for (int i = 0; i < a.length-1; i++) {
        	min=i;
        	
        	for (int j = i+1; j < a.length; j++) {
        		if(a[j]<a[min]) 
        			min=j;
			}
        	
        	int temp =a[i];
			a[i]=a[min];
			a[min]=temp;
		}
        for (int k = 0;k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
        
    }
   
}
