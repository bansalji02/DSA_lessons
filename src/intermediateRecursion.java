public class intermediateRecursion {
    //writing the function of tower of hanoi (classical recusion problem)
    public static void  towerOfHanoi(int n , String src, String help , String dest){
        //base case for the function
        //if the no of disks remain are 1 then we should be simply transferring the disks and then returning from the function
        if (n==1){
            //printing the 1st ring
            System.out.println("Transferring the ring "+ n +" from "+ src+" to "+ dest);
            return;
        }
        //let us suppose we have 3 disks. according to our calculations we should be doing 7 steps
        //the first three steps should be transfering the above two disks to the helper tower so we need to call the same function again i.e. recursion
        towerOfHanoi(n-1 ,src , dest , help);
        //printing the actual funtion work that is printing the line that which ring is being shifted
        System.out.println("Transferring the ring "+ n +" from "+ src+" to "+ dest);
        //again calling the recursive function to put the rings left in helper tower to the destination tower using the source tower as the helper
        towerOfHanoi(n-1, help,src, dest);



    }

    //reversing a string using recursion
    public static void strReverse(String str , int length){
        //base case for the function
        if (length==0){
            System.out.println(str.charAt(0));
            return;
        }
        //printing the last element in the string
        System.out.println(str.charAt(length));
        //using the recursion
        strReverse(str, length-1);

    }

    //making two static variables to track the first and last
    public static int first = -1;
    public static int last= - 1;

    //writing the function to print the first and last occurance of a character in the string
    public static void printOcc(String str , char a , int n){
        //base case
        if (n == str.length()) {
            System.out.println("The first occurance of the char a is at index "+ first);
            System.out.println("The last occurance of the char a is at index "+ last);

            return;
        }
        if (str.charAt(n) == a){
            //this says that if the last character of the string is the given char then we will update the last variable
            if (first == -1){
                first = n;
            }
            else {
                last = n;
            }

        }

        //calling the recursive function
        printOcc(str ,a, n+1);

    }

    //Function to check if an array is sorted and strictly increasing
    //creating a flag variable
    public static int flag =-1;
    public static boolean checkarr(int[] arr, int idx){
        //base case
        if (idx == arr.length-1){
            return true;
        }

        if (arr[idx]< arr[idx+1]){
            //calling the recursive function
            return checkarr(arr , idx+1);

        }
        else{
            return false;
        }


    }




    public static void main(String[] args) {

        /*int n =3;
        towerOfHanoi(n , "S","H","D");*/
       /* String str = "Himanshu"; int size = str.length();
        strReverse(str , size-1);*///Here we are passing size-1 bcoz str.length returns the actual length from the string but the index values start from 0
                                       //so the index size of the string is always 1 less than its actual size

        /*String str = "aaghfaahithjakkt";
         char a = 'a';
        printOcc(str,a, 0);*/

        int[] arr = {1,3,5,9};
        System.out.println(checkarr(arr , 0));

    }
}
