import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = scan.nextInt();
        System.out.println("the num of trailing zeroes is: " + factorialTrailingZeroes(n));
    }

    public static int factorialTrailingZeroes(int n)
    {
        if(n < 5)
            return 0;
        int twoCount = 1;
        int fiveCount = 0;
        for (int i = 4; i <= n; i = i*2)
        {
            twoCount += i/2;
        }
        for (int j = 5; j <= n ; j = 5)
        {
            fiveCount += j/5;
        }

        return 5;


    }
}
