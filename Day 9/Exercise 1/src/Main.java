// Add the following Strings to a HashSet<String> in the given order:
//"Java", "C", "PHP", "JavaScript", "Python", "Rust", "Haskell", "Go", "Prolog"
//Now print the HashSet<String> on the screen. Why are the Strings in the output in this order?
//Repeat the above with the same Strings and rst a LinkedHashSet<String>, then a TreeSet<String>.

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

//        HashSet<String> set = new HashSet<>(); // [Java, C, Rust, JavaScript, Go, PHP, Haskell, Prolog, Python]
//        LinkedHashSet<String> set = new LinkedHashSet<>(); // [Java, C, PHP, JavaScript, Python, Rust, Haskell, Go, Prolog]
        TreeSet<String> set = new TreeSet<>(); // [C, Go, Haskell, Java, JavaScript, PHP, Prolog, Python, Rust]

        set.add("Java");
        set.add("C");
        set.add("PHP");
        set.add("JavaScript");
        set.add("Python");
        set.add("Rust");
        set.add("Haskell");
        set.add("Go");
        set.add("Prolog");

        System.out.println(set);

    }
}