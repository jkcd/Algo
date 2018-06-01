package sorting;

import java.util.Arrays;



/*
 *  selection sort follows below steps
 *	Find the smallest item and swap it with the first element.
 * 	Find the second-smallest item and swap it with the second element.
 *	Find the third-smallest item and swap it with the third element.
 *  Repeat finding the next-smallest item and swapping it into the correct position
 *  until the array is sorted.
 *  This algorithm is called selection sort because it repeatedly selects the
 *  next-smallest element and swaps it into place.
 *  asymptotic notation = O(n2)
 */
public class selectionSort {
	static int input[] = {20,10,5,25,105,65,80};
	
	static int input1[] = { 200, 15, -2, -5, 200, -2, -20, 200,20};
	
	static int count = 0;
	
	
	int findMinIndex(int array[], int startIndex){
		
		int minIndex = startIndex;
		int minValue  = array[startIndex];
		for ( int i = startIndex+1; i < array.length; i++){
			//System.out.println("index: " + i);
			count++;
			if ( array[i] < minValue){
				minIndex = i;
				minValue = array[minIndex];
			}
			
		}
		return minIndex;
	}
	
	void swap(int[] array, int firstIndex, int secondIndex){
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	// 
	
	int[] selectSort(int[] data){
		int mIndex = 0;
		for ( int i = 0; i < data.length; i++){
			count++;
			mIndex = findMinIndex(data, i);
			//System.out.println("swapping: "+ i + " and: " + mIndex);
			swap(data, i, mIndex);
		}
		
		return data;
		
	}
	
	
	public static void main(String[] args){
		selectionSort sortObj = new selectionSort();
		count = 0;
		int data[] = sortObj.selectSort(selectionSort.input);
		System.out.println("output0: " + Arrays.toString(data));
		System.out.println("count:  " + count + "--------\n");
		
		count = 0;
		int data1[] = sortObj.selectSort(selectionSort.input1);
		System.out.println("output1: " + Arrays.toString(data1));
		System.out.println("count:  " + count + "--------\n");
		
	}
	
	
	

};
