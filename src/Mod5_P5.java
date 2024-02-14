import java.util.Scanner;

public class Mod5_P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputTemp = 0;
        String trash = "";
        System.out.println("Give me a number");
        if (scanner.hasNextDouble()) {
            inputTemp = scanner.nextDouble();
            if (inputTemp >= 100)
            {
                System.out.println("your water is turning into gas");
            }
            else if (inputTemp < 100 && inputTemp > 32)
            {
                System.out.println("your water is a liquid");
            }
            else{
                System.out.println("your water is soild");
            }
        }
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);
        }


    }


}
