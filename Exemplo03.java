public class Exemplo03 {
    public static void main(String[] args) {
        double N1, N2, RES;
        
        System.out.print("Digite um n�mero: ");
        N1 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite outro n�mero: ");
        N2 = Double.parseDouble(System.console().readLine());
        
        RES = N1 / N2;
        
        System.out.printf("A divis�o resulta em: %.1f\n", RES);
    
}
}
