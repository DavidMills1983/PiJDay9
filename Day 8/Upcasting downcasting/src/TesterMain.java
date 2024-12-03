public class TesterMain {
    public static void main(String[] args) {
        OldPhone old = new OldPhone("ACME classic");
        MobilePhone mobile = new MobilePhone("ACME");
        OldPhone mobileAsOld = mobile;

        SimpleTester simple = new SimpleTester();
        SpecialTester special = new SpecialTester();
        SimpleTester specialAsSimple = special;

//        special.test(old);
//        special.test(mobile);
//        special.test(mobileAsOld);
//        System.out.println();

//        specialAsSimple.test(old); // "simple test old"
//        specialAsSimple.test(mobile); // "simple test old"
//        specialAsSimple.test(mobileAsOld); // "simple test old"
//        System.out.println();;

//        simple.ring(old); // "simple ring old"
//        simple.ring(mobile); // "simple ring old"
//        simple.ring(mobileAsOld); // "simple ring old"

//        special.ring(old); // "simple ring old"
//        special.ring(mobile); // "special ring mobile"
//        special.ring(mobileAsOld); // "simple ring old"

        specialAsSimple.ring(old); // "simple ring old"
        specialAsSimple.ring(mobile);
        specialAsSimple.ring(mobileAsOld);



    }
}
