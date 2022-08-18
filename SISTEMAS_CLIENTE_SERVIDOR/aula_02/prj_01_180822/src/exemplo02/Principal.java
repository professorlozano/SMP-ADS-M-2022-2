package exemplo02;

public class Principal {
    public static void main(String[] args) {
        Pessoa obj_pessoa1 = new Pessoa("A",38);
        
        //obj_pessoa1.nome = "Luiz";
        //obj_pessoa1.setNome("Jo");
        System.out.println(obj_pessoa1.getNome());
        
        //obj_pessoa1.idade = 18;
        //obj_pessoa1.setIdade(-1);
        System.out.println(obj_pessoa1.getIdade());
    }
}
