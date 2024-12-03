public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }


    @Override
    public void reproduce() {
        giveBirth();

    }

    public void giveBirth(){
        System.out.println(this.name + " is giving birth...");
    }
}
