//program to delete a certain element from a given  array using the index value

import java.util.Scanner;

class  delete{

    //function to delete the element using its index number
    public void deletePos(int arr[] , int position){
        //creating a new array
        int brr[] = new int[arr.length-1];
        //for loop to copy the elements before deleted elements
        for (int i =0; i <position; i ++){
            brr[i]  =arr[i];
        }

        //for loop to copy the elements after deleting the elements
        for (int i =position; i < brr.length; i ++){
            brr[i]  =arr[i+1];
        }


        //printing the array
        for (int i =0; i< brr.length;i++){
            System.out.print(brr[i] + " ");
        }

    }

    //funtion to delete the element using the element value itself
  /*  public void deleteElem(int arr[], int element){
        //creating a new array
        int brr[] = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
            if (arr[i] !=element){
                brr[i] = arr[i];
            }
        }


        //printing the array
        for (int i =0; i< brr.length;i++){
            System.out.print(brr[i] + " ");
        }
    }*/
}

public class deleteArr {
    public static void main(String[] args) {

        //here we can simply put an if else statement to choose if the user want to use elment value or its index
        Scanner sc = new Scanner(System.in);
        int arr[] = {22,56,85,96,36,45,58,22};

        //creating object of above class
        delete del = new delete();

        System.out.println("Enter the index value of element you want to delete");
        int index = sc.nextInt();        if (index<= arr.length){
            //code for deletion
            del.deletePos(arr, 3);
        }
        else {
            System.out.println("The given index does not exist");
        }






    }
}
