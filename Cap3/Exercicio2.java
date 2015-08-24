class Exercicio2 {
    public static void main (String [] args) {
        int soma = 0;
        int n = 1;
        do {
            soma += n;
            n++;
        } while(n <= 1000); // (1 + 1000) * 1000/2
        System.out.println("Soma dos números de 1 até 1000: " + soma);
    }
}
