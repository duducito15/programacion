package prog_java;

public class Mayor {
    public static void main(String[] args) {
        /*
         * Ejemplo 3:   Número mayor
         * En una oficina con más de 100 empleados desean saber, por cada pareja posible, 
         * cuál persona tiene un salario más alto que la otra. Se le pide diseñar un programa
         * que pida por teclado dos números diferentes y determine cuál es el mayor entre los dos.
         */

         int numero1, numero2;

         System.out.println("Ingrese el primer numero: ");
         numero1 = Integer.parseInt(System.console().readLine());

         System.out.println("Ingrese el primer numero: ");
         numero2 = Integer.parseInt(System.console().readLine());

         if (numero1 > numero2) {
            System.out.println("El numero"+ numero1+ " es el mayor");
         }else{
            System.out.println("El numero"+ numero2+ " es el mayor");
         }
    }
}
