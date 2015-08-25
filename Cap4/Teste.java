class Teste {
    public static void main (String [] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Wilson";
        f1.salario = 1000;
        
        f1.mostra();
        System.out.println("Ganho anual de " + f1.nome + ": " + f1.calculaGanhoAnual()); 
        
        System.out.println("\nDados atualizados!\n");
        f1.recebeAumento(500);
        f1.mostra();
        System.out.println("Novo ganho anual de " + f1.nome + ": " + f1.calculaGanhoAnual());
        
    }
}
