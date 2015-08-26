public class Conta {
    private double saldo;
    
    
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
    
    // getters & setters
    public double getSaldo() {
        return this.saldo;
    }
    
    /*
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    */
}
