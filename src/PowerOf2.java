//import java.util.Scanner;
//
//public class PowerOf2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 1: User se positive integer input lena
//        System.out.print("Enter a positive number: ");
//        int n = scanner.nextInt();
//
//        // Step 2: Loop se power of 2 print karna
//        for (int i = 0; i <= n; i++) {
//            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//
//        // Step 1: Check if input is valid
//        if (n < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//            return;
//        }
//
//        // Step 2: Calculate factorial using while loop
//        int factorial = 1;
//        while (n > 1) {
//            factorial *= n;  // Multiply and update factorial
//            n--;  // Decrease n by 1 using -= operator
//        }
//
//        System.out.println("Factorial is: " + factorial);
//    }
//}
//
//import java.util.Scanner;
//
//public class PrimeNumberCheck {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//        boolean isPrime = true;
//
//        // Step 1: Check divisibility from 2 to sqrt(n)
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                isPrime = false;  // If divisible, it's not prime
//                break;
//            }
//        }
//
//        if (n <= 1) {
//            isPrime = false; // Numbers less than or equal to 1 are not prime
//        }
//
//        System.out.println(isPrime ? n + " is a prime number." : n + " is not a prime number.");
//    }
//}
//
//import java.util.Scanner;
//
//public class PrimeInRange {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the start of range: ");
//        int start = scanner.nextInt();
//
//        System.out.print("Enter the end of range: ");
//        int end = scanner.nextInt();
//
//        // Step 1: Loop through the range
//        for (int i = start; i <= end; i++) {
//            boolean isPrime = true;
//
//            // Step 2: Check if number is prime
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (i > 1 && isPrime) {
//                System.out.println(i + " is a prime number.");
//            }
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class PrimeFactors {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//
//        // Step 1: Check for prime factors
//        for (int i = 2; i * i <= n; i++) {
//            while (n % i == 0) {
//                System.out.println(i + " is a prime factor.");
//                n /= i;
//            }
//        }
//
//        // Step 2: If n is still greater than 2, it's prime
//        if (n > 2) {
//            System.out.println(n + " is a prime factor.");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class GamblingSimulator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter stake (in INR): ");
//        int stake = scanner.nextInt();
//
//        System.out.print("Enter goal: ");
//        int goal = scanner.nextInt();
//
//        System.out.print("Enter number of trials: ");
//        int trials = scanner.nextInt();
//
//        int winCount = 0;
//        int totalBets = 0;
//
//        // Step 1: Run simulation for trials
//        for (int i = 0; i < trials; i++) {
//            int currentStake = stake;
//            int betCount = 0;
//
//            // Step 2: Gamble until the goal or stake is met
//            while (currentStake > 0 && currentStake < goal) {
//                betCount++;
//                if (Math.random() < 0.5) {
//                    currentStake++;  // Win a bet
//                } else {
//                    currentStake--;  // Lose a bet
//                }
//            }
//
//            // Step 3: Check if goal is met
//            if (currentStake == goal) {
//                winCount++;
//            }
//            totalBets += betCount;
//        }
//
//        // Step 4: Output results
//        System.out.println("Number of wins: " + winCount);
//        System.out.println("Percentage of wins: " + (100.0 * winCount / trials) + "%");
//        System.out.println("Average number of bets: " + (totalBets / trials));
//    }
//}
//
//import java.util.Scanner;
//
//public class SinCosTaylorSeries {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter angle in degrees: ");
//        double d = sc.nextDouble();
//        System.out.print("Enter number of terms in the series: ");
//        int n = sc.nextInt();
//
//        // Convert angle to radians
//        double x = d * Math.PI / 180;
//
//        // Convert to -2π to 2π range
//        x = x % (2 * Math.PI);
//
//        // Calculate sin(x) using Taylor series
//        double sinValue = 0;
//        for (int i = 0; i < n; i++) {
//            int power = 2 * i + 1;
//            double term = Math.pow(x, power) / factorial(power);
//            if (i % 2 == 0) {
//                sinValue += term;
//            } else {
//                sinValue -= term;
//            }
//        }
//
//        // Calculate cos(x) using Taylor series
//        double cosValue = 0;
//        for (int i = 0; i < n; i++) {
//            int power = 2 * i;
//            double term = Math.pow(x, power) / factorial(power);
//            if (i % 2 == 0) {
//                cosValue += term;
//            } else {
//                cosValue -= term;
//            }
//        }
//
//        // Output results
//        System.out.println("sin(" + d + ") = " + sinValue);
//        System.out.println("cos(" + d + ") = " + cosValue);
//    }
//
//    // Function to calculate factorial
//    public static double factorial(int num) {
//        double fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
//}
//
//public class FibonacciSeries {
//    public static void main(String[] args) {
//        int n = 10; // Print first 10 Fibonacci numbers
//        int a = 0, b = 1;
//
//        System.out.println("Fibonacci Series:");
//        System.out.print(a + " " + b + " ");
//
//        for (int i = 2; i < n; i++) {
//            int next = a + b;
//            System.out.print(next + " ");
//            a = b;
//            b = next;
//        }
//    }
//}
//
//public class ArmstrongNumber {
//    public static void main(String[] args) {
//        int num = 153;
//        int originalNum = num;
//        int sum = 0;
//
//        while (num != 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, 3); // Cube the digit
//            num /= 10;
//        }
//
//        if (sum == originalNum) {
//            System.out.println(originalNum + " is an Armstrong number.");
//        } else {
//            System.out.println(originalNum + " is not an Armstrong number.");
//        }
//    }
//}
//
//public class ReverseNumber {
//    public static void main(String[] args) {
//        int num = 123;
//        int reversed = 0;
//
//        while (num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//
//        System.out.println("Reversed number: " + reversed);
//    }
//}
//
//import java.util.Scanner;
//
//public class NumberGuessingGame {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Define the initial range
//        int low = 1, high = 100;
//        String feedback;
//        int guess;
//
//        // Inform the user to think of a number
//        System.out.println("Think of a number between 1 and 100.");
//        System.out.println("I will try to guess it.");
//
//        // Loop until the computer guesses correctly
//        while (low <= high) {
//            // Find the middle of the range
//            guess = (low + high) / 2;
//
//            // Ask the user for feedback
//            System.out.println("Is your number " + guess + "?");
//            System.out.println("Enter 'high' if my guess is too high, 'low' if my guess is too low, or 'correct' if I guessed your number.");
//
//            // Get user feedback
//            feedback = scanner.nextLine().toLowerCase();
//
//            // If the guess is too high, narrow the range to the lower half
//            if (feedback.equals("high")) {
//                high = guess - 1;
//            }
//            // If the guess is too low, narrow the range to the upper half
//            else if (feedback.equals("low")) {
//                low = guess + 1;
//            }
//            // If the guess is correct, stop the loop
//            else if (feedback.equals("correct")) {
//                System.out.println("Yay! I guessed your number: " + guess);
//                break;
//            }
//            // If the input is invalid, ask again
//            else {
//                System.out.println("Invalid input, please enter 'high', 'low', or 'correct'.");
//            }
//        }
//
//        scanner.close();
//    }
//}
