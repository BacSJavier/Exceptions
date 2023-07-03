public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicio del maain");
        metodo();
        System.out.println("Fin del main");
    }
    public static void metodo() {
        System.out.println("Inicio del metodo 1");
        metodo2();
        System.out.println("Fin del metodo 1");
    }
    public static void metodo2() {
        System.out.println("Inicio del metodo 2");
        for (int i =0 ; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("Fin del metodo 2");
    }
    
}
