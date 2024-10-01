/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Interfaz2main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Pasajero pasajero = new Pasajero (1578, new Date());
        Vehiculo vehiculo = new Vehiculo (15000 , new Date());
        
        System.out.println("Pasajero: ");
        System.out.println("Millas acumuladas: " + pasajero.millasAcumuladas());
        System.out.println("Último viaje: " + format.format(vehiculo.ultimoViajeRealizado()));

        
        System.out.println("\nVehículo: ");
        System.out.println("Millas recorridas: " + vehiculo.millasAcumuladas());
        System.out.println("Último viaje: " + format.format(vehiculo.ultimoViajeRealizado()));
    }
    
}
