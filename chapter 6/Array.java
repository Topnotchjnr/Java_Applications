import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scan.nextInt();
        }

        int sum1 = numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5];
        int sum2 = numbers[6] + numbers[7] + numbers[8];
        

        int result = sum2 - sum1;

        System.out.printf("Result: %d\n", result);
    }
}
