public class Exemplo06 {
    public static void main(String args[]) {
        double salBas, salGra, salNoImp, salImp, salFim;
        
        System.out.print("Qual o seu salário base?");
        salBas = Double.parseDouble(System.console().readLine());
        
        salGra = (salBas * 5) / 100;
        
        salNoImp = salBas + salGra;
                
        salImp =  (salNoImp * 7) / 100;
        
        salFim = salNoImp - salImp;
        
        System.out.printf("O seu salário final será: %.1f\n", salFim);
    
    }
}
