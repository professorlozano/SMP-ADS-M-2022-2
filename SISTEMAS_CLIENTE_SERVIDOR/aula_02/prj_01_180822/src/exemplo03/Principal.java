package exemplo03;

public class Principal {
    public static void main(String[] args) {
        Aluno obj_aluno = new Aluno("Luiz",-2,"597112");
        System.out.println(obj_aluno.getNome());
        System.out.println(obj_aluno.getIdade());
        System.out.println(obj_aluno.getRgm());
    }
}
