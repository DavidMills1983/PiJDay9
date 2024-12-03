import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("How much money do you want to invest? ");
        Scanner input = new Scanner(System.in);
        double investment = input.nextDouble();
        System.out.println("Enter the fixed rate percentage: ");
        double rate = input.nextDouble();
        System.out.println("Do you wish to enter the number of years (1) or a savings goal that should be reached at the end of the savings period? (2) ");
        int menuChoice = input.nextInt();
        if (menuChoice == 1){
            System.out.println("Enter number of years you'd like to invest for: ");
            int years = input.nextInt();
            System.out.printf("You will save %f in %d years.", calcSavings(investment, years, rate), years);

        } else if (menuChoice == 2) {
            System.out.println("Enter how much you'd like to save: ");
            double targetAmount = input.nextDouble();
            System.out.printf("\nIt will take you %d years to save %f.", calcYears(investment, targetAmount, rate), targetAmount);

        }

    }

    static double calcSavings(double investment, int years, double rate){

            int i = 0;
            while (i < years){
                investment = investment * (1 + rate/100);
                i++;
            }
            return investment;

        }

    static int calcYears(double investment, double targetAmount, double rate){
        int years = 0;
        while (investment < targetAmount){

            investment = investment * (1 + rate/100);
            years += 1;

        }
        return years;
    }


}