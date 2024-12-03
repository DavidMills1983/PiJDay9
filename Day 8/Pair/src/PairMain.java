public class PairMain {
    public static void main(String[] args) {
        Pair<Integer, String> original = new Pair<>(41, "David");
        System.out.println(original.getFirst());
        System.out.println(original.getSecond());

        System.out.println(original.swap().getFirst());
        System.out.println(original.swap().getSecond());
    }
}
