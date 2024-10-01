package Ej2;

public class Cronometro {
    private long tiempoInicio;
    private long tiempoFin;

    public void empezar(){
        tiempoInicio = System.currentTimeMillis();
    }

    public void finalizar(){
        tiempoFin = System.currentTimeMillis();
    }

    public void reset(){
        tiempoInicio = 0;
        tiempoFin = 0;
    }

    public long tiempoTranscurrido(){
        return tiempoFin - tiempoInicio;
    }
}
