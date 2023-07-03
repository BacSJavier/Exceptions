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
        for (int i =1 ; i < 5; i++){
            try{
            int num= i / 0;
            System.out.println(num);
            }catch(ArithmeticException exception){
                System.out.println("A ocurrido una exception aritmetica , el problema fue "+exception.getMessage());
                exception.printStackTrace();
            }
        System.out.println("Fin del metodo 2");
    }
}
}
