public class Integer2 {

    int i2;

    int getValue(){
        return i2;
    }

    void setValue(int x){
        this.i2 = x;
    }

    boolean isEven(){
        if (i2 % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    boolean isOdd(){
        if (i2 % 2 != 0){
            return true;
        }
        else {
            return false;
        }
    }

    String asString(){
        return Integer.toString(i2);
    }

}
