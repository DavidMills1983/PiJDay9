public class Cat extends Animal implements AnimalBehaviour{
    public Cat(String name){
        super(name);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating mice.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is climbing.");

    }
}
