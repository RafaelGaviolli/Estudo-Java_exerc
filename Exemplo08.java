public class Exemplo08{
    public static void main(String[] args){
        char conceito;
        
        System.out.print("Conceito do aluno: ");
        
        conceito = System.console().readLine().charAt(0);
        
        if ( conceito!='A' && conceito!='B' && conceito!='C')
            System.out.print("Conceito inválido!");
        if (conceito=='A' || conceito=='B')
            System.out.print("Aprovado!");
        if (conceito=='C')
            System.out.print("Reprovado!");
    }
}