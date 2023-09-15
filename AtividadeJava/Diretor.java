package AtividadeJava;

class Diretor extends Pessoa {
    public Diretor() {
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de funcionário: Diretor");
    }
}
