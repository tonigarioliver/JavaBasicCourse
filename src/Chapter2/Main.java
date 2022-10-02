package Chapter2;

public class Main {
    public static void main(String[] args) {
        double price = getPrice();
        String saludo = obtenerSaludo("Juan","Gonzalez");
        System.out.println(saludo);

    }

    private static String obtenerSaludo(String nombre, String apellido) {
        return "Hola mi nombre es "+nombre + " y mi apellido es "+apellido;
    }

    private static double getPrice() {
        return 100.99;
    }
}
