public class ContaCorrente extends Conta {
    
    public void atualiza(double taxa) {
        this.saldo += this.saldo * 2 * taxa;
    }
    
    public void deposita(double valor) {
        this.saldo += valor - 0.1;
    }
}

class TestaContaCorrente {
    public static void main (String [] args) {
    
    }
}
