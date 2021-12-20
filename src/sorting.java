import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting {
    //creating a swap function to swap the elements while looping
    //to be noted that we are passing the index elements in the swap function
    public void swap ( int[] arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    //code for bubbleSort
    public void bubbleSort(int[] arr){
        int size = arr.length;
        //first for loop loop the number of iterations
        for (int i =0; i<size; i++){
            //nested loop to get the elements sorted in single loop
            for (int j = 0 ; j<size-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr, j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    ////code for selectionSort
    public void selectionSort(int[] arr){
        int size = arr.length;
        for (int i=0; i<size-1; i++){
            int bubble = i;
            for (int j=i+1; j<size;j++){
                if (arr[j]<arr[bubble]){
                    bubble= j;

                }
                swap(arr,bubble, i);

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //code for insertion sort
    public void insertionSort(int[] arr){
        int size = arr.length;
        //for loop to loop through the elements
        for (int i=1; i<size; i++){
            int key = arr[i];// key is our current element
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr= {7,3,5,8,6,1};
        sorting sort = new sorting();
        //sort.bubbleSort(arr);
       // sort.selectionSort(arr);
        sort.insertionSort(arr);

    }
}
