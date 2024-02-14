import java.util.Scanner;
public class Mod5_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = 0;
        String trash = "";
        System.out.println("Give me a number");

        if (scanner.hasNextInt())
        {
            numInput = scanner.nextInt();
            if (numInput > 0) {
                System.out.println("your number is postive");
            }
            else if (numInput < 0) {
                System.out.println("your number is negitve");
            }
            else {
                System.out.println("your number is 0");
            }

        }
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);


        }


    }

}
