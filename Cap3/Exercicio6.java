class Exercicio6 {
    public static void main (String [] args) {
        int anterior = 0, atual = 1, proximo = 0;
        System.out.print("Série de Fibonacci:\n" + anterior + ", " + atual);
        proximo = atual + anterior;
        do {
            System.out.print(", " + proximo);
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        } while (proximo <= 100);
        
        System.out.println();
    }
}
