import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

            System.out.println("Nota Inválida! Digite Novamente: ");
            nota = scan.nextInt();
        }
    }


