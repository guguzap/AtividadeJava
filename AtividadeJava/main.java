package AtividadeJava;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximodemam = 5;
        Mamifero[] mamiferos = new Mamifero[maximodemam];
        int numMamiferos = 0;

        int maximodepess = 5;
        Pessoa[] pessoas = new Pessoa[maximodepess];
        int numPessoas = 0;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar animal de estimação (mamífero)");
            System.out.println("2. Criar pessoa");
            System.out.println("3. Mostrar animais (mamíferos) criados");
            System.out.println("4. Mostrar pessoas criadas");
            System.out.println("5. Sair");

            int num1a5 = scanner.nextInt();
            scanner.nextLine();

            if (num1a5 == 5) {
                System.out.println("Saindo do programa.");
                break;
            }

            switch (num1a5) {
                case 1:
                    if (numMamiferos < maximodemam) {
                        System.out.println("\n Qual tipo de mamífero que deseja criar:");
                        System.out.println("1. Cachorro");
                        System.out.println("2. Gato");
                        System.out.println("3. Macaco");

                        int tipoMamifero = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Peso: ");
                        float peso = scanner.nextFloat();
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Sexo: ");
                        String sexo = scanner.nextLine();

                        Mamifero mamifero = null;

                        if (tipoMamifero == 1) {
                            mamifero = new Cachorro();
                        } else if (tipoMamifero == 2) {
                            mamifero = new Gato();
                        } else if (tipoMamifero == 3) {
                            mamifero = new Macaco();
                        } else {
                            System.out.println("nao tem essa opçao");
                        }

                        if (mamifero != null) {
                            mamifero.setPeso(peso);
                            mamifero.setIdade(idade);
                            mamifero.setSexo(sexo);
                            mamiferos[numMamiferos] = mamifero;
                            numMamiferos++;
                            System.out.println("\n");
                            System.out.println("Mamífero Criado");
                            mamifero.exibirDetalhes();
                        }
                    } else {
                        System.out.println("chegou ao limite de mamiferos");
                    }
                    break;

                case 2:
                    System.out.println("\nEscolha o tipo de pessoa que deseja criar:");
                    System.out.println("1. Aluno");
                    System.out.println("2. Professora");
                    System.out.println("3. Diretor");
                    System.out.println("4. Secretaria");
                    System.out.println("5. Gerente");

                    int tipoPessoa = scanner.nextInt();
                    scanner.nextLine();

                    Pessoa pessoa = null;

                    if (tipoPessoa == 1) {
                        pessoa = new Aluno();

                        System.out.print("Nome: ");
                        String nomeAluno = scanner.nextLine();
                        pessoa.setNome(nomeAluno);

                        System.out.print("Idade: ");
                        int idadeAluno = scanner.nextInt();
                        scanner.nextLine();
                        pessoa.setIdade(idadeAluno);

                        System.out.print("Sexo: ");
                        String sexoAluno = scanner.nextLine();
                        pessoa.setSexo(sexoAluno);

                        System.out.print("Curso: ");
                        String cursoAluno = scanner.nextLine();
                        ((Aluno) pessoa).setCurso(cursoAluno);
                    } else if (tipoPessoa == 2) {
                        pessoa = new Professora();

                        System.out.print("Nome: ");
                        String nomeProfessora = scanner.nextLine();
                        pessoa.setNome(nomeProfessora);

                        System.out.print("Idade: ");
                        int idadeProfessora = scanner.nextInt();
                        scanner.nextLine();
                        pessoa.setIdade(idadeProfessora);

                        System.out.print("Sexo: ");
                        String sexoProfessora = scanner.nextLine();
                        pessoa.setSexo(sexoProfessora);

                        System.out.print("Disciplina: ");
                        String disciplinaProfessora = scanner.nextLine();
                        ((Professora) pessoa).setDisciplina(disciplinaProfessora);
                    } else if (tipoPessoa == 3) {
                        pessoa = new Diretor();

                        System.out.print("Nome: ");
                        String nomeDiretor = scanner.nextLine();
                        pessoa.setNome(nomeDiretor);

                        System.out.print("Idade: ");
                        int idadeDiretor = scanner.nextInt();
                        scanner.nextLine();
                        pessoa.setIdade(idadeDiretor);

                        System.out.print("Sexo: ");
                        String sexoDiretor = scanner.nextLine();
                        pessoa.setSexo(sexoDiretor);

                    } else if (tipoPessoa == 4) {
                        pessoa = new Secretaria();

                        System.out.print("Nome: ");
                        String nomeSecretaria = scanner.nextLine();
                        pessoa.setNome(nomeSecretaria);

                        System.out.print("Idade: ");
                        int idadeSecretaria = scanner.nextInt();
                        scanner.nextLine();
                        pessoa.setIdade(idadeSecretaria);

                        System.out.print("Sexo: ");
                        String sexoSecretaria = scanner.nextLine();
                        pessoa.setSexo(sexoSecretaria);

                    } else if (tipoPessoa == 6) {
                        pessoa = new Gerente();

                        System.out.print("Nome: ");
                        String nomeGerente = scanner.nextLine();
                        pessoa.setNome(nomeGerente);

                        System.out.print("Idade: ");
                        int idadeGerente = scanner.nextInt();
                        scanner.nextLine();
                        pessoa.setIdade(idadeGerente);

                        System.out.print("Sexo: ");
                        String sexoGerente = scanner.nextLine();
                        pessoa.setSexo(sexoGerente);
                    } else {
                        System.out.println("n existe");
                    }

                    if (pessoa != null) {
                        pessoas[numPessoas] = pessoa;
                        numPessoas++;

                        System.out.println("\n Pessoa Criada");
                        pessoa.exibirDetalhes();
                        System.out.println(" ");
                    }
                    break;

                case 3:
                    if (numMamiferos == 0) {
                        System.out.println("\nNenhum mamífero foi criado ainda.");
                    } else {
                        System.out.println("\nMamíferos Criados:");
                        for (int i = 0; i < numMamiferos; i++) {
                            Mamifero mamifero = mamiferos[i];
                            System.out.println("\n");
                            mamifero.exibirDetalhes();
                        }
                    }
                    break;

                case 4:
                    if (numPessoas == 0) {
                        System.out.println("\n Crie uma pessoa");
                    } else {
                        System.out.println("\n Pessoas que vc criou:");
                        for (int i = 0; i < numPessoas; i++) {
                            Pessoa p = pessoas[i];
                            System.out.println("\n");
                            p.exibirDetalhes();
                        }
                    }
                    break;

                default:
                    System.out.println("n existe");
            }
        }
        scanner.close();
    }
}
