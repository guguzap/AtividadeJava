package AtividadeJava;

class Professora extends Pessoa {
    private String disciplina;

    public Professora() {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de pessoa: Professora");
        System.out.println("Disciplina: " + getDisciplina());
    }
}
