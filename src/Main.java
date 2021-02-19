import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to see its factorial:");
        int n = sc.nextInt();
        System.out.println(fact(n));

    }

    public static int fact(int num) {
        if (num == 0) {
            return 0;
        } else {
            int fact = 1;
            for (int i = num; i >= 2; i--) {
                fact *= i;
            }
            return fact;
        }
    }
}
