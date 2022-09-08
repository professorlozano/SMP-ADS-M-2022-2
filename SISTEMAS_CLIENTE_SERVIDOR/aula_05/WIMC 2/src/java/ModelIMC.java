public class ModelIMC {
    private double peso;
    private double altura;

    public ModelIMC(double peso, double altura) {
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
    
    public double calcularIMC(double argPeso, double argAltura){
        double resultado = argPeso / (argAltura * argAltura);
        return resultado;
    }
    
    public String classificarIMC(double argIMC){
        String classificacao;
        if(argIMC < 18.5){
            classificacao = "Desnutrição";
        }
        else if(argIMC < 24.99){
            classificacao = "Peso Normal";
        }
        else if(argIMC < 29.99){
            classificacao = "Sobrepeso";
        }
        else if(argIMC < 34.99){
            classificacao = "Obesidade I";
        }
        else if(argIMC < 39.99){
            classificacao = "Obesidade II";
        }
        else{
            classificacao = "Obesidade III";
        }
        return classificacao;
    }
}
