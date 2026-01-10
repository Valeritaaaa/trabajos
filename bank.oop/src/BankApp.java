import java.util.Scanner;

public class BankApp{
    BankAccount cuenta; 
    public BankApp(BankAccount cuenta){
        this.cuenta = cuenta; 
    }

    public BankApp(){
        cuenta = new BankAccount(); 
    }

    void menuInteractivo(){
        Scanner sc = new Scanner(System.in);
        int eleccion = 0; 
        String opcines ="Menú\n"
                        + "1 = Depositar dinero" +" \n" 
                        + "2 = Retirar dinero" +" \n" 
                        + "3 = Mostrar saldo" +" \n" 
                        + "4 Salir";
        System.out.println(opcines);
    
        while(eleccion != 4){
            System.out.println("Selecciona un opccion");
            eleccion = sc.nextInt();
            switch(eleccion){
            case 1:
                System.out.println("Depositar dinero");
                int deposito = sc.nextInt();
                cuenta.depositarDinero(deposito);
            break; 

            case 2:
                System.out.println("Retirar dinero");
                int montoParaRetirar = sc.nextInt();
                cuenta.retirarDinero(montoParaRetirar);
                
            break; 

            case 3:
                System.out.println("Mostrar saldo");
                cuenta.mostrarSaldo();
            break; 

            case 4:
                System.out.println("Saliendo...");
                
            break; 

            default:
                System.out.println("Opccion invalida"); 
         }
        }
        sc.close();
        
    }
        
    }
