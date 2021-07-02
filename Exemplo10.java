public class Exemplo10 {
    public static void main(String args[]) {
        int N1;
        
        System.out.print("Insira um valor: ");
        N1 = Integer.parseInt(System.console().readLine());
        
        if(  N1 >= 1 && N1 <= 9 )
            System.out.printf("O valor está na faixa permitida");
        else 
            System.out.printf("O valor está fora da faixa permitida");
    }
        
}

