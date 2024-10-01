package Ej1;

public class InterfacesEj1main {

    public static void main(String[] args) {
        ReproductorMultimedia reproducir = new ReproductorMultimedia();

        reproducir.play();
        reproducir.play();

        System.out.println();

        reproducir.bucle();
        reproducir.bucle();
        
        System.out.println();
        
        reproducir.stop();
        reproducir.stop();
    }
}