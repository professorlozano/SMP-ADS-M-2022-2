package exemplo05;

public class OperadorCaixa extends Pessoa {
    private double bonus;

    public OperadorCaixa(double bonus, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }
    
    @Override
    public void calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
