public class Pruebas {
    String name;
    Pruebas(String name){
        name = name; 
    }

    public static void main(String[] args) {
        Pruebas p = new Pruebas("carlos");
        System.out.println(p.name);
    }
}
