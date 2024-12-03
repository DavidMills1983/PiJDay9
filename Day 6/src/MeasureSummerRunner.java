public class MeasureSummerRunner {
    public static void main(String[] args) {
        Measurable[] numbers = new Measurable[8];
        numbers[0] = new Point(4, 8);
        numbers[1] = new Point(5, 10);
        numbers[2] = new Point(8, 12);
        numbers[3] = new Point(12, 16);
        numbers[4] = new MeasurableString("Hello");
        numbers[5] = new MeasurableString("Everybody");
        numbers[6] = new MeasurableString("Finley");
        numbers[7] = new MeasurableString("Max");
        double x = MeasureSummer.sumMeasures(numbers);
        System.out.println(x);




    }
}

// 54.54681689935406