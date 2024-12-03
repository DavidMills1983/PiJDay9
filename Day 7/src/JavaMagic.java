
public class JavaMagic {
    public static void main(String[] args) {
        SingerSongWriter billyCorgan = new SingerSongWriter("Billy Corgan");
        System.out.println("The name of the singer is " + billyCorgan.getName());
        billyCorgan.sing("Today");
        billyCorgan.writeSong("1979");
    }
}
