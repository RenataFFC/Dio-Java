import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a velocidade");
        int velocidadeAtual = leitor.nextInt();
        if (velocidadeAtual >= 60) {
            System.out.println("Foi multado");
        } else {
            System.out.println("Não foi multado");
        }

        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com
        // a entrada, foi multado ou não.

    }
}