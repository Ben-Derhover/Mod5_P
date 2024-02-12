import java.util.Scanner;
public class Mod5_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName = "";
        String lName = "";
        System.out.println("whats your name?");
        fName = scanner.nextLine();
        System.out.println("last name");
        lName = scanner.nextLine();
        System.out.println("your full name is " + fName + " " + lName );
    }
}