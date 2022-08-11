package exemplo03;

public class Aluno extends Pessoa {
    private String rgm;

    public Aluno(String argNome, int argIdade,String argRgm) {
        super(argNome, argIdade);
        //this.rgm = rgm;
        this.setRgm(argRgm);
    }

    
    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    
    
}
