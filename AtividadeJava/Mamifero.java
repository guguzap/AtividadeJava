package AtividadeJava;

class Mamifero{
    private float peso;
    private int idade;
    private String sexo;

    public Mamifero() {
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void exibirDetalhes() {
        System.out.println("\n Tipo de animal: Mamífero");
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }
}
