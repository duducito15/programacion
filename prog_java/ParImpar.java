package prog_java;

public class ParImpar {
    public static void main(String[] args) {
        /*
         * Ejemplo: Par o Impar
         * Se puede determinar que un número es par cuando al dividirlo por 2 su residuo
         * es 0. En el caso en que el residuo fuera 1, se sabría que el número es impar.
         * Diseñe un programa que reciba un número entero del usuario y determine si es par o no.
         */

        // Declarar las variables
        int numero;

        // Entrada
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(System.console().readLine());

        //Proceso
        if (numero % 2 == 0) {
            //Salida
            System.out.println("El numero ingresado es Par");
        }else{
            //Salida
            System.out.println("El numero ingresado es Impar");
        }

    }
}
