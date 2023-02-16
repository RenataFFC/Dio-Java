
import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

int qtdeNumeros;
int numero;
int qtdePares = 0, qtdeImpares=0;

System.out.println("Qual a qtde de nu12meros: ");
qtdeNumeros = scan.nextInt();

int count = 0 ;

do{
 System.out.println("Número: ");
numero = scan.nextInt();

if(numero % 2 == 0)
   qtdePares++;
else 
qtdeImpares++;

count++;

}while( count < qtdeNumeros);
System.out.println("Qtde de numeros pares: " + qtdePares);
System.out.println("Qtde de numeros Impares: " + qtdeImpares);

    }
}
