import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Numero :");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior)
                maior = numero;

            count++;

        } while (count < 5);

        System.out.println("Maior Numero é :" + maior);
  System.out.println("Média é :" + (soma / 5));
    }

}
