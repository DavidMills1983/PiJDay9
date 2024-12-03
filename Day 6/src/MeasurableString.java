public class MeasurableString implements Measurable {
    private String word;

    public MeasurableString(String text){
        this.word = text;

    }

    @Override
    public double getMeasure() {
        return this.word.length();
    }
}
