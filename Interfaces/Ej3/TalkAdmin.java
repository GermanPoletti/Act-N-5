package Ej3;

public class TalkAdmin {
    public static void main(String[] args) {
        separador();
        Gato gato = new Gato();
        System.out.println("Gato:");
        hacerHablarAnimal(gato);
        separador();

        Perro perro = new Perro();
        System.out.println("Perro:");
        hacerHablarAnimal(perro);
        separador();
        
        RelojCucu relojCucu = new RelojCucu();
        System.out.println("Reloj CuCu:");
        relojCucu.hablar();
        separador();
    }

    public static void hacerHablarAnimal(Animal animal){
        animal.hablar();
    }

    static void separador(){
        System.out.println("----------------------------------------\n");
    }
}
