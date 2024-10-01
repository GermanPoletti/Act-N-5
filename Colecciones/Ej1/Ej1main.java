package Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ej1main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

    
        for(int i = 0; i < 1000; i++){
            numeros.add(random.nextInt(1000));
        }

        int maxValor = Collections.max(numeros);
        int minValor = Collections.min(numeros);
        int posMax = numeros.indexOf(maxValor);
        int posMin = numeros.indexOf(minValor);

        System.out.printf("Numero mas alto: %d, y su posición es: %d \n", maxValor, posMax);
        System.out.printf("Numero mas bajo: %d, y su posición es: %d \n", minValor, posMin);
        

    }
}
