public class Exemplo09 {
    public static void main(String args[]) {
        int N1, N2, Fin;
        
        System.out.println("Vamos ver a diferen�a entre dois numeros inteiros, e mostrar o resultado do maior para o menor.");
        System.out.print("Digite um numero inteiro: ");
        N1 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite outro numero inteiro: ");
        N2 = Integer.parseInt(System.console().readLine());
        
        if(N1 > N2){
            Fin = N1 - N2;
            System.out.printf("A diferen�a do �: %d\n", Fin);
        }
        if(N2 > N1){
            Fin = N2 - N1;
            System.out.printf("A diferen�a �: %d\n", Fin);
        }
        if(N1 == N2){
            Fin = 0;
            System.out.printf("Diferen�a iagual a: %d\n", Fin);
        }
        
    }
}
