public class Person {
    private String name; 
    private String email; 
    private EmailService emailService;

    Person(){

    }
    /*Person(String name){
        this.name = name;
        this.emailService = emailService;
        Alto acoplamiento
    } */
    Person(emailService emailService){
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
