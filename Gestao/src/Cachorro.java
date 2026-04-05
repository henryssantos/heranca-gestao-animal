public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String especie, int idade, String raca) {
        super(especie, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void emitirSom(){
        super.emitirSom();
        System.out.println("Au au au!");
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Raça: "+raca);
    }
}
