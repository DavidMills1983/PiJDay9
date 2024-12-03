public class MeasureSummer {

    public static double sumMeasures(Measurable[] measurables){
        if (measurables == null){
            return 0;
        }

        double total = 0;
        for (int i = 0; i < measurables.length; i++){
            if (measurables[i] == null){
                continue;
            }
            total += measurables[i].getMeasure();
        }
        return total;
    }

}
