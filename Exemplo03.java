public class Exemplo03 {
    public static void main(String[] args) {
        double N1, N2, RES;
        
        System.out.print("Digite um número: ");
        N1 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite outro número: ");
        N2 = Double.parseDouble(System.console().readLine());
        
        RES = N1 / N2;
        
        System.out.printf("A divisão resulta em: %.1f\n", RES);
    
}
}
