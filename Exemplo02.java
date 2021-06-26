
public class Exemplo02 {
    public static void main(String[] args) {
        double N1, N2, RES;
        
        System.out.print("Digite um numero: ");
        N1 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite outro numero: ");
        N2 = Double.parseDouble(System.console().readLine());
        
        RES = N1 - N2;
        
        System.out.printf("A subtração dos números é: %.1f\n",RES);       
    }
}
