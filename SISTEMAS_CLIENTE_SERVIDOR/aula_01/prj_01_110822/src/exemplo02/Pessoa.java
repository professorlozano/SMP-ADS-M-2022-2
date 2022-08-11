package exemplo02;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String argNome, int argIdade) {
        //this.nome = argNome;
        //this.idade = argIdade;
        this.setNome(argNome);
        this.setIdade(argIdade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String argNome) {
        if(argNome.length() >= 2){
            this.nome = argNome;
        }
        else{
            System.out.println("Nome deve ter 2 ou mais caracteres");
        }  
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int argIdade) {
        if(argIdade >= 0 && argIdade <120){
            this.idade = argIdade;
        } 
        else{
            System.out.println("Idade deve estar entre 0 e 120");
        }      
    }
    
    
    
}
