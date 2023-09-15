package AtividadeJava;

class Cachorro extends Mamifero {

    public Cachorro() {
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de mamífero: Cachorro");
    }
}