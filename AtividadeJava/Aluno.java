package AtividadeJava;

class Aluno extends Pessoa {
    private String curso;

    public Aluno() {
    }

    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de pessoa: Aluno");
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }
}