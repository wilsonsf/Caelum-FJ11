public class PessoaFisica {
    private String cpf;
    
    private PessoaFisica(String cpf) {
        if (valida(cpf))
            this.cpf = cpf;
        // else 
        //     throw Exception
    }
    
    boolean valida(String cpf) {
        //Varios testes
        return true;
        // else
        // return false;
    }
}
