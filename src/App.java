public class App {
    public static void main(String[] args) throws Exception {
        double x = 1.5;
        System.out.println("Tabela de multiplicação de " + x);

        for (double i = 0; i <= 10; i++){
            double numeroMultiplicado = x * i;
            System.out.println(numeroMultiplicado);
        }

    }
}
