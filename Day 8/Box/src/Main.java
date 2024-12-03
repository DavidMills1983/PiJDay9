
public class Main {
    public static void main(String[] args) {

        Box<Animal> catBox = new Box<>(new Cat());
        Animal animal = AnimalHelper.doSomething(catBox);

        System.out.println(animal);

    }
}