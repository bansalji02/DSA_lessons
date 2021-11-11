import java.util.Scanner;

public class insertBeg {
    public static void main(String[] args) {
        int arr[] = {11,25,36,58,96,85};
        System.out.println("Enter the number you want to enter in the array at the beginning");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int size = arr.length;
        size= size+1;
        int b[] = new int[size];


// we have to reduce the size of for loop by one because we have to take care of the array with lower size
       for (int i = 0; i<size-1 ; i++){
            b[i+1] = arr[i];
        }
        b[0] = a;

        for (int i = 0; i<size;  i++){
            System.out.print(b[i]+" ");
        }

    }
}
