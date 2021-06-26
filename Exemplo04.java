public class Exemplo04 {
    public static void main(String[] args) {
      double N1, N2, N3, RES;
      
      System.out.print("Digite a primeira nota: ");
      N1 = Double.parseDouble(System.console().readLine());
      System.out.print("Digite segunta nota: ");
      N2 = Double.parseDouble(System.console().readLine());
      System.out.print("Digite terceira nota: ");
      N3 = Double.parseDouble(System.console().readLine());
      
      RES = (N1+N2+N3) / 3;
      
      System.out.printf("Sua média é: %.1f\n", RES);
      
    }
}
