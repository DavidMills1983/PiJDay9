public class Animal implements AnimalBehaviour {
    private String name;

    public String getName(){
        return name;
    }

    public Animal(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(name + " makes noise.");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating animal food.");

    }

    @Override
    public void move() {

    }
}
