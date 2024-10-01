package Ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Ej2main {

    static Cronometro cronometro = new Cronometro();
    public static void main(String[] args) throws Exception {

        System.out.println("100 Elementos:");
        probarOrd(100);
        System.out.println("------------------------------------\n1000 Elementos: ");
        probarOrd(1000);
        System.out.println("------------------------------------\n10000 Elementos:");
        probarOrd(10000);
        System.out.println("------------------------------------\n100000 Elementos:");
        probarOrd(100000);
        System.out.println("------------------------------------");
    }

    public static void probarOrd(int tamaño){
        ArrayList<Integer> numeros = listaAleatoria(tamaño);
       
        cronometro.empezar();
        Collections.sort(numeros);
        cronometro.finalizar();

        System.out.println("Ordenar lista de: " + tamaño + " tomó " + cronometro.tiempoTranscurrido() + " milisegundos");
        cronometro.reset();
    }

    public static ArrayList<Integer> listaAleatoria(int tamaño){
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < tamaño; i++){
            lista.add(random.nextInt(10000));
        }

        return lista;
    }
}
