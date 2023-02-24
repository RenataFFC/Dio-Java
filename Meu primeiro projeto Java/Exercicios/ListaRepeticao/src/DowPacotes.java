import java.util.Scanner;

public class DowPacotes {
   

 public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       System.out.println("Digite o tamanho do pacote em MB:");
        int tamanho = leitor.nextInt();
         double barra =   tamanho /10;
      for (int i = 0; i < tamanho; i++){
        System.out.print("/");
      }
      leitor.close();
    }
}



        