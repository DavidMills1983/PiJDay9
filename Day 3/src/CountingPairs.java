//Write a program that reads a short string and then some longer text. The program must say how
//many times you can nd the short string in the text. You cannot use any method of String apart
//from charAt() and length().
import java.util.Scanner;
public class CountingPairs {
    public static void main(String[] args) {
        System.out.println("Enter short string: ");
        Scanner input = new Scanner(System.in);
        String shortString = input.nextLine();
        System.out.println("Enter long string: ");
        String longString = input.nextLine();

        int shortStringLength = shortString.length();
        int longStringLength = longString.length();
        int count = 0;


        for (int i = 0; i < longStringLength - shortStringLength; i++) {
            boolean isMatch = true;
            for (int j = 0; j < shortStringLength; j++) {
                if (longString.charAt(i + j) != shortString.charAt(j)) {
                    isMatch = false;
                }
            }
        if (isMatch) {
            count++;
        }


        }

        System.out.printf("%s appears in %s %d times\n", shortString, longString, count);
    }
}