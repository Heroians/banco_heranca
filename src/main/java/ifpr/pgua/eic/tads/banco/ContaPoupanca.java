package ifpr.pgua.eic.tads.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, String numero, Pessoa cliente, double saldo, double txRendimento) {
        super(agencia, numero, cliente, saldo);
        this.txRendimento = txRendimento;
        //TODO Auto-generated constructor stub
    }

    private double rendimento;
    private double txRendimento;

    public void render() {
        rendimento = rendimento + (saldo * txRendimento);
    }

    public void setTxRendimento(double txRendimento) {
        this.txRendimento = txRendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public double getTxRendimento() {
        return txRendimento;
    }

    @Override
    public String gerarExtrato(){
        String texto = "";

        texto = super.gerarExtrato();

        texto += "Taxa de Rendimento: " + txRendimento + " Rendimentos: " +rendimento;

        return texto;
    }

    @Override
    public String tipo(){
        return "Conta Poupança";
    }

}
