public class Amphibian extends Animal  {
    public Amphibian(String name){
        super(name);
    }

    @Override
    public void call(){
        System.out.println(this.name + " will not come because unaffected by the rain!");
    }

    @Override
    public void reproduce(){
        layEggs();
    }

    public void layEggs(){
        System.out.println(this.name + " is laying eggs.");
    }

}
