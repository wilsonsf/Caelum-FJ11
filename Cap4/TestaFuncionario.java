public class TestaFuncionario {
    public static void main (String [] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Wilson";
        f1.salario = 1000;
        // f1.dataDeEntrada = new Data ();
        
        //f1.mostra();
        System.out.println(f1);
        System.out.println("Ganho anual de " + f1.nome + ": " + f1.calculaGanhoAnual()); 
        
        f1.dataDeEntrada.dia = 25;
        f1.dataDeEntrada.mes = 8;
        f1.dataDeEntrada.ano = 2015;
        f1.recebeAumento(500);
        
        System.out.println("\nDados atualizados!\n");
        
        //f1.mostra();
        System.out.println(f1);
        System.out.println("Novo ganho anual de " + f1.nome + ": " + f1.calculaGanhoAnual());
        
    }
}
