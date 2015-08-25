public class TestaEmpresa {
    public static void main (String [] args) {
        Empresa e = new Empresa();
        e.nome = "Caelum";
        e.cnpj = "11.111.111/0001-01";
        e.empregados = new Funcionario[10];
        
        for (int i = 0; i < 5; i++) {
            if (e.adiciona(new Funcionario ("Func"+i,1000+i*200) )) {
                System.out.println("Adicionado com sucesso!");
            } else {
                System.out.println("Não tem mais vagas!");
            }
        }
        
        System.out.println(e);
    }
}
