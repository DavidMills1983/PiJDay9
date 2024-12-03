package Exercise5;
import java.util.Objects;

public class OldPhone implements Phone {

    private String brand;

    public OldPhone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldPhone otherOldPhone = (OldPhone) o;
        return brand.equals(otherOldPhone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }
}