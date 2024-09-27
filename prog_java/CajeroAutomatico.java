package prog_java;

public class CajeroAutomatico {
    public static void main(String[] args) {
        /*
         * Un cajero automatico entrega dinero a retirar en billetes de 50, 20 y 10 soles, 
         * construya un programa que calcule la cantidad de billetes de cada valor que el 
         * cajero debe entregar al usuario segun el valor a retirar ingresado por teclado. 
         * Asuma que el usuario asigna siempre un valor a retirar permitido.
         */
        // Declaracion de variables
        int monto, billetes50, billetes20, billetes10;
        // Entrada
        System.out.println("Ingrese el monto: ");
        monto = Integer.parseInt(System.console().readLine());

        // Proceso
        billetes50 = monto / 50;
        monto = monto % 50;

        billetes20 = monto / 20;
        monto = monto % 20;

        billetes10 = monto / 10;
        monto = monto % 10;

        // Salida
        System.out.println("billetes de 50 soles: " + billetes50);
        System.out.println("billetes de 20 soles: " + billetes20);
        System.out.println("billetes de 10 soles: " + billetes10);
    }
}
