import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<String, Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of people: ");
        int size = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name: ");
            String names = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            person.put(names,age);    
        }

        for (String iString : person.keySet()) {
            System.out.println("The name of the person: "+iString+" and the age is: "+person.get(iString));
        }

    }
}
