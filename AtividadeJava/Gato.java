package AtividadeJava;

class Gato extends Mamifero {

    public Gato() {
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de mamífero: Gato");
    }
}