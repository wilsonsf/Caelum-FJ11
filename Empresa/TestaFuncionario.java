public class TestaFuncionario {
    public static void main (String [] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Wilson");
        
        f1.setSalario(1000);
        
        //f1.mostra();
        System.out.println(f1);
        System.out.println("Ganho anual de " + f1.getNome() + ": " + f1.getGanhoAnual()); 
        
        f1.getDataDeEntrada().dia = 25;
        f1.getDataDeEntrada().mes = 8;
        f1.getDataDeEntrada().ano = 2015;
        f1.setAumento(500);
        f1.setDepartamento("Qualidade de Software");
        f1.setRG("1234567");
        
        System.out.println("\nDados atualizados!");
        
        //f1.mostra();
        System.out.println(f1);
        System.out.println("Novo ganho anual de " + f1.getNome() + ": " + f1.getGanhoAnual());
        
    }
}
