package Business;

import Basic.Agenda;

public class Inserir {
    public Agenda InserirAgenda(String contato, String telefone){
       Agenda agenda = new Agenda (contato,telefone);
       return agenda;
    }
}
