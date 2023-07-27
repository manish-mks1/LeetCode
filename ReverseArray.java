import java.io.*;

class ReverseArray {
    static void rvereseArray(int arr[], int s, int e)
	{
		int temp;
		if (s >= e)
			return;
		temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
		rvereseArray(arr, s+1, e-1);
	}
	static void printArray(int arr[], int size)
	{
		for (int i=0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	public static void main (String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		printArray(arr, 6);
		rvereseArray(arr, 0, 5);
		System.out.println("Reversed array is ");
		printArray(arr, 6);
	}
}
