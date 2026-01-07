public class BankAccount {
    private String tituloCuenta;
    private int saldo; 
    
    public BankAccount(){
        tituloCuenta = ""; 
        saldo = 0; 
    }

    public BankAccount(String tituloCuenta, int saldo){
        this.tituloCuenta = tituloCuenta; 
        this.saldo = saldo; 
    }

    void depositarDinero(int dineroIngresado){
        if(dineroIngresado > 0){
            saldo+= dineroIngresado; 
        }
    }

    int retirarDinero(int montoParaRetirar){
        if(montoParaRetirar < saldo && saldo > montoParaRetirar){
            return montoParaRetirar;
        }else{
            return 0;
        }
    }

    int mostrarSaldo(){
        return saldo; 
    }
}
