//take a 2d array as input from the user and find an element in the array or matri and also print the indices on the screen

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the matrix");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];

        //taking the user input for the array
        System.out.println("Enter the elements in a matrix format");
        for (int i=0; i<rows;i++){
            for (int j = 0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element you want to find in the matrix");
        int element = sc.nextInt();
        for (int i=0; i<rows;i++){
            for (int j = 0; j<columns; j++){
                if (arr[i][j] == element){
                    System.out.println("The element is present at " + i+","+j );
                }
            }
        }

    }
}
