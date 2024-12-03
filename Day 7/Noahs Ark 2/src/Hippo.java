public class Hippo extends Animal implements AnimalBehaviour{
    public Hippo(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is swimming.");

    }
}
