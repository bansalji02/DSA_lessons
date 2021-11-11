//Funtion to add an element in an given array at any position
//the given array is full (so we have to create a new array)

import java.util.Scanner;

class insert{

    //funtion to insert the element

    public void insertPos(int arr[] ,int size,  int element, int position){
        int brr[] = new int[size+1];
        //for loop to copy the elements till we reach our position
        for (int i = 0; i<position ; i++){
            brr[i] = arr[i];
        }
        brr[position] = element;
        //for loop to copy the elements after the entered elements
        for (int i = position; i<size ; i++){
            brr[i+1] = arr[i];
        }

        for (int i =0; i<size+1;i++){
            System.out.print(brr[i] + " ");
        }

    }

    //function to print that array
    /*public void printarr(int arr[]){
        int size = arr.length;
        for (int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }*/
}

public class insertPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {15,65,85,69,75,35};
        System.out.println("Enter the element you want to add");
        int elem    = sc.nextInt();
        System.out.println("Enter the position where you want to add this element");
        int pos = sc.nextInt();

        int size = arr.length;

        //making an object of that class insert
        insert ins = new insert();
        //using that function
        ins.insertPos(arr , size, elem , pos);





    }
}
