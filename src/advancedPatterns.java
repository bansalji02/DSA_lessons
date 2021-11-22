import java.util.Scanner;

class advPatterns{
    //printing the butterfly pattern
    void butterflyPattern(int n ){
        for (int i = 1; i<=n  ; i++){
            //we will rewuire three loops here, one to print the stars and the other to print the spaces and one another to print the star after the spaces
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            //for loop for the spaces
            //initializing two variables start and end to mark the starting and ending points of the spaces
            int start =1 , end = 2*n;
            for (int j=start+i; j <=end-i; j++){
                System.out.print("  ");
            }

            //again a for loop for the stars after the spaces
            for (int j = 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        //for the bottom part of the butterfly we gonna copy the above code with slight changes to flip the pattern
        //simply we need to change the i to decrement instead of increment

        for (int i = n; i>=0  ; i--){
            //we will require three loops here, one to print the stars and the other to print the spaces and one another to print the star after the spaces
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            //for loop for the spaces
            //initializing two variables start and end to mark the starting and ending points of the spaces
            int start =1 , end = 2*n;
            for (int j=start+i; j <=end-i; j++){
                System.out.print("  ");
            }

            //again a for loop for the stars after the spaces
            for (int j = 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //printing a solid rhombus pattern
    void rhombus(int n ){
        for (int i=1; i<=n;i++){
            //for loop for printing the spaces
            for (int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            //for loop for printing the stars
            for (int j = 1; j <=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //printing the number pyramid
    void numberPyramid(int n){
        int count =1;//the count variable is to make a note of the different values at different levels
        for (int i=1;i<=n;i++){
            //for loop for printing the space
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            //loop for printing the data or elements after the spaces
            for (int j=1;j<=i;j++){
                System.out.print(count+" ");

            }
            count++;
            System.out.println();

        }
    }

    //printing palindroming pyramids that is mirror view type
    void pelindromicPyramid(int n){
        for (int i=1;i<=n;i++){
            //for loop for printing the space
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            //printing the elements
            for (int j= i;j>0;j--){
                System.out.print(j);
            }

            //for loop for the other side of palindrome
            for (int j = 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //printing diamond pattern
    void diamondPattern(int n){
        for (int i =1;i<=n;i++){
            //loop for printing the spaces
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            //loop for printing the stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }

            //for loop for the other side of palindrome
            for (int j = 2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //printing the bottom part of the diamond shape by just changing the value of i in the above code
        for (int i =n;i>0;i--){
            //loop for printing the spaces
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            //loop for printing the stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }

            //for loop for the other side of palindrome
            for (int j = 2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

public class advancedPatterns {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of lines long pyramid you want");
        //int n = sc.nextInt();

        advPatterns obj = new advPatterns();
        //obj.butterflyPattern(4);
        //obj.rhombus(5);
        //obj.numberPyramid(5);
        //obj.pelindromicPyramid(5);
        obj.diamondPattern(5);
    }
}
