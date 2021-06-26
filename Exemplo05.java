public class Exemplo05 {
    public static void main(String[] args) {
        double Prec, Desc, RES;
        
        System.out.print("Qual o preço do produto? ");
        Prec = Double.parseDouble(System.console().readLine());
        Desc = (Prec * 10) / 100;
        RES = Prec - Desc;
        
        System.out.printf("O produto com 10%% de desconto fica: %.1f\n", RES);
    }
    
}