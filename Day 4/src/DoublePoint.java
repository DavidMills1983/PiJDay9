public class DoublePoint {
    private double x;
    private double y;

    public DoublePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(DoublePoint doublepoint){
        return Math.sqrt(Math.pow(this.x - doublepoint.x, 2) + Math.pow(this.y - doublepoint.y, 2));
    }

    public double distanceToOrigin(){
        DoublePoint origin = new DoublePoint(0, 0);
        return distanceTo(origin);
    }

    public void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void moveTo(DoublePoint otherDoublePoint){
        this.x = otherDoublePoint.x;
        this.y = otherDoublePoint.y;
    }

    public DoublePoint copy(){
        return new DoublePoint(this.x, this.y);
    }

    public DoublePoint opposite(){
        return new DoublePoint(-this.x, -this.y);
    }

    public DoublePoint get(DoublePoint dpointObj){
        return dpointObj;
    }

    @Override
    public String toString() {
        return "DoublePoint x=" + x + ", y=" + y;
    }

    public static void main(String[] args) {
        DoublePoint dpoint = new DoublePoint(2, 4);
        DoublePoint dpoint2 = new DoublePoint(4, 6);
        DoublePoint dpoint3 = new DoublePoint(7, 5);

        System.out.println(dpoint);
        System.out.println(dpoint2);

        System.out.println(dpoint.distanceTo(dpoint2));
        System.out.println(dpoint.distanceToOrigin());

        dpoint.moveTo(5, 8);

        System.out.println(dpoint.distanceTo(dpoint2));

        dpoint.moveTo(dpoint3);

        System.out.println(dpoint.get(dpoint));

        System.out.println(dpoint2.copy());
        System.out.println(dpoint2.opposite());;








    }
}