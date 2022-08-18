package exemplo01;

public class Principal {
    public static void main(String[] args) {
        Pessoa obj_pessoa1 = new Pessoa();
        
        //obj_pessoa1.nome = "Luiz";
        obj_pessoa1.setNome("Jo");
        System.out.println(obj_pessoa1.getNome());
        
        //obj_pessoa1.idade = 18;
        obj_pessoa1.setIdade(18);
        System.out.println(obj_pessoa1.getIdade());
    }
}
