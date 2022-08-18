package exemplo06;

public class Principal {
    //psvm + tab para criar metodo main
    public static void main(String[] args) {
        Vendedor obj_vendedor = new Vendedor("Luiz",38,1000,200);
        //System.out.println(obj_vendedor.getNome());
        //System.out.println(obj_vendedor.getIdade());
        //System.out.println(obj_vendedor.getSalario());
        //System.out.println(obj_vendedor.getComissao());
        obj_vendedor.calcularSalario();
    }
}
