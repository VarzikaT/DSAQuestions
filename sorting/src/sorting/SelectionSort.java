package sorting;

public class SelectionSort {
	 void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	        { int minidx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[minidx])
	                    minidx = j;
	 
	            int temp = arr[minidx];
	            arr[minidx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	    public static void main(String args[])
	    {
	        SelectionSort ob = new SelectionSort();
	        int arr[] = {30,45,98,76,15};
	        ob.sort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	    }
}
