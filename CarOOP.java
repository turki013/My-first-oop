
import java.util.Scanner;

public class CarOOP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "", usweName2 = "";
        int userModel = 0, userModel2 = 0;
        try {
            System.out.println("Enter the company name for the first car:");
            userName = input.nextLine();

            System.out.println("Enter the year model for the first car:");
            userModel = input.nextInt();
            input.nextLine();

            System.out.println("Enter the company name for the 2nd car:");
            usweName2 = input.nextLine();

            System.out.println("Enter the year model for the 2nd car:");
            userModel2 = input.nextInt();
        } catch (Exception e) {
            System.out.println("please follow the app role");
             
        }

        Car c1 = new Car();
        Car c2 = new Car();

        c1.setmaker(userName);
        c1.setmodel(userModel);

        c2.setmaker(userName);
        c2.setmodel(userModel2);

        System.out.println("The car 1 details: " + "Company name: " + c1.getmaker() + " The year model: " + c1.getmodel());
        System.out.println("The car 2 details: " + "Company name: " + c2.getmaker() + " Year model: " + c2.getmodel());

    }
}
