class Funcionario extends Object {
    String  nome,
            departamento,
            rg;
    double  salario;
    Data dataDeEntrada;
    
    void recebeAumento(double valor) {
        this.salario += valor;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }
    
    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Entrada: " + this.dataDeEntrada.formatada());
        System.out.println("RG: " + this.rg);
        System.out.println("Salário: " + this.salario);
    }   
    

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nNome: " + this.nome)
           .append("\nDepartamento: " + this.departamento)
           .append("\nData de Entrada: " + this.dataDeEntrada)
           .append("\nRG: " + this.rg)
           .append("\nSalário: " + this.salario);
        
        return str.toString();
    }
}

class Data {
    int dia, 
        mes, 
        ano;
        
    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
