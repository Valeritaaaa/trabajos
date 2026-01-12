package practica;
import java.util.Scanner;

public class EmailValidator {
    EmailValidator(){
        
    }
    public static boolean isEmailValid(String email){
    return email.contains("@") && email.contains(".");
    }
}
