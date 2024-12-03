public class Wolf extends Animal implements AnimalBehaviour{
    public Wolf(String name){
        super(name);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is hungry like the wolf.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is hunting.");

    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is howling.");
    }
}
