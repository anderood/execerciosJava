public class Aluno {

    String nome;
    Double nota;
    Double media;
    String disciplina;

    void verificaAluno( double nota, double media){

        if( nota >= media ){

            System.out.println(
                    "O Aluno:" + nome + "\n"
                    + "Com nota: " + nota + "\n"
                    + "Com media: " + media + "\n"
                    + "Na Disciplina: " + disciplina
            );
            System.out.println("O Aluno Foi Aprovado");
        }else {
            System.out.println(
                    "O Aluno:" + nome + "\n"
                            + "Com nota: " + nota + "\n"
                            + "Com media: " + media + "\n"
                            + "Na Disciplina: " + disciplina
            );
            System.out.println("O Aluno Foi Reprovado");
        }
    }
}
