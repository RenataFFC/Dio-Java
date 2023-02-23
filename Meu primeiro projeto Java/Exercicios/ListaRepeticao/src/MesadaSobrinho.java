
    import java.util.Scanner;

public class MesadaSobrinho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de meses que o sobrinho poupará o dinheiro: ");
        int meses = input.nextInt();

        int valorTotal = 50 * meses;

        System.out.println("O sobrinho terá um total de R$" + valorTotal + " após " + meses + " meses de poupança.");
    }
}


