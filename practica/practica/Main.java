package practica;
public class Main {
    public static void main(String[] args) {
        Register registro = new Register();
        RecuperCuenta recuperacion = new RecuperCuenta();
        registro.register();
        recuperacion.recover();

    }
}
