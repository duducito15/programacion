package prog_java;

public class Impuestos {
    public static void main(String[] args) {
        /*
         * Ejemplo 2: Impuestos
         * En una empresa, los trabajadores con un sueldo superior a $3000 
         * deben pagar impuestos. Diseñe un programa que tome el sueldo de 
         * la persona y determine si debe o no abonar. 
         */
        int sueldo;

        System.out.println("Ingrese el sueldo de la persona: ");
        sueldo = Integer.parseInt(System.console().readLine());

        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos");
        } else {
            System.out.println("No paga impuestos");
        }
    }
}
