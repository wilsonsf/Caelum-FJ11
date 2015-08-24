class Exercicio3 {
    public static void main (String [] args) {
        int n = 1;
        System.out.println("Múltimos de 3 entre 1 e 1000:");
        while (n <= 1000) {
            if (n%(3*10) == 0)
                System.out.println();
            if (n%3 == 0)
                System.out.print(n+"\t");
            n++;
        }
        System.out.println();
    }
}
