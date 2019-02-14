import java.util.*;
public class Book {
    public static void main(String[] args) {

        Map<String, String> Address = new TreeMap<>();

        option(Address);
    }

    public static void option(Map<String, String> Address) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Type '1' to add a person and there email");
        System.out.println("Type '2' to search for a person");
        int choice = Input.nextInt();
        if (choice == 1) {

            add(Address);
        }
        if (choice == 2) {
            search(Address);
        }

    }

    public static void add(Map<String, String> Address) {
        Scanner Input = new Scanner(System.in);
        String decision = "";
        while (!decision.equals("END")) {
            System.out.println("Enter a Name");
            String name = Input.nextLine();
            System.out.println("What is your Email");
            String email = Input.nextLine();
            Address.put(name, email);
            System.out.println("To End process type 'END' or type any key to add more people");
            decision = Input.nextLine();
        }
        option(Address);

    }

    public static void search(Map<String, String> Address) {
        Scanner Input = new Scanner(System.in);
        String decision = "";
        while (!decision.equals("END")) {
            System.out.println("What is the name you would like to search");
            String choice = Input.nextLine();
            for (String name : Address.keySet()) {
                if (name.equals(choice)) {
                    Person person = new Person(name, Address.get(name));
                    System.out.println(person.getEmail());
                }
                else {
                    continue;
                }
            }
            System.out.println("Type 'END' to finish searching for Email addresses or type any key to search again");
            decision = Input.nextLine();
        }
        option(Address);
    }
}


