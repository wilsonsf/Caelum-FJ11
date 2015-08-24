class BalancoTrimestral {
    public static void main (String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        
        System.out.println("Gastos do trimestre: " + gastosTrimestre);
        
        double mediaMensal = ((double) gastosTrimestre) /3d;
        System.out.println("Média de gastos por mês: " + mediaMensal);
    }
}
