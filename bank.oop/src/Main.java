public class Main{
    public static void main (String []args){
        BankAccount cuenta = new BankAccount();
        cuenta.setSaldo(1000);

        System.out.println("Su saldo inicial es de: $" + cuenta.mostrarSaldo());
        BankApp bankApp = new BankApp(cuenta);
        bankApp.menuInteractivo();
    }
}