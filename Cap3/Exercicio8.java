class Exercicio8 {
    public static void main (String [] args) {
        int n = 10;
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print((x * y) + " ");
            }
            System.out.println();
        }
    }
}
