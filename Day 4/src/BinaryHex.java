import java.util.Scanner;

public class BinaryHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to convert to hexadecimal: ");
        int num = input.nextInt();
        System.out.println(decimal2hexadecimal(num));

    }

    static String decimal2hexadecimal(int num){
        String number = "";
        while(num > 0){
            int remainder = num % 16;

            if (remainder > 9){
                switch(remainder){
                    case 10:
                        number += "A";
                        break;
                    case 11:
                        number += "B";
                        break;
                    case 12:
                        number += "C";
                        break;
                    case 13:
                        number += "D";
                        break;
                    case 14:
                        number += "E";
                        break;
                    case 15:
                        number += "F";
                        break;
            }
            } else {
                number += Integer.toString(remainder);
            }
            num = num / 16;
            }
        String hexadecimal = "";
        for(int i = number.length()-1; i > -1; i--){
            hexadecimal += number.charAt(i);
        }

        return hexadecimal;

        }


    static double power(int b, int e){
        return Math.pow(b, e);
    }

    static double power2(int a){
        return power(2, a);
    }

    static int binary2decimal(String binaryNumber){
        int result = 0;
        for(int i = 0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '1'){
                int power = binaryNumber.length() - (i + 1);
                result += (int) power2(power);
            }

        }
        return result;
    }

    static String decimal2binary(int num){
        String number = "";
        while (num > 0){
            number += num % 2;
            num = num / 2;
        }
        String binaryNumber = "";
        for (int i = number.length() - 1; i > -1; i--){
            binaryNumber += number.charAt(i);
        }
        return binaryNumber;
    }

}