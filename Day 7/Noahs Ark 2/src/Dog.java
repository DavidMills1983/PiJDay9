public class Dog extends Animal implements AnimalBehaviour {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Pedigree Chum");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is walking");

    }
}
