import java.util.Scanner;

public class HeightNStar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++) {
            for (int j =1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            for (int k =1;k<=i;k++) {
                System.out.print("+");
            }
            for (int h=i-1;h>=1;h--) {
                System.out.print("+");
            }
            System.out.println("\n");
        }
    }
}
