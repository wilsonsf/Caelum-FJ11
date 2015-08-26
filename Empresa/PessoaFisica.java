public class PessoaFisica {
    protected String cpf;
    
    private PessoaFisica(String cpf) {
        if (valida(cpf))
            this.cpf = cpf;
        // else 
        //     throw Exception
    }
    
    public boolean valida(String cpf) {
        //Varios testes
        return true;
        // else
        // return false;
    }
}
