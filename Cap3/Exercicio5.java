class Exercicio5 {
    public static void main (String [] args) {
        double fatorial = 1;
        for (int n = 1; n <= 30; n++) {
            fatorial *= n;
            System.out.println("Fatorial de ("+n+") : " + fatorial);
        }
    }
}
