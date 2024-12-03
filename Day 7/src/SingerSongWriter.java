public class SingerSongWriter extends Singer{

    public SingerSongWriter(String name){
        super(name);
    }

    public void writeSong(String title){
        System.out.println("Writing song with title: " + title);
    }



}
