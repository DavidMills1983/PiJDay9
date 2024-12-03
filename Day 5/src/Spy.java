
public class Spy {
    private static int activeSpyCount = 0;
    private int SpyID;
    private boolean active;

    public Spy(int SpyID) {
        activeSpyCount++;
        this.SpyID = SpyID;
        this.active = true;
        System.out.println("SpyID: " + this.SpyID);
        System.out.println("Number of active spies: " + getNumberOfActiveSpies());
    }

    public void retire() {
        System.out.println("Spy " + SpyID + " has retired.");
        activeSpyCount--;
        this.active = false;
        System.out.println("Number of active spies now: " + getNumberOfActiveSpies());

    }

    public static int getNumberOfActiveSpies(){
        return activeSpyCount;
    }

    public static void main(String[] args) {
        Spy spyOne = new Spy(7);
        Spy spyTwo = new Spy(4);
        Spy spyThree = new Spy(39);
        spyTwo.retire();


        }
    }
