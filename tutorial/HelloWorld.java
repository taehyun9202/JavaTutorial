import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("hello world");
        String name;
        int age;
        String address;
        Scanner scan = new Scanner(System.in);
        System.out.print("Your Name :");
        name = scan.next();
        System.out.print("Your Age :");
        age = scan.nextInt();
        System.out.print("Your Address :");
        address = scan.next();
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My hometown is " + address);
    }
}