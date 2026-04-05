public class Animal {
    private String especie;
    private int idade;

    public Animal(){}

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("O animal fez um som..");
    }

    public void exibirInfo(){
        System.out.println("Especie: "+especie);
        System.out.println("Idade: "+idade);
    }

}
