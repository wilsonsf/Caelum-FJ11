public class ContaPoupanca extends Conta {
    
    public void deposita(double valor) {
        this.saldo += valor - 0.1;
    }
    
    public void atualiza(double taxa) {
        this.saldo += this.saldo * 3 * taxa;
    }
}

class TestaContaPoupanca {
    public static void main (String [] args) {
    
    }
}
