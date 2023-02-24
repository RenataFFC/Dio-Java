import java.util.Scanner;

public class LojaDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do dinheiro");
        int dinheiro = leitor.nextInt();
        int total =  dinheiro * 2;
        System.out.println("O cliente obteve " + total +  " Doces");
    }
}