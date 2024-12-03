
public class Tile {
    private char letter;
    private int value;

    public static void main(String[] args) {
        Tile qTile = new Tile('Q', 9);
        System.out.println(qTile.copy());
    }

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public void printTile(Tile t){
        System.out.printf("%s %d", t.letter, t.value);
    }

    public Tile testTile(){
        Tile t = new Tile('Z', 10);
        printTile(t);
        return t;
    }

    @Override
    public String toString() {
        return "Tile: " + letter + ", value: " + value;
    }

    public boolean equals(Tile other){
        return this.value == other.value;
    }

    public Tile get(Tile tileObj){
        return tileObj;
    }

    public Tile copy(){
        return new Tile(this.letter, this.value);
    }


}