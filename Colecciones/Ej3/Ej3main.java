package Ej3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Ej3main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Producto> carrito = new ArrayList<>();
    
        String respuesta, nombreProducto;
        double precio;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el nombre del producto: ");
            nombreProducto = scanner.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            precio = verificarNum();
            
            carrito.add(new Producto(nombreProducto, precio));

            System.out.println("¿Desea seguir agregando mas productos? (si/no)");
            respuesta = scanner.nextLine();

            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("respuesta incorrecta, intente nuevamente");
                System.out.println("¿Desea seguir agregando mas productos? (si/no)");
                respuesta = scanner.nextLine();
            }

            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
        double total = calcularTotal(carrito);

        System.out.println("El precio total a pagar es: $" + total);
        scanner.close();

    }

    public static double calcularTotal(ArrayList<Producto> carrito) {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }

    public static double verificarNum() {
        
        double number = 0;
        boolean ingresado = false;
        while (!ingresado) {
            try {
                number = scanner.nextDouble();
                ingresado = true;
            } catch (InputMismatchException e) {
                System.out.println("El dato ingresado no es del tipo esperado, intente de nuevo");
            }finally{
                scanner.nextLine();
            }
        }
        
        return number;
    }


}
