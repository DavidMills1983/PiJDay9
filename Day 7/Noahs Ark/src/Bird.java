public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void call(){
        System.out.println(this.name + " now flying, will come back later when tired...");
    }

    @Override
    public void reproduce(){
        layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " is tweeting...");
    }

    public void layEggs(){
        System.out.println(this.name + " is laying eggs...");
    }
}
