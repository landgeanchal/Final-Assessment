import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0, n 1= 0;

        originalNumber = num;

        // Count the number of digits
        for (originalNumber = num; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = num;

        // Calculate the sum of nth power of digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the number is Armstrong
        return result == num;
    }
}