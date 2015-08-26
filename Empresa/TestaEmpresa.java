public class TestaEmpresa {
    public static void main (String [] args) {
        Empresa e = new Empresa();
        e.nome = "Caelum";
        e.cnpj = "11.111.111/0001-01";
        e.empregados = new Funcionario[10];
        
        for (int i = 0; i < 5; i++) {
            if (e.adiciona(new Funcionario ("Funcionário"+i,1000+i*200) )) {
                System.out.println("Adicionado com sucesso!");
            } else {
                System.out.println("Não tem mais vagas!");
            }
        }
        
        e.empregados[9] = new Funcionario("Wilson",5000);
        
        if (e.contem(new Funcionario("Wilson")))
            System.out.println("Funcionário bandido encontrado!");
        
        //System.out.println(e);
        System.out.println(e.mostraEmpregados());
        
    }
}
