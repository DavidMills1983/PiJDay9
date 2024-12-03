package Exercise9;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Map;

public class EmployeesList {
    private String name;
    private int number;
    public EmployeesList(String name, int number){
        this.name = name;
        this.number = number;
    }

    public static void main(String[] args) {
        boolean running = true;
        Map<String, Integer> map = new HashMap<>();

        while(running){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter employee name: ");
            String employeeName = scanner.nextLine();
            if (Objects.equals(employeeName, "")){
                running = false;
                break;
            }
            System.out.println("Enter employee number: ");
            int employeeNumber = scanner.nextInt();
            map.put(employeeName, employeeNumber);

        }

        map.forEach((key, value) -> System.out.println("Employee name: " + key +
                " Employee number: "+ value));

    }
}

