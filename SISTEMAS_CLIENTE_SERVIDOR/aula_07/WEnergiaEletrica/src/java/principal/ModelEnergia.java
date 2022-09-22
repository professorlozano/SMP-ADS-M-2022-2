package principal;

public class ModelEnergia {
    private double consumo, fornecimento, icms, cofins, pispasep, icmscofins, icmspispasep, fatura;

    public ModelEnergia(double consumo) {
        //this.consumo = consumo;
        this.setConsumo(consumo);
    }
    
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getFornecimento() {
        return fornecimento;
    }

    public void setFornecimento(double fornecimento) {
        this.fornecimento = fornecimento;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getCofins() {
        return cofins;
    }

    public void setCofins(double cofins) {
        this.cofins = cofins;
    }

    public double getPispasep() {
        return pispasep;
    }

    public void setPispasep(double pispasep) {
        this.pispasep = pispasep;
    }

    public double getIcmscofins() {
        return icmscofins;
    }

    public void setIcmscofins(double icmscofins) {
        this.icmscofins = icmscofins;
    }

    public double getIcmspispasep() {
        return icmspispasep;
    }

    public void setIcmspispasep(double icmspispasep) {
        this.icmspispasep = icmspispasep;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }
    
    public void calcularFornecimento(double consumo){
        this.setFornecimento(consumo * 0.28172);
    }
    
    public void calcularIcms(double consumo, double fornecimento){
        if (consumo <= 200)
            this.setIcms(fornecimento * 0.136363);
        else
            this.setIcms(fornecimento * 0.333333);  
    }
    
    public void calcularCofins(double consumo, double fornecimento){
        if (consumo <= 200)
            this.setCofins(fornecimento * 0.0614722);
        else
            this.setCofins(fornecimento * 0.0730751);  
    }
    
    public void calcularPisPasep(double consumo, double fornecimento){
        if (consumo <= 200)
            this.setPispasep(fornecimento * 0.013346);
        else
            this.setPispasep(fornecimento * 0.0158651);  
    }
    
    public void calcularIcmsCofins(double consumo, double fornecimento){
        if (consumo <= 200)
            this.setIcmscofins(fornecimento * 0.0614722 * 0.136363);
        else
            this.setIcmscofins(fornecimento * 0.0730751 * 0.333333);  
    }
    
    public void calcularIcmsPisPasep(double consumo, double fornecimento){
        if (consumo <= 200)
            this.setIcmspispasep(fornecimento * 0.013346 * 0.136363);
        else
            this.setIcmspispasep(fornecimento * 0.0158651 * 0.333333);  
    }
    
    public void calcularFatura(double fornecimento, double icms, double cofins, double pispasep, 
            double icmscofins, double icmspispasep){
        this.setFatura(fornecimento + icms + cofins + pispasep + icmscofins + icmspispasep);
    }
    
}


