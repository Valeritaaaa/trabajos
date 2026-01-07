import java.util.Scanner;

public class BankApp{
    BankAccount cuenta; 
    public BankApp(BankAccount cuenta){
        this.cuenta = cuenta; 
    }

    public BankApp(){
        cuenta = new BankAccount(); 
    }

    String menuInteractivo(){
        Scanner sc = new Scanner(System.in);
        int eleccion = 0; 
        String opcines ="Menú\n"
                        + "1 = Depositar dinero" +" \n" 
                        + "2 = Depositar dinero" +" \n" 
                        + "3 = Depositar dinero" +" \n" 
                        + "4 Salir";
        System.out.println(opcines);
    
        while(eleccion != 4){
            eleccion = sc.nextInt();
            switch(eleccion){
            case 1:
                System.out.println("Depositar dinero");
                
            break; 
        }
        }
        
    }
        
    }
