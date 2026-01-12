package practica;
public class Person {
    private String name; 
    private EmailService emailService;

    Person(){

    }
    /*Person(String name){
        this.name = name;
        this.emailService = emailService;
        Alto acoplamiento
    } */
    Person(EmailService emailService){
        this.emailService = emailService;
    }

    public void notifyPerson(){
        emailService.sendEmail("Hello my name is: " + name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name; 
    }
}
