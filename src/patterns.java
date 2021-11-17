class patternMaker{

    //function to print hollow rectangle
    void hollowRectangle(int rows, int column){
        int m =rows;
        int n = column;
       /*int i,j;
        for ( i =0; i<m; i++){
            //nested for loop
            for ( j = 0;j<n; j++){
                if (i ==0||i==m||
                    j==0||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    //printing half pyramid
    void halfPyramid(int rows){
        for (int i = 0 ; i<rows ; i++){
            for (int j =0; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverted half pyramid
    void invertedhalfPyramid(int columns ){
        for (int i = 0 ; i<columns ; i++){
            for (int j =columns-i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //printing the inverted half pyramid rotated by 180 degree
    void invertedHalfPyramid2(int columns){
        for (int i = 0 ; i<columns ; i++){

            //inner loop to print spaces
            for (int j =0; j<columns-i-1;j++){
                System.out.print(" ");
            }
            for (int j =0; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //half pyramid with numbers
    void numberHalfPyramid(int columns){
        for (int i = 0 ; i<columns ; i++){
            for (int j =0; j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //printing inverted half pyramid with numbers
    void invertedNumericalHalfPyramid(int columns){
        for (int i = columns ; i>0 ; i--){
            for (int j=0; j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //printing the floyd's triangle
    void floydsTriangle(int columns){
        int count =1;
        for (int i = 0 ; i<columns ; i++){
            for (int j =0; j<i+1;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }


}


public class patterns {
    public static void main(String[] args) {
        //making object of the above pattern class
        patternMaker pm = new patternMaker();
        //pm.hollowRectangle(10,5);
        //pm.halfPyramid(5);
        //pm.invertedhalfPyramid(5);
        //pm.invertedHalfPyramid2(5);
        //pm.numberHalfPyramid(5);
        //pm.invertedNumericalHalfPyramid(5);
        pm.floydsTriangle(5);

    }
}
