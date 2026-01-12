package practica;
import java.util.Scanner;
public class RecuperCuenta{
    private EmailValidator validator = new EmailValidator();

    public void recover() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el email ");
        String email = scanner.nextLine();

        if (validator.isEmailValid(email)) {
            System.out.println("cuanta creada");
        } else {
            System.out.println("Invalido");
        }
    }

}
