import java.util.Scanner;

public class Mod5_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input1 = 0;
        double input2 = 0;
        double inputProduct;
        String trash = "";

        System.out.println("give me an input");
        if (scanner.hasNextDouble()) {
            input1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("give me another input");
            if(scanner.hasNextDouble()){
                input2 = scanner.nextDouble();

                inputProduct = input1 * input2;

                System.out.println("Your product is "+ inputProduct);

            }
            else{
                trash = scanner.nextLine();
                System.out.println("your input is trash " + trash);

            }
        }
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);

        }


    }
}
