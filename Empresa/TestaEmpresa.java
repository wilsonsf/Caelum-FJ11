public class TestaEmpresa {
    public static void main (String [] args) {
        Empresa e = new Empresa(10);
        // e.empregados = new Funcionario[10];
        e.setNome("Caelum");
        e.setCNPJ("11.111.111/0001-01");

        
        for (int i = 0; i < 5; i++) {
            if (e.setEmpregado(new Funcionario ("Funcionário"+i,1000+i*200))) {
                System.out.println("Adicionado com sucesso!");
            } else {
                System.out.println("Não tem mais vagas!");
                break;
            }
        }
        
        e.setEmpregado(new Funcionario("Wilson",5000),9);
        
        if (e.contem(new Funcionario("Wilson")))
            System.out.println("Funcionário bandido encontrado!");
        
        System.out.println(e);
        // System.out.println(e.mostraEmpregados());
        
    }
}
