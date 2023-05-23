package ifpr.pgua.eic.tads.banco;

public class ContaCorrente extends Conta {
    
    private double limite;

    public ContaCorrente(String agencia, String numero, Pessoa cliente, double saldo, double limite) {
        super(agencia, numero, cliente, saldo);
        this.limite = limite;
        //TODO Auto-generated constructor stub
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getLimite() {
        return limite;
    }


    @Override
    public String sacar(double valor){
        if(valor < 0){
            return "Valor Inválido";
        }
        if(valor > saldo + limite){
            return "Saldo Insuficiente";
        }
        
        saldo = saldo - valor;
        return "Saque Realizado;";

    }
    
    @Override
    public String tipo(){
        return "Conta Corrente";
    }

}
