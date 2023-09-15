package AtividadeJava;

class Gerente extends Pessoa {
    public Gerente() {
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de funcionário: Gerente");
    }
}
