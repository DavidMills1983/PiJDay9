import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CopyingArrays {
    public static void main(String[] args) {
        ArrayCopier copier = new ArrayCopier();
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {4, 5, 6, 7, 8, 9};
        String result = Arrays.toString(copier.copy(arrayOne, arrayTwo));
        System.out.println(result);

        }
    }
