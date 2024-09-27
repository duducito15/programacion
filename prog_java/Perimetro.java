package prog_java;

public class Perimetro {
    public static void main(String[] args) {
        /*
         * Ejercicio 2: Una persona tiene un terreno campestre al cual desea construirle
         * una valla que lo rodee. Para saber cuánto debe gastar en los materiales, la
         * mejor forma de calcular la longitud de los alrededores del terreno es hallando el
         * perímetro. Debido a que el terreno tiene forma cuadrada, el perímetro se 
         * calculará multiplicando la longitud de un lado por cuatro.
         * Desarrolle un programa que reciba el valor del lado de un cuadrado y muestre
         * por pantalla el perímetro del mismo.
         */

        int lado, perimetro;
        // Entrada
        System.out.println("Ingrese el lado: ");
        lado = Integer.parseInt(System.console().readLine());

        // Proceso
        perimetro = lado * 4;

        // Salida
        System.out.println("El perimetro del terreno es: "+perimetro);
    }
}
