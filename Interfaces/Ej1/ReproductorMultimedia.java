package Ej1;

public class ReproductorMultimedia implements VideoClip {

    boolean reproduciendo, enBucle;

    public ReproductorMultimedia() {
        this.reproduciendo = false;
        this.enBucle = false;
    }


    @Override
    public void play(){
        if (!reproduciendo) {
            System.out.println("Se ha iniciado la reproducción del video");
            reproduciendo = true;
        } else{
            System.out.println("El video ya se está reproduciendo");
        }
    }
    
    
    @Override
    public void bucle(){
        if (!enBucle) {
            System.out.println("Reproduccion en bucle: ON");
            enBucle = true;
        }else{
            System.out.println("Reproduccion en bucle: OFF");
            enBucle = false;
        }

    }
    
    
    @Override
    public void stop(){
        if (reproduciendo) {
            System.out.println("Se ha detenido el video");
            reproduciendo = false;
        }else{
            System.out.println("El video ya está detenido");
        }
    }
    

}