public class Singer {

    private String name;

    public Singer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void sing(String song){
        System.out.println("Singing song: " + song);
    }

}
