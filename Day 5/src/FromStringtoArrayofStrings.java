import java.util.Scanner;
public class FromStringtoArrayofStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println("How many times do you want to split it? (number must be less than string length! ");
        int n = input.nextInt();

        String[] myArray = split(word, n);

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        }

    static String[] split(String s, int n){
        int arrayLength;
        if (s.length() % n != 0){
            arrayLength = (s.length()/n) + 1;
        }
        else {
            arrayLength = s.length() / n;
        }

        String[] splitString;
        splitString = new String[arrayLength];
        int a = 0;
        int b = n;

        for(int i = 0; i < splitString.length; i++){
            splitString[i] = s.substring(a, b);
            a += n;
            if(b + n > s.length() - 1){
                b = s.length();
            } else {
                b += n;
            }

        }
        return splitString;
    }

}
