import java.util.Scanner;

public class Demo { 

    public static void main(String args[]) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for Dog or 2 for Cat:");
        int choice = scanner.nextInt();

        Animal animal; 

        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Input was not 1 or 2");
            return;
        }
        animal.sound(); 
    }
}