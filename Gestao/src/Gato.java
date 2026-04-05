public class Gato extends Animal{
    private boolean domesticado;

    public Gato(String especie, int idade, boolean domesticado) {
        super(especie, idade);
        this.domesticado = domesticado;
    }

    public boolean isDomesticado() {
        return domesticado;
    }

    public void setDomesticado(boolean domesticado) {
        this.domesticado = domesticado;
    }

    public void emitirSom(){
        super.emitirSom();
        System.out.println("Miauu!");
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Domesticado: "+domesticado);
    }
}
