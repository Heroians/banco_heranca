package ifpr.pgua.eic.tads.banco;

import java.util.ArrayList;

public class AppTest {

    public void name(String[] args) {
        
        ArrayList<Conta> contas = new ArrayList<>();
     
        Pessoa ze = new Pessoa("Ze", "0123", 25, 500);
        Pessoa chico = new Pessoa("Chico", "4567",35, 1000);

        ContaPoupanca poupanca = new ContaPoupanca("123", "009988", chico, 100, 0.05);
        ContaCorrente corrente = new ContaCorrente("123", "009988", chico, 0, 100);

        contas.add (poupanca);
        contas.add (corrente);

        System.out.println(contas.size());

        for(Conta c: contas){
            System.out.println(c.tipo());
        }

        for(Conta c: contas){
            if(c instanceof ContaPoupanca){
                ContaPoupanca var = (ContaPoupanca)c;
                    var.render();
                    System.out.println("Rendeu...");
            }else{
                System.out.println("Não rendeu...");
            }
        }



        System.out.println(poupanca.getRendimento());
        System.out.println(poupanca.getTxRendimento());
        
        String retPoupança = poupanca.sacar(200);
        String retContaCorrente = corrente.sacar(99);
        
    }
    
}
