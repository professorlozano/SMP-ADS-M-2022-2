package exemplo06;

public class Vendedor extends Pessoa{

    private double comissao;

    public Vendedor(String nome, int idade, double salario, double comissao) {
        super(nome, idade, salario);
        //this.comissao = comissao;
        this.setComissao(comissao);
    }
    
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    @Override
    public void calcularSalario(){
        System.out.println("O salario total é: "
                +(this.getComissao() + this.getSalario()));
    }
    
}
