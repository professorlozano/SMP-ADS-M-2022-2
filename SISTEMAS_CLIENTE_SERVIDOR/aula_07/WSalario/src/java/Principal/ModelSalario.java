package Principal;

public class ModelSalario {
    private double salBruto;

    public ModelSalario(double salBruto) {
        //this.salBruto = salBruto;
        this.setSalBruto(salBruto);
    }

    public double getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(double salBruto) {
        if(salBruto > 0){
            this.salBruto = salBruto;
        }
        else
        {
            System.out.println("Salário Bruto deve ser maior que zero!!!");
        }  
    }
    
    public double calcularFgts(double argSalBruto){
        double retorno;
        retorno = (argSalBruto * 8)/100;
        return retorno;
    }
    
    public double calcularInss(double argSalBruto){
        double retorno;
        if(argSalBruto <= 1045){
            retorno = (argSalBruto * 7.5)/100;
        }
        else if(argSalBruto <= 2089.60){
            retorno = (argSalBruto * 9)/100;
        }
        else if(argSalBruto <= 3134.40){
            retorno = (argSalBruto * 12)/100;
        }
        else if(argSalBruto <= 6106.06){
            retorno = (argSalBruto * 14)/100;
        }
        else{
            retorno = (6106.06 * 14)/100;
        }
        return retorno;
    }
    
    public double calcularIr(double argSalBruto){
        double retorno;
        if(argSalBruto <= 1903.98){
            retorno = 0;
        }
        else if(argSalBruto <= 2826.65){
            retorno = ((argSalBruto * 7.5)/100) - 142.8;
        }
        else if(argSalBruto <= 3751.05){
            retorno = ((argSalBruto * 15)/100) - 354.8;
        }
        else if(argSalBruto <= 4664.68){
            retorno = ((argSalBruto * 22.5)/100) - 636.13;
        }
        else{
            retorno = ((argSalBruto * 27.5)/100) - 869.36;
        }
        return retorno;
    }
    
    public double calcularSalarioLiquido(double argSalBruto, double argInss, double argIr){
        double retorno;
        retorno = argSalBruto - (argInss + argIr);
        return retorno;
    }
}


