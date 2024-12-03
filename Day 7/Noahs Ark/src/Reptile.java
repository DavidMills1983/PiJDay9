public abstract class Reptile extends Animal {
    public Reptile(String name){
        super(name);
    }

    @Override
    public void reproduce() {
        layEggs();
    }

    public void layEggs(){
        System.out.println(this.name + " laying eggs...");
    }
}
