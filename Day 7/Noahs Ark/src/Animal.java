public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void call(){
        System.out.println(name + " coming");
    }

    public void makeSound(){
        System.out.println(this.name + " making a sound.");
    }

    public abstract void reproduce();
}
