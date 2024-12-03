package Exercise5;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        OldPhone oldPhone1 = new OldPhone("ACME");
        OldPhone oldPhone2 = new OldPhone("ACME");

        System.out.println("oldPhone1.equals(oldPhone2) is " + oldPhone1.equals(oldPhone2));

        HashSet<Phone> phones = new HashSet<>();
        phones.add(oldPhone1);

        System.out.println("phones.contains(oldPhone2) is " + phones.contains(oldPhone2));






    }




}
