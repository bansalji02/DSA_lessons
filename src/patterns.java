import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for star pattern:");
        int n = sc.nextInt();
        System.out.println("its a decreasing star pattern");
        for (int i= 1; i<=n; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Its a increasing star pattern");
        for (int i= 1; i<=n; i++){
            for (int j = n; j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
