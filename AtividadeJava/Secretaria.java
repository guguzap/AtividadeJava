package AtividadeJava;

class Secretaria extends Pessoa {
    public Secretaria() {
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de funcionário: Secretaria");
    }
}
