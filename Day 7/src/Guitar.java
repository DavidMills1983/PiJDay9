public class Guitar {
    private MusicalInstrument musicalInstrument;
    private WoodenObject woodenObject;

    public Guitar(){
        this.musicalInstrument = new MusicalInstrument();
        this.woodenObject = new WoodenObject();
    }

    public void play(){
        musicalInstrument.play();
    }

    public void burn(){
        woodenObject.burn();
    }

    }

