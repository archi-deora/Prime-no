// The line `import java.util.Scanner;` is importing the `Scanner` class from the `java.util` package.
// The `Scanner` class is used to read input from the user in Java.
import java.util.Scanner;

public class Prime {
   // The `public static void main(String[] args)` method is the entry point of the Java program. It is
   // the method that gets executed when the program is run.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        System.out.println("List of prime numbers between " + start + " and " + end);
        // The code snippet `for (int i = start; i <= end; i++) { if (isPrime(i)) {
        // System.out.println(i); }` is a loop that iterates from the `start` number to the `end`
        // number (inclusive).
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
       // The `scanner.close();` statement is used to close the `Scanner` object.
        scanner.close();
    }

   // The `isPrime` method is a helper method that checks whether a given number `n` is prime or not.
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // The code snippet `for (int i = 2; i <= Math.sqrt(n); i++) { if (n % i == 0) { return false;
        // }` is checking whether the given number `n` is divisible by any number between 2 and the
        // square root of `n`.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
       // The `return true;` statement is used to indicate that the number being checked in the
       // `isPrime` method is a prime number. If none of the conditions in the `for` loop are met
       // (i.e., the number is not divisible by any number between 2 and the square root of `n`), then
       // the method reaches the `return true;` statement, indicating that the number is prime.
        return true;
    }
}
