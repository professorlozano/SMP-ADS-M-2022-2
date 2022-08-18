package exemplo04;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        //this.nome = nome;
        //this.idade = idade;
        //this.salario = salario;
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0)
            this.salario = salario;
        else
            System.out.println("Salario menor ou igual a 0");
    }
    
    public void calcularSalario(){
        System.out.println("O salario total é: "+this.getSalario());
    }
}
