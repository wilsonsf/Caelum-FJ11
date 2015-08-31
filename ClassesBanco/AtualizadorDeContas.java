public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Salto final: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }
    
    public double getSaldoTotal (){
        return this.saldoTotal;
    }
    
    public double getSelic() {
        return this.selic;
    }
}

class TestaAtualizadorDeContas {
    public static void main (String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
