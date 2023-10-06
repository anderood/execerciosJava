public class Principal {

    public static void main(String[] args){

        Aluno novoAluno = new Aluno();

        novoAluno.nome = "Anderson Santos";
        novoAluno.nota = 7.0;
        novoAluno.media = 6.0;
        novoAluno.disciplina = "Desenvolvimento";

        novoAluno.verificaAluno(novoAluno.nota, novoAluno.media);


    }
}
