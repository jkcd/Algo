package sorting;

import java.util.Arrays;

/*
 * In insertion sort, you take an element and insert it 
 * into the right position
 */
   
public class insertionSort {
	
	static int[] data = {22, 11, 99, 88, 9, 7, 42};
	
	static int[] data1 = {25, -25,10,2,20,105,-85,95};
	
	static int count = 0;

	
	void insert (int[] array, int rightIndex) {
		int value = array[rightIndex];
		
		for ( int i = 0; i <= rightIndex; i++){
			count++;
			if ( array[i] <= array[rightIndex]){
				continue;
			}
			int temp = 0; 
			int next = array[i];
			// j [1] 11 next[2] is 99, temp[0] 22
			for ( int j = i+1; j <=rightIndex; j++){
				count++;
				temp = array[j];
				array[j] = next;
				next = temp;
			}
			array[i] = value;
			
		}
		
	};
	
	
	// best algo for insertion sort
	void insertSort(int arr[], int n)
	{
	   int i, key, j;
	   for (i = 1; i < n; i++)
	   {
		   count++;
	       key = arr[i];
	       j = i-1;
	 
	       /* Move elements of arr[0..i-1], that are
	          greater than key, to one position ahead
	          of their current position */
	       while (j >= 0 && arr[j] > key)
	       {
	    	   count++;
	           arr[j+1] = arr[j];
	           j = j-1;
	       }
	       arr[j+1] = key;
	   }
	}

	void insSort(int[] array) {
	    for ( int i =1; i < array.length; i++){
	    	count++;
	    	//System.out.println("iteration: "+ i);
	        insert(array,i);
	        System.out.println("Array after sorting:  " + Arrays.toString(data));
	    }

	};
	
	void binarySearch(int[] array, int key, int low, int high){
		int mid = low + high/2;
		if ( array[mid] < key ){
			binarySearch(array, key, low, mid);
		}
		else if ( array[mid] > key ){
			binarySearch(array, key, mid, high);
		}
		
	}

	void binaryInsertSort(int[] array){
		int n = array.length;
		int key = 0;
		int position = 0;
		int temp = 0;
		for ( int i = 1 ; i < n; i ++){
			key = array[i];
		//	position = binarySearch(array,key, 0, i);
			temp = array[position];
			array[position] = key;
			for ( int j = position+1; j < i; j++){
				array[j] = temp;
				temp = array[j+1];
			}
			
		}
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args){
		insertionSort iSort = new insertionSort();
		
		//iSort.count = 0;
		iSort.insSort(data);
		System.out.println("\nArray after sorting:  " + Arrays.toString(data));
		int[] out = {7, 9, 11, 22, 42, 88, 99};
		System.out.println("count: " + count);
		System.out.println( Arrays.equals(data, out)?"passed":"failed");
		
		
		//iSort.count = 0;
		iSort.insertSort(data1, data1.length);
		System.out.println("\nArray after sorting:  " + Arrays.toString(data1));
		int[] out1 = {-85, -25, 2, 10, 20, 25, 95, 105};
		System.out.println("count: " + count);
		System.out.println(Arrays.equals(data1, out1)?"passed":"failed");
	}


	
	
	
}
