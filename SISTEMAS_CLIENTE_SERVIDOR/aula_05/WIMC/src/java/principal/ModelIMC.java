package principal;

public class ModelIMC {
    private double peso, altura, imc;
    private String classificacao;

    public ModelIMC(double peso, double altura) {
        //this.peso = peso;
        //this.altura = altura;
        //this.imc = imc;
        this.setPeso(peso);
        this.setAltura(altura);
    }

    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
   
    public void calcularIMC(double peso,double altura)
    {
        this.setImc(peso/(altura*altura));
    }
    
    public void classificarIMC(double imc)
    {
        if (imc < 18.5)
            this.setClassificacao("Estado de Desnutrição");
        else if (imc < 25)
            this.setClassificacao("Peso Normal");
        else if (imc < 30)
            this.setClassificacao("Sobrepeso");
        else if (imc < 35)
            this.setClassificacao("Obesidade Nível I");
        else
            this.setClassificacao("Obesidade Nível II");
    }
    
}
