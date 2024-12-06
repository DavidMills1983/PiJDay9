//4 Error handling on user input
//a)
//Write a program that reads 10 numbers from the user and then prints the mean average. If the user
//inputs something that is not a number, the program should complain and ask for a number again until
//10 numbers have been introduced.
//b)
//Modify the program so that it first asks how many numbers the user wants to enter, and then asks
//for the numbers. The computer should complain if the user enters something that is not a number in
//both cases. Use methods to prevent code repetitions.

package Day10;
import java.util.Scanner;

public class Day10Exercise4 {

    public static int checkIfNumber(Scanner scan, String prompt) {

        while (true) {
            System.out.println(prompt);
            String input = scan.nextLine();
            try {
                return Integer.parseInt(input);

            } catch (NumberFormatException ex) {
                System.out.println("Invalid number. Enter a valid number: ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = checkIfNumber(scan, "How many numbers do you want to enter? ");
        int total = 0;
        int i = 0;

        while (i < count) {
            int number = checkIfNumber(scan, "Enter a number: ");
            i++;
            total += number;
            }

        System.out.println("The average number is: " + total/count);

            }

        }


