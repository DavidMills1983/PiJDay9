import java.util.Arrays;
import java.util.Scanner;
public class EmployeesList {

    private String[] names;
    private int[] ids;
    private int count;

    public EmployeesList() {
        this.count = 0;
        this.names = new String[0];
        this.ids = new int[0];
    }

    public void addEmployee(String name, int id) {
        if (names.length == count) {
            resizeArray();
            addEmployee(name, id);
        }
        else {
            names[count] = name;
            ids[count] = id;
            count++;
        }
    }

    public void resizeArray(){
        String[] newNamesArray = new String[count+1];
        int[] newIDsArray = new int[count+1];

        for(int i = 0; i < names.length; i++){
            newNamesArray[i] = names[i];
            newIDsArray[i] = ids[i];
        }
        names = newNamesArray;
        ids = newIDsArray;

    }

    @Override
    public String toString() {
        return "EmployeesList{" +
                "names=" + Arrays.toString(names) +
                "ids=" + Arrays.toString(ids) +
                '}';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeesList employeesList = new EmployeesList();

        while(true){
            System.out.println("Enter employee's name: ");
            String name = input.nextLine();
            if (name.isEmpty()) break;


            System.out.println("Enter employee's ID: ");
            int id = input.nextInt();

            input.nextLine();

            if (id == 0){
                break;
            }
            employeesList.addEmployee(name, id);
        }

        System.out.println(employeesList);

        }
}