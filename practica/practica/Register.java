package practica;
import java.util.Scanner;
public class Register {
    private EmailValidator validator = new EmailValidator();

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email to register: ");
        String email = scanner.nextLine();

        if (validator.isEmailValid(email)) {
            System.out.println("Successfully registered!");
        } else {
            System.out.println("Invalid email format.");
        }
    }
}
