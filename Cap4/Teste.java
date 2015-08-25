class Teste {
    public static void main (String [] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Wilson";
        f1.salario = 1000;
        
        System.out.println("Salário atual de " + f1.nome + ": " + f1.salario);
        System.out.println("Ganho anual de " + f1.nome + ": " + f1.calculaGanhoAnual()); 
        
        
        f1.recebeAumento(500);
        System.out.println("Salário atual de " + f1.nome + ": " + f1.salario);
        System.out.println("Novo ganho anual de " + f1.nome + ": " + f1.calculaGanhoAnual());
    }
}
