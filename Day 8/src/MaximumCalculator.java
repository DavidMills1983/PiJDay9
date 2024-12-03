public class MaximumCalculator{
    public int getMax(int n, int m){
        return getMaxHelper(n, m, n, m);
    }

    public Object[] getMax(Object[] o1, Object[] o2){
        return getMaxHelper(o1, o2, o1.length, o2.length);
    }

    public String getMax(String number1, String number2){
        return getMaxHelper(number1, number2, number1.length(), number2.length());
    }

    private <T> T getMaxHelper(T result1, T result2, int value1, int value2){
        if (value1 > value2){
            return result1;
        }
        else {
            return result2;
        }
    }
}