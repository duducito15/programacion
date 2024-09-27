package prog_java;

public class AreaRectangulo {
    public static void main(String[] args) {
        /*
         * base y altura
         * area del rectangulo
         */
        //Declarar las variables
        int base, altura, areaRectangulo;
        
        //Entrada
        System.out.println("Ingrese la base: ");
        base = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la altura: ");
        altura = Integer.parseInt(System.console().readLine());

        //Proceso
        areaRectangulo = base * altura;

        //Salida
        System.out.println("El area del rectangulo es: "+areaRectangulo);
    }
}
