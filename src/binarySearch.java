//this the program to perform binary search on an array to find if a given element is present in the array

import java.util.Scanner;

public class binarySearch {

    //creating a method or function for binary search
    int binarySearch(int arr[] , int size, int element){
        int start = 0;
        int end = size;
        //using a while loop to iterate till the end of the array
        while(start<=end){
            int mid = (start+end)/2;
            //using if else statements
            if (arr[mid] == element){
                return mid;
            }
            if (arr[mid]<element){
                start = mid+1;
            }
            if (arr[mid]>element){
                end = mid-1;
            }
        }

        return -1;

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {22,36,45,56,69,75,86,95};
        int size = arr.length;
        System.out.println("Enter the element you want to search in the array");
        int element = sc.nextInt();

        //using the function
        binarySearch ob = new binarySearch();
        int result = ob.binarySearch(arr,size,element);

        if (result == -1){
            System.out.println("couldn't find the element");
        }
        else{
            System.out.println("Element found at "  +
                    result);
        }




    }
}


// Java implementation of iterative Binary Search
/*
class BinarySearch {
    // Returns index of x if it is present in arr[],
    // else return -1
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 40;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
*/
