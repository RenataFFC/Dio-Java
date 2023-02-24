import java.util.Scanner; 

public class contadorlivro {
     public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
System.out.println("Digite quantas páginas tem o livro: ");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
       int leituraFinal = paginas / paginasLidas;
       System.out.println("Total de dias será em " + leituraFinal + " Dias");
        
        

    }
}