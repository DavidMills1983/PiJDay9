public abstract class Insect extends Animal {
    public Insect(String name){
        super(name);
    }


    @Override
    public void reproduce(){
        layEggs();
    }

    public void layEggs(){
        System.out.println(this.name + " laying eggs.");
    }
}
