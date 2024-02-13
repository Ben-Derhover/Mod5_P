import java.util.Scanner;

public class Mod5_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dblInput;
        int intInput;
        String stringInput;

        System.out.println("give input");

            if (scanner.hasNextInt()){
                intInput = scanner.nextInt();
                System.out.println("you gave me a int " + intInput);
            }
            else if (scanner.hasNextDouble()) {
                dblInput = scanner.nextDouble();
                System.out.println("You game me a double " + dblInput);
            }
            else {
                stringInput = scanner.nextLine();
                System.out.println("you gave me a string " + stringInput);
        }

    }
}
