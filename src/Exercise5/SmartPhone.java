package Exercise5;

import java.util.Arrays;

public class SmartPhone extends MobilePhone {
    private static final String INTERNATIONAL_PREFIX = "00";

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String address) {
        System.out.println("Browsing " + address + "...");
    }

    public void findPosition() {
        System.out.println("Coordinates TO DO");
    }

    @Override
    public void call(String number) {
        if (number.startsWith(INTERNATIONAL_PREFIX)) {
            System.out.println("Calling " + number + " through the internet to save money");
        } else {
            super.call(number);
        }
    }

    @Override
    public boolean equals(Object o) {
        MobilePhone otherMobilePhone = (MobilePhone) o;
        return super.equals(o) && getBrand().equals(otherMobilePhone.getBrand())
                && Arrays.equals(lastCalledNumbers, otherMobilePhone.lastCalledNumbers);
    }
}