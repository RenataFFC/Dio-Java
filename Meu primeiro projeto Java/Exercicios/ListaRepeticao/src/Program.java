import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de meses: ");
        int entrada = leitor.nextInt();
        int mesada = 50;

        int valorFinal = mesada * entrada;

        System.out.println("O voce tera " + valorFinal + " reais");
    }
}

