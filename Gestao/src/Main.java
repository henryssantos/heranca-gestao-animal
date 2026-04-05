public class Main{
    public static void main(String[] args){

        Gato gato = new Gato("Felino", 3, true );
        Cachorro cachorro = new Cachorro("Canino", 3, "Pitbull");

        System.out.println("=== Gato ===");
        gato.exibirInfo();
        gato.emitirSom();

        System.out.println("=== Cachorro ===");
        cachorro.exibirInfo();
        cachorro.emitirSom();

    }
}